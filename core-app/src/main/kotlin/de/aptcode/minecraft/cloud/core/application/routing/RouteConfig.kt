/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 06.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.application.routing

import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

class RouteConfig(private val application: Application) {

    //setup function for init all routes
    fun setup() {
        application.routing {
            configure()
        }
    }

    private fun Route.configure() {

        //routes



        //default message
        get { call.respond("Hello World!") }
    }
}