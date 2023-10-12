package net.knavesneeds.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.knavesneeds.KnavesExpectPlatform;

import java.nio.file.Path;

import static net.knavesneeds.KnavesCommon.MOD_ID;

public class KnavesExpectPlatformImpl {
    /**
     * This is our actual method to {@link KnavesExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }

    public static String getVersion() {return FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().toString();}
}
