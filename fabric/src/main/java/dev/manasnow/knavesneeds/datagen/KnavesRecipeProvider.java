package dev.manasnow.knavesneeds.datagen;

import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.registries.AmethystImbuementAdditionsRegistries;
import dev.manasnow.knavesneeds.registries.BetterEndAdditionsRegistries;
import dev.manasnow.knavesneeds.registries.BetterNetherAdditionsRegistries;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class KnavesRecipeProvider extends FabricRecipeProvider {
    public KnavesRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {

        for (var item : AmethystImbuementAdditionsRegistries.AMETRINE_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks"))), Ingredient.of(Items.STONE), Ingredient.of(Items.STONE), "amethyst_imbuement");
        }
        for (var item : AmethystImbuementAdditionsRegistries.GARNET_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks"))), Ingredient.of(Items.STONE), Ingredient.of(Items.STONE), "amethyst_imbuement");
        }

        //Better End Recipe Datagen
        for (var item : BetterEndAdditionsRegistries.AETERNIUM_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks"))), Ingredient.of(Items.STONE), Ingredient.of(Items.STONE), "better_end");
        }
        for (var item : BetterEndAdditionsRegistries.TERMINITE_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks"))), Ingredient.of(Items.STONE), Ingredient.of(Items.STONE), "better_end" );
        }
        for (var item : BetterEndAdditionsRegistries.THALLASIUM_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks"))), Ingredient.of(Items.STONE), Ingredient.of(Items.STONE), "better_end");
        }

        //Better Nether Recipe Datagen
        for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks"))), Ingredient.of(Items.STONE), Ingredient.of(Items.STONE), "better_nether");
        }

        for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_DIAMOND_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createAdvancedSmithingRecipe(item, exporter, Ingredient.of(Items.STONE), Ingredient.of(Items.DIAMOND), "simply_swords","diamond_", "better_nether");
        }
    }
}