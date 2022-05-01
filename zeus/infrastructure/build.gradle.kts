val mybatisGenerator: Configuration by configurations.creating

dependencies {
    implementation(project(":zeus:domain"))
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
    implementation("org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.4.0")
    implementation("mysql:mysql-connector-java:8.0.28")
    mybatisGenerator("org.mybatis.generator:mybatis-generator-core:1.4.1")
    mybatisGenerator("mysql:mysql-connector-java:8.0.28")
}

tasks {
    bootRun {
        enabled = false
    }
}

val mbgenerator = ant.withGroovyBuilder {
    "taskdef"(
        "name" to "mbgenerator",
        "classname" to "org.mybatis.generator.ant.GeneratorAntTask",
        "classpath" to mybatisGenerator.asPath
    )
}

fun getCustomMbgenerator(xml: String): Any? {
    return ant.withGroovyBuilder {
        "mbgenerator"(
            "overwrite" to true,
            "configfile" to xml,
            "verbose" to true
        )
    }
}

val generatorNingenmeMysqlTask = task("generatorNingenmeMysql") {
    group = "mybatis"
    doLast {
        mbgenerator
        getCustomMbgenerator("generatorNingenmeMysqlConfig.xml")
    }
    dependsOn(tasks.dockerComposeUp)
    finalizedBy(tasks.dockerComposeDown)
}

val generatorComicmeMysqlTask = task("generatorComicmeMysql") {
    group = "mybatis"
    doLast {
        mbgenerator
        getCustomMbgenerator("generatorComicmeMysqlConfig.xml")
    }
    dependsOn(tasks.dockerComposeUp)
    finalizedBy(tasks.dockerComposeDown)
}


val generatorComproMysqlTask = task("generatorComproMysql") {
    group = "mybatis"
    doLast {
        mbgenerator
        getCustomMbgenerator("generatorComproMysqlConfig.xml")
    }
    dependsOn(tasks.dockerComposeUp)
    finalizedBy(tasks.dockerComposeDown)
}

task("generatorAllMysql") {
    group = "mybatis"
    dependsOn(tasks.dockerComposeUp, generatorNingenmeMysqlTask, generatorComicmeMysqlTask, generatorComproMysqlTask)
    finalizedBy(tasks.dockerComposeDown)
}
