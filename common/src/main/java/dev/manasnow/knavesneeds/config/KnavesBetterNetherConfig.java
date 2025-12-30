package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Action;
import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.RequiresAction;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBetterNetherConfig extends Config {

    public KnavesBetterNetherConfig() {
        super(new ResourceLocation(MOD_ID, "better_nether_config"));
    }

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables/disables - Knaves' Needs' Cincinnasite additions.")
    public boolean cincinnasiteEnabled = true;
    @Comment("Cincinnasite durability/uses, can be any whole number.")
    public int cincinnasiteDurability = 1000;
    @Comment("Cincinnasite attack speed, can be any decimal number.")
    public float cincinnasiteMiningSpeedMultiplier = 1.0f;
    @Comment("Cincinnasite bonus damage, can be any decimal number.")
    public float cincinnasiteAttackDamage = 0.0f;
    @Comment("Cincinnasite mining level, can be any whole number.")
    public int cincinnasiteMiningLevel = 1;
    public int cincinnasiteEnchantability = 15;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables/disables - Knaves' Needs' Cincinnasite Diamond additions.")
    public boolean cincinnasiteDiamondEnabled = true;
    @Comment("Cincinnasite Diamond durability/uses, can be any whole number.")
    public int cincinnasiteDiamondDurability = 1000;
    @Comment("Cincinnasite Diamond attack speed, can be any decimal number.")
    public float cincinnasiteDiamondMiningSpeedMultiplier = 1.0f;
    @Comment("Cincinnasite Diamond bonus damage, can be any decimal number.")
    public float cincinnasiteDiamondAttackDamage = 0.0f;
    @Comment("Cincinnasite Diamond mining level, can be any whole number.")
    public int cincinnasiteDiamondMiningLevel = 1;
    @Comment("Cincinnasite Diamond enchantability, can be any whole number.")
    public int cincinnasiteDiamondEnchantability = 15;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables/disables - Knaves' Needs' Nether Ruby additions.")
    public boolean netherRubyEnabled = true;
    @Comment("Nether Ruby durability/uses, can be any whole number.")
    public int netherRubyDurability = 1000;
    @Comment("Nether Ruby attack speed, can be any decimal number.")
    public float netherRubyMiningSpeedMultiplier = 1.0f;
    @Comment("Nether Ruby bonus damage, can be any decimal number.")
    public float netherRubyAttackDamage = 0.0f;
    @Comment("Nether Ruby mining level, can be any whole number.")
    public int netherRubyMiningLevel = 1;
    @Comment("Nether Ruby enchantability, can be any whole number.")
    public int netherRubyEnchantability = 15;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables/disables - Knaves' Needs' Flaming Ruby additions.")
    public boolean flamingRubyEnabled = true;
    @Comment("Flaming Ruby durability/uses, can be any whole number.")
    public int flamingRubyDurability = 1000;
    @Comment("Flaming Ruby attack speed, can be any decimal number.")
    public float flamingRubyMiningSpeedMultiplier = 1.0f;
    @Comment("Flaming Ruby bonus damage, can be any decimal number.")
    public float flamingRubyAttackDamage = 0.0f;
    @Comment("Flaming Ruby mining level, can be any whole number.")
    public int flamingRubyMiningLevel = 1;
    @Comment("Flaming Ruby enchantability, can be any whole number.")
    public int flamingRubyEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
