package org.blog.enhancecraft;

import org.blog.enhancecraft.enhance.equipment.controller.EnhanceEquipmentController;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnhanceCraft extends JavaPlugin {

    private static EnhanceCraft serverInstance;
    private static EnhanceEquipmentController enhanceEquipmentController;

    @Override
    public void onEnable() {
        serverInstance = this;
        enhanceEquipmentController = new EnhanceEquipmentController();

        // Plugin startup logic
        getLogger().info("플러그인 시작 테스트");
        //
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인 종료 테스트");
    }

    public static EnhanceCraft getServerInstance() {
        return serverInstance;
    }
}
