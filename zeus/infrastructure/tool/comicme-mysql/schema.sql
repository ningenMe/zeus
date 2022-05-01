CREATE TABLE `health`
(
    `id` integer NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `comic_page`
(
    `url`            varchar(511) NOT NULL,
    `name`           varchar(511) NOT NULL DEFAULT '',
    `processed_time` timestamp    NOT NULL,
    `created_time`   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time`   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted_time`   timestamp    NULL     DEFAULT NULL,
    PRIMARY KEY (`url`),
    KEY `processed_time` (`processed_time`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `creator`
(
    `creator_id`   integer(10) unsigned AUTO_INCREMENT NOT NULL,
    `creator_name` varchar(511)                        NOT NULL,
    `created_time` timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time` timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted_time` timestamp                           NULL     DEFAULT NULL,
    PRIMARY KEY (`creator_id`),
    UNIQUE KEY `creator_name_unique` (`creator_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `publisher`
(
    `publisher_id`   integer(10) unsigned AUTO_INCREMENT NOT NULL,
    `publisher_name` varchar(511)                        NOT NULL,
    `created_time`   timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time`   timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted_time`   timestamp                           NULL     DEFAULT NULL,
    PRIMARY KEY (`publisher_id`),
    UNIQUE KEY `publisher_name_unique` (`publisher_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `work`
(
    `work_id`        integer(10) unsigned AUTO_INCREMENT NOT NULL,
    `work_name`      varchar(511)                        NOT NULL,
    `publisher_name` varchar(511)                        NOT NULL,
    `created_time`   timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time`   timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted_time`   timestamp                           NULL     DEFAULT NULL,
    PRIMARY KEY (`work_id`),
    UNIQUE KEY `work_name_unique` (`work_name`),
    FOREIGN KEY `publisher_name_foreign` (`publisher_name`) REFERENCES `publisher` (`publisher_name`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `comic`
(
    `comic_id`       integer(10) unsigned AUTO_INCREMENT NOT NULL,
    `isbn13`         varchar(13)                         NOT NULL,
    `url`            varchar(511)                        NOT NULL,
    `work_id`        integer(10) unsigned                NOT NULL,
    `comic_name`     varchar(511)                        NOT NULL,
    `published_date` date                                NOT NULL,
    `created_time`   timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time`   timestamp                           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted_time`   timestamp                           NULL     DEFAULT NULL,
    PRIMARY KEY (`comic_id`),
    UNIQUE KEY `isbn13_unique` (`isbn13`),
    KEY `published_date` (`published_date`),
    FOREIGN KEY `work_id_foreign` (`work_id`) REFERENCES `work` (`work_id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `relation_creator_work`
(
    `creator_id` integer(10) unsigned NOT NULL,
    `work_id`    integer(10) unsigned NOT NULL,
    PRIMARY KEY (`creator_id`, `work_id`),
    KEY `work_id` (`work_id`),
    FOREIGN KEY `creator_id_foreign` (`creator_id`) REFERENCES `creator` (`creator_id`) ON DELETE CASCADE,
    FOREIGN KEY `work_id_foreign` (`work_id`) REFERENCES `work` (`work_id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

