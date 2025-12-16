package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class KnavesSoulsWeaponsConfig extends Config {

    public KnavesSoulsWeaponsConfig() {
        super(new ResourceLocation(MOD_ID, "SoulsWeaponsConfig"));
    }

    @Comment("Material - Translucent")
    boolean translucentEnabled = true;
    int translucentDurability = 1000;
    float translucentMiningSpeedMultiplier = 1.0f;
    float translucentAttackDamage = 0.0f;
    int translucentMiningLevel = 1;
    int translucentEnchantability = 15;

}
