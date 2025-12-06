/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 06.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.application.di

import org.koin.core.module.Module
import org.koin.dsl.module
import org.slf4j.LoggerFactory

class AppModule {

    //init Kion module
    fun initAppModule(): Module {
        val appModule = module {
            //add singletons & factories
            single { LoggerFactory.getLogger("CoreApp") }
        }

        return appModule;
    }
}