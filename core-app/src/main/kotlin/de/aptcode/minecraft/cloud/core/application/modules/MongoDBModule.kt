package de.aptcode.minecraft.cloud.core.application.modules

import com.mongodb.kotlin.client.coroutine.MongoClient
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 09.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
class MongoDBModule {

    fun initialize(): Module {
        val mongoModule = module {
            //MongoDatabase connection
            single {
                MongoClient.Factory.create("mongodb://localhost:27017")
            }

            //MongoDatabase
            single {
                get<MongoClient>().getDatabase("CLOUD_DATABASE")
            }
        }

        return mongoModule
    }
}