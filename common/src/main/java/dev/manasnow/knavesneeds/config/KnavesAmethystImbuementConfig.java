package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;


import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesAmethystImbuementConfig extends Config {

    public KnavesAmethystImbuementConfig() {
        super(new ResourceLocation(MOD_ID, "amethyst_imbuement_config"));
    }

    @Comment("Material Modifier - ametrine")
    public boolean ametrineEnabled = true;
    public int ametrineDurability = 1000;
    public float ametrineMiningSpeedMultiplier = 1.0f;
    public float ametrineAttackDamage = 0.0f;
    public int ametrineMiningLevel = 1;
    public int ametrineEnchantability = 15;

    @Comment("\n Garnet")
    public boolean garnetEnabled = true;
    public int garnetDurability = 1000;
    public float garnetMiningSpeedMultiplier = 1.0f;
    public float garnetAttackDamage = 0.0f;
    public int garnetMiningLevel = 1;
    public int garnetEnchantability = 15;

    @Comment("\n Glowing")
    public boolean glowingEnabled = true;
    public int glowingDurability = 1000;
    public float glowingMiningSpeedMultiplier = 1.0f;
    public float glowingAttackDamage = 0.0f;
    public int glowingMiningLevel = 1;
    public int glowingEnchantability = 15;

    @Comment("\n Steel")
    public boolean steelEnabled = true;
    public int steelDurability = 1000;
    public float steelMiningSpeedMultiplier = 1.0f;
    public float steelAttackDamage = 0.0f;
    public int steelMiningLevel = 1;
    public int steelEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
