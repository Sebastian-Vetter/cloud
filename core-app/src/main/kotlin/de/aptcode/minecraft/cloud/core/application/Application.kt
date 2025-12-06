/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.application

import de.aptcode.minecraft.cloud.core.application.core.CoreApplication
import de.aptcode.minecraft.cloud.core.application.di.AppModule
import de.aptcode.minecraft.cloud.core.application.routing.RouteConfig
import io.ktor.server.application.Application
import org.koin.ktor.plugin.koin

//main function
fun main(args: Array<String>) {
    CoreApplication().main(args)
}

fun Application.module() {
    //added koin module
    koin {
        modules(AppModule().initAppModule())
    }

    //Setup routeConfig
    RouteConfig(this).setup()
}