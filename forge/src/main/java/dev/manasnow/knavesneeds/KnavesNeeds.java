package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.commands.KnavesCommands;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class KnavesNeeds {
    
    public KnavesNeeds() {
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.debug("Knaves' Needs (Neo)Forge code running!");
        KnavesCommon.init();

        MinecraftForge.EVENT_BUS.register(this);

    }


    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        KnavesCommands.register(event.getDispatcher());
    }

}