package org.blog.enhancecraft.enhance.equipment.view;

import java.util.HashMap;
import org.blog.enhancecraft.enhance.equipment.entity.EnhanceUI;
import org.bukkit.entity.Player;

public class EnhanceUIOpener {
    public EnhanceUI openEnhanceUi(Player player){
        EnhanceUI newEnhanceUI = new EnhanceUI();
        player.openInventory(newEnhanceUI.getUi());
        return newEnhanceUI;
    }

}
