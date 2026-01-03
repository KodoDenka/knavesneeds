package dev.manasnow.knavesneeds;


import dev.manasnow.knavesneeds.datagen.CommonRecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KnavesForgeDatagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();

        generator.addProvider(event.includeServer(), new ForgeRecipeProvider(output, event.getExistingFileHelper()));

    }

    private static class ForgeRecipeProvider extends RecipeProvider {
        public ForgeRecipeProvider(PackOutput output, ExistingFileHelper helper) {
            super(output);
        }

        protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
            //CommonRecipeGenerator.generate(consumer);
        }
    }
}
