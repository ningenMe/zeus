dependencies {
    implementation(project(":zeus:domain"))
    runtimeOnly(project(":zeus:infrastructure"))
}

tasks {
    bootJar {
        archiveBaseName.set(rootProject.name)
        launchScript()
    }
}
springBoot {
    buildInfo()
}