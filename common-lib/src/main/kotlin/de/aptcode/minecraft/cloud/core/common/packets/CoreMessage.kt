/**
 * @author Sebastian Vetter
 * @company aptcode.de
 * @date 21.11.25
 * @project cloud
 *
 * Copyright (c) 2025 aptcode.de. All rights reserved.
 */

package de.aptcode.minecraft.cloud.core.common.packets

import de.aptcode.minecraft.cloud.core.common.type.CommunicationEvent
import de.aptcode.minecraft.cloud.core.common.type.MessageState
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
data class CoreMessage(val messageId: String, val ip: String, val state: MessageState, val token: String, val data: JsonObject, val event: CommunicationEvent)
