package net.knavesneeds.customitems.swords.deeperdarker;

import net.knavesneeds.KnavesCommon;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;

public class WardenSwordItem extends KnavesSwordItem {

    public WardenSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        // Default super, with hardcoded values for itemGroup and Rarity.
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS).rarity(Rarity.RARE).fireproof());
    }


}
