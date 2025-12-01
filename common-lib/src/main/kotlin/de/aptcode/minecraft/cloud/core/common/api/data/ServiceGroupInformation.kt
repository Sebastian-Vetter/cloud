/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 29.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.api.data

import kotlinx.serialization.Serializable

@Serializable
data class ServiceGroupInformation(
    val groupUniqueId: String,
    val workerInfo: WorkerInformation,
    val groupName: String,
    val maxRam: Double,
    val maxCpu: Double,
    val maxServices: Int,
    val minServices: Int,
    val hostIp: String,

)