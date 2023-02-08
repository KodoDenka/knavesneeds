package net.knavesneeds.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.KnavesCommon;

@Config(name = KnavesCommon.MOD_ID)
public class KnavesConfigWrapper extends PartitioningSerializer.GlobalData {
    @ConfigEntry.Category("server")
    @ConfigEntry.Gui.Excluded
    public KnavesConfig client = new KnavesConfig();
}