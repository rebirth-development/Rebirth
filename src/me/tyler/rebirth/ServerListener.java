package me.tyler.rebirth;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
	 public void onServerPing(ServerListPingEvent event)
	    {
		if(Bukkit.hasWhitelist()) {
			event.setMotd(ChatColor.GOLD + "[Rebirth 2.0]" + ChatColor.WHITE + " - " + ChatColor.YELLOW + "Undergoing Maintenance.");
		}else {
		 event.setMotd(ChatColor.GOLD + "[Rebirth 2.0]" + ChatColor.WHITE + " - " + ChatColor.DARK_RED + "Live your 2nd life");
		}
		 return;
	    }
}