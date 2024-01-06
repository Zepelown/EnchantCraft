package org.blog.enhancecraft.enhance.equipment.entity;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class EnhanceUI {
    private Inventory ui;

    public EnhanceUI(){
        initSetting();
    }

    public Inventory getUi() {
        return ui;
    }

    public void startEnhance(){
        for (int i = 12; i < 15; i++){
            ui.setItem(i, UIDisplayItem.enhanceEffectYellowGlassPane);
        }
    }

    private void initSetting(){
        ui = Bukkit.createInventory(null, 54, "강화");

        //왼쪽
        ui.setItem(1, UIDisplayItem.backgroundBlackGlassPane);
        ui.setItem(9, UIDisplayItem.backgroundBlackGlassPane);
        ui.setItem(11, UIDisplayItem.backgroundBlackGlassPane);
        ui.setItem(19, UIDisplayItem.backgroundBlackGlassPane);

        //오른쪽
        ui.setItem(7, UIDisplayItem.backgroundBlackGlassPane);
        ui.setItem(15, UIDisplayItem.backgroundBlackGlassPane);
        ui.setItem(17, UIDisplayItem.backgroundBlackGlassPane);
        ui.setItem(25, UIDisplayItem.backgroundBlackGlassPane);

        //강화 게이지
        for (int i = 12; i < 15; i++){
            ui.setItem(i, UIDisplayItem.backgroundWhiteGlassPane);
        }

        //강화 버튼
        ui.setItem(39, UIDisplayItem.buttonEnhancement);
    }

}
