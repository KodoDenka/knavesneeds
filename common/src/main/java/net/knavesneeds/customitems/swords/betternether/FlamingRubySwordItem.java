package net.knavesneeds.customitems.swords.betternether;

import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.interfaces.InitialStackStateProvider;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.Map;

public class FlamingRubySwordItem extends KnavesSwordItem implements InitialStackStateProvider {
    public FlamingRubySwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS).rarity(Rarity.RARE).fireproof());
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

    @Override
    public void putEnchantments(ItemStack stack, Map<Enchantment, Integer> defaultEnchants) {
        if (this.arch$holder().equals(new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS))) {
            defaultEnchants.put(Registries.ENCHANTMENT.get(new Identifier("betternether", "rubyfire")), 1);
            EnchantmentHelper.set(defaultEnchants, stack);
        }
    }
}
