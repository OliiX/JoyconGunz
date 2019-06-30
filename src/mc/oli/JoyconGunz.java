package mc.oli;

import org.bukkit.plugin.java.JavaPlugin;

public class JoyconGunz extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new PlayerListener(this);
	}
	
	@Override
	public void onDisable() {
		
	}

}
