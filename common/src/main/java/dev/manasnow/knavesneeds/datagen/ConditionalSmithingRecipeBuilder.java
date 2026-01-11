package dev.manasnow.knavesneeds.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConditionalSmithingRecipeBuilder extends SmithingTransformRecipeBuilder {
    private final String platform;
    private final Ingredient template;
    private final Ingredient base;
    private final Ingredient addition;
    private final RecipeCategory category;
    private final Item result;
    private final Advancement.Builder advancement = Advancement.Builder.recipeAdvancement();
    private final RecipeSerializer<?> type;

    // Inventory trigger helper
    private static InventoryChangeTrigger.TriggerInstance inventoryTrigger(Ingredient ingredient) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ingredient.getItems()[0].getItem()).build());
    }

    public ConditionalSmithingRecipeBuilder(RecipeSerializer<?> type, Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result, String platform) {
        super(type, template, base, addition, category, result);
        this.template = template;
        this.base = base;
        this.addition = addition;
        this.category = category;
        this.result = result;
        this.type = type;
        this.platform = platform;
    }

    //public static ConditionalSmithingRecipeBuilder smithing(
    //        RecipeSerializer<?> type, Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result) {
    //    return new ConditionalSmithingRecipeBuilder(type, template, base, addition, category, result);
    //}

    // New static helper to match usage in FabricRecipeProvider
    public static void smithing(Supplier<Item> itemSupplier, Consumer<FinishedRecipe> exporter, Ingredient template, Ingredient addition, String baseNamespace, String baseTier, String modId, String platform) {
        Item item = itemSupplier.get();
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);

        // Gets the path and type of weapon.
        String path = itemId.getPath();
        String weaponType = path.substring(path.lastIndexOf('_') + 1);

        ResourceLocation baseLocation = new ResourceLocation(baseNamespace, baseTier + weaponType);
        Item baseItem = BuiltInRegistries.ITEM.get(baseLocation);

        ConditionalSmithingRecipeBuilder builder = new ConditionalSmithingRecipeBuilder(
                RecipeSerializer.SMITHING_TRANSFORM,
                template,
                Ingredient.of(baseItem),
                addition,
                RecipeCategory.COMBAT,
                item,
                platform);

        builder.unlocks("has_material", inventoryTrigger(addition));
        builder.save(exporter, itemId, modId, platform);
    }

    public void save(Consumer<FinishedRecipe> recipeConsumer, ResourceLocation location) {
        // Default save behavior if needed, defaulting to no conditions or empty strings
        this.save(recipeConsumer, location, "", "");
    }

    public void save(Consumer<FinishedRecipe> recipeConsumer, ResourceLocation location, String modId, String platform) {
        //this.ensureValid(location);
        this.advancement.parent(RecipeBuilder.ROOT_RECIPE_ADVANCEMENT)
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(location))
                .rewards(net.minecraft.advancements.AdvancementRewards.Builder.recipe(location))
                .requirements(RequirementsStrategy.OR);

        recipeConsumer.accept(new Result(
                location,
                this.type,
                this.template,
                this.base,
                this.addition,
                this.result,
                this.advancement,
                location.withPrefix("recipes/" + this.category.getFolderName() + "/"),
                modId,
                platform
        ));
    }

    public record Result(
            ResourceLocation id,
            RecipeSerializer<?> type,
            Ingredient template,
            Ingredient base,
            Ingredient addition,
            Item result,
            Advancement.Builder advancement,
            ResourceLocation advancementId,
            String modId,
            String platform
    ) implements FinishedRecipe {
        @Override
        public void serializeRecipeData(JsonObject json) {
            json.add("template", this.template.toJson());
            json.add("base", this.base.toJson());
            json.add("addition", this.addition.toJson());
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", BuiltInRegistries.ITEM.getKey(this.result).toString());
            json.add("result", jsonobject);
        }

        @Override
        public JsonObject serializeRecipe() {
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("type", BuiltInRegistries.RECIPE_SERIALIZER.getKey(this.type).toString());
            this.serializeRecipeData(jsonobject);
            // Conditional logic from LoaderConditionalRecipe integrated here
            if ("forge".equals(this.platform)) {
                this.addForgeConditions(jsonobject);
            } else if ("fabric".equals(this.platform)) {
                this.addFabricConditions(jsonobject);
            }
            return jsonobject;
        }

        private void addForgeConditions(JsonObject json) {
            JsonArray conditions = new JsonArray();
            JsonObject condition = new JsonObject();
            condition.addProperty("type", "forge:mod_loaded");
            condition.addProperty("modid", this.modId);
            conditions.add(condition);
            json.add("conditions", conditions);
        }

        private void addFabricConditions(JsonObject json) {
            JsonArray conditions = new JsonArray();
            JsonObject condition = new JsonObject();
            condition.addProperty("condition", "fabric:all_mods_loaded");
            JsonArray values = new JsonArray();
            values.add(this.modId);
            condition.add("values", values);
            json.add("fabric:load_conditions", conditions);
        }

        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        @Override
        public RecipeSerializer<?> getType() {
            return this.type;
        }

        @Nullable
        @Override
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}