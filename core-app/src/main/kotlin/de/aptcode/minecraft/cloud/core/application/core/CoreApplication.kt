package de.aptcode.minecraft.cloud.core.application.core

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.int
import de.aptcode.minecraft.cloud.core.application.module
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 06.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

//class for performing the application
class CoreApplication : CliktCommand(name = "CoreApp", help = "Starts the cloud core application.") {
    //port handling (TODO add other params)
    private val port by option("-p", "--port", help = "Port to bind to.").int().default(8080)

    override fun run() {
        //Running ktor server and add module
        embeddedServer(Netty, port = port, host = "0.0.0.0") {
            module()
        }.start(wait = true)
    }
}