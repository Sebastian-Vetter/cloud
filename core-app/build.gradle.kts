plugins {
    kotlin("jvm")
    application
}

group = "de.aptcode.minecraft.cloud"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("de.aptcaine.minecraft.cloud.ApplicationKt")
}

dependencies {
    implementation(project(":common-lib"))

    // --- KTOR (Webserver & API) ---
    val ktorVersion = "2.3.12"
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion") // Engine
    implementation("io.ktor:ktor-server-auth:$ktorVersion") // Für Bearer Token
    implementation("io.ktor:ktor-server-auth-jwt:$ktorVersion") // Falls du JWT nutzen willst
    implementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    implementation("io.ktor:ktor-server-websockets:$ktorVersion") // Für Live-Konsole

    // --- DATABASE (MongoDB) ---
    // KMongo ist der beste Wrapper für Kotlin + Mongo
    implementation("org.litote.kmongo:kmongo-coroutine-serialization:5.1.0")

    // --- DEPENDENCY INJECTION (Koin) ---
    implementation("io.insert-koin:koin-ktor:3.5.6") // Speziell für Ktor
    implementation("io.insert-koin:koin-logger-slf4j:3.5.6")

    // --- MESSAGING (RabbitMQ) ---
    implementation("com.rabbitmq:amqp-client:5.21.0")

    // --- CLI (Command Line Interface) ---
    // Clikt macht das Parsen von Befehlen super einfach
    implementation("com.github.ajalt.clikt:clikt:4.4.0")

    // --- UTILS ---
    // BCrypt für das Hashen von Passwörtern/Tokens
    implementation("org.mindrot:jbcrypt:0.4")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}