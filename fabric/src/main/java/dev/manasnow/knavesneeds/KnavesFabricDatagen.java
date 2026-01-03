package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.datagen.KnavesModelProvider;
import dev.manasnow.knavesneeds.datagen.KnavesRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KnavesFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(KnavesModelProvider::new);
        pack.addProvider(KnavesRecipeProvider::new);
    }
}