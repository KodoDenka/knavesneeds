package dev.manasnow.knavesneeds.datagen;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;

import java.util.function.Consumer;

public class CommonRecipeGenerator {
    public static void generate(Consumer<FinishedRecipe> exporter) {
        // Shared recipe logic here using standard Minecraft classes
    }

    public static void generateSword(String material, Item ingredient, Consumer<FinishedRecipe> consumer) {
        // Common logic
    }
}