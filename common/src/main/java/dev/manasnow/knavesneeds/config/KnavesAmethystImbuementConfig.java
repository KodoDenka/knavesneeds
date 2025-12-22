package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;


import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesAmethystImbuementConfig extends Config {

    public KnavesAmethystImbuementConfig() {
        super(new ResourceLocation(MOD_ID, "AmethystImbuementConfig"));
    }

    @Comment("Material Modifier - ametrine")
    public static boolean ametrineEnabled = true;
    public static int ametrineDurability = 1000;
    public static float ametrineMiningSpeedMultiplier = 1.0f;
    public static float ametrineAttackDamage = 0.0f;
    public static int ametrineMiningLevel = 1;
    public static int ametrineEnchantability = 15;

    @Comment("\n Garnet")
    public static boolean garnetEnabled = true;
    public static int garnetDurability = 1000;
    public static float garnetMiningSpeedMultiplier = 1.0f;
    public static float garnetAttackDamage = 0.0f;
    public static int garnetMiningLevel = 1;
    public static int garnetEnchantability = 15;

    @Comment("\n Glowing")
    public static boolean glowingEnabled = true;
    public static int glowingDurability = 1000;
    public static float glowingMiningSpeedMultiplier = 1.0f;
    public static float glowingAttackDamage = 0.0f;
    public static int glowingMiningLevel = 1;
    public static int glowingEnchantability = 15;

    @Comment("\n Steel")
    public static boolean steelEnabled = true;
    public static int steelDurability = 1000;
    public static float steelMiningSpeedMultiplier = 1.0f;
    public static float steelAttackDamage = 0.0f;
    public static int steelMiningLevel = 1;
    public static int steelEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
