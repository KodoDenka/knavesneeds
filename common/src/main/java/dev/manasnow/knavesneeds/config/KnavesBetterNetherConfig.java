package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBetterNetherConfig extends Config {

    public KnavesBetterNetherConfig() {
        super(new ResourceLocation(MOD_ID, "better_nether_config"));
    }

    @Comment("Material - Cincinnasite")
    public boolean cincinnasiteEnabled = true;
    public int cincinnasiteDurability = 1000;
    public float cincinnasiteMiningSpeedMultiplier = 1.0f;
    public float cincinnasiteAttackDamage = 0.0f;
    public int cincinnasiteMiningLevel = 1;
    public int cincinnasiteEnchantability = 15;

    @Comment("\n Material - Cincinnasite Diamond")
    public boolean cincinnasiteDiamondEnabled = true;
    public int cincinnasiteDiamondDurability = 1000;
    public float cincinnasiteDiamondMiningSpeedMultiplier = 1.0f;
    public float cincinnasiteDiamondAttackDamage = 0.0f;
    public int cincinnasiteDiamondMiningLevel = 1;
    public int cincinnasiteDiamondEnchantability = 15;

    @Comment("\n Material - Nether Ruby")
    public boolean netherRubyEnabled = true;
    public int netherRubyDurability = 1000;
    public float netherRubyMiningSpeedMultiplier = 1.0f;
    public float netherRubyAttackDamage = 0.0f;
    public int netherRubyMiningLevel = 1;
    public int netherRubyEnchantability = 15;

    @Comment("\n Material - Flaming Ruby")
    public boolean flamingRubyEnabled = true;
    public int flamingRubyDurability = 1000;
    public float flamingRubyMiningSpeedMultiplier = 1.0f;
    public float flamingRubyAttackDamage = 0.0f;
    public int flamingRubyMiningLevel = 1;
    public int flamingRubyEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
