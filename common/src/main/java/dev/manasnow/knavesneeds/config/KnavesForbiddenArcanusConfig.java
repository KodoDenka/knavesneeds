package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class KnavesForbiddenArcanusConfig extends Config {

    public KnavesForbiddenArcanusConfig() {
        super(new ResourceLocation(MOD_ID, "ForbiddenArcanusConfig"));
    }

    @Comment("Material - deorum")
    boolean deorumEnabled = true;
    int deorumDurability = 1000;
    float deorumMiningSpeedMultiplier = 1.0f;
    float deorumAttackDamage = 0.0f;
    int deorumMiningLevel = 1;
    int deorumEnchantability = 15;

    @Comment("Material - reinforcedDeorum")
    boolean reinforcedDeorumEnabled = true;
    int reinforcedDeorumDurability = 1000;
    float reinforcedDeorumMiningSpeedMultiplier = 1.0f;
    float reinforcedDeorumAttackDamage = 0.0f;
    int reinforcedDeorumMiningLevel = 1;
    int reinforcedDeorumEnchantability = 15;

    @Comment("Material - dracoArcanus")
    boolean dracoArcanusEnabled = true;
    int dracoArcanusDurability = 1000;
    float dracoArcanusMiningSpeedMultiplier = 1.0f;
    float dracoArcanusAttackDamage = 0.0f;
    int dracoArcanusMiningLevel = 1;
    int dracoArcanusEnchantability = 15;

}
