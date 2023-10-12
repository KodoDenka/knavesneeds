package net.knavesneeds.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "better_end")
public class BetterEndConfig implements ConfigData {
    @Comment("""
            This file controls values specifically for BetterEnd.
            Material modifiers are set to the base damage of each material's tier.
            Values are ints, meaning you cannot have values with a decimal point.
            Valid:
            - '5'
            
            Invalid:
            - '3.4'
            
            """)
    public int AETERNIUM_MOD = 0;
    public int TERMINITE_MOD = 0;
    public int THALLASIUM_MOD = 0;

}
