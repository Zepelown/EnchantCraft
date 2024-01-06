package org.blog.enhancecraft.enhance.equipment.controller;

import org.blog.enhancecraft.EnhanceCraft;
import org.blog.enhancecraft.enhance.equipment.controller.commands.OpenEnhanceUi;
import org.blog.enhancecraft.enhance.equipment.service.EquipmentEnhancer;
import org.blog.enhancecraft.enhance.equipment.view.EnhanceUIOpener;

public class EnhanceEquipmentController {
    private final EnhanceCraft serverInstance;

    private static EnhanceUIOpener enhanceUiOpener;

    private static EquipmentEnhancer equipmentEnhancer;


    public EnhanceEquipmentController(){
        this.serverInstance = EnhanceCraft.getServerInstance();
        this.enhanceUiOpener = new EnhanceUIOpener();
        equipmentEnhancer = new EquipmentEnhancer();

        registerCommands();
        registerEvents();
    }

    private void registerCommands(){
        serverInstance.getServer().getPluginCommand("enhance").setExecutor(new OpenEnhanceUi(enhanceUiOpener, equipmentEnhancer));
    }
    private void registerEvents(){
        serverInstance.getServer().getPluginManager().registerEvents(new EnhanceUIController(equipmentEnhancer), serverInstance);
    }

}
