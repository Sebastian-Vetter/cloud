package de.aptcode.minecraft.cloud.core.common.database

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 01.12.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
interface IGenericRepository<T> {
    suspend fun create(entity: T): T
    suspend fun update(entity: T): T
    suspend fun delete(entity: T): T
    suspend fun get(id: String): T
    suspend fun getAll(): List<T>
    suspend fun getHighest()
    suspend fun getLowest(): T
    suspend fun getNewest(): T
}