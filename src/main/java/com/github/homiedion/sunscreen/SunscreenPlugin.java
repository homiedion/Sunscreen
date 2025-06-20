package com.github.homiedion.sunscreen;

import org.bukkit.plugin.java.JavaPlugin;

public class SunscreenPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
        getLogger().info("onEnable is called!");
	}

	@Override
	public void onDisable() {}
}
