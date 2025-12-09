package de.aptcode.minecraft.cloud.core.common.model.services

import de.aptcode.minecraft.cloud.core.common.model.worker.CloudWorker
import kotlinx.serialization.Serializable

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 09.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
@Serializable
data class CloudService(
    val groupUniqueId: String,
    val workerInfo: CloudWorker,
    val groupName: String,
    val maxRam: Double,
    val maxCpu: Double,
    val maxServices: Int,
    val minServices: Int,
    val hostIp: String,
)