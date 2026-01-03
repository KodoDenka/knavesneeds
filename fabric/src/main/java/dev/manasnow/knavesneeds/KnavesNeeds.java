package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.commands.KnavesCommands;
import dev.manasnow.knavesneeds.platform.Services;
import dev.manasnow.knavesneeds.registries.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

import static dev.manasnow.knavesneeds.KnavesCommon.commonConfig;
import static dev.manasnow.knavesneeds.registries.BetterEndAdditionsRegistries.betterEndConfig;
import static dev.manasnow.knavesneeds.registries.BetterNetherAdditionsRegistries.betterNetherConfig;
import static dev.manasnow.knavesneeds.registries.TwilightForestAdditionsRegistries.twilightForestConfig;
import static dev.manasnow.knavesneeds.registries.UndergardenAdditionsRegistries.undergardenConfig;

public class KnavesNeeds implements ModInitializer {
    
    @Override
    public void onInitialize() {

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.debug("Knaves' Needs Fabric code running!");
        KnavesCommon.init();

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> KnavesCommands.register(dispatcher));

        if (Services.PLATFORM.isModLoaded("twilightforest") && commonConfig.twilightForestEnabled) {
            if (twilightForestConfig.fieryEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        TwilightForestAdditionsRegistries.FIERY_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (twilightForestConfig.knightmetalEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        TwilightForestAdditionsRegistries.KNIGHTMETAL_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (twilightForestConfig.ironwoodEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        TwilightForestAdditionsRegistries.IRONWOOD_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (twilightForestConfig.steeleafEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        TwilightForestAdditionsRegistries.STEELEAF_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
        }

        //Undergarden is not on Fabric this is a placeholder for now
        if (Services.PLATFORM.isModLoaded("undergarden") && commonConfig.undergardenEnabled) {
            if (undergardenConfig.cloggrumEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        UndergardenAdditionsRegistries.CLOGGRUM_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (undergardenConfig.forgottenEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        UndergardenAdditionsRegistries.FORGOTTEN_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (undergardenConfig.froststeelEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        UndergardenAdditionsRegistries.FROSTSTEEL_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (undergardenConfig.utheriumEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        UndergardenAdditionsRegistries.UTHERIUM_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
        }

        if (Services.PLATFORM.isModLoaded("soulsweapons") && commonConfig.soulsWeaponsEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                    SoulsWeaponsAdditionsRegistries.TRANSLUCENT_ITEMS.forEach(item ->
                            content.accept(item.get())));
        }

        if (Services.PLATFORM.isModLoaded("deeperdarker") && commonConfig.deeperDarkerEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                    DeeperDarkerAdditionsRegistries.WARDEN_ITEMS.forEach(item ->
                            content.accept(item.get())));
        }

        if (Services.PLATFORM.isModLoaded("betterend") && commonConfig.betterEndEnabled) {
            if (betterEndConfig.aeterniumEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        BetterEndAdditionsRegistries.AETERNIUM_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (betterEndConfig.terminiteEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        BetterEndAdditionsRegistries.TERMINITE_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (betterEndConfig.thallasiumEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        BetterEndAdditionsRegistries.THALLASIUM_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
        }

        if ((Services.PLATFORM.isModLoaded("betternether") && commonConfig.betterNetherEnabled)) {
            if (betterNetherConfig.cincinnasiteDiamondEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        BetterNetherAdditionsRegistries.CINCINNASITE_DIAMOND_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (betterNetherConfig.cincinnasiteEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        BetterNetherAdditionsRegistries.CINCINNASITE_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }
            if (betterNetherConfig.netherRubyEnabled) {
                ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content ->
                        BetterNetherAdditionsRegistries.NETHER_RUBY_ITEMS.forEach(item ->
                                content.accept(item.get())));
            }

        }

    }
}
