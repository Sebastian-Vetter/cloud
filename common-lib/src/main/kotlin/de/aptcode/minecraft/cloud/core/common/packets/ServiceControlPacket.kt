package de.aptcode.minecraft.cloud.core.common.packets

import de.aptcode.minecraft.cloud.core.common.api.ServiceInformation
import de.aptcode.minecraft.cloud.core.common.type.ServiceAction

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
data class ServiceControlPacket(
    val uniqueId: String,
    val action: ServiceAction,
    val serverData: ServiceInformation
)