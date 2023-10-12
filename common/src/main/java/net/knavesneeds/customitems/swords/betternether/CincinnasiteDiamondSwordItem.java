package net.knavesneeds.customitems.swords.betternether;

import net.knavesneeds.KnavesCommon;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class CincinnasiteDiamondSwordItem extends KnavesSwordItem {
    public CincinnasiteDiamondSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS).fireproof());
    }
}
