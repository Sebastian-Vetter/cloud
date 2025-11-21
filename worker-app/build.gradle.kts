plugins {
    kotlin("jvm")
}

group = "de.aptcode.minecraft.cloud"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-lib"))

    // --- DOCKER CONTROL ---
    // Die Standard-Lib um Docker via Java zu steuern
    implementation("com.github.docker-java:docker-java-core:3.4.0")
    implementation("com.github.docker-java:docker-java-transport-httpclient5:3.4.0")

    // --- DEPENDENCY INJECTION (Koin) ---
    // Hier nutzen wir Core, da Worker keinen Webserver hat
    implementation("io.insert-koin:koin-core:3.5.6")

    // --- MESSAGING (RabbitMQ) ---
    implementation("com.rabbitmq:amqp-client:5.21.0")

    // --- CLI & Coroutines ---
    implementation("com.github.ajalt.clikt:clikt:4.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(24)
}