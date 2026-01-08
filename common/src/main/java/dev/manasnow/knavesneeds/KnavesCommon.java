package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.config.KnavesCommonConfig;
import dev.manasnow.knavesneeds.platform.Services;
import dev.manasnow.knavesneeds.registries.*;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;

public class KnavesCommon {
    public static KnavesCommonConfig commonConfig = ConfigApiJava.registerAndLoadConfig(KnavesCommonConfig::new);

    public static boolean USE_SAFE_ITEMSTACK = false;

    public static void init() {
        Constants.LOG.info("Knaves' Needs main running!");

        //Register items if Dev environment for testing.
        if (Services.PLATFORM.getEnvironmentName().equals("development")){
            AmethystImbuementAdditionsRegistries.smartRegistrar();
            BetterEndAdditionsRegistries.smartRegistrar();
            BetterNetherAdditionsRegistries.smartRegistrar();
            BlueSkiesAdditionsRegistries.smartRegistrar();
            DeeperDarkerAdditionsRegistries.smartRegistrar();
            ForbiddenArcanusAdditionsRegistries.smartRegistrar();
            SoulsWeaponsAdditionsRegistries.smartRegistrar();
            //SpectrumAdditionsRegistries.smartRegistrar();
            TwilightForestAdditionsRegistries.smartRegistrar();
            UndergardenAdditionsRegistries.smartRegistrar();
        }

        //BetterCombatHelper Enable
        if (Services.PLATFORM.isModLoaded("bettercombat")) {
            Constants.LOG.info("BetterCombat is loaded. BetterCombatHelper is enabled.");
            USE_SAFE_ITEMSTACK = true;
            Constants.LOG.info(String.valueOf(USE_SAFE_ITEMSTACK));
        }
        else {
            Constants.LOG.info("BetterCombat is not loaded. BetterCombatHelper will not be enabled.");
        }


        //Checks if mod is loaded and enabled, and registers the weapons.
        if (Services.PLATFORM.isModLoaded("twilightforest") && commonConfig.twilightForestEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Twilight Forest items.");
            TwilightForestAdditionsRegistries.smartRegistrar();

        }

        if (Services.PLATFORM.isModLoaded("undergarden") && commonConfig.undergardenEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Undergarden items.");
            UndergardenAdditionsRegistries.smartRegistrar();
        }

        if (Services.PLATFORM.isModLoaded("soulsweapons") && commonConfig.soulsWeaponsEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Soulslike Weaponry items.");
            SoulsWeaponsAdditionsRegistries.smartRegistrar();
        }

        if (Services.PLATFORM.isModLoaded("forbidden_arcanus") && commonConfig.forbiddenArcanusEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Forbidden Arcanus items.");
            ForbiddenArcanusAdditionsRegistries.smartRegistrar();
        }

        if (Services.PLATFORM.isModLoaded("deeperdarker") && commonConfig.deeperDarkerEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Deeper and Darker items.");
            DeeperDarkerAdditionsRegistries.smartRegistrar();
        }

        if (Services.PLATFORM.isModLoaded("blue_skies") && commonConfig.blueSkiesEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Blue Skies items.");
            BlueSkiesAdditionsRegistries.smartRegistrar();
        }

        if (Services.PLATFORM.isModLoaded("betterend") && commonConfig.betterEndEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Better End items.");
            BetterEndAdditionsRegistries.smartRegistrar();
        }

        if ((Services.PLATFORM.isModLoaded("betternether") && commonConfig.betterNetherEnabled)) {
            Constants.LOG.info("Knaves' Needs is adding Better Nether items.");
            BetterNetherAdditionsRegistries.smartRegistrar();
        }

        if (Services.PLATFORM.isModLoaded("evenbetternether")) {
            Constants.LOG.info("Knaves' Needs is adding Even Better Nether items.");
            //TODO Support even better nether
        }
    }
}