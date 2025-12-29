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
            TwilightForestAdditionsRegistries.smartRegister();
        }

        //BetterCombatHelper Enable
        if (Services.PLATFORM.isModLoaded("bettercombat")) {
            Constants.LOG.info("BetterCombat is loaded. BetterCombatHelper is enabled.");
            USE_SAFE_ITEMSTACK = true;
        }
        else {
            Constants.LOG.info("BetterCombat is not loaded. BetterCombatHelper will not be enabled.");
        }


        //Checks if mod is loaded and enabled, and registers the weapons.
        if (Services.PLATFORM.isModLoaded("twilightforest") && commonConfig.twilightForestEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Twilight Forest items.");
            TwilightForestAdditionsRegistries.smartRegister();

        }

        if (Services.PLATFORM.isModLoaded("undergarden") && commonConfig.undergardenEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Undergarden items.");
            UndergardenAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("soulsweapons") && commonConfig.soulsWeaponsEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Soulslike Weaponry items.");
            SoulsWeaponsAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("forbidden_arcanus") && commonConfig.forbiddenArcanusEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Forbidden Arcanus items.");
            ForbiddenArcanusAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("deeperdarker") && commonConfig.deeperDarkerEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Deeper and Darker items.");
            DeeperDarkerAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("blue_skies") && commonConfig.blueSkiesEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Blue Skies items.");
            BlueSkiesAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("betterend") && commonConfig.betterEndEnabled) {
            Constants.LOG.info("Knaves' Needs is adding Better End items.");
            BetterEndAdditionsRegistries.smartRegister();
        }

        if ((Services.PLATFORM.isModLoaded("betternether") && commonConfig.betterNetherEnabled)) {
            Constants.LOG.info("Knaves' Needs is adding Better Nether items.");
            BetterNetherAdditionsRegistries.smartRegister();
        }

        if (Services.PLATFORM.isModLoaded("evenbetternether")) {
            Constants.LOG.info("Knaves' Needs is adding Even Better Nether items.");
            //TODO Support even better nether
        }
    }
}