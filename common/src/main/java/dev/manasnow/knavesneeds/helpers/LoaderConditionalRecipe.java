package dev.manasnow.knavesneeds.helpers;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public interface LoaderConditionalRecipe {
    //TODO Rework this interface to rebuild the recipes properly.

    void serializeRecipeData(JsonObject var1);

    default JsonObject serializeRecipe() {
        JsonObject jsonobject = new JsonObject();
        jsonobject.addProperty("type", BuiltInRegistries.RECIPE_SERIALIZER.getKey(this.getType()).toString());
        this.serializeRecipeData(jsonobject);
        return jsonobject;
    }

    ResourceLocation getId();

    RecipeSerializer<?> getType();

    @Nullable
    JsonObject serializeAdvancement();

    @Nullable
    ResourceLocation getAdvancementId();
}