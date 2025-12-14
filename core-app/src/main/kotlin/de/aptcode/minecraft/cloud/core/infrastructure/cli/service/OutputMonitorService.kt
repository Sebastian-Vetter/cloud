/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 14.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.infrastructure.cli.service

interface OutputMonitorService {

    fun startMonitoring()
    fun stopMonitoring()

}