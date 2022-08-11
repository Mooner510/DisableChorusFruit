package org.mooner.disablechorusfruit;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisableChorusFruit extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Disabled!");
    }
}