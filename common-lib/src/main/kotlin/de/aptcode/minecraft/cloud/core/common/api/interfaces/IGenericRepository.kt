package de.aptcode.minecraft.cloud.core.common.api.interfaces

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 01.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
interface IGenericRepository<T> {
    fun create(entity: T): T
    fun update(entity: T): T
    fun delete(entity: T): T
    fun get(entity: T): T
    fun getAll(entity: T): List<T>
}