package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBetterNetherConfig extends Config {

    public KnavesBetterNetherConfig() {
        super(new ResourceLocation(MOD_ID, "BetterNetherConfig"));
    }

    @Comment("Material - Cincinnasite")
    public static boolean cincinnasiteEnabled = true;
    public static int cincinnasiteDurability = 1000;
    public static float cincinnasiteMiningSpeedMultiplier = 1.0f;
    public static float cincinnasiteAttackDamage = 0.0f;
    public static int cincinnasiteMiningLevel = 1;
    public static int cincinnasiteEnchantability = 15;

    @Comment("\n Material - Cincinnasite Diamond")
    public static boolean cincinnasiteDiamondEnabled = true;
    public static int cincinnasiteDiamondDurability = 1000;
    public static float cincinnasiteDiamondMiningSpeedMultiplier = 1.0f;
    public static float cincinnasiteDiamondAttackDamage = 0.0f;
    public static int cincinnasiteDiamondMiningLevel = 1;
    public static int cincinnasiteDiamondEnchantability = 15;

    @Comment("\n Material - Nether Ruby")
    public static boolean netherRubyEnabled = true;
    public static int netherRubyDurability = 1000;
    public static float netherRubyMiningSpeedMultiplier = 1.0f;
    public static float netherRubyAttackDamage = 0.0f;
    public static int netherRubyMiningLevel = 1;
    public static int netherRubyEnchantability = 15;

    @Comment("\n Material - Flaming Ruby")
    public static boolean flamingRubyEnabled = true;
    public static int flamingRubyDurability = 1000;
    public static float flamingRubyMiningSpeedMultiplier = 1.0f;
    public static float flamingRubyAttackDamage = 0.0f;
    public static int flamingRubyMiningLevel = 1;
    public static int flamingRubyEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
