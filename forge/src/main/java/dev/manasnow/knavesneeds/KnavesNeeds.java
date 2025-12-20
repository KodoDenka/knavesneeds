package dev.manasnow.knavesneeds;

import dev.manasnow.knavesneeds.commands.KnavesCommands;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class KnavesNeeds {
    
    public KnavesNeeds() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        KnavesCommon.init();

        MinecraftForge.EVENT_BUS.register(this);

    }


    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        Constants.LOG.info("Registering commands");
        KnavesCommands.register(event.getDispatcher());
    }

}