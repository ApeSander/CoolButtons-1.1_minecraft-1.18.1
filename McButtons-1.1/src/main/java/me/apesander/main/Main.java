package me.apesander.main;

import me.apesander.main.code.ButtonPressEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //Plugin startup logic
        getServer().getPluginManager().registerEvents(new ButtonPressEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
