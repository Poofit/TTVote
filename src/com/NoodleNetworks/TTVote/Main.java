package com.NoodleNetworks.TTVote;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player player = (Player)sender;
		if(commandLabel.equalsIgnoreCase("vote")) {
			player.sendMessage(ChatColor.YELLOW + "=====================================================");
			player.sendMessage(ChatColor.RED + "                 To Vote Please, Click The Link Below");
			player.sendMessage(ChatColor.BLUE + "");
			player.sendMessage(ChatColor.BLUE + "                 http://tekkit.mvpservers.net/votemodal/1/");
			player.sendMessage(ChatColor.BLUE + "                 http://tinyurl.com/Totallyvote");
		    player.sendMessage(ChatColor.BLUE + "                 http://tinyurl.com/p4delnz");
		    player.sendMessage(ChatColor.YELLOW + "=====================================================");
		    return false;
		}
		if(commandLabel.equalsIgnoreCase("banned")) {
			player.sendMessage(ChatColor.YELLOW + "=====================================================");
		      player.sendMessage(ChatColor.BLUE + "");
		      player.sendMessage(ChatColor.RED + "        For A Full List of Banned Items, Click The Link Below");
		      player.sendMessage(ChatColor.BLUE + "");
		      player.sendMessage(ChatColor.BLUE + "            http://tinyurl.com/totallybanned");
		      player.sendMessage(ChatColor.BLUE + "");
		      player.sendMessage(ChatColor.YELLOW + "=====================================================");
		      return false;
		}
		if(commandLabel.equalsIgnoreCase("donate")) {
			player.sendMessage(ChatColor.YELLOW + "=====================================================");
		      player.sendMessage(ChatColor.BLUE + "");
		      player.sendMessage(ChatColor.RED + "     Donate To Help Support The Server, Click The Link Below");
		      player.sendMessage(ChatColor.BLUE + "");
		      player.sendMessage(ChatColor.BLUE + "                http://www.totallytekkit.com/shop");
		      player.sendMessage(ChatColor.BLUE + "");
		      player.sendMessage(ChatColor.YELLOW + "=====================================================");
		      return false;
		}
		return false;
	}
}
