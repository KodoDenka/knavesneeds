package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.config.KnavesCommonConfig;
import dev.manasnow.knavesneeds.config.KnavesTwilightForestConfig;
import dev.manasnow.knavesneeds.platform.Services;
import dev.manasnow.knavesneeds.registries.*;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;
import net.sweenus.simplyswords.api.SimplySwordsAPI;

public class KnavesCommon {
    public static KnavesTwilightForestConfig twilightForestConfig;

    //TODO Clean up comments and LOG.info statements from template. Properly credit template on modpage and modinfo.

    public static KnavesCommonConfig commonConfig = ConfigApiJava.registerAndLoadConfig(KnavesCommonConfig::new);

    public static void init() {

        //SimplySwordsAPI.

        Constants.LOG.info("Knaves' Needs main running!");
        //Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
        //Constants.LOG.info("The ID for diamonds is {}", BuiltInRegistries.ITEM.getKey(Items.DIAMOND));

        if (Services.PLATFORM.getEnvironmentName().equals("development")){
            TwilightForestAdditionsRegistries.smartRegister();
        }


        //Checks if mod is loaded and enabled, and registers the weapons.
        if (Services.PLATFORM.isModLoaded("twilightforest") && commonConfig.twilightForestEnabled) {
            Constants.LOG.info("Loading Twilight Forest items.");
            TwilightForestAdditionsRegistries.smartRegister();

        }

        if (Services.PLATFORM.isModLoaded("undergarden") && commonConfig.undergardenEnabled) {
            Constants.LOG.info("Loading Undergarden items.");
            UndergardenAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("plus_the_end") && commonConfig.plusTheEndEnabled) {
            Constants.LOG.info("Loading Plus The End items.");
            //this mod is gone :c
        }

        if (Services.PLATFORM.isModLoaded("soulsweapons") && commonConfig.soulsWeaponsEnabled) {
            Constants.LOG.info("Loading Soulslike Weaponry items.");
            SoulsWeaponsAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("forbidden_arcanus") && commonConfig.forbiddenArcanusEnabled) {
            Constants.LOG.info("Loading Forbidden Arcanus items.");
            ForbiddenArcanusAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("deeperdarker") && commonConfig.deeperDarkerEnabled) {
            Constants.LOG.info("Loading Deeper and Darker items.");
            DeeperDarkerAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("blue_skies") && commonConfig.blueSkiesEnabled) {
            Constants.LOG.info("Loading Blue Skies items.");
            BlueSkiesAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("betterend") && commonConfig.betterEndEnabled) {
            Constants.LOG.info("Loading Better End items.");
            BetterEndAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("betternether") && commonConfig.betterNetherEnabled) {
            Constants.LOG.info("Loading Better Nether items.");
            BetterNetherAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("biomeswevegone") && commonConfig.biomesYoullGoEnabled) {
            Constants.LOG.info("Loading Biomes You'll Go items.");
            BiomesYoullGoAdditionsRegistries.smartRegister();
        }
    }
}