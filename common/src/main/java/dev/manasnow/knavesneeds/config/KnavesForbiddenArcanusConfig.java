package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesForbiddenArcanusConfig extends Config {

    public KnavesForbiddenArcanusConfig() {
        super(new ResourceLocation(MOD_ID, "forbidden_arcanus_config"));
    }

    @Comment("Enables/disables - Knaves' Needs' Deorum additions.")
    public boolean deorumEnabled = true;
    @Comment("Deorum durability/uses, can be any whole number.")
    public int deorumDurability = 1000;
    @Comment("Deorum attack speed, can be any decimal number.")
    public float deorumSpeed = 1.0f;
    @Comment("Deorum bonus damage, can be any decimal number.")
    public float deorumAttackBonus = 0.0f;
    @Comment("Deorum mining level, can be any whole number.")
    public int deorumMiningLevel = 1;
    @Comment("Deorum enchantability, can be any whole number.")
    public int deorumEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Reinforced Deorum additions.")
    public boolean reinforcedDeorumEnabled = true;
    @Comment("Reinforced Deorum durability/uses, can be any whole number.")
    public int reinforcedDeorumDurability = 1000;
    @Comment("Reinforced Deorum attack speed, can be any decimal number.")
    public float reinforcedDeorumSpeed = 1.0f;
    @Comment("Reinforced Deorum bonus damage, can be any decimal number.")
    public float reinforcedDeorumAttackBonus = 0.0f;
    @Comment("Reinforced Deorum mining level, can be any whole number.")
    public int reinforcedDeorumMiningLevel = 1;
    @Comment("Reinforced Deorum enchantability, can be any whole number.")
    public int reinforcedDeorumEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Draco Arcanus additions.")
    public boolean dracoArcanusEnabled = true;
    @Comment("Draco Arcanus durability/uses, can be any whole number.")
    public int dracoArcanusDurability = 1000;
    @Comment("Draco Arcanus attack speed, can be any decimal number.")
    public float dracoArcanusSpeed = 1.0f;
    @Comment("Draco Arcanus bonus damage, can be any decimal number.")
    public float dracoArcanusAttackBonus = 0.0f;
    @Comment("Draco Arcanus mining level, can be any whole number.")
    public int dracoArcanusMiningLevel = 1;
    @Comment("Draco Arcanus enchantability, can be any whole number.")
    public int dracoArcanusEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
