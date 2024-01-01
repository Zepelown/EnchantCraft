package org.blog.enhancecraft.enhance.equipment.view;

import java.util.HashMap;
import org.blog.enhancecraft.enhance.equipment.entity.EnhanceUi;
import org.bukkit.entity.Player;

public class EnhanceUiOpener {
    private static HashMap<Player, EnhanceUi> playerEnhanceUi = new HashMap<>();

    public void openEnhanceUi(Player player){
        EnhanceUi newEnhanceUi = new EnhanceUi();
        playerEnhanceUi.put(player, newEnhanceUi);
        player.openInventory(newEnhanceUi.getUi());
    }

}
