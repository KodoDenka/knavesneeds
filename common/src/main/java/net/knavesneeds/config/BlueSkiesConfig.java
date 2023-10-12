package net.knavesneeds.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "blue_skies")
public class BlueSkiesConfig implements ConfigData {
    @Comment("""
            This file controls values specifically for Blue Skies.
            Material modifiers are set to the base damage of each material's tier.
            Values are ints, meaning you cannot have values with a decimal point.
            Valid:
            - '5'
            
            Invalid:
            - '3.4'
            
            """)
    public int AETERNIUM_MOD = 0;
    public int BLUEBRIGHT_WOOD_MOD = 0;
    public int CHAROITE_MOD = 0;
    public int CHERRY_WOOD_MOD = 0;
    public int DIOPSIDE_MOD = 0;
    public int DUSK_WOOD_MOD = 0;
    public int FROSTBRIGHT_WOOD_MOD = 0;
    public int HORIZONITE_MOD = 0;
    public int LUNAR_STONE_MOD = 0;
    public int LUNAR_WOOD_MOD = 0;
    public int MAPLE_WOOD_MOD = 0;
    public int PYROPE_MOD = 0;
    public int STARLIT_WOOD_MOD = 0;
    public int TURQUOISE_STONE_MOD = 0;


}