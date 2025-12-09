package de.aptcode.minecraft.cloud.core.common.queue

import kotlinx.coroutines.flow.Flow

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 09.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
interface RabbitMessageQueue {

    //non-blocking for ktor
    suspend fun sendMessage(message: String)

    //non-blocking message receive
    fun listenToMessage(): Flow<String>
}