/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.event.platform;

import com.sk89q.worldedit.LocalSession;
import com.sk89q.worldedit.entity.Player;
import com.sk89q.worldedit.event.Event;

import java.io.File;

/**
 * A World Edit event triggered when a a schematic has been saved.
 * This event is triggered by a custom world edit build.
 *
 * @author SmylerMC
 */
public class SchematicSavedEvent extends Event {

    private final Player player;
    private final File file;
    private final LocalSession session;

    public SchematicSavedEvent(Player player, File file, LocalSession session) {
        this.player = player;
        this.file = file;
        this.session = session;
    }

    public Player player() {
        return this.player;
    }

    public File file() {
        return this.file;
    }

    public LocalSession session() {
        return this.session;
    }

}
