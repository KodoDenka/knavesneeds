package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.RootConfig;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@RootConfig

public class KnavesCommonConfig extends Config {

    // Common Config constructor
    public KnavesCommonConfig() {
        super(new ResourceLocation(MOD_ID, "knaves_config"));
    }


    @Comment("Enables Better End support.")
    public boolean betterEndEnabled = true;

    @Comment("\n Enables Better Nether support.")
    public boolean betterNetherEnabled = true;

    @Comment("\n Enables Biomes You'll Go support.")
    public boolean biomesYoullGoEnabled = true;

    @Comment("\n Enables Blue Skies support.")
    public boolean blueSkiesEnabled = true;

    @Comment("\n Enables Deeper and Darker support.")
    public boolean deeperDarkerEnabled = true;

    @Comment("\n Enables Forbidden Arcanus support.")
    public boolean forbiddenArcanusEnabled = true;

    @Comment("\n Enables Plus The End support.")
    public boolean plusTheEndEnabled = true;

    @Comment("\n Enables Marium's Soulslike Weaponry support.")
    public boolean soulsWeaponsEnabled = true;

    @Comment("\n Enables Twilight Forest support")
    public boolean twilightForestEnabled = true;

    @Comment("\n Enables Undergarden support")
    public boolean undergardenEnabled = true;


    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
