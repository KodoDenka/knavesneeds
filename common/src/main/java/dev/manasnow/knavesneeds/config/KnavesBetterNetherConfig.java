package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class KnavesBetterNetherConfig extends Config {

    public KnavesBetterNetherConfig() {
        super(new ResourceLocation(MOD_ID, "BetterNetherConfig"));
    }

    @Comment("Material - Cincinnasite")
    boolean cincinnasiteEnabled = true;
    int cincinnasiteDurability = 1000;
    float cincinnasiteMiningSpeedMultiplier = 1.0f;
    float cincinnasiteAttackDamage = 0.0f;
    int cincinnasiteMiningLevel = 1;
    int cincinnasiteEnchantability = 15;

    @Comment("Material - Cincinnasite Diamond")
    boolean cincinnasiteDiamondEnabled = true;
    int cincinnasiteDiamondDurability = 1000;
    float cincinnasiteDiamondMiningSpeedMultiplier = 1.0f;
    float cincinnasiteDiamondAttackDamage = 0.0f;
    int cincinnasiteDiamondMiningLevel = 1;
    int cincinnasiteDiamondEnchantability = 15;

    @Comment("Material - Nether Ruby")
    boolean netherRubyEnabled = true;
    int netherRubyDurability = 1000;
    float netherRubyMiningSpeedMultiplier = 1.0f;
    float netherRubyAttackDamage = 0.0f;
    int netherRubyMiningLevel = 1;
    int netherRubyEnchantability = 15;

    @Comment("Material - Flaming Ruby")
    boolean flamingRubyEnabled = true;
    int flamingRubyDurability = 1000;
    float flamingRubyMiningSpeedMultiplier = 1.0f;
    float flamingRubyAttackDamage = 0.0f;
    int flamingRubyMiningLevel = 1;
    int flamingRubyEnchantability = 15;

}
