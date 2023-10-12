package net.knavesneeds.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.knavesneeds.KnavesCommon;

@Config(name = KnavesCommon.MOD_ID)
@Config.Gui.Background("cloth-config2:transparent")
public class PlusTheEndWrapper {
    @ConfigEntry.Category("plus_the_end")
    @ConfigEntry.Gui.TransitiveObject
    public PlusTheEndConfig plus_the_end = new PlusTheEndConfig();
}
