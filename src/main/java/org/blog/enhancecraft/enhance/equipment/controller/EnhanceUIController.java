package org.blog.enhancecraft.enhance.equipment.controller;

import java.util.HashMap;
import org.blog.enhancecraft.enhance.equipment.entity.EnhanceUI;
import org.blog.enhancecraft.enhance.equipment.service.EquipmentEnhancer;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class EnhanceUIController implements Listener {

    private final EquipmentEnhancer equipmentEnhancer;

    public EnhanceUIController(EquipmentEnhancer equipmentEnhancer){
        this.equipmentEnhancer = equipmentEnhancer;
    }

    @EventHandler
    public void clickEnhanceUI(InventoryClickEvent event){
        if (!event.getView().getOriginalTitle().matches("강화") || event.getCurrentItem() == null){
            return;
        }

        if (event.getCurrentItem().getType() != Material.IRON_SWORD){
            event.setCancelled(true);
        }
        Player player = (Player) event.getView().getPlayer();
        equipmentEnhancer.startEnhance(player,new ItemStack(Material.IRON_SWORD));

    }
}
