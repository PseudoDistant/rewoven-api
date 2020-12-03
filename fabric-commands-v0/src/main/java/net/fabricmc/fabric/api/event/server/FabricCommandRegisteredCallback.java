/*
 * Copyright (c) 2020 Legacy Fabric
 * Copyright (c) 2016 - 2020 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.api.event.server;

import net.minecraft.command.AbstractCommand;
import net.minecraft.server.MinecraftServer;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.command.CommandSide;

public interface FabricCommandRegisteredCallback {
	Event<FabricCommandRegisteredCallback> EVENT = EventFactory.createArrayBacked(FabricCommandRegisteredCallback.class,
			(listeners) -> (server, command, side) -> {
				for (FabricCommandRegisteredCallback event : listeners) {
					event.onCommandRegistered(server, command, side);
				}
			}
	);

	void onCommandRegistered(MinecraftServer server, AbstractCommand command, CommandSide side);
}
