package de.aptcode.minecraft.cloud.core.common.protocol.events

/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 22.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */
enum class CommunicationResponse {
    SERVER_STOPPED,
    SERVER_RESTARTED,
    SERVER_CREATED,
    SERVER_DELETED,
    HEART_BEAT,
    WORKER_AUTHENTICATED,
    WORKER_DISCONNECTED,
    WORKER_CONNECTED,
    WORKER_CREATED,
    WORKER_DELETED
}