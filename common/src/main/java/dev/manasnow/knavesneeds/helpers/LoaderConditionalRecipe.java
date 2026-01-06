package dev.manasnow.knavesneeds.helpers;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.NotNull;

public record LoaderConditionalRecipe(FinishedRecipe internal, String modId, String platform) implements FinishedRecipe {
    @Override
    public void serializeRecipeData(@NotNull JsonObject json) {
        internal.serializeRecipeData(json);

        JsonArray conditions = new JsonArray();
        JsonObject condition = new JsonObject();

        if (platform.equals("forge")) {
            condition.addProperty("condition", "forge:mod_loaded");
            condition.addProperty("modid", modId);
            json.add("conditions", conditions);
        } else {
            condition.addProperty("condition", "fabric:all_mods_loaded");
            JsonArray values = new JsonArray();
            values.add(modId);
            condition.add("values", values);
            json.add("fabric:load_conditions", conditions);
        }
        conditions.add(condition);
    }

    @MethodsReturnNonnullByDefault
    @Override
    public ResourceLocation getId() { return internal.getId(); }

    @MethodsReturnNonnullByDefault
    @Override
    public RecipeSerializer<?> getType() { return internal.getType(); }

    @Override
    public JsonObject serializeAdvancement() { return internal.serializeAdvancement(); }

    @Override
    public ResourceLocation getAdvancementId() { return internal.getAdvancementId(); }

}