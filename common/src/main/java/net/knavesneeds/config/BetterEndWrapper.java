package net.knavesneeds.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.KnavesCommon;

@Config(name = KnavesCommon.MOD_ID)
@Config.Gui.Background("cloth-config2:transparent")
public class BetterEndWrapper extends PartitioningSerializer.GlobalData{
    @ConfigEntry.Category("better_end")
    @ConfigEntry.Gui.TransitiveObject
    public BetterEndConfig better_end = new BetterEndConfig();
}
