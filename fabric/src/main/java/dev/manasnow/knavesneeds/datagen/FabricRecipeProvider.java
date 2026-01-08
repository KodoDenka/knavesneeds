package dev.manasnow.knavesneeds.datagen;

import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.registries.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class FabricRecipeProvider extends net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider {
    public FabricRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        Ingredient ironNugget = Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation("minecraft:iron_nugget")));
        Ingredient cSticks = Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks")));

        String platform = "forge";

        if (platform.equals("fabric") || platform.equals("forge")) {
            //Twilight Forest
            for (var item : TwilightForestAdditionsRegistries.KNIGHTMETAL_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "twilight_forest", platform);
            }
            for (var item : TwilightForestAdditionsRegistries.FIERY_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "twilight_forest", platform);
            }
            for (var item : TwilightForestAdditionsRegistries.IRONWOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "twilight_forest", platform);
            }
            for (var item : TwilightForestAdditionsRegistries.STEELEAF_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "twilight_forest", platform);
            }

            //Deeper Darker
            for (var item : DeeperDarkerAdditionsRegistries.WARDEN_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "deeperdarker", platform);
            }

            //Souls Weapons
            //TODO it needs the mod load to do this, either load the mod or look into a bypass.
            Ingredient lostSoul = Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation("soulsweapons:lost_soul")));
            Ingredient soulIngot = Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation("soulsweapons:soul_ingot")));
            for (var item : SoulsWeaponsAdditionsRegistries.TRANSLUCENT_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, soulIngot, lostSoul, ironNugget, "soulsweapons", platform);
            }
        }

        if (platform.equals("fabric")) {
            //Amethyst Imbuement

            //Better End
            for (var item : BetterEndAdditionsRegistries.AETERNIUM_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "better_end", platform);
            }
            for (var item : BetterEndAdditionsRegistries.TERMINITE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "better_end", platform);
            }
            for (var item : BetterEndAdditionsRegistries.THALLASIUM_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "better_end", platform);
            }

            //Better Nether
            for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "better_nether", platform);
            }

            for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_DIAMOND_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createAdvancedSmithingRecipe(item, exporter, Ingredient.of(Items.STONE), Ingredient.of(Items.DIAMOND), "simply_swords","diamond_", "better_nether", platform);
            }

            //Spectrum
        }

        if (platform.equals("forge")) {
            //Blue Skies
            for (var item : BlueSkiesAdditionsRegistries.PYROPE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "blue_skies", platform);
            }

            //FobiddenArcanus


            //Undergarden

        }


        for (var item : AmethystImbuementAdditionsRegistries.AMETRINE_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "amethyst_imbuement", platform);
        }
        for (var item : AmethystImbuementAdditionsRegistries.GARNET_ITEMS) {
            Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
            CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, Ingredient.of(Items.STONE), ironNugget, "amethyst_imbuement", platform);
        }
    }
}