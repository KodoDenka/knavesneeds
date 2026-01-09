package dev.manasnow.knavesneeds.datagen;

import com.google.gson.JsonObject;
import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.registries.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class FabricRecipeProvider extends net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider {
    public FabricRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * This is a hacky fix to create ingredients for mods that aren't loaded.
     * If you mess with this, remember about the access widener
     */
    private static Ingredient ingredientFromId(String modId, String path) {
        return Ingredient.fromValues(Stream.of(new Ingredient.ItemValue(new ItemStack(
                BuiltInRegistries.ITEM.get(new ResourceLocation(modId, path))
        )) {
            @Override
            public JsonObject serialize() {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("item", new ResourceLocation(modId, path).toString());
                return jsonObject;
            }
        }));
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        Ingredient ironNugget = Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation("minecraft:iron_nugget")));
        Ingredient cSticks = Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("c", "wood_sticks")));

        String platform = "forge";

        if (platform.equals("fabric") || platform.equals("forge")) {

            //Twilight Forest
            Ingredient knightmetalIngot = ingredientFromId("twilight_forest","knightmetal_ingot");
            for (var item : TwilightForestAdditionsRegistries.KNIGHTMETAL_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, knightmetalIngot, ironNugget, "twilight_forest", platform);
            }

            //TODO also add shapless recipes
            Ingredient fieryIngot = ingredientFromId("twilight_forest","fiery_ingot");
            Ingredient blazeRod = Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation("minecraft:blaze_rod")));
            for (var item : TwilightForestAdditionsRegistries.FIERY_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, blazeRod, fieryIngot, ironNugget, "twilight_forest", platform);
            }

            Ingredient ironwoodIngot = ingredientFromId("twilight_forest","ironwood_ingot");
            for (var item : TwilightForestAdditionsRegistries.IRONWOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, ironwoodIngot, ironNugget, "twilight_forest", platform);
            }

            Ingredient steeleafIngot = ingredientFromId("twilight_forest","steeleaf_ingot");
            for (var item : TwilightForestAdditionsRegistries.STEELEAF_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, steeleafIngot, ironNugget, "twilight_forest", platform);
            }

            //Deeper Darker
            Ingredient wardenTemplate = ingredientFromId("deeperdarker","warden_upgrade_smithing_template");
            Ingredient echoShard = ingredientFromId("deeperdarker","reinforced_echo_shard");
            for (var item : DeeperDarkerAdditionsRegistries.WARDEN_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createAdvancedSmithingRecipe(item, exporter, wardenTemplate, echoShard, "simply_swords", "netherite_","deeperdarker", platform);
            }

            //Souls Weapons
            //TODO it needs the mod load to do this, either load the mod or look into a bypass.
            Ingredient lostSoul = ingredientFromId("soulsweapons","lost_soul");
            Ingredient soulIngot = ingredientFromId("soulsweapons","soul_ingot");
            for (var item : SoulsWeaponsAdditionsRegistries.TRANSLUCENT_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, soulIngot, lostSoul, ironNugget, "soulsweapons", platform);
            }
        }

        if (platform.equals("fabric")) {
            //Amethyst Imbuement
            //TODO Skip datagen for this, uses another thing.


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
            //TODO Spectrum doesn't exist yet. .-.
        }

        if (platform.equals("forge")) {
            //Blue Skies
            Ingredient pyropeGem = ingredientFromId("blue_skies","pyrope_gem");
            for (var item : BlueSkiesAdditionsRegistries.PYROPE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, pyropeGem, ironNugget, "blue_skies", platform);
            }

            Ingredient aquite = ingredientFromId("blue_skies","aquite");
            for (var item : BlueSkiesAdditionsRegistries.AQUITE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, aquite, ironNugget, "blue_skies", platform);
            }

            Ingredient diopsideGem = ingredientFromId("blue_skies","diopside_gem");
            for (var item : BlueSkiesAdditionsRegistries.DIOPSIDE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, diopsideGem, ironNugget, "blue_skies", platform);
            }

            Ingredient charoite = ingredientFromId("blue_skies","charoite");
            for (var item : BlueSkiesAdditionsRegistries.CHAROITE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, charoite, ironNugget, "blue_skies", platform);
            }

            Ingredient horizoniteIngot = ingredientFromId("blue_skies","horizonite_ingot");
            for (var item : BlueSkiesAdditionsRegistries.HORIZONITE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, horizoniteIngot, ironNugget, "blue_skies", platform);
            }

            Ingredient turquoiseCobblestone = ingredientFromId("blue_skies","turquoise_cobblestone");
            for (var item : BlueSkiesAdditionsRegistries.TURQUOISE_STONE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, turquoiseCobblestone, ironNugget, "blue_skies", platform);
            }

            Ingredient lunarCobblestone = ingredientFromId("blue_skies","lunar_cobblestone");
            for (var item : BlueSkiesAdditionsRegistries.LUNAR_STONE_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, lunarCobblestone, ironNugget, "blue_skies", platform);
            }

            Ingredient bluebrightPlanks = ingredientFromId("blue_skies","bluebright_planks");
            for (var item : BlueSkiesAdditionsRegistries.BLUEBRIGHT_WOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, bluebrightPlanks, ironNugget, "blue_skies", platform);
            }

            Ingredient lunarPlanks = ingredientFromId("blue_skies","lunar_planks");
            for (var item : BlueSkiesAdditionsRegistries.LUNAR_WOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, lunarPlanks, ironNugget, "blue_skies", platform);
            }

            Ingredient starlitPlanks = ingredientFromId("blue_skies","starlit_planks");
            for (var item : BlueSkiesAdditionsRegistries.STARLIT_WOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, starlitPlanks, ironNugget, "blue_skies", platform);
            }

            Ingredient duskPlanks = ingredientFromId("blue_skies","dusk_planks");
            for (var item : BlueSkiesAdditionsRegistries.DUSK_WOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, duskPlanks, ironNugget, "blue_skies", platform);
            }

            Ingredient frostbrightPlanks = ingredientFromId("blue_skies","frostbright_planks");
            for (var item : BlueSkiesAdditionsRegistries.FROSTBRIGHT_WOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, frostbrightPlanks, ironNugget, "blue_skies", platform);
            }

            Ingredient maplePlanks = ingredientFromId("blue_skies","maple_planks");
            for (var item : BlueSkiesAdditionsRegistries.MAPLE_WOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, maplePlanks, ironNugget, "blue_skies", platform);
            }

            Ingredient cometPlanks = ingredientFromId("blue_skies","comet_planks");
            for (var item : BlueSkiesAdditionsRegistries.COMET_WOOD_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, cometPlanks, ironNugget, "blue_skies", platform);
            }

            //FobiddenArcanus
            //TODO What the hell are these recipes????

            //Undergarden
            Ingredient cloggrumIngot = ingredientFromId("undergarden","cloggrum_ingot");
            for (var item : UndergardenAdditionsRegistries.CLOGGRUM_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, cloggrumIngot, ironNugget, "undergarden", platform);
            }

            Ingredient froststeelIngot = ingredientFromId("undergarden","froststeel_ingot");
            for (var item : UndergardenAdditionsRegistries.FROSTSTEEL_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, froststeelIngot, ironNugget, "undergarden", platform);
            }

            Ingredient uthericShard = ingredientFromId("undergarden","utheric_shard");
            for (var item : UndergardenAdditionsRegistries.UTHERIUM_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createShapedRecipe(item, exporter, cSticks, uthericShard, ironNugget, "undergarden", platform);
            }

            Ingredient forgottenIngot = ingredientFromId("undergarden","forgotten_ingot");
            Ingredient forgottenTemplate = ingredientFromId("undergarden","forgotten_upgrade_smithing_template");
            for (var item : UndergardenAdditionsRegistries.FORGOTTEN_ITEMS) {
                Constants.LOG.info("Attempting to make recipe for item: {}", item.get());
                CommonRecipeGenerator.createAdvancedSmithingRecipe(item, exporter, forgottenTemplate, forgottenIngot, "undergarden","cloggrum_", "undergarden", platform);
            }

        }
    }
}