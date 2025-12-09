package de.aptcode.minecraft.cloud.core.common.model.states

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 09.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
enum class ServiceState {
    OFFLINE,
    ONLINE,
    STARTING,
    STOPPING,
    BACKUP,
    CREATING,
    DELETING
}