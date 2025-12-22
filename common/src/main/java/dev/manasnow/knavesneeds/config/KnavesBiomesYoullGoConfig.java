package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBiomesYoullGoConfig extends Config {

    public KnavesBiomesYoullGoConfig() {
        super(new ResourceLocation(MOD_ID, "BiomesYoullGoConfig"));
    }

    @Comment("Material - Pendorite")
    public boolean pendoriteEnabled = true;
    public int pendoriteDurability = 1000;
    public float pendoriteMiningSpeedMultiplier = 1.0f;
    public float pendoriteAttackDamage = 0.0f;
    public int pendoriteMiningLevel = 1;
    public int pendoriteEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
