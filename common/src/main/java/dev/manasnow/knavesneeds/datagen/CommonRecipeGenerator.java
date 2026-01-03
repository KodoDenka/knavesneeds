package dev.manasnow.knavesneeds.datagen;

import dev.manasnow.knavesneeds.Constants;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class CommonRecipeGenerator {
    public static void buildRecipesFor(RegistrySupplier< Item > item, Consumer<FinishedRecipe> exporter, Ingredient handle, Ingredient material, Ingredient binder) {

        //TODO Should be able to use a builder here for cleaner code.
        switch (item.get().toString().split("/")[2]) {
            case "longsword" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("H  ")
                    .pattern(" M ")
                    .pattern("  M")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "twinblade" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("  M")
                    .pattern(" H ")
                    .pattern("M  ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "rapier" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("  M")
                    .pattern(" M ")
                    .pattern("H  ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "katana" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("   ")
                    .pattern("HMM")
                    .pattern("   ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "sai" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern(" M ")
                    .pattern("H  ")
                    .pattern("   ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "spear" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("  M")
                    .pattern(" H ")
                    .pattern("H  ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "glaive" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("  M")
                    .pattern(" HM")
                    .pattern("H  ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "warglaive" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("   ")
                    .pattern(" B ")
                    .pattern("MHM")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    .define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "cutlass" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern(" B ")
                    .pattern("MM ")
                    .pattern("H  ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    .define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "claymore" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern(" BM")
                    .pattern("BMB")
                    .pattern("HB ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    .define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "greathammer" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("MMM")
                    .pattern("BBB")
                    .pattern(" H ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    .define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "greataxe" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("MMM")
                    .pattern("BHB")
                    .pattern(" H ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    .define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "chakram" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("BMB")
                    .pattern("M M")
                    .pattern("BHB")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    .define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "scythe" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern("MMH")
                    .pattern("MH ")
                    .pattern("H  ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    //.define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            case "halberd" -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, item.get(), 1)
                    .pattern(" MB")
                    .pattern("MHM")
                    .pattern("H  ")
                    //Handle
                    .define('H', handle)
                    //Material or Ingredient
                    .define('M', material)
                    //Binder
                    .define('B', binder)
                    // Check if any supported mod needs this?
                    .unlockedBy("has_material", inventoryTrigger(material))
                    .save(exporter, new ResourceLocation(Constants.MOD_ID, item.get().toString()));
            default -> Constants.LOG.info("Failed to make recipe for item: {}", item.get());
        }
    }

    protected static InventoryChangeTrigger.TriggerInstance inventoryTrigger(Ingredient ingredient) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ingredient.getItems()[0].getItem()).build());
    }
}