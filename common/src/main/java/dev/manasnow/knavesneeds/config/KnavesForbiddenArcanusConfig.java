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
    public static boolean deorumEnabled = true;
    public static int deorumDurability = 1000;
    public static float deorumMiningSpeedMultiplier = 1.0f;
    public static float deorumAttackDamage = 0.0f;
    public static int deorumMiningLevel = 1;
    public static int deorumEnchantability = 15;

    @Comment("\n Material - reinforcedDeorum")
    public static boolean reinforcedDeorumEnabled = true;
    public static int reinforcedDeorumDurability = 1000;
    public static float reinforcedDeorumMiningSpeedMultiplier = 1.0f;
    public static float reinforcedDeorumAttackDamage = 0.0f;
    public static int reinforcedDeorumMiningLevel = 1;
    public static int reinforcedDeorumEnchantability = 15;

    @Comment("\n Material - dracoArcanus")
    public static boolean dracoArcanusEnabled = true;
    public static int dracoArcanusDurability = 1000;
    public static float dracoArcanusMiningSpeedMultiplier = 1.0f;
    public static float dracoArcanusAttackDamage = 0.0f;
    public static int dracoArcanusMiningLevel = 1;
    public static int dracoArcanusEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
