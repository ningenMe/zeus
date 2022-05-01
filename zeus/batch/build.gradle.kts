dependencies {
    implementation(project(":zeus:domain"))
    runtimeOnly(project(":zeus:infrastructure"))
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    launchScript()
}
springBoot {
    buildInfo()
}