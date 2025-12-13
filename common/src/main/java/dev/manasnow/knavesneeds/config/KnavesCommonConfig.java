package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class KnavesCommonConfig extends Config {

    public KnavesCommonConfig() {
        super(new ResourceLocation(MOD_ID, "knaves_config"));
    }

    @Comment("Enables Better End support.")
    public boolean betterEndEnabled = true;

    @Comment("Enables Better Nether support.")
    public boolean betterNetherEnabled = true;

    @Comment("Enables Biomes You'll Go support.")
    public boolean biomesYoullGoEnabled = true;

    @Comment("Enables Blue Skies support.")
    public boolean blueSkiesEnabled = true;

    @Comment("Enables Deeper and Darker support.")
    public boolean deeperDarkerEnabled = true;

    @Comment("Enables Forbidden Arcanus support.")
    public boolean forbiddenArcanusEnabled = true;

    @Comment("Enables Plus The End support.")
    public boolean plusTheEndEnabled = true;

    @Comment("Enables Marium's Soulslike Weaponry support.")
    public boolean soulsWeaponsEnabled = true;

    @Comment("Enables Twilight Forest support")
    public boolean twilightForestEnabled = true;

    @Comment("Enables Undergarden support")
    public boolean undergardenEnabled = true;




    //public KnavesCommonConfig() {
        //super(ResourceLocation.of(MOD_ID, 'c'));

        //super (new ResourceLocation(MOD_ID, "knaves_config"));

        //super(ResourceLocation.of(MOD_ID, "KnavesCommonConfig"));

        //super(ResourceLocation.tryBuild(MOD_ID, "KnavesCommonConfig"));
    //}
}
