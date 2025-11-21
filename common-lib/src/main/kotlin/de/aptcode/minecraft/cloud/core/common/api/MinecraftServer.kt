/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.api

import de.aptcode.minecraft.cloud.core.common.type.ServerType

data class MinecraftServer(val name: String, val version: String, val serverType: ServerType, val downloadUrl: String)
