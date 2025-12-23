package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesUndergardenConfig extends Config {

    public KnavesUndergardenConfig() {
        super(new ResourceLocation(MOD_ID, "undergarden_config"));
    }

    @Comment("Material - Cloggrum")
    public static boolean cloggrumEnabled = true;
    public static int cloggrumDurability = 1000;
    public static float cloggrumMiningSpeedMultiplier = 1.0f;
    public static float cloggrumAttackDamage = 0.0f;
    public static int cloggrumMiningLevel = 1;
    public static int cloggrumEnchantability = 15;

    @Comment("\n Material - Froststeel")
    public static boolean froststeelEnabled = true;
    public static int froststeelDurability = 1000;
    public static float froststeelMiningSpeedMultiplier = 1.0f;
    public static float froststeelAttackDamage = 0.0f;
    public static int froststeelMiningLevel = 1;
    public static int froststeelEnchantability = 15;

    @Comment("\n Material - Utherium")
    public static boolean utheriumEnabled = true;
    public static int utheriumDurability = 1000;
    public static float utheriumMiningSpeedMultiplier = 1.0f;
    public static float utheriumAttackDamage = 0.0f;
    public static int utheriumMiningLevel = 1;
    public static int utheriumEnchantability = 15;

    @Comment("\n Material - Forgotten")
    public static boolean forgottenEnabled = true;
    public static int forgottenDurability = 1000;
    public static float forgottenMiningSpeedMultiplier = 1.0f;
    public static float forgottenAttackDamage = 0.0f;
    public static int forgottenMiningLevel = 1;
    public static int forgottenEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
