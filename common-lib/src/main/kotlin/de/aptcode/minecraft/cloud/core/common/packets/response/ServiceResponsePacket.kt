package de.aptcode.minecraft.cloud.core.common.packets.response

import kotlinx.serialization.Serializable

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
@Serializable
data class ServiceResponsePacket(
    val requestUniqueId: String,
    val success: Boolean,
    val errorMessage: String? = null
)