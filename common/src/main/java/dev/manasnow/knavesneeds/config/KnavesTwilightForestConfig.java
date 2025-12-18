package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesTwilightForestConfig extends Config {

    public KnavesTwilightForestConfig() {
        super(new ResourceLocation(MOD_ID, "TwilightForestConfig"));
    }

    @Comment("Material - Steeleaf")
    boolean steeleafEnabled = true;
    int steeleafDurability = 1000;
    float steeleafMiningSpeedMultiplier = 1.0f;
    float steeleafAttackDamage = 0.0f;
    int steeleafMiningLevel = 1;
    int steeleafEnchantability = 15;

    @Comment("\n Material - Ironwood")
    boolean ironwoodEnabled = true;
    int ironwoodDurability = 1000;
    float ironwoodMiningSpeedMultiplier = 1.0f;
    float ironwoodAttackDamage = 0.0f;
    int ironwoodMiningLevel = 1;
    int ironwoodEnchantability = 15;


    @Comment("\n Material - Fiery")
    boolean fieryEnabled = true;
    int fieryDurability = 1000;
    float fieryMiningSpeedMultiplier = 1.0f;
    float fieryAttackDamage = 0.0f;
    int fieryMiningLevel = 1;
    int fieryEnchantability = 15;

    @Comment("\n Material - Knightmetal")
    boolean knightmetalEnabled = true;
    int knightmetalDurability = 1000;
    float knightmetalMiningSpeedMultiplier = 1.0f;
    float knightmetalAttackDamage = 0.0f;
    int knightmetalMiningLevel = 1;
    int knightmetalEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
