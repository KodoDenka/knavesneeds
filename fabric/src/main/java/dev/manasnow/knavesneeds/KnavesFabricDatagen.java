package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.datagen.KnavesModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KnavesFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        //CommonRecipeGenerator.generate(generator);
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(KnavesModelProvider::new);

    }
}