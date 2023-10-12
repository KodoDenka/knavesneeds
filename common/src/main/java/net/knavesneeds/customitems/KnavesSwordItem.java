package net.knavesneeds.customitems;


import net.knavesneeds.compat.ToolMaterialCompat;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;


public class KnavesSwordItem extends SwordItem {

    // Starting super
    public KnavesSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings itemSettings) {
        super(toolMaterial, attackDamage, attackSpeed, itemSettings);
    }

    // Tooltip Manger
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        if (itemStack.getItem() instanceof KnavesSwordItem swordItem) {
            // Undergarden Tooltips
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FROSTSTEEL)) {
                tooltip.add(Text.translatable("tooltip.froststeel_sword").formatted((Formatting.AQUA)));
            }
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FORGOTTEN)) {
                tooltip.add(Text.translatable("tooltip.forgotten_sword").formatted(Formatting.GREEN));
            }
            if (swordItem.getMaterial().equals(ToolMaterialCompat.UTHERIUM)) {
                tooltip.add(Text.translatable("tooltip.utheric_sword").formatted(Formatting.RED));
            }
            // Twilight Forest Tooltips
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FIERY)) {
                tooltip.add(Text.translatable("item.twilightforest.fiery_sword.tooltip").formatted(Formatting.GRAY));
            }
            if (swordItem.getMaterial().equals(ToolMaterialCompat.KNIGHTMETAL)) {
                tooltip.add(Text.translatable("item.twilightforest.knightmetal_sword.tooltip").formatted(Formatting.GRAY));
            }
            // Blue Skies Tooltips
            if (swordItem.getMaterial().equals(ToolMaterialCompat.HORIZONITE)) {
                tooltip.add(Text.translatable("gui.blue_skies.item.ability.fire").formatted(Formatting.GRAY));
            }
        }
    }
}
