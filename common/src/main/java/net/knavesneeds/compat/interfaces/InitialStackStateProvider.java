package net.knavesneeds.compat.interfaces;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantment;

import java.util.HashMap;
import java.util.Map;

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
 * The following code is from InitialStackStateProvider and can be found here:
 * <a href = "https://github.com/quiqueck/BetterNether/blob/1.20/src/main/java/org/betterx/betternether/interfaces/InitialStackStateProvider.java#L12>InitialStackStateProvider Lines 12-21</a>
 */

public interface InitialStackStateProvider {
    default void initializeState(ItemStack stack) {
        putEnchantments(stack, new HashMap<>());
    }

    void putEnchantments(ItemStack stack, Map<Enchantment, Integer> defaultEnchants);
}

