package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesTwilightForestConfig extends Config {

    public KnavesTwilightForestConfig() {
        super(new ResourceLocation(MOD_ID, "twilight_forest_config"));
    }

    @Comment("Material - Steeleaf")
    public boolean steeleafEnabled = true;
    public int steeleafDurability = 1000;
    public float steeleafMiningSpeedMultiplier = 1.0f;
    public float steeleafAttackDamage = 0.0f;
    public int steeleafMiningLevel = 1;
    public int steeleafEnchantability = 15;

    @Comment("Material - Ironwood")
    public boolean ironwoodEnabled = true;
    public int ironwoodDurability = 1000;
    public float ironwoodMiningSpeedMultiplier = 1.0f;
    public float ironwoodAttackDamage = 0.0f;
    public int ironwoodMiningLevel = 1;
    public int ironwoodEnchantability = 15;


    @Comment("Material - Fiery")
    public boolean fieryEnabled = true;
    public int fieryDurability = 1000;
    public float fieryMiningSpeedMultiplier = 1.0f;
    public float fieryAttackDamage = 0.0f;
    public int fieryMiningLevel = 1;
    public int fieryEnchantability = 15;

    @Comment("Material - Knightmetal")
    public boolean knightmetalEnabled = true;
    public int knightmetalDurability = 1000;
    public float knightmetalMiningSpeedMultiplier = 1.0f;
    public float knightmetalAttackDamage = 0.0f;
    public int knightmetalMiningLevel = 1;
    public int knightmetalEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
