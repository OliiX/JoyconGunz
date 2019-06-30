package mc.oli;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {
	
	public PlayerListener(JoyconGunz plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onEntityHit(EntityDamageByEntityEvent snow) {
	    if ((snow.getDamager() instanceof Snowball)) {

	      snow.setDamage(12);
	      
	    }
	    
	}
	    
	
	    
	@EventHandler
	public void onShoot(PlayerInteractEvent e){
		
		Player player = e.getPlayer();
		
		ItemStack item = player.getInventory().getItemInMainHand();
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
			if(item != null && item.getType() == Material.BRICK) {
				player.sendMessage(ChatColor.RED + "[Debug] " + ChatColor.RESET + "Bullet fired.");
				player.launchProjectile(Snowball.class);  
				
			}
		}
		
	}
	
	

}
