import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.spring") version "1.6.10"
    id("org.springframework.boot") version "2.6.6"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

allprojects {
    apply {
        plugin("kotlin")
        plugin("org.springframework.boot")
    }
    group = "ningenme.net"
    version = ""
    java.sourceCompatibility = JavaVersion.VERSION_17

    repositories {
        mavenCentral()
    }
    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-web:2.6.5")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.2")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        compileOnly("org.projectlombok:lombok:1.18.22")
        annotationProcessor("org.projectlombok:lombok:1.18.22")
        testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.5")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
