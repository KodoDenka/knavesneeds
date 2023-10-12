package net.knavesneeds.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "twilight_forest")
public class TwilightForestConfig   implements ConfigData {
    @Comment("""
            This file controls values specifically for Twilight Forest.
            Material modifiers are set to the base damage of each material's tier.
            Values are ints, meaning you cannot have values with a decimal point.
            Valid:
            - '5'
            
            Invalid:
            - '3.4'
            
            """)
    public int FIERY_MOD = 0;
    public int IRONWOOD_MOD = 0;
    public int KNIGHTMETAL_MOD = 0;
    public int STEELEAF_MOD = 0;


}
