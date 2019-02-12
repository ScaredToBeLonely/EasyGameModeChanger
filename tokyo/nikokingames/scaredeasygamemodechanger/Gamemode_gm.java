package tokyo.nikokingames.scaredeasygamemodechanger;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode_gm implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player)sender;
		if (args.length != 0) {
			if (args[0].equals("0")) {
	        	player.setGameMode(GameMode.SURVIVAL);
	        	player.playSound(player.getLocation(),Sound.BLOCK_NOTE_BLOCK_HARP,10,(float) 1.5);
	    		sender.sendMessage(ChatColor.DARK_RED + "ScaredEasySwitchGameMode: " + ChatColor.GREEN + "Changed your GameMode to Survival.");
	        	return true;
	    	} else if (args[0].equals("1")) {
	        	player.setGameMode(GameMode.CREATIVE);
	        	player.playSound(player.getLocation(),Sound.BLOCK_NOTE_BLOCK_HARP,10,(float) 1.5);
	    		sender.sendMessage(ChatColor.DARK_RED + "ScaredEasySwitchGameMode: " + ChatColor.GREEN + "Changed your GameMode to Creative.");
	        	return true;
	    	} else if (args[0].equals("3")) {
	    		player.setGameMode(GameMode.SPECTATOR);
	    		player.playSound(player.getLocation(),Sound.BLOCK_NOTE_BLOCK_HARP,10,(float) 1.5);
	    		sender.sendMessage(ChatColor.DARK_RED + "ScaredEasySwitchGameMode: " + ChatColor.GREEN + "Changed your GameMode to Spectator.");
	    		return true;
	    	}
		}
		sender.sendMessage(ChatColor.RED + "ScaredEasySwitchGameMode: An error occured.");
		return false;
	}


}