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
    public boolean wardenEnabled = true;
    public int wardenDurability = 1000;
    public float wardenMiningSpeedMultiplier = 1.0f;
    public float wardenAttackDamage = 0.0f;
    public int wardenMiningLevel = 1;
    public int wardenEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
