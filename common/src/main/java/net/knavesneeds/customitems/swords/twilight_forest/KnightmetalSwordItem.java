package net.knavesneeds.customitems.swords.twilight_forest;

import net.knavesneeds.KnavesCommon;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class KnightmetalSwordItem extends KnavesSwordItem {
    public KnightmetalSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS));
    }
}