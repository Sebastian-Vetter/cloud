/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 09.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.application.modules

import com.rabbitmq.client.ConnectionFactory
import org.koin.core.module.Module
import org.koin.dsl.module
import java.sql.Connection

class RabbitMQModule {

    fun initialize(): Module {
        val rabbitModule = module {
            single<ConnectionFactory> {
                ConnectionFactory().apply {
                    host = "localhost"
                    port = 5672
                    username = "guest"
                    password = "guest"
                }
            }

            single<Connection> {
                get<ConnectionFactory>().newConnection() as Connection
            }
        }

        return rabbitModule;
    }
}