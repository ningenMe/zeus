tasks {
    bootRun {
        enabled = false
    }
}
repositories {
    maven { url = uri("https://jitpack.io") }
}
dependencies {
    implementation("com.github.guepardoapps:kulid:2.0.0.0")
}
