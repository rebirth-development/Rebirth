package me.tyler.rebirth.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.tyler.rebirth.RB_Util;

public class Command_rban extends RB_Command
{
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args,
			boolean senderIsConsole) {
		if(!sender.getName().equalsIgnoreCase("buildcarter8")) {
			sender.sendMessage(ChatColor.RED + "You are not authorized for this command");
			Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + " - Attempted to use /rban");
		}else {
			/*
		}
			if(args.length == 0) {
				sender.sendMessage(ChatColor.DARK_RED + "Enter a name!");
			}
			if(args.length == 1) {
				final Player player = Bukkit.getPlayer(args[0]);
				player.setOp(false);
				player.kickPlayer(ChatColor.DARK_RED + "You have been permenently banned from this server.");
				
			}
		}
		*/
	}
		return true;
	}
}
