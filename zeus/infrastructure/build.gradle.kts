val mybatisGenerator: Configuration by configurations.creating

dependencies {
    implementation(project(":zeus:domain"))
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
    implementation("org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.4.0")
    mybatisGenerator("org.mybatis.generator:mybatis-generator-core:1.4.1")
    mybatisGenerator("mysql:mysql-connector-java:8.0.28")
}

task("generatorNingenmeMysql") {
    group = "mybatis"
    doLast {
        ant.withGroovyBuilder {
            "taskdef"(
                "name" to "mbgenerator",
                "classname" to "org.mybatis.generator.ant.GeneratorAntTask",
                "classpath" to mybatisGenerator.asPath
            )
        }
        ant.withGroovyBuilder {
            "mbgenerator"(
                "overwrite" to true,
                "configfile" to "generatorNingenmeMysqlConfig.xml",
                "verbose" to true
            )
        }
    }
    dependsOn("dockerComposeUp")
    finalizedBy("dockerComposeDown")
}
