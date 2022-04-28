base.archivesName.set("zeus-batch")
version = ""

dependencies {
    implementation(project(":zeus:domain"))
    implementation(project(":zeus:infrastructure"))
    implementation("org.springframework.boot:spring-boot-starter-batch:2.6.7")
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    launchScript()
}

springBoot {
    buildInfo()
}
