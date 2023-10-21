package net.knavesneeds.config;


import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.KnavesCommon;

@Config(name = KnavesCommon.MOD_ID)
@Config.Gui.Background("cloth-config2:transparent")
public class DeeperDarkerWrapper extends PartitioningSerializer.GlobalData{
    @ConfigEntry.Category("deeperdarker")
    @ConfigEntry.Gui.TransitiveObject
    public DeeperDarkerConfig deeperdarker = new DeeperDarkerConfig();
}