package net.knavesneeds.compat;

import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import org.betterx.bclib.recipes.AnvilRecipe;

public class BetterEndRecipeCompat {
    public static void register() {

        //Aeternium Recipes
        AnvilRecipe.create("aeternium_chakram_head")
                .setInput("betterend:aeternium_ingot")
                .setInputCount(3)
                .setOutput((ItemConvertible) BetterEndCompat.AETERNIUM_CHAKRAM_HEAD)
                .setAnvilLevel(6)
                .setToolLevel(6)
                .setDamage(6)
                .build();

        AnvilRecipe.create("aeternium_claymore_head")
                .setInput("betterend:aeternium_ingot")
                .setInputCount(3)
                .setOutput((ItemConvertible) BetterEndCompat.AETERNIUM_CLAYMORE_HEAD)
                .setAnvilLevel(6)
                .setToolLevel(6)
                .setDamage(6)
                .build();

        AnvilRecipe.create("aeternium_cutlass_head")
                .setInput("betterend:aeternium_ingot")
                .setInputCount(3)
                .setOutput((ItemConvertible) BetterEndCompat.AETERNIUM_CUTLASS_HEAD)
                .setAnvilLevel(6)
                .setToolLevel(6)
                .setDamage(6)
                .build();

        //Terminite Recipes





        //Thallasium Recipes


    }
}
