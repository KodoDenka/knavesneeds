package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;


import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class KnavesAmethystImbuementConfig extends Config {

    public KnavesAmethystImbuementConfig() {
        super(new ResourceLocation(MOD_ID, "AmethystImbuementConfig"));
    }

    @Comment("Material Modifier - ametrine")
    boolean ametrineEnabled = true;

    int ametrineDurability = 1000;

    float ametrineMiningSpeedMultiplier = 1.0f;

    float ametrineAttackDamage = 0.0f;

    int ametrineMiningLevel = 1;

    int ametrineEnchantability = 15;

    @Comment("Garnet")

    boolean garnetEnabled = true;

    int garnetDurability = 1000;

    float garnetMiningSpeedMultiplier = 1.0f;

    float garnetAttackDamage = 0.0f;

    int garnetMiningLevel = 1;

    int garnetEnchantability = 15;

    @Comment("Glowing")

    boolean glowingEnabled = true;

    int glowingDurability = 1000;

    float glowingMiningSpeedMultiplier = 1.0f;

    float glowingAttackDamage = 0.0f;

    int glowingMiningLevel = 1;

    int glowingEnchantability = 15;

    @Comment("Steel")

    boolean steelEnabled = true;

    int steelDurability = 1000;

    float steelMiningSpeedMultiplier = 1.0f;

    float steelAttackDamage = 0.0f;

    int steelMiningLevel = 1;

    int steelEnchantability = 15;

}
