package dev.manasnow.knavesneeds.datagen;

import dev.manasnow.knavesneeds.registries.AmethystImbuementAdditionsRegistries;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;

import java.util.function.Consumer;

public class KnavesRecipeProvider extends FabricRecipeProvider {
    public KnavesRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AmethystImbuementAdditionsRegistries.AMETRINE_ITEMS.CHAKRAM.get(), 1)
                .pattern("AAA");
    }
}
