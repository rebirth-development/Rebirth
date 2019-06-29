package me.tyler.rebirth.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_vote extends RB_Command
{
	public static boolean hasVoted = false;
	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args,
			boolean senderIsConsole) {
		//if(args.length == 0) {
		 sender.sendMessage(ChatColor.AQUA + "The very first election will be on: 7/-/19");
		 sender.sendMessage(ChatColor.DARK_RED + "Buildcarter8/Speedcrafter11 (Conservative)");
		 sender.sendMessage(ChatColor.RED + "Gobomo (Independant)");
		 //sender.sendMessage(ChatColor.AQUA + "All players are registered to vote automatically just type /vote (party) to vote for the player running for that party");
		//}
		/*
		if(args[0].equalsIgnoreCase("Conservative")) {
		}
		*/
		 return true;
	}

}
