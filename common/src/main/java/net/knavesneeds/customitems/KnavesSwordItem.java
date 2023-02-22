package net.knavesneeds.customitems;

import io.github.fabricators_of_create.porting_lib.enchant.CustomEnchantingBehaviorItem;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.sweenus.simplyswords.SimplySwords;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.knavesneeds.KnavesCommon.*;

public class KnavesSwordItem  extends SwordItem implements CustomEnchantingBehaviorItem {
    String[] repairIngredient;
    public KnavesSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, String... repairIngredient) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().group(SimplySwords.SIMPLYSWORDS));

        this.repairIngredient = repairIngredient;
    }

    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        List<Item> potentialIngredients = new ArrayList<>(List.of());
        Arrays.stream(repairIngredient).toList().forEach(repIngredient ->
                potentialIngredients.add(
                        Registry.ITEM.get(new Identifier(repIngredient))));


        return potentialIngredients.contains(ingredient.getItem());
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
        }
    }

    // Steeleaf / Ironwood inventory enchant
    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> stacks) {
            ItemStack istack = new ItemStack(this);

            //SteelLeaf
            if (this.getMaterial().equals(ToolMaterialCompat.STEELEAF)) {
                istack.addEnchantment(Enchantments.LOOTING, 2);
            }

            //Ironwood
            if (this.getMaterial().equals(ToolMaterialCompat.IRONWOOD)) {
                istack.addEnchantment(Enchantments.KNOCKBACK, 1);
            }
            stacks.add(istack);
    }


    //Fiery creation
    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        if (stack.getItem() instanceof KnavesSwordItem swordItem) {
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FIERY)) {
                return enchantment != Enchantments.FIRE_ASPECT;
            }
        }
        return CustomEnchantingBehaviorItem.super.canApplyAtEnchantingTable(stack, enchantment);
    }


    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        if (stack.getItem() instanceof KnavesSwordItem swordItem) {
            if (swordItem.getMaterial().equals(ToolMaterialCompat.FIERY)) {
                return !book.getEnchantments().contains(Enchantments.FIRE_ASPECT) && CustomEnchantingBehaviorItem.super.isBookEnchantable(stack, book);
            }
        }
        return CustomEnchantingBehaviorItem.super.isBookEnchantable(stack, book);
    }

}
