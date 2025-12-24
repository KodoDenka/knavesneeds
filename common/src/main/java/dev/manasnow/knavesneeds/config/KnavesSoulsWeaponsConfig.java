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

    @Comment("Material - Translucent")
    public boolean translucentEnabled = true;
    public int translucentDurability = 1000;
    public float translucentMiningSpeedMultiplier = 1.0f;
    public float translucentAttackDamage = 0.0f;
    public int translucentMiningLevel = 1;
    public int translucentEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
