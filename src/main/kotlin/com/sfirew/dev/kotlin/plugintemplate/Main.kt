package com.sfirew.dev.kotlin.plugintemplate

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
// self
import com.sfirew.dev.kotlin.plugintemplate.PlayerEventListener

class Main: JavaPlugin() {
    override fun onEnable() {
        // ensure config file exists
        saveDefaultConfig()
        Bukkit.getPluginManager().registerEvents(PlayerEventListener, this)
        
        logger.info("plugin loaded!")
    }

    override fun onDisable() {
        logger.info("plugin stopped!")
    }
}
