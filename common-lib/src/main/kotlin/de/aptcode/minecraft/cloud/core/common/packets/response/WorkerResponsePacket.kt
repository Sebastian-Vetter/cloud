package de.aptcode.minecraft.cloud.core.common.packets.response

import de.aptcode.minecraft.cloud.core.common.api.data.WorkerInformation
import de.aptcode.minecraft.cloud.core.common.type.CommunicationEvent
import kotlinx.serialization.Serializable

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 01.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
@Serializable
data class WorkerResponsePacket(
    val uniqueId: String,
    val taskName: String,
    val taskDescription: String,
    val workerInfo: WorkerInformation,
    val eventName: CommunicationEvent,
)