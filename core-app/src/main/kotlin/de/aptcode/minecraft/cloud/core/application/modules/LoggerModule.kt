/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 09.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.application.modules

import org.koin.core.module.Module
import org.koin.dsl.module
import org.slf4j.LoggerFactory

class LoggerModule {

    fun initialize(): Module {
        val loggerModule = module {
            //logger
            single {
                LoggerFactory.getLogger("[CLOUD]")
            }
        }

        return loggerModule
    }

}