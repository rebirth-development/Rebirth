package me.tyler.rebirth.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_hoes extends RB_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args,
			boolean senderIsConsole) {
			sender.sendMessage(ChatColor.AQUA + "The status of the hoes are mad.");
			for (int i = 0; i < 11; i++) {
			sender.sendMessage(ChatColor.GREEN + "HOES MAD");
			}
		return true;
	}

}
