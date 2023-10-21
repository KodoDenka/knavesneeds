package net.knavesneeds.customitems.swords.betterend;

import net.knavesneeds.KnavesCommon;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class TerminiteSwordItem extends KnavesSwordItem {
    // Default super, with hardcoded values for itemGroup and Rarity.
    public TerminiteSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS));
    }
}