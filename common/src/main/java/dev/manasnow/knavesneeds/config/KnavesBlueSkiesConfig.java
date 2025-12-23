package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBlueSkiesConfig extends Config {

    public KnavesBlueSkiesConfig() {
        super(new ResourceLocation(MOD_ID, "blue_skies_config"));
    }

    @Comment("Material - Pyrope")
    public boolean pyropeEnabled = true;
    public int pyropeDurability = 1000;
    public float pyropeMiningSpeedMultiplier = 1.0f;
    public float pyropeAttackDamage = 0.0f;
    public int pyropeMiningLevel = 1;
    public int pyropeEnchantability = 15;

    @Comment("\n Material - Aquite")
    public boolean aquiteEnabled = true;
    public int aquiteDurability = 1000;
    public float aquiteMiningSpeedMultiplier = 1.0f;
    public float aquiteAttackDamage = 0.0f;
    public int aquiteMiningLevel = 1;
    public int aquiteEnchantability = 15;

    @Comment("\n Material - Diopside")
    public boolean diopsideEnabled = true;
    public int diopsideDurability = 1000;
    public float diopsideMiningSpeedMultiplier = 1.0f;
    public float diopsideAttackDamage = 0.0f;
    public int diopsideMiningLevel = 1;
    public int diopsideEnchantability = 15;

    @Comment("\n Material - Charoite")
    public boolean charoiteEnabled = true;
    public int charoiteDurability = 1000;
    public float charoiteMiningSpeedMultiplier = 1.0f;
    public float charoiteAttackDamage = 0.0f;
    public int charoiteMiningLevel = 1;
    public int charoiteEnchantability = 15;

    @Comment("\n Material - Horizonite")
    public boolean horizoniteEnabled = true;
    public int horizoniteDurability = 1000;
    public float horizoniteMiningSpeedMultiplier = 1.0f;
    public float horizoniteAttackDamage = 0.0f;
    public int horizoniteMiningLevel = 1;
    public int horizoniteEnchantability = 15;

    @Comment("\n Material - Turquoise Stone")
    public boolean turquoiseStoneEnabled = true;
    public int turquoiseStoneDurability = 1000;
    public float turquoiseStoneMiningSpeedMultiplier = 1.0f;
    public float turquoiseStoneAttackDamage = 0.0f;
    public int turquoiseStoneMiningLevel = 1;
    public int turquoiseStoneEnchantability = 15;

    @Comment("\n Material - Lunar Stone")
    public boolean lunarStoneEnabled = true;
    public int lunarStoneDurability = 1000;
    public float lunarStoneMiningSpeedMultiplier = 1.0f;
    public float lunarStoneAttackDamage = 0.0f;
    public int lunarStoneMiningLevel = 1;
    public int lunarStoneEnchantability = 15;

    @Comment("\n Material - Bluebright Wood")
    public boolean bluebrightWoodEnabled = true;
    public int bluebrightWoodDurability = 1000;
    public float bluebrightWoodMiningSpeedMultiplier = 1.0f;
    public float bluebrightWoodAttackDamage = 0.0f;
    public int bluebrightWoodMiningLevel = 1;
    public int bluebrightWoodEnchantability = 15;

    @Comment("\n Material - Lunar Wood")
    public boolean lunarWoodEnabled = true;
    public int lunarWoodDurability = 1000;
    public float lunarWoodMiningSpeedMultiplier = 1.0f;
    public float lunarWoodAttackDamage = 0.0f;
    public int lunarWoodMiningLevel = 1;
    public int lunarWoodEnchantability = 15;

    @Comment("\n Material - Starlit Wood")
    public boolean starlitWoodEnabled = true;
    public int starlitWoodDurability = 1000;
    public float starlitWoodMiningSpeedMultiplier = 1.0f;
    public float starlitWoodAttackDamage = 0.0f;
    public int starlitWoodMiningLevel = 1;
    public int starlitWoodEnchantability = 15;

    @Comment("\n Material - Dusk Wood")
    public boolean duskWoodEnabled = true;
    public int duskWoodDurability = 1000;
    public float duskWoodMiningSpeedMultiplier = 1.0f;
    public float duskWoodAttackDamage = 0.0f;
    public int duskWoodMiningLevel = 1;
    public int duskWoodEnchantability = 15;

    @Comment("\n Material - Frostbright Wood")
    public boolean frostbrightWoodEnabled = true;
    public int frostbrightWoodDurability = 1000;
    public float frostbrightWoodMiningSpeedMultiplier = 1.0f;
    public float frostbrightWoodAttackDamage = 0.0f;
    public int frostbrightWoodMiningLevel = 1;
    public int frostbrightWoodEnchantability = 15;

    @Comment("\n Material - Maple Wood")
    public boolean mapleWoodEnabled = true;
    public int mapleWoodDurability = 1000;
    public float mapleWoodMiningSpeedMultiplier = 1.0f;
    public float mapleWoodAttackDamage = 0.0f;
    public int mapleWoodMiningLevel = 1;
    public int mapleWoodEnchantability = 15;

    @Comment("\n Material - Cherry Wood")
    public boolean cherryWoodEnabled = true;
    public int cherryWoodDurability = 1000;
    public float cherryWoodMiningSpeedMultiplier = 1.0f;
    public float cherryWoodAttackDamage = 0.0f;
    public int cherryWoodMiningLevel = 1;
    public int cherryWoodEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
