package org.tofu.sampleplugin1;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class studySpigot implements Listener {
    SamplePlugin1 plugin;
    public studySpigot(SamplePlugin1 plugin) {
        this.plugin = plugin;
        this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
    }


    @EventHandler
    public void onStudy() {
        //コード
        //コード
    }

    //他のイベントのクラスも作成してみよう
}
