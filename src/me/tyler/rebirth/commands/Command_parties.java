package me.tyler.rebirth.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_parties extends RB_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args,
			boolean senderIsConsole) {
		 sender.sendMessage(ChatColor.AQUA + "The Political Parties of Rebirth");
		 sender.sendMessage(ChatColor.AQUA + "----------------------------------");
		 sender.sendMessage(ChatColor.DARK_RED + "General Conservative Party (Conservatism)");
		 sender.sendMessage(ChatColor.RED + "Workers Party of Rebirth (Socialist)");
		 sender.sendMessage(ChatColor.DARK_GREEN + "Liberal Party of Rebirth (Liberal)");
		 sender.sendMessage(ChatColor.DARK_PURPLE + "***Please do not bring up Politics from the real world.***");
		return true;
	}

}
