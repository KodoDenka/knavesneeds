package dev.manasnow.knavesneeds.datagen;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dev.manasnow.knavesneeds.Constants;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class ConditionalShapedRecipeBuilder extends CraftingRecipeBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final Item result;
    private final String platform;
    private final int count;
    private final List<String> rows = Lists.newArrayList();
    private final Map<Character, Ingredient> key = Maps.newLinkedHashMap();
    private final Advancement.Builder advancement = Advancement.Builder.recipeAdvancement();
    @javax.annotation.Nullable
    private String group;
    private boolean showNotification = true;

    //Update this to include needed parameters from FabricRecipeProvider.
    public ConditionalShapedRecipeBuilder(String platform, RecipeCategory category, ItemLike result, int count) {
        this.platform = platform;
        this.category = category;
        this.result = result.asItem();
        this.count = count;
    }

    //Might bring this basic to make things easier.
    public static ConditionalShapedRecipeBuilder shaped(String platform, RecipeCategory category, ItemLike result) {
        return new ConditionalShapedRecipeBuilder(platform, RecipeCategory.MISC, result, 1);
    }

    //Needs to take all the parameters from FabricRecipeProvider.
    //Also might need to be moved outa here???
    public static void swordSetFor(ItemLike result, Consumer<FinishedRecipe> exporter, Ingredient handle, Ingredient material, Ingredient binder, String namesapce, String platform) {

        //THis is the template we needed rework.
        //Reduce pattern to only care about weapon type.
        //Add method
        String swordType = result.asItem().toString().split("/")[2];


        ConditionalShapedRecipeBuilder.shaped(platform, RecipeCategory.MISC, result).swordType(swordType).multiDefine(handle, material, binder).unlockedBy("has_material", material).save(exporter, new ResourceLocation(namesapce, result.toString()));


    }

    public ConditionalShapedRecipeBuilder define(Character symbol, TagKey<Item> tag) {
        return this.define(symbol, Ingredient.of(tag));
    }

    public ConditionalShapedRecipeBuilder define(Character symbol, ItemLike item) {
        return this.define(symbol, Ingredient.of(new ItemLike[]{item}));
    }

    public ConditionalShapedRecipeBuilder define(Character symbol, Ingredient ingredient) {
        if (this.key.containsKey(symbol)) {
            throw new IllegalArgumentException("Symbol '" + symbol + "' is already defined!");
        } else if (symbol == ' ') {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
        } else {
            this.key.put(symbol, ingredient);
            return this;
        }
    }

    public ConditionalShapedRecipeBuilder multiDefine(Ingredient handle, Ingredient material, Ingredient binder) {
        this.define('H', handle);
        this.define('M', material);

        for (String row : this.rows) {
            if (row.contains("B")) {
                this.define('B', binder);
                return this;
            }
        }
        return this;
    }

    //Remake this class to be swordType
    public ConditionalShapedRecipeBuilder pattern(String pattern) {
        if (!this.rows.isEmpty() && pattern.length() != ((String)this.rows.get(0)).length()) {
            throw new IllegalArgumentException("Pattern must be the same width on every line!");
        } else {
            this.rows.add(pattern);
            return this;
        }
    }

    public ConditionalShapedRecipeBuilder swordType(String swordType) {
        //Selects the recipe pattern based on itemType.

        String[] pattern = switch (swordType) {
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

        this.rows.add(pattern[0]);
        this.rows.add(pattern[1]);
        this.rows.add(pattern[2]);
        return this;
    }

    public ConditionalShapedRecipeBuilder unlockedBy(String criterionName, CriterionTriggerInstance criterionTrigger) {
        this.advancement.addCriterion(criterionName, criterionTrigger);
        return this;
    }

    public ConditionalShapedRecipeBuilder group(@javax.annotation.Nullable String groupName) {
        this.group = groupName;
        return this;
    }

    public ConditionalShapedRecipeBuilder unlockedBy(String criterionName, Ingredient ingredient) {
        return this.unlockedBy(criterionName, InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ingredient.getItems()[0].getItem()).build()));
    }

    public Item getResult() {
        return this.result;
    }

    //Modify the save method to have fabric and forge specific conditions.
    public void save(Consumer<FinishedRecipe> finishedRecipeConsumer, ResourceLocation recipeId) {
        this.ensureValid(recipeId);
        this.advancement.parent(ROOT_RECIPE_ADVANCEMENT).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(recipeId)).rewards(net.minecraft.advancements.AdvancementRewards.Builder.recipe(recipeId)).requirements(RequirementsStrategy.OR);
        finishedRecipeConsumer.accept(new ConditionalShapedRecipeBuilder.Result(this.platform, recipeId, this.result, this.count, this.group == null ? "" : this.group, determineBookCategory(this.category), this.rows, this.key, this.advancement, recipeId.withPrefix("recipes/" + this.category.getFolderName() + "/"), this.showNotification));
    }

    private void ensureValid(ResourceLocation id) {
        if (this.rows.isEmpty()) {
            throw new IllegalStateException("No pattern is defined for shaped recipe " + String.valueOf(id) + "!");
        } else {
            Set<Character> set = Sets.newHashSet(this.key.keySet());
            set.remove(' ');

            for(String s : this.rows) {
                for(int i = 0; i < s.length(); ++i) {
                    char c0 = s.charAt(i);
                    if (!this.key.containsKey(c0) && c0 != ' ') {
                        String var10002 = String.valueOf(id);
                        throw new IllegalStateException("Pattern in recipe " + var10002 + " uses undefined symbol '" + c0 + "'");
                    }

                    set.remove(c0);
                }
            }

            if (!set.isEmpty()) {
                throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + String.valueOf(id));
            } else if (this.rows.size() == 1 && ((String)this.rows.get(0)).length() == 1) {
                throw new IllegalStateException("Shaped recipe " + String.valueOf(id) + " only takes in a single item - should it be a shapeless recipe instead?");
            } else if (this.advancement.getCriteria().isEmpty()) {
                throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(id));
            }
        }
    }

    //Update this to include needed parameters from FabricRecipeProvider.
    static class Result implements FinishedRecipe {
        private final String platform;
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final String group;
        private final List<String> pattern;
        private final Map<Character, Ingredient> key;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;
        private final boolean showNotification;

        public Result(String platform, ResourceLocation id, Item result, int count, String group, CraftingBookCategory category, List<String> pattern, Map<Character, Ingredient> key, Advancement.Builder advancement, ResourceLocation advancementId, boolean showNotification) {
            //this.category = category;
            this.platform = platform;
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

        @Override
        public void serializeRecipeData(JsonObject json) {
            Constants.LOG.info("Serialization is starting with: {}", json);

            json.remove("type");
            Constants.LOG.info("Attempting to clear: {}", json);

            json.addProperty("platform", this.platform);
            json.addProperty("type", "minecraft:crafting_shaped");
            Constants.LOG.info("Reordering to: {}", json);
            //json = sortedJson;

            //json.

            Constants.LOG.info("Serialization is:{} after adding platform.", json);

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

            Constants.LOG.info("Serialization is finishing with: {}", json);
        }

        public RecipeSerializer<?> getType() {
            return RecipeSerializer.SHAPED_RECIPE;
        }

        public ResourceLocation getId() {
            return this.id;
        }

        @javax.annotation.Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }

}