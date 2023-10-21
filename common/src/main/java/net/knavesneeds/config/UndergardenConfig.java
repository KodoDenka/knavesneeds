package net.knavesneeds.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "undergarden")
public class UndergardenConfig   implements ConfigData {
    @Comment("""
            This file controls values specifically for The Undergarden.
            Material modifiers are set to the base damage of each material's tier.
            Values are ints, meaning you cannot have values with a decimal point.
            Valid:
            - '5'
            
            Invalid:
            - '3.4'
            
            """)
    public int CLOGGRUM_MOD = 0;
    public int FORGOTTEN_MOD = 0;
    public int FROSTSTEEL_MOD = 0;
    public int UTHERIUM_MOD = 0;


}