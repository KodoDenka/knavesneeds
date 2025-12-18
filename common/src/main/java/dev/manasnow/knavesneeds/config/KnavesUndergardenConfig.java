package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesUndergardenConfig extends Config {

    public KnavesUndergardenConfig() {
        super(new ResourceLocation(MOD_ID, "UndergardenConfig"));
    }

    @Comment("Material - Cloggrum")
    boolean cloggrumEnabled = true;
    int cloggrumDurability = 1000;
    float cloggrumMiningSpeedMultiplier = 1.0f;
    float cloggrumAttackDamage = 0.0f;
    int cloggrumMiningLevel = 1;
    int cloggrumEnchantability = 15;

    @Comment("\n Material - Froststeel")
    boolean froststeelEnabled = true;
    int froststeelDurability = 1000;
    float froststeelMiningSpeedMultiplier = 1.0f;
    float froststeelAttackDamage = 0.0f;
    int froststeelMiningLevel = 1;
    int froststeelEnchantability = 15;

    @Comment("\n Material - Utherium")
    boolean utheriumEnabled = true;
    int utheriumDurability = 1000;
    float utheriumMiningSpeedMultiplier = 1.0f;
    float utheriumAttackDamage = 0.0f;
    int utheriumMiningLevel = 1;
    int utheriumEnchantability = 15;

    @Comment("\n Material - Forgotten")
    boolean forgottenEnabled = true;
    int forgottenDurability = 1000;
    float forgottenMiningSpeedMultiplier = 1.0f;
    float forgottenAttackDamage = 0.0f;
    int forgottenMiningLevel = 1;
    int forgottenEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
