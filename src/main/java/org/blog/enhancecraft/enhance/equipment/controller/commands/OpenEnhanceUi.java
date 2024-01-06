package org.blog.enhancecraft.enhance.equipment.controller.commands;

import org.blog.enhancecraft.enhance.equipment.entity.EnhanceUI;
import org.blog.enhancecraft.enhance.equipment.service.EquipmentEnhancer;
import org.blog.enhancecraft.enhance.equipment.view.EnhanceUIOpener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OpenEnhanceUi implements CommandExecutor {

    private final EnhanceUIOpener enhanceUiOpener;
    private final EquipmentEnhancer equipmentEnhancer;

    public OpenEnhanceUi(EnhanceUIOpener enhanceUiOpener, EquipmentEnhancer equipmentEnhancer){
        this.enhanceUiOpener = enhanceUiOpener;
        this.equipmentEnhancer = equipmentEnhancer;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
                             @NotNull String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("플레이어로 입력이 가능합니다.");
            return false;
        }

        Player player = (Player) sender;

        EnhanceUI playerEnhanceUI = enhanceUiOpener.openEnhanceUi(player);
        equipmentEnhancer.addPlayer(player, playerEnhanceUI);

        return false;
    }
}
