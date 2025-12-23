package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesUndergardenConfig extends Config {

    public KnavesUndergardenConfig() {
        super(new ResourceLocation(MOD_ID, "undergarden_config"));
    }

    @Comment("Material - Cloggrum")
    public boolean cloggrumEnabled = true;
    public int cloggrumDurability = 1000;
    public float cloggrumMiningSpeedMultiplier = 1.0f;
    public float cloggrumAttackDamage = 0.0f;
    public int cloggrumMiningLevel = 1;
    public int cloggrumEnchantability = 15;

    @Comment("\n Material - Froststeel")
    public boolean froststeelEnabled = true;
    public int froststeelDurability = 1000;
    public float froststeelMiningSpeedMultiplier = 1.0f;
    public float froststeelAttackDamage = 0.0f;
    public int froststeelMiningLevel = 1;
    public int froststeelEnchantability = 15;

    @Comment("\n Material - Utherium")
    public boolean utheriumEnabled = true;
    public int utheriumDurability = 1000;
    public float utheriumMiningSpeedMultiplier = 1.0f;
    public float utheriumAttackDamage = 0.0f;
    public int utheriumMiningLevel = 1;
    public int utheriumEnchantability = 15;

    @Comment("\n Material - Forgotten")
    public boolean forgottenEnabled = true;
    public int forgottenDurability = 1000;
    public float forgottenMiningSpeedMultiplier = 1.0f;
    public float forgottenAttackDamage = 0.0f;
    public int forgottenMiningLevel = 1;
    public int forgottenEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
