package tokyo.nikokingames.scaredeasygamemodechanger;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements CommandExecutor{

	@Override
	public void onDisable() {
		super.onDisable();
		System.out.println("Plugin has disabled.");
	}

	@Override
	public void onEnable() {
		super.onEnable();
		getCommand("gm").setExecutor(new Gamemode_gm());
		System.out.println("Plugin has loaded.");
	}

}