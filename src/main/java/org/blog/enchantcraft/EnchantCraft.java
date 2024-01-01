package org.blog.enchantcraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantCraft extends JavaPlugin {
    public static EnchantCraft serverInstance;
    @Override
    public void onEnable() {
        serverInstance = this;
        // Plugin startup logic
        getLogger().info("플러그인 시작 테스트");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인 종료 테스트");
    }

    public static EnchantCraft getServerInstance() {
        return serverInstance;
    }
}
