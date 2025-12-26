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

    @Comment("Enables/disables - Knaves' Needs' Pyrope additions.")
    public boolean pyropeEnabled = true;
    @Comment("Pyrope durability/uses, can be any whole number.")
    public int pyropeDurability = 1000;
    @Comment("Pyrope attack speed, can be any decimal number.")
    public float pyropeSpeed = 1.0f;
    @Comment("Pyrope bonus damage, can be any decimal number.")
    public float pyropeAttackBonus = 0.0f;
    @Comment("Pyrope mining level, can be any whole number.")
    public int pyropeMiningLevel = 1;
    @Comment("Pyrope enchantability, can be any whole number.")
    public int pyropeEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Aquite additions.")
    public boolean aquiteEnabled = true;
    @Comment("Aquite durability/uses, can be any whole number.")
    public int aquiteDurability = 1000;
    @Comment("Aquite attack speed, can be any decimal number.")
    public float aquiteSpeed = 1.0f;
    @Comment("Aquite bonus damage, can be any decimal number.")
    public float aquiteAttackBonus = 0.0f;
    @Comment("Aquite mining level, can be any whole number.")
    public int aquiteMiningLevel = 1;
    @Comment("Aquite enchantability, can be any whole number.")
    public int aquiteEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Diopside additions.")
    public boolean diopsideEnabled = true;
    @Comment("Diopside durability/uses, can be any whole number.")
    public int diopsideDurability = 1000;
    @Comment("Diopside attack speed, can be any decimal number.")
    public float diopsideSpeed = 1.0f;
    @Comment("Diopside bonus damage, can be any decimal number.")
    public float diopsideAttackBonus = 0.0f;
    @Comment("Diopside mining level, can be any whole number.")
    public int diopsideMiningLevel = 1;
    @Comment("Diopside enchantability, can be any whole number.")
    public int diopsideEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Charoite additions.")
    public boolean charoiteEnabled = true;
    @Comment("Charoite durability/uses, can be any whole number.")
    public int charoiteDurability = 1000;
    @Comment("Charoite attack speed, can be any decimal number.")
    public float charoiteSpeed = 1.0f;
    @Comment("Charoite bonus damage, can be any decimal number.")
    public float charoiteAttackBonus = 0.0f;
    @Comment("Charoite mining level, can be any whole number.")
    public int charoiteMiningLevel = 1;
    @Comment("Charoite enchantability, can be any whole number.")
    public int charoiteEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Horizonite additions.")
    public boolean horizoniteEnabled = true;
    @Comment("Horizonite durability/uses, can be any whole number.")
    public int horizoniteDurability = 1000;
    @Comment("Horizonite attack speed, can be any decimal number.")
    public float horizoniteSpeed = 1.0f;
    @Comment("Horizonite bonus damage, can be any decimal number.")
    public float horizoniteAttackBonus = 0.0f;
    @Comment("Horizonite mining level, can be any whole number.")
    public int horizoniteMiningLevel = 1;
    @Comment("Horizonite enchantability, can be any whole number.")
    public int horizoniteEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Turquoise Stone additions.")
    public boolean turquoiseStoneEnabled = true;
    @Comment("Turquoise Stone durability/uses, can be any whole number.")
    public int turquoiseStoneDurability = 1000;
    @Comment("Turquoise Stone attack speed, can be any decimal number.")
    public float turquoiseStoneSpeed = 1.0f;
    @Comment("Turquoise Stone bonus damage, can be any decimal number.")
    public float turquoiseStoneAttackBonus = 0.0f;
    @Comment("Turquoise Stone mining level, can be any whole number.")
    public int turquoiseStoneMiningLevel = 1;
    @Comment("Turquoise Stone enchantability, can be any whole number.")
    public int turquoiseStoneEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Lunar Stone additions.")
    public boolean lunarStoneEnabled = true;
    @Comment("Lunar Stone durability/uses, can be any whole number.")
    public int lunarStoneDurability = 1000;
    @Comment("Lunar Stone attack speed, can be any decimal number.")
    public float lunarStoneSpeed = 1.0f;
    @Comment("Lunar Stone bonus damage, can be any decimal number.")
    public float lunarStoneAttackBonus = 0.0f;
    @Comment("Lunar Stone mining level, can be any whole number.")
    public int lunarStoneMiningLevel = 1;
    @Comment("Lunar Stone enchantability, can be any whole number.")
    public int lunarStoneEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Bluebright Wood additions.")
    public boolean bluebrightWoodEnabled = true;
    @Comment("Bluebright Wood durability/uses, can be any whole number.")
    public int bluebrightWoodDurability = 1000;
    @Comment("Bluebright Wood attack speed, can be any decimal number.")
    public float bluebrightWoodSpeed = 1.0f;
    @Comment("Bluebright Wood bonus damage, can be any decimal number.")
    public float bluebrightWoodAttackBonus = 0.0f;
    @Comment("Bluebright Wood mining level, can be any whole number.")
    public int bluebrightWoodMiningLevel = 1;
    @Comment("Bluebright Wood enchantability, can be any whole number.")
    public int bluebrightWoodEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Lunar Wood additions.")
    public boolean lunarWoodEnabled = true;
    @Comment("Lunar Wood durability/uses, can be any whole number.")
    public int lunarWoodDurability = 1000;
    @Comment("Lunar Wood attack speed, can be any decimal number.")
    public float lunarWoodSpeed = 1.0f;
    @Comment("Lunar Wood bonus damage, can be any decimal number.")
    public float lunarWoodAttackBonus = 0.0f;
    @Comment("Lunar Wood mining level, can be any whole number.")
    public int lunarWoodMiningLevel = 1;
    @Comment("Lunar Wood enchantability, can be any whole number.")
    public int lunarWoodEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Starlit Wood additions.")
    public boolean starlitWoodEnabled = true;
    @Comment("Starlit Wood durability/uses, can be any whole number.")
    public int starlitWoodDurability = 1000;
    @Comment("Starlit Wood attack speed, can be any decimal number.")
    public float starlitWoodSpeed = 1.0f;
    @Comment("Starlit Wood bonus damage, can be any decimal number.")
    public float starlitWoodAttackBonus = 0.0f;
    @Comment("Starlit Wood mining level, can be any whole number.")
    public int starlitWoodMiningLevel = 1;
    @Comment("Starlit Wood enchantability, can be any whole number.")
    public int starlitWoodEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Dusk Wood additions.")
    public boolean duskWoodEnabled = true;
    @Comment("Dusk Wood durability/uses, can be any whole number.")
    public int duskWoodDurability = 1000;
    @Comment("Dusk Wood attack speed, can be any decimal number.")
    public float duskWoodSpeed = 1.0f;
    @Comment("Dusk Wood bonus damage, can be any decimal number.")
    public float duskWoodAttackBonus = 0.0f;
    @Comment("Dusk Wood mining level, can be any whole number.")
    public int duskWoodMiningLevel = 1;
    @Comment("Dusk Wood enchantability, can be any whole number.")
    public int duskWoodEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Frostbright Wood additions.")
    public boolean frostbrightWoodEnabled = true;
    @Comment("Frostbright Wood durability/uses, can be any whole number.")
    public int frostbrightWoodDurability = 1000;
    @Comment("Frostbright Wood attack speed, can be any decimal number.")
    public float frostbrightWoodSpeed = 1.0f;
    @Comment("Frostbright Wood bonus damage, can be any decimal number.")
    public float frostbrightWoodAttackBonus = 0.0f;
    @Comment("Frostbright Wood mining level, can be any whole number.")
    public int frostbrightWoodMiningLevel = 1;
    @Comment("Frostbright Wood enchantability, can be any whole number.")
    public int frostbrightWoodEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Maple Wood additions.")
    public boolean mapleWoodEnabled = true;
    @Comment("Maple Wood durability/uses, can be any whole number.")
    public int mapleWoodDurability = 1000;
    @Comment("Maple Wood attack speed, can be any decimal number.")
    public float mapleWoodSpeed = 1.0f;
    @Comment("Maple Wood bonus damage, can be any decimal number.")
    public float mapleWoodAttackBonus = 0.0f;
    @Comment("Maple Wood mining level, can be any whole number.")
    public int mapleWoodMiningLevel = 1;
    @Comment("Maple Wood enchantability, can be any whole number.")
    public int mapleWoodEnchantability = 15;

    @Comment("Enables/disables - Knaves' Needs' Comet Wood additions.")
    public boolean cometWoodEnabled = true;
    @Comment("Comet Wood durability/uses, can be any whole number.")
    public int cometWoodDurability = 1000;
    @Comment("Comet Wood attack speed, can be any decimal number.")
    public float cometWoodSpeed = 1.0f;
    @Comment("Comet Wood bonus damage, can be any decimal number.")
    public float cometWoodAttackBonus = 0.0f;
    @Comment("Comet Wood mining level, can be any whole number.")
    public int cometWoodMiningLevel = 1;
    @Comment("Comet Wood enchantability, can be any whole number.")
    public int cometWoodEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
