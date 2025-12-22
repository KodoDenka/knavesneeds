package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBlueSkiesConfig extends Config {

    public KnavesBlueSkiesConfig() {
        super(new ResourceLocation(MOD_ID, "BlueSkiesConfig"));
    }

    @Comment("Material - Pyrope")
    public static boolean pyropeEnabled = true;
    public static int pyropeDurability = 1000;
    public static float pyropeMiningSpeedMultiplier = 1.0f;
    public static float pyropeAttackDamage = 0.0f;
    public static int pyropeMiningLevel = 1;
    public static int pyropeEnchantability = 15;

    @Comment("\n Material - Aquite")
    public static boolean aquiteEnabled = true;
    public static int aquiteDurability = 1000;
    public static float aquiteMiningSpeedMultiplier = 1.0f;
    public static float aquiteAttackDamage = 0.0f;
    public static int aquiteMiningLevel = 1;
    public static int aquiteEnchantability = 15;

    @Comment("\n Material - Diopside")
    public static boolean diopsideEnabled = true;
    public static int diopsideDurability = 1000;
    public static float diopsideMiningSpeedMultiplier = 1.0f;
    public static float diopsideAttackDamage = 0.0f;
    public static int diopsideMiningLevel = 1;
    public static int diopsideEnchantability = 15;

    @Comment("\n Material - Charoite")
    public static boolean charoiteEnabled = true;
    public static int charoiteDurability = 1000;
    public static float charoiteMiningSpeedMultiplier = 1.0f;
    public static float charoiteAttackDamage = 0.0f;
    public static int charoiteMiningLevel = 1;
    public static int charoiteEnchantability = 15;

    @Comment("\n Material - Horizonite")
    public static boolean horizoniteEnabled = true;
    public static int horizoniteDurability = 1000;
    public static float horizoniteMiningSpeedMultiplier = 1.0f;
    public static float horizoniteAttackDamage = 0.0f;
    public static int horizoniteMiningLevel = 1;
    public static int horizoniteEnchantability = 15;

    @Comment("\n Material - Turquoise Stone")
    public static boolean turquoiseStoneEnabled = true;
    public static int turquoiseStoneDurability = 1000;
    public static float turquoiseStoneMiningSpeedMultiplier = 1.0f;
    public static float turquoiseStoneAttackDamage = 0.0f;
    public static int turquoiseStoneMiningLevel = 1;
    public static int turquoiseStoneEnchantability = 15;

    @Comment("\n Material - Lunar Stone")
    public static boolean lunarStoneEnabled = true;
    public static int lunarStoneDurability = 1000;
    public static float lunarStoneMiningSpeedMultiplier = 1.0f;
    public static float lunarStoneAttackDamage = 0.0f;
    public static int lunarStoneMiningLevel = 1;
    public static int lunarStoneEnchantability = 15;

    @Comment("\n Material - Bluebright Wood")
    public static boolean bluebrightWoodEnabled = true;
    public static int bluebrightWoodDurability = 1000;
    public static float bluebrightWoodMiningSpeedMultiplier = 1.0f;
    public static float bluebrightWoodAttackDamage = 0.0f;
    public static int bluebrightWoodMiningLevel = 1;
    public static int bluebrightWoodEnchantability = 15;

    @Comment("\n Material - Lunar Wood")
    public static boolean lunarWoodEnabled = true;
    public static int lunarWoodDurability = 1000;
    public static float lunarWoodMiningSpeedMultiplier = 1.0f;
    public static float lunarWoodAttackDamage = 0.0f;
    public static int lunarWoodMiningLevel = 1;
    public static int lunarWoodEnchantability = 15;

    @Comment("\n Material - Starlit Wood")
    public static boolean starlitWoodEnabled = true;
    public static int starlitWoodDurability = 1000;
    public static float starlitWoodMiningSpeedMultiplier = 1.0f;
    public static float starlitWoodAttackDamage = 0.0f;
    public static int starlitWoodMiningLevel = 1;
    public static int starlitWoodEnchantability = 15;

    @Comment("\n Material - Dusk Wood")
    public static boolean duskWoodEnabled = true;
    public static int duskWoodDurability = 1000;
    public static float duskWoodMiningSpeedMultiplier = 1.0f;
    public static float duskWoodAttackDamage = 0.0f;
    public static int duskWoodMiningLevel = 1;
    public static int duskWoodEnchantability = 15;

    @Comment("\n Material - Frostbright Wood")
    public static boolean frostbrightWoodEnabled = true;
    public static int frostbrightWoodDurability = 1000;
    public static float frostbrightWoodMiningSpeedMultiplier = 1.0f;
    public static float frostbrightWoodAttackDamage = 0.0f;
    public static int frostbrightWoodMiningLevel = 1;
    public static int frostbrightWoodEnchantability = 15;

    @Comment("\n Material - Maple Wood")
    public static boolean mapleWoodEnabled = true;
    public static int mapleWoodDurability = 1000;
    public static float mapleWoodMiningSpeedMultiplier = 1.0f;
    public static float mapleWoodAttackDamage = 0.0f;
    public static int mapleWoodMiningLevel = 1;
    public static int mapleWoodEnchantability = 15;

    @Comment("\n Material - Cherry Wood")
    public static boolean cherryWoodEnabled = true;
    public static int cherryWoodDurability = 1000;
    public static float cherryWoodMiningSpeedMultiplier = 1.0f;
    public static float cherryWoodAttackDamage = 0.0f;
    public static int cherryWoodMiningLevel = 1;
    public static int cherryWoodEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
