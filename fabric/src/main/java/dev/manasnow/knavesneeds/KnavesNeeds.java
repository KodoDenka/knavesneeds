package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.commands.KnavesCommands;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class KnavesNeeds implements ModInitializer {
    
    @Override
    public void onInitialize() {

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.debug("Knaves' Needs Fabric code running!");
        KnavesCommon.init();

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            KnavesCommands.register(dispatcher);
        });

    }
}
