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
import de.aptcode.minecraft.cloud.core.application.modules.KtorModule
import de.aptcode.minecraft.cloud.core.application.modules.LoggerModule
import de.aptcode.minecraft.cloud.core.application.modules.MongoDBModule
import de.aptcode.minecraft.cloud.core.application.modules.RabbitMQModule
import de.aptcode.minecraft.cloud.core.application.routing.RouteConfig
import io.ktor.server.application.Application
import org.koin.ktor.ext.inject
import org.koin.ktor.plugin.koin
import org.slf4j.Logger

//main function
fun main(args: Array<String>) {
    CoreApplication().main(args)
}

fun Application.module() {
    //koin modules
    koin {
        modules(KtorModule().initialize())
        modules(LoggerModule().initialize())
        modules(MongoDBModule().initialize())
        modules(RabbitMQModule().initialize())
    }

    //routeConfig setup
    val routeConfig by inject<RouteConfig>()
    routeConfig.setup(this)

    val logger by inject<Logger>()
    logger.info("Starting cloud system runner [LOADING.]")
}