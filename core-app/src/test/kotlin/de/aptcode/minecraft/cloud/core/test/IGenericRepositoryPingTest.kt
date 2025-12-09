/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 09.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.test

import de.aptcode.minecraft.cloud.core.application.modules.MongoDBModule
import org.koin.dsl.koinApplication
import kotlin.test.Test

class IGenericRepositoryPingTest {

    @Test
    fun `run repository ping test`() {

        koinApplication{
            modules(MongoDBModule().initialize())
        }

        assert(true)
    }
}