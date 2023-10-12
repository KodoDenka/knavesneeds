package net.knavesneeds.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "better_nether")
public class BetterNetherConfig implements ConfigData {
    @Comment("""
            This file controls values specifically for BetterNether.
            Material modifiers are set to the base damage of each material's tier.
            Values are ints, meaning you cannot have values with a decimal point.
            Valid:
            - '5'
            
            Invalid:
            - '3.4'
            
            """)
    public int CINCINNASITE_MOD = 0;
    public int CINCINNASITE_DIAMOND_MOD = 0;
    public int NETHER_RUBY_MOD = 0;
    public int FLAMING_RUBY_MOD = 0;

}