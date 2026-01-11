package dev.manasnow.knavesneeds.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConditionalShapedRecipeBuilder extends ShapedRecipeBuilder {

    public ConditionalShapedRecipeBuilder(RecipeCategory category, ItemLike result, int count) {
        super(category, result, count);
    }


    public static ConditionalShapedRecipeBuilder shaped(RecipeCategory category, ItemLike result, int count) {
        return new ConditionalShapedRecipeBuilder(category, result, count);
    }

    @Override
    public void save(Consumer<FinishedRecipe> finishedRecipeConsumer, ResourceLocation recipeId) {
        this.ensureValid(recipeId);
        this.advancement.parent(ROOT_RECIPE_ADVANCEMENT).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(recipeId)).rewards(net.minecraft.advancements.AdvancementRewards.Builder.recipe(recipeId)).requirements(RequirementsStrategy.OR);
        finishedRecipeConsumer.accept(new Result(recipeId, this.result, this.count, this.group == null ? "" : this.group, determineBookCategory(this.category), this.rows, this.key, this.advancement, recipeId.withPrefix("recipes/" + this.category.getFolderName() + "/"), this.showNotification));
    }

    static class Result extends CraftingRecipeBuilder.CraftingResult {
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final String group;
        private final List<String> pattern;
        private final Map<Character, Ingredient> key;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;
        private final boolean showNotification;

        public Result(ResourceLocation id, Item result, int count, String group, CraftingBookCategory category, List<String> pattern, Map<Character, Ingredient> key, Advancement.Builder advancement, ResourceLocation advancementId, boolean showNotification) {
            super(category);
            this.id = id;
            this.result = result;
            this.count = count;
            this.group = group;
            this.pattern = pattern;
            this.key = key;
            this.advancement = advancement;
            this.advancementId = advancementId;
            this.showNotification = showNotification;
        }

        public void serializeRecipeData(JsonObject json) {
            super.serializeRecipeData(json);
            if (!this.group.isEmpty()) {
                json.addProperty("group", this.group);
            }

            JsonArray jsonarray = new JsonArray();

            for(String s : this.pattern) {
                jsonarray.add(s);
            }

            json.add("pattern", jsonarray);
            JsonObject jsonobject = new JsonObject();

            for(Map.Entry<Character, Ingredient> entry : this.key.entrySet()) {
                jsonobject.add(String.valueOf(entry.getKey()), ((Ingredient)entry.getValue()).toJson());
            }

            json.add("key", jsonobject);
            JsonObject jsonobject1 = new JsonObject();
            jsonobject1.addProperty("item", BuiltInRegistries.ITEM.getKey(this.result).toString());
            if (this.count > 1) {
                jsonobject1.addProperty("count", this.count);
            }

            json.add("result", jsonobject1);
            json.addProperty("show_notification", this.showNotification);
        }

    /*
     *     // Creates a shaped recipe based on predefined patterns.
     *     public static void createShapedRecipe(RegistrySupplier<Item> itemSupplier, Consumer<FinishedRecipe> exporter, Ingredient handle, Ingredient material, Ingredient binder, String modId, String platform) {
     *         Item item = itemSupplier.get();
     *         String itemType = item.toString().split("/")[2];
     *
     *         //Selects the recipe pattern based on itemType.
     *         String[] pattern = switch (itemType) {
     *             case "longsword" -> new String[]{
     *                     "H  ",
     *                     " M ",
     *                     "  M"};
     *             case "twinblade" -> new String[]{
     *                     "  M",
     *                     " H ",
     *                     "M  "};
     *             case "rapier" -> new String[]{
     *                     "  M",
     *                     " M ",
     *                     "H  "};
     *             case "katana" -> new String[]{
     *                     "   ",
     *                     "HMM",
     *                     "   "};
     *             case "sai" -> new String[]{
     *                     " M ",
     *                     "H  ",
     *                     "   "};
     *             case "spear" -> new String[]{
     *                     "  M",
     *                     " H ",
     *                     "H  "};
     *             case "glaive" -> new String[]{
     *                     "  M",
     *                     " HM",
     *                     "H  "};
     *             case "warglaive" -> new String[]{
     *                     "   ",
     *                     " B ",
     *                     "MHM"};
     *             case "cutlass" -> new String[]{
     *                     " B ",
     *                     "MM ",
     *                     "H  "};
     *             case "claymore" -> new String[]{
     *                     " BM",
     *                     "BMB",
     *                     "HB "};
     *             case "greathammer" -> new String[]{
     *                     "MMM",
     *                     "BBB",
     *                     " H "};
     *             case "greataxe" -> new String[]{
     *                     "MMM",
     *                     "BHB",
     *                     " H "};
     *             case "chakram" -> new String[]{
     *                     "BMB",
     *                     "M M",
     *                     "BHB"};
     *             case "scythe" -> new String[]{
     *                     "MHM",
     *                     "MH ",
     *                     "H  "};
     *             case "halberd" -> new String[]{
     *                     " MB",
     *                     "MHM",
     *                     "H  "};
     *             default -> null;
     *         };
     *
     *         //Makes sure the pattern is valid.
     *         if (pattern == null) {
     *             Constants.LOG.info("Pattern is null for item: {}", item);
     *             return;
     *         }
     *
     *         //Using the pattern, creates the recipe.
     *         ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, item, 1);
     *         for (String row : pattern) {
     *             builder.pattern(row);
     *         }
     *         builder.define('H', handle)
     *                 .define('M', material);
     *
     *         // Cannot define binder if the pattern doesn't contain it.
     *         if (Arrays.toString(pattern).contains("B")) {
     *             builder.define('B', binder);
     *         }
     *
     *         builder.unlockedBy("has_material", inventoryTrigger(material));
     *
     *         builder.save(exporter, new ResourceLocation(Constants.MOD_ID, item.toString()));
     *
     *         // Saves a finished recipe to the exporter and injects mod loaded condition.
     *         //builder.save(recipe -> exporter.accept(new LoaderConditionalRecipe(recipe, modId, platform)),
     *         //        new ResourceLocation(Constants.MOD_ID, item.toString()));
     *     }
     */
}

