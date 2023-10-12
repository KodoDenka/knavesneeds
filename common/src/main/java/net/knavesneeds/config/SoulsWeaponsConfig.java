package net.knavesneeds.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "souls_weapons")

public class SoulsWeaponsConfig   implements ConfigData {
    @Comment("""
            This file controls values specifically for Marium's Soulslike Weaponry.
            Material modifiers are set to the base damage of each material's tier.
            Values are ints, meaning you cannot have values with a decimal point.
            Valid:
            - '5'
            
            Invalid:
            - '3.4'
            
            """)
    public int TRANSLUCENT_MOD = 0;


}
