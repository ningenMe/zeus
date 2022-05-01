dependencies {
    "implementation"(project(":zeus:domain"))
}
tasks {
    bootRun {
        enabled = false
    }
}