package net.knavesneeds.config;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "server")
public class KnavesConfig implements ConfigData {

    @Comment("Twilight Forest Modifiers")
    public float damage_mod = 1.0f;

}
