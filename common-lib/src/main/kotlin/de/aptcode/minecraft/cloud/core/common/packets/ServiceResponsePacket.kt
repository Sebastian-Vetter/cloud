/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.packets

import kotlinx.serialization.Serializable

@Serializable
data class ServiceResponsePacket(
    val requestUniqueId: String,
    val success: Boolean,
    val errorMessage: String? = null
)
