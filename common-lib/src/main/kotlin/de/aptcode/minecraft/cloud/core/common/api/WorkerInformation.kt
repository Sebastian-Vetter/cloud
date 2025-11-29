/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 29.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.api

import kotlinx.serialization.Serializable

@Serializable
data class WorkerInformation(
    val uniqueIdString: String,
    val ram: Double,
    val cpuPercentage: Double,
    val services: List<ServiceInformation>,

)