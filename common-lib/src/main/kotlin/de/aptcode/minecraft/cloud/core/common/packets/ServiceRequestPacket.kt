/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 29.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.packets

import de.aptcode.minecraft.cloud.core.common.api.ServiceInformation
import de.aptcode.minecraft.cloud.core.common.type.ServiceAction
import kotlinx.serialization.Serializable

@Serializable
data class ServiceRequestPacket(
    val requestUniqueId: String,
    val action: ServiceAction,
    val serverData: ServiceInformation
)