package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBlueSkiesConfig;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class BlueSkiesAdditionsRegistries {

    public static KnavesBlueSkiesConfig blueSkiesConfig = ConfigApiJava.registerAndLoadConfig(KnavesBlueSkiesConfig::new);

    public static final Tier PYROPE = new SimpleTier(
            "PYROPE",
            () -> blueSkiesConfig.pyropeDurability,
            () -> blueSkiesConfig.pyropeMiningSpeedMultiplier,
            () -> blueSkiesConfig.pyropeAttackDamage,
            () -> blueSkiesConfig.pyropeMiningLevel,
            () -> blueSkiesConfig.pyropeEnchantability,
            "blue_skies:pyrope_gem"
    );

    public static final Tier AQUITE = new SimpleTier(
            "AQUITE",
            () -> blueSkiesConfig.aquiteDurability,
            () -> blueSkiesConfig.aquiteMiningSpeedMultiplier,
            () -> blueSkiesConfig.aquiteAttackDamage,
            () -> blueSkiesConfig.aquiteMiningLevel,
            () -> blueSkiesConfig.aquiteEnchantability,
            "blue_skies:aquite"
    );

    public static final Tier DIOPSIDE = new SimpleTier(
            "DIOPSIDE",
            () -> blueSkiesConfig.diopsideDurability,
            () -> blueSkiesConfig.diopsideMiningSpeedMultiplier,
            () -> blueSkiesConfig.diopsideAttackDamage,
            () -> blueSkiesConfig.diopsideMiningLevel,
            () -> blueSkiesConfig.diopsideEnchantability,
            "blue_skies:diopside_gem"
    );

    public static final Tier CHAROITE = new SimpleTier(
            "CHAROITE",
            () -> blueSkiesConfig.charoiteDurability,
            () -> blueSkiesConfig.charoiteMiningSpeedMultiplier,
            () -> blueSkiesConfig.charoiteAttackDamage,
            () -> blueSkiesConfig.charoiteMiningLevel,
            () -> blueSkiesConfig.charoiteEnchantability,
            "blue_skies:charoite"
    );

    public static final Tier HORIZONITE = new SimpleTier(
            "HORIZONITE",
            () -> blueSkiesConfig.horizoniteDurability,
            () -> blueSkiesConfig.horizoniteMiningSpeedMultiplier,
            () -> blueSkiesConfig.horizoniteAttackDamage,
            () -> blueSkiesConfig.horizoniteMiningLevel,
            () -> blueSkiesConfig.horizoniteEnchantability,
            "blue_skies:horizonite_ingot"
    );

    public static final Tier TURQUOISE_STONE = new SimpleTier(
            "TURQUOISE_STONE",
            () -> blueSkiesConfig.turquoiseStoneDurability,
            () -> blueSkiesConfig.turquoiseStoneMiningSpeedMultiplier,
            () -> blueSkiesConfig.turquoiseStoneAttackDamage,
            () -> blueSkiesConfig.turquoiseStoneMiningLevel,
            () -> blueSkiesConfig.turquoiseStoneEnchantability,
            "blue_skies:turquoise_cobblestone"
    );

    public static final Tier LUNAR_STONE = new SimpleTier(
            "LUNAR_STONE",
            () -> blueSkiesConfig.lunarStoneDurability,
            () -> blueSkiesConfig.lunarStoneMiningSpeedMultiplier,
            () -> blueSkiesConfig.lunarStoneAttackDamage,
            () -> blueSkiesConfig.lunarStoneMiningLevel,
            () -> blueSkiesConfig.lunarStoneEnchantability,
            "blue_skies:lunar_cobblestone"
    );

    public static final Tier BLUEBRIGHT_WOOD = new SimpleTier(
            "BLUEBRIGHT_WOOD",
            () -> blueSkiesConfig.bluebrightWoodDurability,
            () -> blueSkiesConfig.bluebrightWoodMiningSpeedMultiplier,
            () -> blueSkiesConfig.bluebrightWoodAttackDamage,
            () -> blueSkiesConfig.bluebrightWoodMiningLevel,
            () -> blueSkiesConfig.bluebrightWoodEnchantability,
            "blue_skies:bluebright_planks"
    );

    public static final Tier LUNAR_WOOD = new SimpleTier(
            "LUNAR_WOOD",
            () -> blueSkiesConfig.lunarWoodDurability,
            () -> blueSkiesConfig.lunarWoodMiningSpeedMultiplier,
            () -> blueSkiesConfig.lunarWoodAttackDamage,
            () -> blueSkiesConfig.lunarWoodMiningLevel,
            () -> blueSkiesConfig.lunarWoodEnchantability,
            "blue_skies:lunar_planks"
    );

    public static final Tier STARLIT_WOOD = new SimpleTier(
            "STARLIT_WOOD",
            () -> blueSkiesConfig.starlitWoodDurability,
            () -> blueSkiesConfig.starlitWoodMiningSpeedMultiplier,
            () -> blueSkiesConfig.starlitWoodAttackDamage,
            () -> blueSkiesConfig.starlitWoodMiningLevel,
            () -> blueSkiesConfig.starlitWoodEnchantability,
            "blue_skies:starlit_planks"
    );

    public static final Tier DUSK_WOOD = new SimpleTier(
            "DUSK_WOOD",
            () -> blueSkiesConfig.duskWoodDurability,
            () -> blueSkiesConfig.duskWoodMiningSpeedMultiplier,
            () -> blueSkiesConfig.duskWoodAttackDamage,
            () -> blueSkiesConfig.duskWoodMiningLevel,
            () -> blueSkiesConfig.duskWoodEnchantability,
            "blue_skies:dusk_planks"
    );

    public static final Tier FROSTBRIGHT_WOOD = new SimpleTier(
            "FROSTBRIGHT_WOOD",
            () -> blueSkiesConfig.frostbrightWoodDurability,
            () -> blueSkiesConfig.frostbrightWoodMiningSpeedMultiplier,
            () -> blueSkiesConfig.frostbrightWoodAttackDamage,
            () -> blueSkiesConfig.frostbrightWoodMiningLevel,
            () -> blueSkiesConfig.frostbrightWoodEnchantability,
            "blue_skies:frostbright_planks"
    );

    public static final Tier MAPLE_WOOD = new SimpleTier(
            "MAPLE_WOOD",
            () -> blueSkiesConfig.mapleWoodDurability,
            () -> blueSkiesConfig.mapleWoodMiningSpeedMultiplier,
            () -> blueSkiesConfig.mapleWoodAttackDamage,
            () -> blueSkiesConfig.mapleWoodMiningLevel,
            () -> blueSkiesConfig.mapleWoodEnchantability,
            "blue_skies:maple_planks"
    );

    //TODO add comet support since cherry wood has been removed.


    //TODO Blue skies needs a diffrent MOD_ID
    static Registrar<Item> BLUE_SKIES_ITEMS  = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    //TODO Blue skies needs a different namespace.
    public static final SwordSet PYROPE_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", PYROPE, SwordItem::new);
    public static final SwordSet AQUITE_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", AQUITE, SwordItem::new);
    public static final SwordSet DIOPSIDE_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", DIOPSIDE, SwordItem::new);
    public static final SwordSet CHAROITE_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", CHAROITE, SwordItem::new);
    public static final SwordSet HORIZONITE_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", HORIZONITE, SwordItem::new);

    public static final SwordSet TURQUOISE_STONE_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", TURQUOISE_STONE, SwordItem::new);
    public static final SwordSet LUNAR_STONE_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", LUNAR_STONE, SwordItem::new);

    public static final SwordSet BLUEBRIGHT_WOOD_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", BLUEBRIGHT_WOOD, SwordItem::new);
    public static final SwordSet LUNAR_WOOD_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", LUNAR_WOOD, SwordItem::new);
    public static final SwordSet STARLIT_WOOD_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", STARLIT_WOOD, SwordItem::new);
    public static final SwordSet DUSK_WOOD_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", DUSK_WOOD, SwordItem::new);
    public static final SwordSet FROSTBRIGHT_WOOD_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", FROSTBRIGHT_WOOD, SwordItem::new);
    public static final SwordSet MAPLE_WOOD_ITEMS = new SwordSet(BLUE_SKIES_ITEMS ,"blue_skies", MAPLE_WOOD, SwordItem::new);

    public static void smartRegister() {
        BLUE_SKIES_ITEMS .init();
    }
}