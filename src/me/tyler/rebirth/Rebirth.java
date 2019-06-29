package me.tyler.rebirth;

import java.io.File;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.tyler.rebirth.commands.RB_Command;

public class Rebirth extends JavaPlugin
{
	public final Logger log = Logger.getLogger("Minecraft-Server");
	public static Rebirth plugin;
	public static String VERSION = "2.0.4";
	public static String LDATE = "6/28/19";
	 public static final String COMMAND_PATH = "me.tyler.rebirth.commands";
	  public static final String COMMAND_PREFIX = "Command_";
	  FileConfiguration config;

	public void onDisable() {
	  PluginDescriptionFile pdfFile = this.getDescription();
	  this.log.info(pdfFile.getName() + " Has Been Disabled!");
	}
	
	public  void onEnable() {
		loadConfiguration();
		  PluginDescriptionFile pdfFile = this.getDescription();
		  this.log.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled"); 
		  final PluginManager pm = Bukkit.getServer().getPluginManager();
		  pm.registerEvents(new ServerListener(), this);
		  pm.registerEvents(new LoginListener(), this);
		  }
    public void loadConfiguration() {//to load config file
        config = getConfig();//get the configuration
        addDefault("Banned", "n/a");
        config.options().copyDefaults(true);//copy the default from above
        saveConfig();//write them to file
    }
    private void addDefault(String o, String p) {//add and set default
        File configFile = new File("plugins" + File.separator + this.getDescription().getName() + File.separator + "config.yml");//config file
        config.addDefault(o, p);//add default to config
        if (configFile.exists() == false) {//if there is no config file, set defaults as well!
            config.set(o, p);
        }
    }
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        try
        {
            Player sender_p = null;
            boolean senderIsConsole = false;
            if (sender instanceof Player)
            {
                sender_p = (Player) sender;
                log.info(String.format("[PLAYER_COMMAND] %s(%s): /%s %s",
                        sender_p.getName(),
                        ChatColor.stripColor(sender_p.getDisplayName()),
                        commandLabel,
                        RB_Util.implodeStringList(" ", Arrays.asList(args))));
            }
            else
            {
                senderIsConsole = true;
                log.info(String.format("[CONSOLE_COMMAND] %s: /%s %s",
                        sender.getName(),
                        commandLabel,
                        RB_Util.implodeStringList(" ", Arrays.asList(args))));
            }

            RB_Command dispatcher;
            try
            {
                ClassLoader classLoader = Rebirth.class.getClassLoader();
                dispatcher = (RB_Command) classLoader.loadClass(String.format("%s.%s%s", COMMAND_PATH, COMMAND_PREFIX, cmd.getName().toLowerCase())).newInstance();
                dispatcher.setPlugin(this);
            }
            catch (Throwable ex)
            {
                log.log(Level.SEVERE, "[" + getDescription().getName() + "] Command not loaded: " + cmd.getName(), ex);
                sender.sendMessage(ChatColor.RED + "Command Error: Command not loaded: " + cmd.getName());
                return true;
            }

            try
            {
                return dispatcher.run(sender, sender_p, cmd, commandLabel, args, senderIsConsole);
            }
            catch (Throwable ex)
            {
                sender.sendMessage(ChatColor.RED + "Command Error: " + ex.getMessage());
            }

            dispatcher = null;
        }
        catch (Throwable ex)
        {
            log.log(Level.SEVERE, "[" + getDescription().getName() + "] Command Error: " + commandLabel, ex);
            sender.sendMessage(ChatColor.RED + "Unknown Command Error.");
        }

        return true;
    }
}