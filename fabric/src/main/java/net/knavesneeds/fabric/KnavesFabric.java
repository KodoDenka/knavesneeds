package net.knavesneeds.fabric;

import net.knavesneeds.KnavesCommon;
import net.fabricmc.api.ModInitializer;

public class KnavesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KnavesCommon.init();
    }


}
