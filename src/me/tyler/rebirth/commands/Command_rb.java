package me.tyler.rebirth.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.tyler.rebirth.Rebirth;

public class Command_rb extends RB_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args,
			boolean senderIsConsole) {
		if(args.length != 1) {
		 sender.sendMessage(ChatColor.AQUA + "The Rebirth Roleplay Plugin By Buildcarter8");
		 sender.sendMessage(ChatColor.GREEN + "Plugin was last updated to version " + Rebirth.VERSION + " on " + Rebirth.LDATE);
		 sender.sendMessage(ChatColor.AQUA + "Type /rb help for help on the rebirth commands");
		}
		 if(args[0].equalsIgnoreCase("help")) {
			 sender.sendMessage(ChatColor.GREEN + "====== Rebirth Help ======");
			 sender.sendMessage(ChatColor.AQUA + "/rb - displays info about rebirth");
			 sender.sendMessage(ChatColor.AQUA + "/vote - vote for a player running (Broken)");
			 sender.sendMessage(ChatColor.AQUA + "/parties - displays info about the political parties");
			 sender.sendMessage(ChatColor.AQUA + "/hoes - HOES MAD");
			 sender.sendMessage(ChatColor.AQUA + "/rban - Executive only command - Perm. ban a player by username, UUID and, IP");
		 }
		return true;
	}

}
