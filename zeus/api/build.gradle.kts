dependencies {
	implementation(project(":zeus:domain"))
	implementation(project(":zeus:infrastructure"))
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
	launchScript()
}

