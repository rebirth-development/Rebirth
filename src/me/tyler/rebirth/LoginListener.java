package me.tyler.rebirth;

import java.net.InetSocketAddress;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLogin(PlayerLoginEvent event)
    {
		Player player = event.getPlayer();
		InetSocketAddress ip = event.getPlayer().getAddress();
		//Ban handling
		
		//Login Handling
		if(player.getName().equals("buildcarter8"))
		{
			 Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + " is the " + ChatColor.DARK_RED + "Owner");
		}
		else if(player.getName().equalsIgnoreCase("_DrFluffy_")) {
			Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + " is the " + ChatColor.RED + "Co-Owner");
		}
		else if(player.getName().equalsIgnoreCase("o_dannyboy")) {
			Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + " is the " + ChatColor.GREEN + "Chief Executive");
		}
    }
}
