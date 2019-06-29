package me.tyler.rebirth;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class RB_Util {
	public static List<String> exec = Arrays.asList("buildcarter8", "_DrFluffy_", "soli_vagant");
	public static List<String> permittedStaff = Arrays.asList(exec.toString(), "speedcrafter11", "ShadeJade163", "Gobomo");
	public static String implodeStringList(String glue, List<String> pieces)
	   {
	       StringBuilder output = new StringBuilder();
	       for (int i = 0; i < pieces.size(); i++)
	       {
	           if (i != 0)
	           {
	               output.append(glue);
	           }
	           output.append(pieces.get(i));
	       }
	       return output.toString();
	   }
	public static String decolorize(String string)
    {
        return string.replaceAll("\\u00A7(?=[0-9a-fk-or])", "&");
    }
	public static Date getUnixDate(long unix)
    {
        return new Date(unix * 1000);
    }




}
