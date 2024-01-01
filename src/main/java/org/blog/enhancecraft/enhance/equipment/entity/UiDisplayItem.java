package org.blog.enhancecraft.enhance.equipment.entity;

import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class UiDisplayItem {

    public static final ItemStack backgroundBlackGlassPane
            = buildItem(Material.BLACK_STAINED_GLASS_PANE, 1, "", "");

    public static final ItemStack backgroundWhiteGlassPane
            = buildItem(Material.WHITE_STAINED_GLASS_PANE,1,"","");

    public static final ItemStack backgroundChain
            = buildItem(Material.CHAIN,1,"","");

    public static final ItemStack backgroundLimeGlassPane
            = buildItem(Material.LIME_STAINED_GLASS_PANE,1,"","");

    public static final ItemStack backgroundRedGlassPane
            = buildItem(Material.RED_STAINED_GLASS_PANE, 1, "" ,"");

    public static final ItemStack backgroundIronBars
            = buildItem(Material.IRON_BARS,1,"", "");

    public static final ItemStack buttonEnhancement
            = buildItem(Material.ANVIL, 1,"강화 시작하기","테스트");

    public static final ItemStack buttonExit
            = buildItem(Material.BARRIER, 1, "나가기","");

    public static final ItemStack guideSign
            = buildItem(Material.OAK_HANGING_SIGN,1,"여기 사이에 강화 재료를 넣어주세요","");


    private static ItemStack buildItem(Material type, int amount, String displayName, String... lore) {
        ItemStack stack = new ItemStack(type, amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        stack.setItemMeta(meta);
        return stack;
    }
}
