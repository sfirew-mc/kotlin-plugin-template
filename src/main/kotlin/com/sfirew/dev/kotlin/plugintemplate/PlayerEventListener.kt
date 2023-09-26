package com.sfirew.dev.kotlin.plugintemplate

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.EventPriority
import org.bukkit.event.player.PlayerJoinEvent

object PlayerEventListener : Listener {
    @EventHandler(priority = EventPriority.NORMAL)
    public fun onPlayerJoin(event: PlayerJoinEvent) {
        event.player.sendMessage("Hello ${event.player.name}, This is player join event by Kotlin!");
    }
}
