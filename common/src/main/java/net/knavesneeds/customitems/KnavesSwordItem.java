package net.knavesneeds.customitems;

import net.knavesneeds.KnavesCommon;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.List;

import static net.knavesneeds.KnavesCommon.*;

public class KnavesSwordItem  extends SwordItem {
    public KnavesSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().group(KnavesCommon.KNAVES_TAB));

    }


/*
    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable(this.getTranslationKey(stack)).formatted(Formatting.GOLD, Formatting.BOLD, Formatting.UNDERLINE);
    }
 */



    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        //Undergarden Tooltips
        if (itemStack.isIn(FROSTSTEEL_WEAPON)) {
            tooltip.add(Text.translatable("tooltip.froststeel_sword").formatted((Formatting.AQUA)));
        }
        if (itemStack.isIn(FORGOTTEN_WEAPON)) {
            tooltip.add(Text.translatable("tooltip.forgotten_sword").formatted(Formatting.GREEN));
        }
        if (itemStack.isIn(UTHERIUM_WEAPON)) {
            tooltip.add(Text.translatable("tooltip.utheric_sword").formatted(Formatting.RED));
        }

        //Twilight Forest Tooltips
        if (itemStack.isIn(FIERY_WEAPON)) {
            tooltip.add(Text.translatable("item.twilightforest.fiery_sword.tooltip").formatted(Formatting.GRAY));
        }

        if (itemStack.isIn(KNIGHTMETAL_WEAPON)) {
            tooltip.add(Text.translatable("item.twilightforest.knightmetal_sword.tooltip").formatted(Formatting.GRAY));
        }
    }

    //Steeleaf

    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> stacks) {
        if (this.isIn(group)) {
            ItemStack istack = new ItemStack(this);

            //SteelLeaf
            if (istack.isIn(STEELEAF_WEAPON)) {
                istack.addEnchantment(Enchantments.LOOTING, 2);

            }

            //Ironwood
            if (istack.isIn(IRONWOOD_WEAPON)) {
                istack.addEnchantment(Enchantments.KNOCKBACK, 1);
            }
            stacks.add(istack);
        }
    }
/*


    //Fiery creation
        public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment != Enchantments.FIRE_ASPECT && super.canApplyAtEnchantingTable(stack, enchantment);
    }

    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return !EnchantmentHelper.getEnchantments(book).containsKey(Enchantments.FIRE_ASPECT) && super.isBookEnchantable(stack, book);
    }

    //Undergarden creation
        protected static Rarity isForgotten(Tier tier) {
        return tier.equals(UGItemTiers.FORGOTTEN) ? UGItems.FORGOTTEN : Rarity.COMMON;
    }
*/

}
