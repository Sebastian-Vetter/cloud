/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.application

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.int
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.engine.embeddedServer
import io.ktor.server.http.content.staticResources
import io.ktor.server.netty.Netty
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import org.slf4j.LoggerFactory

//main function
fun main(args: Array<String>) {
    CoreApplication().main(args)
}

//class for performing the application
class CoreApplication : CliktCommand(name = "CoreApp", help = "Starts the cloud core application.") {

    private val port by option("-p", "--port", help = "Port to bind to.").int().default(8080)

    private val logger = LoggerFactory.getLogger("CoreApp")

    override fun run() {
        logger.info("Starting application")

        embeddedServer(Netty, port = port, host = "0.0.0.0") {
            // Konfiguriere Ktor Module
            module()
            configureRouting()
        }.start(wait = true)
    }
}

//loading ktor plugins
fun Application.module() {
    //Plugin laden für Ktor
}

fun Application.configureRouting() {
    routing {
        staticResources("static", "static")

        get("/") {
            call.respondText("Hello World!")
        }
    }
}
