package org.tofu.sampleplugin1;

import org.bukkit.plugin.java.JavaPlugin;

public final class SamplePlugin1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new studySpigot(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
