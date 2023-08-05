package net.knavesneeds.fabric;

import net.fabricmc.api.ModInitializer;
import net.knavesneeds.KnavesCommon;

public class KnavesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KnavesCommon.init();
    }
}
