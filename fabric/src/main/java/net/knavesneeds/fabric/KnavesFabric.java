package net.knavesneeds.fabric;

import dev.architectury.platform.Platform;
import net.fabricmc.api.ModInitializer;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.data.BetterEndRecipesGenerator;

public class KnavesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KnavesCommon.init();
    }
}
