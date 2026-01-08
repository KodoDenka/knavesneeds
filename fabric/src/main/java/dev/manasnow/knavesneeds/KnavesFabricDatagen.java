package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.datagen.FabricModelProvider;
import dev.manasnow.knavesneeds.datagen.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KnavesFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(FabricModelProvider::new);
        pack.addProvider(FabricRecipeProvider::new);
    }
}