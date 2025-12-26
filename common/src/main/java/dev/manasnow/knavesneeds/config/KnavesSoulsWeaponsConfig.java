package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesSoulsWeaponsConfig extends Config {

    public KnavesSoulsWeaponsConfig() {
        super(new ResourceLocation(MOD_ID, "souls_weapons_config"));
    }

    @Comment("Enables/disables - Knaves' Needs' Translucent additions.")
    public boolean translucentEnabled = true;
    @Comment("Translucent durability/uses, can be any whole number.")
    public int translucentDurability = 1000;
    @Comment("Translucent attack speed, can be any decimal number.")
    public float translucentSpeed = 1.0f;
    @Comment("Translucent bonus damage, can be any decimal number.")
    public float translucentAttackBonus = 0.0f;
    @Comment("Translucent mining level, can be any whole number.")
    public int translucentMiningLevel = 1;    
    @Comment("Translucent enchantability, can be any whole number.")
    public int translucentEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
