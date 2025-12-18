package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesDeeperDarkerConfig extends Config {

    public KnavesDeeperDarkerConfig() {
        super(new ResourceLocation(MOD_ID, "DeeperDarkerConfig"));
    }

    @Comment("Material - warden")
    boolean wardenEnabled = true;
    int wardenDurability = 1000;
    float wardenMiningSpeedMultiplier = 1.0f;
    float wardenAttackDamage = 0.0f;
    int wardenMiningLevel = 1;
    int wardenEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
