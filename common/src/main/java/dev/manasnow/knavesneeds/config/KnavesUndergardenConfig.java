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

    @Comment("Enables/disables - Knaves' Needs' Cloggrum additions.")
    public boolean cloggrumEnabled = true;
    @Comment("Cloggrum durability/uses, can be any whole number.")
    public int cloggrumDurability = 286;
    @Comment("Cloggrum attack speed, can be any decimal number.")
    public float cloggrumSpeed = 6.0f;
    @Comment("Cloggrum bonus damage, can be any decimal number.")
    public float cloggrumAttackBonus = 3.0f;
    @Comment("Cloggrum mining level, can be any whole number.")
    public int cloggrumMiningLevel = 2;
    @Comment("Cloggrum enchantability, can be any whole number.")
    public int cloggrumEnchantability = 8;

    @Comment("Enables/disables - Knaves' Needs' Froststeel additions.")
    public boolean froststeelEnabled = true;
    @Comment("Froststeel durability/uses, can be any whole number.")
    public int froststeelDurability = 575;
    @Comment("Froststeel attack speed, can be any decimal number.")
    public float froststeelSpeed = 7.0f;
    @Comment("Froststeel bonus damage, can be any decimal number.")
    public float froststeelAttackBonus = 2.0f;
    @Comment("Froststeel mining level, can be any whole number.")
    public int froststeelMiningLevel = 2;
    @Comment("Froststeel enchantability, can be any whole number.")
    public int froststeelEnchantability = 20;

    @Comment("Enables/disables - Knaves' Needs' Utherium additions.")
    public boolean utheriumEnabled = true;
    @Comment("Utherium durability/uses, can be any whole number.")
    public int utheriumDurability = 1279;
    @Comment("Utherium attack speed, can be any decimal number.")
    public float utheriumSpeed = 8.5f;
    @Comment("Utherium bonus damage, can be any decimal number.")
    public float utheriumAttackBonus = 3.5f;
    @Comment("Utherium mining level, can be any whole number.")
    public int utheriumMiningLevel = 3;
    @Comment("Utherium enchantability, can be any whole number.")
    public int utheriumEnchantability = 17;

    @Comment("Enables/disables - Knaves' Needs' Forgotten additions.")
    public boolean forgottenEnabled = true;
    @Comment("Forgotten durability/uses, can be any whole number.")
    public int forgottenDurability = 1876;
    @Comment("Forgotten attack speed, can be any decimal number.")
    public float forgottenSpeed = 8.0f;
    @Comment("Forgotten bonus damage, can be any decimal number.")
    public float forgottenAttackBonus = 3.0f;
    @Comment("Forgotten mining level, can be any whole number.")
    public int forgottenMiningLevel = 4;
    @Comment("Forgotten enchantability, can be any whole number.")
    public int forgottenEnchantability = 2;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
