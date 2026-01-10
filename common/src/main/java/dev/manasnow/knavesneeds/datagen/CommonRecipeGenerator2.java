package dev.manasnow.knavesneeds.datagen;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class CommonRecipeGenerator2 {
    private final RecipeCategory category;
    private final String loader;
    private final Item result;
    private final int count;
    private final List<String> rows = Lists.newArrayList();
    private final Map<Character, Ingredient> key = Maps.newLinkedHashMap();
    private final Advancement.Builder advancement = Advancement.Builder.recipeAdvancement();
    @Nullable
    private String group;
    private boolean showNotification = true;
    private final Ingredient template;
    private final Ingredient base;
    private final Ingredient addition;
    private final RecipeSerializer<?> type;

    public CommonRecipeGenerator2(RecipeSerializer<?> type, String loader, Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result, int count) {
        this.loader = loader;
        this.category = category;
        this.type = type;
        this.template = template;
        this.base = base;
        this.addition = addition;
        this.result = result;
        this.count = count;
    }

    public static CommonRecipeGenerator2 smithing(String loader, Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result) {
        return smithing(loader, template, base, addition, category, result, 1);
    }

    public static CommonRecipeGenerator2 smithing(String loader, Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result, int count) {
        return new CommonRecipeGenerator2(RecipeSerializer.SMITHING_TRANSFORM, loader, template, base, addition, category, result, count);
    }

    public static CommonRecipeGenerator2 shaped(String loader, RecipeCategory category, ItemLike result) {
        return shaped(loader, category, result, 1);
    }

    public static CommonRecipeGenerator2 shaped(String loader, RecipeCategory category, ItemLike result, int count) {
        return new CommonRecipeGenerator2(RecipeSerializer.SHAPED_RECIPE, loader, null, null, null, category, result.asItem(), count);
    }

    public void save(Consumer<FinishedRecipe> recipeConsumer, String location) {
        this.save(recipeConsumer, new ResourceLocation(location));
    }

    public void save(Consumer<FinishedRecipe> recipeConsumer, ResourceLocation location) {
        this.ensureValid(location);
        this.advancement.parent(RecipeBuilder.ROOT_RECIPE_ADVANCEMENT).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(location)).rewards(net.minecraft.advancements.AdvancementRewards.Builder.recipe(location)).requirements(RequirementsStrategy.OR);
        recipeConsumer.accept(new SmithingTransformRecipeBuilder.Result(location, this.type, this.template, this.base, this.addition, this.result, this.advancement, location.withPrefix("recipes/" + this.category.getFolderName() + "/")));
    }

    private void ensureValid(ResourceLocation location) {
        if (this.advancement.getCriteria().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(location));
        }
    }

    public static record Result(ResourceLocation id, RecipeSerializer<?> type, Ingredient template, Ingredient base, Ingredient addition, Item result, Advancement.Builder advancement, ResourceLocation advancementId) implements FinishedRecipe {
        public void serializeRecipeData(JsonObject p_266713_) {
            p_266713_.add("template", this.template.toJson());
            p_266713_.add("base", this.base.toJson());
            p_266713_.add("addition", this.addition.toJson());
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", BuiltInRegistries.ITEM.getKey(this.result).toString());
            p_266713_.add("result", jsonobject);
        }

        public ResourceLocation getId() {
            return this.id;
        }

        public RecipeSerializer<?> getType() {
            return this.type;
        }

        @Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}
