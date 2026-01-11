package dev.manasnow.knavesneeds.datagen;

import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class ConditionalShapedRecipeBuilder extends CraftingRecipeBuilder implements RecipeBuilder {

    public static void shaped(Registrar<Item> item, Consumer<FinishedRecipe> exporter, Ingredient handle, Ingredient material, Ingredient binder, String namespace, String platform) {

    }




    @Override
    public RecipeBuilder unlockedBy(String s, CriterionTriggerInstance criterionTriggerInstance) {
        return null;
    }

    @Override
    public RecipeBuilder group(@Nullable String s) {
        return null;
    }

    @Override
    public Item getResult() {
        return null;
    }

    @Override
    public void save(Consumer<FinishedRecipe> consumer, ResourceLocation resourceLocation) {

    }
}