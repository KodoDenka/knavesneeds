package dev.manasnow.knavesneeds.datagen;

import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.helpers.LoaderConditionalRecipe;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.Arrays;
import java.util.function.Consumer;

public class CommonRecipeGenerator {
    public static void createAdvancedSmithingRecipe(RegistrySupplier<Item> itemSupplier, Consumer<FinishedRecipe> exporter, Ingredient template, Ingredient addition, String baseNamespace, String baseTier, String modId, String platform) {
        Item item = itemSupplier.get();
        String itemType = item.toString().split("/")[2];

        SmithingTransformRecipeBuilder builder = SmithingTransformRecipeBuilder.smithing(
                template,
                Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation(baseNamespace, (baseTier + itemType)))),
                addition,
                RecipeCategory.COMBAT,
                item
        );

        builder.unlocks("has_material", inventoryTrigger(addition));

        // Use our custom wrapper to inject the mod condition
        builder.save(recipe -> exporter.accept(new LoaderConditionalRecipe(recipe, modId, platform)),
                new ResourceLocation(Constants.MOD_ID, item.toString()));
    }


    // Creates a shaped recipe based on predefined patterns.
    public static void createShapedRecipe(RegistrySupplier<Item> itemSupplier, Consumer<FinishedRecipe> exporter, Ingredient handle, Ingredient material, Ingredient binder, String modId, String platform) {
        Item item = itemSupplier.get();
        String itemType = item.toString().split("/")[2];

        //Selects the recipe pattern based on itemType.
        String[] pattern = switch (itemType) {
            case "longsword" -> new String[]{
                    "H  ",
                    " M ",
                    "  M"};
            case "twinblade" -> new String[]{
                    "  M",
                    " H ",
                    "M  "};
            case "rapier" -> new String[]{
                    "  M",
                    " M ",
                    "H  "};
            case "katana" -> new String[]{
                    "   ",
                    "HMM",
                    "   "};
            case "sai" -> new String[]{
                    " M ",
                    "H  ",
                    "   "};
            case "spear" -> new String[]{
                    "  M",
                    " H ",
                    "H  "};
            case "glaive" -> new String[]{
                    "  M",
                    " HM",
                    "H  "};
            case "warglaive" -> new String[]{
                    "   ",
                    " B ",
                    "MHM"};
            case "cutlass" -> new String[]{
                    " B ",
                    "MM ",
                    "H  "};
            case "claymore" -> new String[]{
                    " BM",
                    "BMB",
                    "HB "};
            case "greathammer" -> new String[]{
                    "MMM",
                    "BBB",
                    " H "};
            case "greataxe" -> new String[]{
                    "MMM",
                    "BHB",
                    " H "};
            case "chakram" -> new String[]{
                    "BMB",
                    "M M",
                    "BHB"};
            case "scythe" -> new String[]{
                    "MHM",
                    "MH ",
                    "H  "};
            case "halberd" -> new String[]{
                    " MB",
                    "MHM",
                    "H  "};
            default -> null;
        };

        //Makes sure the pattern is valid.
        if (pattern == null) {
            Constants.LOG.info("Pattern is null for item: {}", item);
            return;
        }

        //Using the pattern, creates the recipe.
        ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, item, 1);
        for (String row : pattern) {
            builder.pattern(row);
        }
        builder.define('H', handle)
                .define('M', material);

        // Cannot define binder if the pattern doesn't contain it.
        if (Arrays.toString(pattern).contains("B")) {
            builder.define('B', binder);
        }

        builder.unlockedBy("has_material", inventoryTrigger(material));

        // Saves a finished recipe to the exporter and injects mod loaded condition.
        builder.save(recipe -> exporter.accept(new LoaderConditionalRecipe(recipe, modId, platform)),
                new ResourceLocation(Constants.MOD_ID, item.toString()));
    }

    //Inventory trigger to help with unlockedBy for Datagen.
    protected static InventoryChangeTrigger.TriggerInstance inventoryTrigger(Ingredient ingredient) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ingredient.getItems()[0].getItem()).build());
    }
}