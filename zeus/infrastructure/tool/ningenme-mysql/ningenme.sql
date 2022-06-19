CREATE DATABASE `ningenme`;
USE `ningenme`;

CREATE TABLE `health`
(
    `id` integer NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `application_meta`
(
    `application_meta_id` varchar(255) NOT NULL,
    `deleted_time`        timestamp    NULL     DEFAULT NULL,
    `created_time`        timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`application_meta_id`, `created_time`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `ningenme_net_user`
(
    `ningenme_net_user_id` varchar(255) NOT NULL,
    `password`             varchar(255) NOT NULL,
    `deleted_time`         timestamp    NULL     DEFAULT NULL,
    `created_time`         timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time`         timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`ningenme_net_user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `blog`
(
    `url`          varchar(255) NOT NULL,
    `date`         varchar(255) NOT NULL,
    `type`         varchar(255) NOT NULL,
    `title`        varchar(255) NOT NULL,
    `liked`        integer(10)  NOT NULL DEFAULT 0,
    `deleted_time` timestamp    NULL     DEFAULT NULL,
    `created_time` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`url`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `access_count`
(
    `access_count_id` varchar(255) NOT NULL,
    `access_time`     timestamp    NOT NULL,
    `created_time`    timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_time`    timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`access_count_id`),
    KEY `access_time` (`access_time`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE
    USER 'master_user' IDENTIFIED BY 'password';
GRANT
    SELECT, INSERT , UPDATE, DELETE ON *.* TO 'master_user';
