plugins {
    // Kotlin Version 2.0.0 (oder neuer) ist empfohlen für moderne Features
    kotlin("jvm") version "2.0.20"
    // Ktor Plugin für einfaches Setup im Core
    id("io.ktor.plugin") version "2.3.12" apply false
    // Serializierung ist essenziell für Netzwerk-Traffic
    kotlin("plugin.serialization") version "2.0.20" apply false
}

allprojects {
    group = "de.aptcode.minecraft.cloud"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        // Für spezielle Docker-Libs oder EAP Versionen
        maven("https://jitpack.io")
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.plugin.serialization")

    repositories {
        mavenCentral()
    }

    kotlin {
        jvmToolchain(24)
    }

    dependencies {
        // Logging (Modernes Kotlin Logging)
        implementation("io.github.oshai:kotlin-logging-jvm:5.1.0")
        implementation("ch.qos.logback:logback-classic:1.5.6") // Die eigentliche Engine

        // Testing (Mockk & JUnit 5)
        testImplementation("io.mockk:mockk:1.13.12")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
        testImplementation("org.junit.jupiter:junit-jupiter:5.10.3")
    }
}

tasks.test {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}