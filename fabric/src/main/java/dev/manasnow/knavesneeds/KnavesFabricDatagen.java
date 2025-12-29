package dev.manasnow.knavesneeds;


import dev.manasnow.knavesneeds.datagen.CommonRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class KnavesFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MyFabricRecipeProvider::new);
    }

    private static class MyFabricRecipeProvider {
        private MyFabricRecipeProvider(FabricDataGenerator output) {
            super(output);
        }

        @Override
        public void generate(Consumer<FinishedRecipe> exporter) {

            CommonRecipeGenerator.generate(exporter);

        }
    }
}
