package net.knavesneeds.forge;

import net.knavesneeds.KnavesExpectPlatform;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

import static net.knavesneeds.KnavesCommon.MOD_ID;

public class KnavesExpectPlatformImpl {
    /**
     * This is our actual method to {@link KnavesExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }

    public static String getVersion() {return ModList.get().getModContainerById(MOD_ID).map(it -> it.getModInfo().getVersion().toString()).orElseThrow();}
}
