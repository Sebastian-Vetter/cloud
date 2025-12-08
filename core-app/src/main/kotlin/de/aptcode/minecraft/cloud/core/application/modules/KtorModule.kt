package de.aptcode.minecraft.cloud.core.application.modules

import com.mongodb.kotlin.client.coroutine.MongoClient
import de.aptcode.minecraft.cloud.core.application.routing.RouteConfig
import org.koin.core.module.Module
import org.koin.dsl.module
import org.slf4j.LoggerFactory

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 06.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
class KtorModule {

    fun initialize(): Module {
        val ktorModule = module {
            //RouteConfig
            single {
                RouteConfig()
            }
        }

        return ktorModule;
    }
}