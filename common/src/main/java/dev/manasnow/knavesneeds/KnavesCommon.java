package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.config.KnavesCommonConfig;
import dev.manasnow.knavesneeds.platform.Services;
import dev.manasnow.knavesneeds.registries.TwilightForestAdditionsRegistries;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

// This class is part of the common project, meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code cannot directly use loader-specific concepts such as Forge events.
// However, it will be compatible with all supported mod loaders.
public class KnavesCommon {

    //TODO Clean up comments and LOG.info statements from template. Properly credit template on modpage and modinfo.

    //public static KnavesCommonConfig CONFIG2 = ConfigApiJava.registerAndLoadConfig(KnavesCommonConfig::new);

    // The loader-specific projects are able to import and use any code from the common project. This allows you to
    // write the majority of your code here and load it from your loader-specific projects. This example has some
    // code that gets invoked by the entry point of the loader-specific projects.
    public static void init() {

        KnavesCommonConfig commonConfig = ConfigApiJava.registerAndLoadConfig(KnavesCommonConfig::new);

        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
        Constants.LOG.info("The ID for diamonds is {}", BuiltInRegistries.ITEM.getKey(Items.DIAMOND));

        // It is common for all supported loaders to provide a similar feature that cannot be used directly in the
        // common code. A popular way to get around this is using Java's built-in service loader feature to create
        // your own abstraction layer. You can learn more about this in our provided services class. In this example
        // we have an interface in the common code and use a loader-specific implementation to delegate our call to
        // the platform-specific approach.
        if (Services.PLATFORM.isModLoaded("knavesneeds")) {
            Constants.LOG.info("Hello to knavesneeds");


            Constants.LOG.info(String.valueOf(commonConfig.betterEndEnabled));

            //KnavesCommands.register();

            TwilightForestAdditionsRegistries.smartRegister();

        }


        if (Services.PLATFORM.isModLoaded("twilightforest") && commonConfig.twilightForestEnabled) {
            // do twilight forest things
            Constants.LOG.info("Loading Twilight Forest items.");

        }

        if (Services.PLATFORM.isModLoaded("undergarden") && commonConfig.undergardenEnabled) {
            Constants.LOG.info("Loading Undergarden items.");

        }

        if (Services.PLATFORM.isModLoaded("plus_the_end") && commonConfig.plusTheEndEnabled) {
            Constants.LOG.info("Loading Plus The End items.");

        }

        if (Services.PLATFORM.isModLoaded("soulsweapons") && commonConfig.soulsWeaponsEnabled) {
            Constants.LOG.info("Loading Soulslike Weaponry items.");

        }

        if (Services.PLATFORM.isModLoaded("forbidden_arcanus") && commonConfig.forbiddenArcanusEnabled) {
            Constants.LOG.info("Loading Forbidden Arcanus items.");

        }

        if (Services.PLATFORM.isModLoaded("deeperdarker") && commonConfig.deeperDarkerEnabled) {
            Constants.LOG.info("Loading Deeper and Darker items.");

        }

        if (Services.PLATFORM.isModLoaded("blue_skies") && commonConfig.blueSkiesEnabled) {
            Constants.LOG.info("Loading Blue Skies items.");

        }

        if (Services.PLATFORM.isModLoaded("betterend") && commonConfig.betterEndEnabled) {
            Constants.LOG.info("Loading Better End items.");

        }

        if (Services.PLATFORM.isModLoaded("betternether") && commonConfig.betterNetherEnabled) {
            Constants.LOG.info("Loading Better Nether items.");

        }

        if (Services.PLATFORM.isModLoaded("byd") && commonConfig.biomesYoullGoEnabled) {
            Constants.LOG.info("Loading Biomes You'll Go items.");

        }
    }
}