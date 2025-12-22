package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesSoulsWeaponsConfig extends Config {

    public KnavesSoulsWeaponsConfig() {
        super(new ResourceLocation(MOD_ID, "SoulsWeaponsConfig"));
    }

    @Comment("Material - Translucent")
    public static boolean translucentEnabled = true;
    public static int translucentDurability = 1000;
    public static float translucentMiningSpeedMultiplier = 1.0f;
    public static float translucentAttackDamage = 0.0f;
    public static int translucentMiningLevel = 1;
    public static int translucentEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
