package net.knavesneeds.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "amethyst_imbuement")
public class AmethystImbuementConfig implements ConfigData {
    @Comment("""
            This file controls values specifically for AmethystImbuement.
            Material modifiers are set to the base damage of each material's tier.
            Values are ints, meaning you cannot have values with a decimal point.
            Valid:
            - '5'
            
            Invalid:
            - '3.4'
            
            """)
    public int AMETRINE_MOD = 0;
    public int GARNET_MOD = 0;
    public int GLOWING_MOD = 0;
    public int STEEL_MOD = 0;


}
