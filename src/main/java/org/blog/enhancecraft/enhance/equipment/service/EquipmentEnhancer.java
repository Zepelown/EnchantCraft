package org.blog.enhancecraft.enhance.equipment.service;

import java.util.HashMap;
import org.blog.enhancecraft.enhance.equipment.entity.EnhanceUI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class EquipmentEnhancer {

    private static HashMap<Player, EnhanceUI> playersInEnhance = new HashMap<>();

    public void addPlayer(Player player, EnhanceUI enhanceUI){
        playersInEnhance.put(player,enhanceUI);
    }

    public void removePlayer(Player player){
        playersInEnhance.remove(player);
    }

    public void startEnhance(Player player, ItemStack item){
        playersInEnhance.get(player).startEnhance();
    }
}
