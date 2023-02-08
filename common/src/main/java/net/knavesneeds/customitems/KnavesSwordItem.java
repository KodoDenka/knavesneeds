package net.knavesneeds.customitems;

import net.knavesneeds.KnavesCommon;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import static net.knavesneeds.KnavesCommon.*;

public class KnavesSwordItem  extends SwordItem {
    public KnavesSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().group(KnavesCommon.KNAVES_TAB));
    }



    //@Override
    //public Text getName(ItemStack stack) {
    //    return Text.translatable(this.getTranslationKey(stack)).formatted(Formatting.GOLD, Formatting.BOLD, Formatting.UNDERLINE);
    //}

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

    //@Override
    //Steeleaf
    public void fillItemCategory(ItemGroup tab, List<ItemStack> list) {
        if (this.getGroup() == tab) {
            ItemStack istack = new ItemStack(this);
            istack.addEnchantment(Enchantments.LOOTING, 2);
            list.add(istack);
        }
    }

/*

        public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> list) {
        if (this.allowdedIn(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.enchant(Enchantments.MOB_LOOTING, 2);
            list.add(istack);
        }

    }


 */
/*

    //Ironwood creation
        public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> list) {
        if (this.allowdedIn(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.enchant(Enchantments.KNOCKBACK, 1);
            list.add(istack);
        }

    }

    //Fiery creation
        public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment != Enchantments.FIRE_ASPECT && super.canApplyAtEnchantingTable(stack, enchantment);
    }

    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return !EnchantmentHelper.getEnchantments(book).containsKey(Enchantments.FIRE_ASPECT) && super.isBookEnchantable(stack, book);
    }

    //Steeleaf
        public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> list) {
        if (this.allowdedIn(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.enchant(Enchantments.MOB_LOOTING, 2);
            list.add(istack);
        }

    }

    //Undergarden creation
        protected static Rarity isForgotten(Tier tier) {
        return tier.equals(UGItemTiers.FORGOTTEN) ? UGItems.FORGOTTEN : Rarity.COMMON;
    }


        //Blue skies creation should be it's own class due to mod_id and other issues.

*/

}
