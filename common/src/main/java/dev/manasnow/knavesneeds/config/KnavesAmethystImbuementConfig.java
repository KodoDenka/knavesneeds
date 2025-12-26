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

    @Comment("Enables/disables - Knaves' Needs' Ametrine additions.")
    public boolean ametrineEnabled = true;
    @Comment("Ametrine durability/uses, can be any whole number.")
    public int ametrineDurability = 1000;
    @Comment("Ametrine attack speed, can be any decimal number.")
    public float ametrineSpeed = 1.0f;
    @Comment("Ametrine bonus damage, can be any decimal number.")
    public float ametrineAttackBonus = 0.0f;
    @Comment("Ametrine mining level, can be any whole number.")
    public int ametrineMiningLevel = 1;
    @Comment("Ametrine enchantability, can be any whole number.")
    public int ametrineEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Garnet additions.")
    public boolean garnetEnabled = true;
    @Comment("Garnet durability/uses, can be any whole number.")
    public int garnetDurability = 1000;
    @Comment("Garnet attack speed, can be any decimal number.")
    public float garnetSpeed = 1.0f;
    @Comment("Garnet bonus damage, can be any decimal number.")
    public float garnetAttackBonus = 0.0f;
    @Comment("Garnet mining level, can be any whole number.")
    public int garnetMiningLevel = 1;
    @Comment("Garnet enchantability, can be any whole number.")
    public int garnetEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Glowing additions.")
    public boolean glowingEnabled = true;
    @Comment("Glowing durability/uses, can be any whole number.")
    public int glowingDurability = 1000;
    @Comment("Glowing attack speed, can be any decimal number.")
    public float glowingSpeed = 1.0f;
    @Comment("Glowing bonus damage, can be any decimal number.")
    public float glowingAttackBonus = 0.0f;
    @Comment("Glowing mining level, can be any whole number.")
    public int glowingMiningLevel = 1;
    @Comment("Glowing enchantability, can be any whole number.")
    public int glowingEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Steel additions.")
    public boolean steelEnabled = true;
    @Comment("Steel durability/uses, can be any whole number.")
    public int steelDurability = 1000;
    @Comment("Steel attack speed, can be any decimal number.")
    public float steelSpeed = 1.0f;
    @Comment("Steel bonus damage, can be any decimal number.")
    public float steelAttackBonus = 0.0f;
    @Comment("Steel mining level, can be any whole number.")
    public int steelMiningLevel = 1;
    @Comment("Steel enchantability, can be any whole number.")
    public int steelEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
