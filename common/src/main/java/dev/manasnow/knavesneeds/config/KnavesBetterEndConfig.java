package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBetterEndConfig extends Config {

    public KnavesBetterEndConfig() {
        super(new ResourceLocation(MOD_ID, "betterend_config"));
    }

    @Comment("Enables/disables - Knaves' Needs' Aeternium additions.")
    public boolean aeterniumEnabled = true;
    @Comment("Aeternium durability/uses, can be any whole number.")
    public int aeterniumDurability = 1000;
    @Comment("Aeternium attack speed, can be any decimal number.")
    public float aeterniumSpeed = 1.0f;
    @Comment("Aeternium bonus damage, can be any decimal number.")
    public float aeterniumAttackBonus = 0.0f;
    @Comment("Aeternium mining level, can be any whole number.")
    public int aeterniumMiningLevel = 1;
    @Comment("Aeternium enchantability, can be any whole number.")
    public int aeterniumEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Terminite additions.")
    public boolean terminiteEnabled = true;
    @Comment("Terminite durability/uses, can be any whole number.")
    public int terminiteDurability = 1000;
    @Comment("Terminite attack speed, can be any decimal number.")
    public float terminiteSpeed = 1.0f;
    @Comment("Terminite bonus damage, can be any decimal number.")
    public float terminiteAttackBonus = 0.0f;
    @Comment("Terminite mining level, can be any whole number.")
    public int terminiteMiningLevel = 1;
    @Comment("Terminite enchantability, can be any whole number.")
    public int terminiteEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Thallasium additions.")
    public boolean thallasiumEnabled = true;
    @Comment("Thallasium durability/uses, can be any whole number.")
    public int thallasiumDurability = 1000;
    @Comment("Thallasium attack speed, can be any decimal number.")
    public float thallasiumSpeed = 1.0f;
    @Comment("Thallasium bonus damage, can be any decimal number.")
    public float thallasiumAttackBonus = 0.0f;
    @Comment("Thallasium mining level, can be any whole number.")
    public int thallasiumMiningLevel = 1;
    @Comment("Thallasium enchantability, can be any whole number.")
    public int thallasiumEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
