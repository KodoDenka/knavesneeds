package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBlueSkiesConfig;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BlueSkiesAdditionsRegistries {

    public static KnavesBlueSkiesConfig blueSkiesConfig = ConfigApiJava.registerAndLoadConfig(KnavesBlueSkiesConfig::new);

    public static final Tier PYROPE = new TierHelper(
            "PYROPE",
            () -> blueSkiesConfig.pyropeDurability,
            () -> blueSkiesConfig.pyropeSpeed,
            () -> blueSkiesConfig.pyropeAttackBonus,
            () -> blueSkiesConfig.pyropeMiningLevel,
            () -> blueSkiesConfig.pyropeEnchantability,
            "blue_skies:pyrope_gem"
    );

    public static final Tier AQUITE = new TierHelper(
            "AQUITE",
            () -> blueSkiesConfig.aquiteDurability,
            () -> blueSkiesConfig.aquiteSpeed,
            () -> blueSkiesConfig.aquiteAttackBonus,
            () -> blueSkiesConfig.aquiteMiningLevel,
            () -> blueSkiesConfig.aquiteEnchantability,
            "blue_skies:aquite"
    );

    public static final Tier DIOPSIDE = new TierHelper(
            "DIOPSIDE",
            () -> blueSkiesConfig.diopsideDurability,
            () -> blueSkiesConfig.diopsideSpeed,
            () -> blueSkiesConfig.diopsideAttackBonus,
            () -> blueSkiesConfig.diopsideMiningLevel,
            () -> blueSkiesConfig.diopsideEnchantability,
            "blue_skies:diopside_gem"
    );

    public static final Tier CHAROITE = new TierHelper(
            "CHAROITE",
            () -> blueSkiesConfig.charoiteDurability,
            () -> blueSkiesConfig.charoiteSpeed,
            () -> blueSkiesConfig.charoiteAttackBonus,
            () -> blueSkiesConfig.charoiteMiningLevel,
            () -> blueSkiesConfig.charoiteEnchantability,
            "blue_skies:charoite"
    );

    public static final Tier HORIZONITE = new TierHelper(
            "HORIZONITE",
            () -> blueSkiesConfig.horizoniteDurability,
            () -> blueSkiesConfig.horizoniteSpeed,
            () -> blueSkiesConfig.horizoniteAttackBonus,
            () -> blueSkiesConfig.horizoniteMiningLevel,
            () -> blueSkiesConfig.horizoniteEnchantability,
            "blue_skies:horizonite_ingot"
    );

    public static final Tier TURQUOISE_STONE = new TierHelper(
            "TURQUOISE_STONE",
            () -> blueSkiesConfig.turquoiseStoneDurability,
            () -> blueSkiesConfig.turquoiseStoneSpeed,
            () -> blueSkiesConfig.turquoiseStoneAttackBonus,
            () -> blueSkiesConfig.turquoiseStoneMiningLevel,
            () -> blueSkiesConfig.turquoiseStoneEnchantability,
            "blue_skies:turquoise_cobblestone"
    );

    public static final Tier LUNAR_STONE = new TierHelper(
            "LUNAR_STONE",
            () -> blueSkiesConfig.lunarStoneDurability,
            () -> blueSkiesConfig.lunarStoneSpeed,
            () -> blueSkiesConfig.lunarStoneAttackBonus,
            () -> blueSkiesConfig.lunarStoneMiningLevel,
            () -> blueSkiesConfig.lunarStoneEnchantability,
            "blue_skies:lunar_cobblestone"
    );

    public static final Tier BLUEBRIGHT_WOOD = new TierHelper(
            "BLUEBRIGHT_WOOD",
            () -> blueSkiesConfig.bluebrightWoodDurability,
            () -> blueSkiesConfig.bluebrightWoodSpeed,
            () -> blueSkiesConfig.bluebrightWoodAttackBonus,
            () -> blueSkiesConfig.bluebrightWoodMiningLevel,
            () -> blueSkiesConfig.bluebrightWoodEnchantability,
            "blue_skies:bluebright_planks"
    );

    public static final Tier LUNAR_WOOD = new TierHelper(
            "LUNAR_WOOD",
            () -> blueSkiesConfig.lunarWoodDurability,
            () -> blueSkiesConfig.lunarWoodSpeed,
            () -> blueSkiesConfig.lunarWoodAttackBonus,
            () -> blueSkiesConfig.lunarWoodMiningLevel,
            () -> blueSkiesConfig.lunarWoodEnchantability,
            "blue_skies:lunar_planks"
    );

    public static final Tier STARLIT_WOOD = new TierHelper(
            "STARLIT_WOOD",
            () -> blueSkiesConfig.starlitWoodDurability,
            () -> blueSkiesConfig.starlitWoodSpeed,
            () -> blueSkiesConfig.starlitWoodAttackBonus,
            () -> blueSkiesConfig.starlitWoodMiningLevel,
            () -> blueSkiesConfig.starlitWoodEnchantability,
            "blue_skies:starlit_planks"
    );

    public static final Tier DUSK_WOOD = new TierHelper(
            "DUSK_WOOD",
            () -> blueSkiesConfig.duskWoodDurability,
            () -> blueSkiesConfig.duskWoodSpeed,
            () -> blueSkiesConfig.duskWoodAttackBonus,
            () -> blueSkiesConfig.duskWoodMiningLevel,
            () -> blueSkiesConfig.duskWoodEnchantability,
            "blue_skies:dusk_planks"
    );

    public static final Tier FROSTBRIGHT_WOOD = new TierHelper(
            "FROSTBRIGHT_WOOD",
            () -> blueSkiesConfig.frostbrightWoodDurability,
            () -> blueSkiesConfig.frostbrightWoodSpeed,
            () -> blueSkiesConfig.frostbrightWoodAttackBonus,
            () -> blueSkiesConfig.frostbrightWoodMiningLevel,
            () -> blueSkiesConfig.frostbrightWoodEnchantability,
            "blue_skies:frostbright_planks"
    );

    public static final Tier MAPLE_WOOD = new TierHelper(
            "MAPLE_WOOD",
            () -> blueSkiesConfig.mapleWoodDurability,
            () -> blueSkiesConfig.mapleWoodSpeed,
            () -> blueSkiesConfig.mapleWoodAttackBonus,
            () -> blueSkiesConfig.mapleWoodMiningLevel,
            () -> blueSkiesConfig.mapleWoodEnchantability,
            "blue_skies:maple_planks"
    );

    public static final Tier COMET_WOOD = new TierHelper(
            "COMET_WOOD",
            () -> blueSkiesConfig.cometWoodDurability,
            () -> blueSkiesConfig.cometWoodSpeed,
            () -> blueSkiesConfig.cometWoodAttackBonus,
            () -> blueSkiesConfig.cometWoodMiningLevel,
            () -> blueSkiesConfig.cometWoodEnchantability,
            "blue_skies:comet_planks"
    );

    //TODO Blue skies needs a different namespace.

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar("blue_skies", BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "blue_skies";

    private static final Registrar<Item> PYROPE_REGISTRAR = createRegistrar();
    public static final SwordSet PYROPE_ITEMS = new SwordSet(PYROPE_REGISTRAR, NAMESPACE, PYROPE, SwordItem::new);

    private static final Registrar<Item> AQUITE_REGISTRAR = createRegistrar();
    public static final SwordSet AQUITE_ITEMS = new SwordSet(AQUITE_REGISTRAR, NAMESPACE, AQUITE, SwordItem::new);

    private static final Registrar<Item> DIOPSIDE_REGISTRAR = createRegistrar();
    public static final SwordSet DIOPSIDE_ITEMS = new SwordSet(DIOPSIDE_REGISTRAR, NAMESPACE, DIOPSIDE, SwordItem::new);

    private static final Registrar<Item> CHAROITE_REGISTRAR = createRegistrar();
    public static final SwordSet CHAROITE_ITEMS = new SwordSet(CHAROITE_REGISTRAR, NAMESPACE, CHAROITE, SwordItem::new);

    private static final Registrar<Item> HORIZONITE_REGISTRAR = createRegistrar();
    public static final SwordSet HORIZONITE_ITEMS = new SwordSet(HORIZONITE_REGISTRAR, NAMESPACE, HORIZONITE, SwordItem::new);

    private static final Registrar<Item> TURQUOISE_STONE_REGISTRAR = createRegistrar();
    public static final SwordSet TURQUOISE_STONE_ITEMS = new SwordSet(TURQUOISE_STONE_REGISTRAR, NAMESPACE, TURQUOISE_STONE, SwordItem::new);

    private static final Registrar<Item> LUNAR_STONE_REGISTRAR = createRegistrar();
    public static final SwordSet LUNAR_STONE_ITEMS = new SwordSet(LUNAR_STONE_REGISTRAR, NAMESPACE, LUNAR_STONE, SwordItem::new);

    private static final Registrar<Item> BLUEBRIGHT_WOOD_REGISTRAR = createRegistrar();
    public static final SwordSet BLUEBRIGHT_WOOD_ITEMS = new SwordSet(BLUEBRIGHT_WOOD_REGISTRAR, NAMESPACE, BLUEBRIGHT_WOOD, SwordItem::new);

    private static final Registrar<Item> LUNAR_WOOD_REGISTRAR = createRegistrar();
    public static final SwordSet LUNAR_WOOD_ITEMS = new SwordSet(LUNAR_WOOD_REGISTRAR, NAMESPACE, LUNAR_WOOD, SwordItem::new);

    private static final Registrar<Item> STARLIT_WOOD_REGISTRAR = createRegistrar();
    public static final SwordSet STARLIT_WOOD_ITEMS = new SwordSet(STARLIT_WOOD_REGISTRAR, NAMESPACE, STARLIT_WOOD, SwordItem::new);

    private static final Registrar<Item> DUSK_WOOD_REGISTRAR = createRegistrar();
    public static final SwordSet DUSK_WOOD_ITEMS = new SwordSet(DUSK_WOOD_REGISTRAR, NAMESPACE, DUSK_WOOD, SwordItem::new);

    private static final Registrar<Item> FROSTBRIGHT_WOOD_REGISTRAR = createRegistrar();
    public static final SwordSet FROSTBRIGHT_WOOD_ITEMS = new SwordSet(FROSTBRIGHT_WOOD_REGISTRAR, NAMESPACE, FROSTBRIGHT_WOOD, SwordItem::new);

    private static final Registrar<Item> MAPLE_WOOD_REGISTRAR = createRegistrar();
    public static final SwordSet MAPLE_WOOD_ITEMS = new SwordSet(MAPLE_WOOD_REGISTRAR, NAMESPACE, MAPLE_WOOD, SwordItem::new);

    private static final Registrar<Item> COMET_WOOD_REGISTRAR = createRegistrar();
    public static final SwordSet COMET_WOOD_ITEMS = new SwordSet(COMET_WOOD_REGISTRAR, NAMESPACE, COMET_WOOD, SwordItem::new);

    public static void smartRegister() {
        if (blueSkiesConfig.pyropeEnabled) {
            PYROPE_REGISTRAR.init();
        }
        if (blueSkiesConfig.aquiteEnabled) {
            AQUITE_REGISTRAR.init();
        }
        if (blueSkiesConfig.diopsideEnabled) {
            DIOPSIDE_REGISTRAR.init();
        }
        if (blueSkiesConfig.charoiteEnabled) {
            CHAROITE_REGISTRAR.init();
        }
        if (blueSkiesConfig.horizoniteEnabled) {
            HORIZONITE_REGISTRAR.init();
        }
        if (blueSkiesConfig.turquoiseStoneEnabled) {
            TURQUOISE_STONE_REGISTRAR.init();
        }
        if (blueSkiesConfig.lunarStoneEnabled) {
            LUNAR_STONE_REGISTRAR.init();
        }
        if (blueSkiesConfig.bluebrightWoodEnabled) {
            BLUEBRIGHT_WOOD_REGISTRAR.init();
        }
        if (blueSkiesConfig.lunarWoodEnabled) {
            LUNAR_WOOD_REGISTRAR.init();
        }
        if (blueSkiesConfig.starlitWoodEnabled) {
            STARLIT_WOOD_REGISTRAR.init();
        }
        if (blueSkiesConfig.duskWoodEnabled) {
            DUSK_WOOD_REGISTRAR.init();
        }
        if (blueSkiesConfig.frostbrightWoodEnabled) {
            FROSTBRIGHT_WOOD_REGISTRAR.init();
        }
        if (blueSkiesConfig.mapleWoodEnabled) {
            MAPLE_WOOD_REGISTRAR.init();
        }
        if (blueSkiesConfig.cometWoodEnabled) {
            COMET_WOOD_REGISTRAR.init();
        }
    }
}