package net.knavesneeds.customitems;


import net.knavesneeds.compat.ToolMaterialCompat;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.registry.Registries;
import net.minecraft.world.World;
import net.sweenus.simplyswords.SimplySwords;


import java.util.List;

public class KnavesSwordItem  extends SwordItem {
    public KnavesSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().group(SimplySwords.SIMPLYSWORDS));
    }

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

    // Steeleaf & Ironwood inventory enchant from creative menu
    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> stacks) {
        if (this.isIn(group)) {
            ItemStack itemStack = new ItemStack(this);
            //SteelLeaf
            if (this.getMaterial().equals(ToolMaterialCompat.STEELEAF)) {
                itemStack.addEnchantment(Enchantments.LOOTING, 2);
            }

            //Ironwood
            if (this.getMaterial().equals(ToolMaterialCompat.IRONWOOD)) {
                itemStack.addEnchantment(Enchantments.KNOCKBACK, 1);
            }

            //Nether Ruby
            if (this.getMaterial().equals(ToolMaterialCompat.NETHER_RUBY)) {
                itemStack.addEnchantment(Registries.ENCHANTMENT.get(new Identifier("betternether","rubyfire")), 1);
            }

            stacks.add(itemStack);
        }
    }
}
