package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class KnavesBetterEndConfig extends Config {

    public KnavesBetterEndConfig() {
        super(new ResourceLocation(MOD_ID, "BetterEndConfig"));
    }

    @Comment("Material - Aeternium")
    boolean aeterniumEnabled = true;
    int aeterniumDurability = 1000;
    float aeterniumMiningSpeedMultiplier = 1.0f;
    float aeterniumAttackDamage = 0.0f;
    int aeterniumMiningLevel = 1;
    int aeterniumEnchantability = 15;

    @Comment("Material - Terminite")
    boolean terminiteEnabled = true;
    int terminiteDurability = 1000;
    float terminiteMiningSpeedMultiplier = 1.0f;
    float terminiteAttackDamage = 0.0f;
    int terminiteMiningLevel = 1;
    int terminiteEnchantability = 15;

    @Comment("Material - Thallasium")
    boolean thallasiumEnabled = true;
    int thallasiumDurability = 1000;
    float thallasiumMiningSpeedMultiplier = 1.0f;
    float thallasiumAttackDamage = 0.0f;
    int thallasiumMiningLevel = 1;
    int thallasiumEnchantability = 15;
}
