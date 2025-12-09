package de.aptcode.minecraft.cloud.core.common.model.worker

import de.aptcode.minecraft.cloud.core.common.model.groups.ServiceGroup
import kotlinx.serialization.Serializable

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 29.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
@Serializable
data class CloudWorker(
    val uniqueId: String,
    val ram: Double,
    val cpuPercentage: Double,
    val groups: List<ServiceGroup>,

    )