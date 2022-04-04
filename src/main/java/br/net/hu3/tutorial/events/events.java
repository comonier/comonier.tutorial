package br.net.hu3.tutorial.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class events implements Listener {

    @EventHandler
    public void aoEntrar(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(null);
        Bukkit.broadcastMessage("§6O Jogador §f" + p.getName() + "§6entrou no servidor");
    }

    @EventHandler
    public void aoSair(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage(null);
        Bukkit.broadcastMessage("§6O Jogador §f" + p.getName() + "§6saiu do servidor");


    }
}
