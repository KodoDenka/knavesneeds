package net.knavesneeds.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.knavesneeds.KnavesExpectPlatform;

import java.nio.file.Path;

public class KnavesExpectPlatformImpl {
    /**
     * This is our actual method to {@link KnavesExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
