dependencies {
    implementation(project(":zeus:domain"))
    runtimeOnly(project(":zeus:infrastructure"))
    implementation("org.springframework.boot:spring-boot-starter-batch:2.7.0")
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    launchScript()
}
springBoot {
    buildInfo()
}
