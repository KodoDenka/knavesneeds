package net.knavesneeds.forge;

import net.knavesneeds.KnavesExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class KnavesExpectPlatformImpl {
    /**
     * This is our actual method to {@link KnavesExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
