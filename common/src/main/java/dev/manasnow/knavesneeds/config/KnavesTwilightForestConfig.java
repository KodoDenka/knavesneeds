package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.*;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesTwilightForestConfig extends Config {

    public KnavesTwilightForestConfig() {
        super(new ResourceLocation(MOD_ID, "twilight_forest_config"));
    }

    @Comment("Enables/disables - Knaves' Needs' Fiery additions.")
    public boolean fieryEnabled = true;
    @Comment("Fiery durability/uses, can be any whole number.")
    public int fieryDurability = 1024;
    @Comment("Fiery attack speed, can be any decimal number.")
    public float fierySpeed = 9.0f;
    @Comment("Fiery bonus damage, can be any decimal number.")
    public float fieryAttackBonus = 4.0f;
    @Comment("Fiery mining level, can be any whole number.")
    public int fieryMiningLevel = 4;
    @Comment("Fiery enchantability, can be any whole number.")
    public int fieryEnchantability = 10;

    @RequiresAction(action = Action.RESTART)
    @Comment("Enables/disables - Knaves' Needs' Ironwood additions.")
    public boolean ironwoodEnabled = true;
    @Comment("Ironwood durability/uses, can be any whole number.")
    public int ironwoodDurability = 512;
    @Comment("Ironwood attack speed, can be any decimal number.")
    @Name("Ironwood §3Speeeeeeed")
    public float ironwoodSpeed = 6.5f;
    @Comment("Ironwood bonus damage, can be any decimal number.")
    public float ironwoodAttackBonus = 2.5f;
    @Comment("Ironwood mining level, can be any whole number.")
    public int ironwoodMiningLevel = 2;
    @Comment("Ironwood enchantability, can be any whole number.")
    public int ironwoodEnchantability = 25;

    @Comment("Enables/disables - Knaves' Needs' Knightmetal additions.")
    public boolean knightmetalEnabled = true;
    @Comment("Knightmetal durability/uses, can be any whole number.")
    public int knightmetalDurability = 512;
    @Comment("Knightmetal attack speed, can be any decimal number.")
    public float knightmetalSpeed = 7.0f;
    @Comment("Knightmetal bonus damage, can be any decimal number.")
    public float knightmetalAttackBonus = 3.0f;
    @Comment("Knightmetal mining level, can be any whole number.")
    public int knightmetalMiningLevel = 3;
    @Comment("Knightmetal enchantability, can be any whole number.")
    public int knightmetalEnchantability = 8;

    @Comment("Enables/disables - Knaves' Needs' Steeleaf additions.")
    public boolean steeleafEnabled = true;
    @Comment("Steeleaf durability/uses, can be any whole number.")
    public int steeleafDurability = 131;
    @Comment("Steeleaf attack speed, can be any decimal number.")
    public float steeleafSpeed = 8.0f;
    @Comment("Steeleaf bonus damage, can be any decimal number.")
    public float steeleafAttackBonus = 3.0f;
    @Comment("Steeleaf mining level, can be any whole number.")
    public int steeleafMiningLevel = 3;
    @Comment("Steeleaf enchantability, can be any whole number.")
    public int steeleafEnchantability = 9;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
