base.archivesName.set("zeus-api")
version = ""

plugins {
    id("org.openapi.generator") version "5.3.1"
}

dependencies {
    implementation(project(":zeus:domain"))
    implementation(project(":zeus:infrastructure"))
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("org.openapitools:jackson-databind-nullable:0.2.2")
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    launchScript()
}

openApiGenerate {
    generatorName.set("kotlin-spring")
    inputSpec.set("$rootDir/openapi/openapi.yaml")
    outputDir.set("$rootDir/zeus/api")
    apiPackage.set("ningenme.net.zeus.application.generated.controller")
    modelPackage.set("ningenme.net.zeus.application.generated.view")
    modelNameSuffix.set("view")
    generateModelTests.set(false)
    generateApiTests.set(false)
    generateModelDocumentation.set(false)
    generateApiDocumentation.set(false)
    configOptions.set(
        mutableMapOf(
            "dateLibrary" to "java8",
            "interfaceOnly" to "true",
            "skipDefaultInterface" to "true",
            "useTags" to "true"
        )
    )
}

