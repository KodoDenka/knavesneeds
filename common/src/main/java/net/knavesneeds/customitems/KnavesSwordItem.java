package net.knavesneeds.customitems;


import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.compat.interfaces.InitialStackStateProvider;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;


public class KnavesSwordItem  extends SwordItem implements InitialStackStateProvider {
    public KnavesSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS));
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

    /**
     * Copyright 2022 Team BetterX
     *
     * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
     * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
     * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
     * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
     *
     * The above copyright notice and this permission notice shall be included in all copies or substantial portions
     * of the Software.
     *
     * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
     * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
     * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
     * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
     * IN THE SOFTWARE.
     *
     * The following code is from NetherSword.java and can be found here:
     * <a href = "https://github.com/quiqueck/BetterNether/blob/1.20/src/main/java/org/betterx/betternether/items/NetherSword.java>NetherSword Lines 22-25</a>
     */


    // Steeleaf, Ironwood and Ruby inventory enchant from creative menu.
    @Override
    public void putEnchantments(ItemStack stack, Map<Enchantment, Integer> defaultEnchants) {
        if (this.arch$holder().equals(new Item.Settings().arch$tab((RegistryKey<ItemGroup>)KnavesCommon.KNAVESNEEDS))){
            //SteelLeaf
            if (this.getMaterial().equals(ToolMaterialCompat.STEELEAF)) {
                defaultEnchants.put(Enchantments.LOOTING, 2);
                EnchantmentHelper.set(defaultEnchants, stack);
            }

            //Ironwood
            if (this.getMaterial().equals(ToolMaterialCompat.IRONWOOD)) {
                defaultEnchants.put(Enchantments.KNOCKBACK, 1);
                EnchantmentHelper.set(defaultEnchants, stack);
            }

            //Nether Ruby
            if (this.getMaterial().equals(ToolMaterialCompat.FLAMING_RUBY)) {
                defaultEnchants.put(Registries.ENCHANTMENT.get(new Identifier("betternether", "rubyfire")), 1);
                EnchantmentHelper.set(defaultEnchants, stack);
            }
        }
    }
}
