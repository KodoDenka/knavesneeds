package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBetterEndConfig extends Config {

    public KnavesBetterEndConfig() {
        super(new ResourceLocation(MOD_ID, "BetterEndConfig"));
    }

    @Comment("Material - Aeternium")
    public static boolean aeterniumEnabled = true;
    public static int aeterniumDurability = 1000;
    public static float aeterniumMiningSpeedMultiplier = 1.0f;
    public static float aeterniumAttackDamage = 0.0f;
    public static int aeterniumMiningLevel = 1;
    public static int aeterniumEnchantability = 15;

    @Comment("\n Material - Terminite")
    public static boolean terminiteEnabled = true;
    public static int terminiteDurability = 1000;
    public static float terminiteMiningSpeedMultiplier = 1.0f;
    public static float terminiteAttackDamage = 0.0f;
    public static int terminiteMiningLevel = 1;
    public static int terminiteEnchantability = 15;

    @Comment("\n Material - Thallasium")
    public static boolean thallasiumEnabled = true;
    public static int thallasiumDurability = 1000;
    public static float thallasiumMiningSpeedMultiplier = 1.0f;
    public static float thallasiumAttackDamage = 0.0f;
    public static int thallasiumMiningLevel = 1;
    public static int thallasiumEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
