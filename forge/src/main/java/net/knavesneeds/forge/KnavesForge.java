package net.knavesneeds.forge;

import dev.architectury.platform.forge.EventBuses;
import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.TwilightForestCompat;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KnavesCommon.MOD_ID)
public class KnavesForge {
    public KnavesForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(KnavesCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        //Init core.
        KnavesCommon.init();
    }
}
