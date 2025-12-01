/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 01.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.packets.request

import de.aptcode.minecraft.cloud.core.common.api.data.WorkerInformation
import kotlinx.serialization.Serializable

@Serializable
class WorkerRequestPacket (
    val uniqueId: String,
    val taskName: String,
    val taskDescription: String,
    val token: String,
    val workerInfo: WorkerInformation,
)