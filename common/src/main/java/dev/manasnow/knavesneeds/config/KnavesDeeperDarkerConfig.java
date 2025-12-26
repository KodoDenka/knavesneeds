package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesDeeperDarkerConfig extends Config {

    public KnavesDeeperDarkerConfig() {
        super(new ResourceLocation(MOD_ID, "deeper_darker_config"));
    }

    @Comment("Warden durability/uses, can be any whole number.")
    public int wardenDurability = 1000;
    @Comment("Warden attack speed, can be any decimal number.")
    public float wardenSpeed = 1.0f;
    @Comment("Warden bonus damage, can be any decimal number.")
    public float wardenAttackBonus = 0.0f;
    @Comment("Warden mining level, can be any whole number.")
    public int wardenMiningLevel = 1;
    @Comment("Warden enchantability, can be any whole number.")
    public int wardenEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
