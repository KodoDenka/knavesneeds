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
    public static boolean pendoriteEnabled = true;
    public static int pendoriteDurability = 1000;
    public static float pendoriteMiningSpeedMultiplier = 1.0f;
    public static float pendoriteAttackDamage = 0.0f;
    public static int pendoriteMiningLevel = 1;
    public static int pendoriteEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
