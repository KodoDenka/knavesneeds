package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.*;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@RootConfig

public class KnavesCommonConfig extends Config {

    // Common Config constructor
    public KnavesCommonConfig() {
        super(new ResourceLocation(MOD_ID, "knaves_config"));
    }

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Better End support.")
    public boolean betterEndEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Better Nether support.")
    public boolean betterNetherEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Blue Skies support.")
    public boolean blueSkiesEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Deeper and Darker support.")
    public boolean deeperDarkerEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Forbidden Arcanus support.")
    public boolean forbiddenArcanusEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Plus The End support.")
    public boolean plusTheEndEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Marium's Soulslike Weaponry support.")
    public boolean soulsWeaponsEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Twilight Forest support")
    public boolean twilightForestEnabled = true;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables Undergarden support")
    public boolean undergardenEnabled = true;


    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
