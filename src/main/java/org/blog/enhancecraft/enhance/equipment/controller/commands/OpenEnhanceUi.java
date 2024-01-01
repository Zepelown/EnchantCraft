package org.blog.enhancecraft.enhance.equipment.controller.commands;

import org.blog.enhancecraft.enhance.equipment.view.EnhanceUiOpener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OpenEnhanceUi implements CommandExecutor {

    private final EnhanceUiOpener enhanceUiOpener;

    public OpenEnhanceUi(EnhanceUiOpener enhanceUiOpener){
        this.enhanceUiOpener = enhanceUiOpener;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
                             @NotNull String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("플레이어로 입력이 가능합니다.");
            return false;
        }

        Player player = (Player) sender;

        enhanceUiOpener.openEnhanceUi(player);


        return false;
    }
}
