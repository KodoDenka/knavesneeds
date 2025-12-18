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
    boolean pyropeEnabled = true;
    int pyropeDurability = 1000;
    float pyropeMiningSpeedMultiplier = 1.0f;
    float pyropeAttackDamage = 0.0f;
    int pyropeMiningLevel = 1;
    int pyropeEnchantability = 15;

    @Comment("\n Material - Aquite")
    boolean aquiteEnabled = true;
    int aquiteDurability = 1000;
    float aquiteMiningSpeedMultiplier = 1.0f;
    float aquiteAttackDamage = 0.0f;
    int aquiteMiningLevel = 1;
    int aquiteEnchantability = 15;

    @Comment("\n Material - Diopside")
    boolean diopsideEnabled = true;
    int diopsideDurability = 1000;
    float diopsideMiningSpeedMultiplier = 1.0f;
    float diopsideAttackDamage = 0.0f;
    int diopsideMiningLevel = 1;
    int diopsideEnchantability = 15;

    @Comment("\n Material - Charoite")
    boolean charoiteEnabled = true;
    int charoiteDurability = 1000;
    float charoiteMiningSpeedMultiplier = 1.0f;
    float charoiteAttackDamage = 0.0f;
    int charoiteMiningLevel = 1;
    int charoiteEnchantability = 15;

    @Comment("\n Material - Horizonite")
    boolean horizoniteEnabled = true;
    int horizoniteDurability = 1000;
    float horizoniteMiningSpeedMultiplier = 1.0f;
    float horizoniteAttackDamage = 0.0f;
    int horizoniteMiningLevel = 1;
    int horizoniteEnchantability = 15;

    @Comment("\n Material - Turquoise Stone")
    boolean turquoiseStoneEnabled = true;
    int turquoiseStoneDurability = 1000;
    float turquoiseStoneMiningSpeedMultiplier = 1.0f;
    float turquoiseStoneAttackDamage = 0.0f;
    int turquoiseStoneMiningLevel = 1;
    int turquoiseStoneEnchantability = 15;

    @Comment("\n Material - Lunar Stone")
    boolean lunarStoneEnabled = true;
    int lunarStoneDurability = 1000;
    float lunarStoneMiningSpeedMultiplier = 1.0f;
    float lunarStoneAttackDamage = 0.0f;
    int lunarStoneMiningLevel = 1;
    int lunarStoneEnchantability = 15;

    @Comment("\n Material - Bluebright Wood")
    boolean bluebrightWoodEnabled = true;
    int bluebrightWoodDurability = 1000;
    float bluebrightWoodMiningSpeedMultiplier = 1.0f;
    float bluebrightWoodAttackDamage = 0.0f;
    int bluebrightWoodMiningLevel = 1;
    int bluebrightWoodEnchantability = 15;

    @Comment("\n Material - Lunar Wood")
    boolean lunarWoodEnabled = true;
    int lunarWoodDurability = 1000;
    float lunarWoodMiningSpeedMultiplier = 1.0f;
    float lunarWoodAttackDamage = 0.0f;
    int lunarWoodMiningLevel = 1;
    int lunarWoodEnchantability = 15;

    @Comment("\n Material - Starlit Wood")
    boolean starlitWoodEnabled = true;
    int starlitWoodDurability = 1000;
    float starlitWoodMiningSpeedMultiplier = 1.0f;
    float starlitWoodAttackDamage = 0.0f;
    int starlitWoodMiningLevel = 1;
    int starlitWoodEnchantability = 15;

    @Comment("\n Material - Dusk Wood")
    boolean duskWoodEnabled = true;
    int duskWoodDurability = 1000;
    float duskWoodMiningSpeedMultiplier = 1.0f;
    float duskWoodAttackDamage = 0.0f;
    int duskWoodMiningLevel = 1;
    int duskWoodEnchantability = 15;

    @Comment("\n Material - Frostbright Wood")
    boolean frostbrightWoodEnabled = true;
    int frostbrightWoodDurability = 1000;
    float frostbrightWoodMiningSpeedMultiplier = 1.0f;
    float frostbrightWoodAttackDamage = 0.0f;
    int frostbrightWoodMiningLevel = 1;
    int frostbrightWoodEnchantability = 15;

    @Comment("\n Material - Maple Wood")
    boolean mapleWoodEnabled = true;
    int mapleWoodDurability = 1000;
    float mapleWoodMiningSpeedMultiplier = 1.0f;
    float mapleWoodAttackDamage = 0.0f;
    int mapleWoodMiningLevel = 1;
    int mapleWoodEnchantability = 15;

    @Comment("\n Material - Cherry Wood")
    boolean cherryWoodEnabled = true;
    int cherryWoodDurability = 1000;
    float cherryWoodMiningSpeedMultiplier = 1.0f;
    float cherryWoodAttackDamage = 0.0f;
    int cherryWoodMiningLevel = 1;
    int cherryWoodEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
