/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.api.data

import de.aptcode.minecraft.cloud.core.common.type.ServerType
import kotlinx.serialization.Serializable

@Serializable
data class ServiceInformation(
    val serviceId: String,
    val ram: Int,
    val template: String,
    val port: Int,
    val serverType: ServerType,
    val version: String,
    val downloadUrl: String
)
