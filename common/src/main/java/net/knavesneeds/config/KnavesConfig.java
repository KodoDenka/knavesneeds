package net.knavesneeds.config;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "server")
public class KnavesConfig implements ConfigData {

    @Comment("Forbidden & Arcanus")
    public static int DEORUM_MOD = 0;
    public static int DRACO_ARCANUS_MOD = 0;
    public static int REINFORCED_DEORUM_MOD = 0;

    @Comment("Blue Skies")
    public static int AQUITE_MOD = 0;
    public static int CHAROITE_MOD = 0;
    public static int DIOPSIDE_MOD = 0;
    public static int HORIZONITE_MOD = 0;
    public static int PYROPE_MOD = 0;

    @Comment("------------------------------")
    public static int LUNAR_STONE_MOD = 0;
    public static int TURQUOISE_STONE_MOD = 0;

    @Comment("------------------------------")
    public static int BLUEBRIGHT_WOOD_MOD = 0;
    public static int CHERRY_WOOD_MOD = 0;
    public static int DUSK_WOOD_MOD= 0;
    public static int FROSTBRIGHT_WOOD_MOD = 0;
    public static int LUNAR_WOOD_MOD = 0;
    public static int MAPLE_WOOD_MOD = 0;
    public static int STARLIT_WOOD_MOD = 0;

    @Comment("Plus The End")
    public static int ENDRONIUM_MOD = 0;

    @Comment("Twilight Forest")
    public static int STEELEAF_MOD = 0;
    public static int IRONWOOD_MOD = 0;
    public static int FIERY_MOD= 0;
    public static int KNIGHTMETAL_MOD = 0;

    @Comment("Undergarden")
    public static int CLOGGRUM_MOD = 0;
    public static int FORGOTTEN_MOD = 0;
    public static int FROSTSTEEL_MOD= 0;
    public static int UTHERIUM_MOD = 0;

    @Comment("BetterEnd")
    public static int AETERNIUM_MOD = 0;
    public static int TERMINITE_MOD = 0;
    public static int THALLASIUM_MOD = 0;

    @Comment("BetterNether")
    public static int CINCINNASITE_MOD = 0;
    public static int CINCINNASITE_DIAMOND_MOD = 0;
    public static int NETHER_RUBY_MOD = 0;
    public static int FLAMING_RUBY_MOD = 0;

    @Comment("SoulslikeWeapons")
    public static int TRANSLUCENT_MOD = 0;

    @Comment("Deeper And Darker")
    public static int WARDEN_MOD = 0;

    @Comment("Oh The Biomes You'll Go")
    public static int PENDORITE_MOD = 0;

}
