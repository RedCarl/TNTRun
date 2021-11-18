package cn.redcarl;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;
    public Plugin getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        instance=this;

    }

    @Override
    public void onDisable() {

    }
}
