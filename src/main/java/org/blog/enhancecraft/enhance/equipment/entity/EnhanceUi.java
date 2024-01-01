package org.blog.enhancecraft.enhance.equipment.entity;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class EnhanceUi {
    private Inventory ui;

    public EnhanceUi(){
        initSetting();
    }

    public Inventory getUi() {
        return ui;
    }

    private void initSetting(){
        ui = Bukkit.createInventory(null, 54, "강화");

        //왼쪽
        ui.setItem(1, UiDisplayItem.backgroundBlackGlassPane);
        ui.setItem(9, UiDisplayItem.backgroundBlackGlassPane);
        ui.setItem(11,UiDisplayItem.backgroundBlackGlassPane);

        //오른쪽
        ui.setItem(7, UiDisplayItem.backgroundBlackGlassPane);
        ui.setItem(15,UiDisplayItem.backgroundBlackGlassPane);
        ui.setItem(17,UiDisplayItem.backgroundBlackGlassPane);

        for (int i = 12; i < 15; i++){
            ui.setItem(i, UiDisplayItem.backgroundWhiteGlassPane);
        }
    }

}
