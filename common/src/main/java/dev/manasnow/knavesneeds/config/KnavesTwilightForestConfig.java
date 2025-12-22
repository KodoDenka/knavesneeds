package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedAny;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesTwilightForestConfig extends Config {

    public KnavesTwilightForestConfig() {
        super(new ResourceLocation(MOD_ID, "TwilightForestConfig"));
    }

    //public ValidatedAny<Tier> test = ;

    @Comment("Material - Steeleaf")
    public static boolean steeleafEnabled = true;
    public static int steeleafDurability = 1000;
    public static float steeleafMiningSpeedMultiplier = 1.0f;
    public static float steeleafAttackDamage = 0.0f;
    public static int steeleafMiningLevel = 1;
    public static int steeleafEnchantability = 15;

    @Comment("\n Material - Ironwood")
    public static boolean ironwoodEnabled = true;
    public static int ironwoodDurability = 1000;
    public static float ironwoodMiningSpeedMultiplier = 1.0f;
    public static float ironwoodAttackDamage = 0.0f;
    public static int ironwoodMiningLevel = 1;
    public static int ironwoodEnchantability = 15;


    @Comment("\n Material - Fiery")
    public static boolean fieryEnabled = true;
    public static int fieryDurability = 1000;
    public static float fieryMiningSpeedMultiplier = 1.0f;
    public static float fieryAttackDamage = 0.0f;
    public static int fieryMiningLevel = 1;
    public static int fieryEnchantability = 15;

    @Comment("\n Material - Knightmetal")
    public static boolean knightmetalEnabled = true;
    public static int knightmetalDurability = 1000;
    public static float knightmetalMiningSpeedMultiplier = 1.0f;
    public static float knightmetalAttackDamage = 0.0f;
    public static int knightmetalMiningLevel = 1;
    public static int knightmetalEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
