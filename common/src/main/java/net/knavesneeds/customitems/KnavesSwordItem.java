package net.knavesneeds.customitems;


import dev.architectury.platform.Platform;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.sweenus.simplyswords.SimplySwords;
import org.betterx.betternether.enchantments.RubyFire;

import java.util.List;

import static org.betterx.betternether.registry.NetherEnchantments.RUBY_FIRE;

public class KnavesSwordItem  extends SwordItem {
    public KnavesSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().group(SimplySwords.SIMPLYSWORDS));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        if (itemStack.getItem() instanceof KnavesSwordItem swordItem) {
            // Undergarden Tooltips
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FROSTSTEEL)) {
                tooltip.add(new TranslatableText("tooltip.froststeel_sword").formatted((Formatting.AQUA)));
            }
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FORGOTTEN)) {
                tooltip.add(new TranslatableText("tooltip.forgotten_sword").formatted(Formatting.GREEN));
            }
            if (swordItem.getMaterial().equals(ToolMaterialCompat.UTHERIUM)) {
                tooltip.add(new TranslatableText("tooltip.utheric_sword").formatted(Formatting.RED));
            }
            // Twilight Forest Tooltips
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FIERY)) {
                tooltip.add(new TranslatableText("item.twilightforest.fiery_sword.tooltip").formatted(Formatting.GRAY));
            }
            if (swordItem.getMaterial().equals(ToolMaterialCompat.KNIGHTMETAL)) {
                tooltip.add(new TranslatableText("item.twilightforest.knightmetal_sword.tooltip").formatted(Formatting.GRAY));
            }
            // Blue Skies Tooltips
            if (swordItem.getMaterial().equals(ToolMaterialCompat.HORIZONITE)) {
                tooltip.add(new TranslatableText("gui.blue_skies.item.ability.fire").formatted(Formatting.GRAY));
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
                itemStack.addEnchantment(Registry.ENCHANTMENT.get(new Identifier("betternether","rubyfire")), 1);
            }

            stacks.add(itemStack);
        }
    }
}
