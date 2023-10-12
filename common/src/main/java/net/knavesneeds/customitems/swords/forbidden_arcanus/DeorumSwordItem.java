package net.knavesneeds.customitems.swords.forbidden_arcanus;

import net.knavesneeds.KnavesCommon;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class DeorumSwordItem extends KnavesSwordItem {
    public DeorumSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS));
    }
}
