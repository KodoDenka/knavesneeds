package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesForbiddenArcanusConfig extends Config {

    public KnavesForbiddenArcanusConfig() {
        super(new ResourceLocation(MOD_ID, "ForbiddenArcanusConfig"));
    }

    @Comment("Material - deorum")
    public boolean deorumEnabled = true;
    public int deorumDurability = 1000;
    public float deorumMiningSpeedMultiplier = 1.0f;
    public float deorumAttackDamage = 0.0f;
    public int deorumMiningLevel = 1;
    public int deorumEnchantability = 15;

    @Comment("\n Material - reinforcedDeorum")
    public boolean reinforcedDeorumEnabled = true;
    public int reinforcedDeorumDurability = 1000;
    public float reinforcedDeorumMiningSpeedMultiplier = 1.0f;
    public float reinforcedDeorumAttackDamage = 0.0f;
    public int reinforcedDeorumMiningLevel = 1;
    public int reinforcedDeorumEnchantability = 15;

    @Comment("\n Material - dracoArcanus")
    public boolean dracoArcanusEnabled = true;
    public int dracoArcanusDurability = 1000;
    public float dracoArcanusMiningSpeedMultiplier = 1.0f;
    public float dracoArcanusAttackDamage = 0.0f;
    public int dracoArcanusMiningLevel = 1;
    public int dracoArcanusEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
