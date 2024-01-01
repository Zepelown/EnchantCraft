package org.blog.enhancecraft.enhance.equipment.controller;

import org.blog.enhancecraft.EnhanceCraft;
import org.blog.enhancecraft.enhance.equipment.controller.commands.OpenEnhanceUi;
import org.blog.enhancecraft.enhance.equipment.view.EnhanceUiOpener;

public class EnhanceEquipmentController {
    private final EnhanceCraft serverInstance;

    private static EnhanceUiOpener enhanceUiOpener;

    public EnhanceEquipmentController(){
        this.serverInstance = EnhanceCraft.getServerInstance();
        this.enhanceUiOpener = new EnhanceUiOpener();

        registerCommands();
    }

    private void registerCommands(){
        serverInstance.getServer().getPluginCommand("openEnhance").setExecutor(new OpenEnhanceUi(enhanceUiOpener));
    }

}
