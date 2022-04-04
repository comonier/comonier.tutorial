package br.net.hu3.tutorial;
import br.net.hu3.tutorial.events.events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
public class tutorial extends JavaPlugin {

    public static tutorial plugin;

    @Override
    public void onEnable() {
        plugin=this;
        Bukkit.getConsoleSender().sendMessage( "§2PLUGIN INICIADO TUTORIAL");
        registerEvents();
        registerCommands();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage( "§cPLUGIN DESLIGADO TUTORIAL");
    }

    public void registerEvents(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new events(), this);

    }
    public void registerCommands(){

    }
}
