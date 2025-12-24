package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesTwilightForestConfig;
import dev.manasnow.knavesneeds.customitems.swords.twilight_forest.FierySwordItem;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class TwilightForestAdditionsRegistries {

    //Load config for Twilight Forest
    public static KnavesTwilightForestConfig twilightForestConfig = ConfigApiJava.registerAndLoadConfig(KnavesTwilightForestConfig::new);

    public static final Tier STEELEAF = new SimpleTier(
            "STEELEAF",
            () -> twilightForestConfig.steeleafDurability,
            () -> twilightForestConfig.steeleafMiningSpeedMultiplier,
            () -> twilightForestConfig.steeleafAttackDamage,
            () -> twilightForestConfig.steeleafMiningLevel,
            () -> twilightForestConfig.steeleafEnchantability,
            "twilightforest:steeleaf_ingot"
    );

    public static final Tier IRONWOOD = new SimpleTier(
            "IRONWOOD",
            () -> twilightForestConfig.ironwoodDurability,
            () -> twilightForestConfig.ironwoodMiningSpeedMultiplier,
            () -> twilightForestConfig.ironwoodAttackDamage,
            () -> twilightForestConfig.ironwoodMiningLevel,
            () -> twilightForestConfig.ironwoodEnchantability,
            "twilightforest:ironwood_ingot"
    );

    public static final Tier FIERY = new SimpleTier(
            "FIERY",
            () -> twilightForestConfig.fieryDurability,
            () -> twilightForestConfig.fieryMiningSpeedMultiplier,
            () -> twilightForestConfig.fieryAttackDamage,
            () -> twilightForestConfig.fieryMiningLevel,
            () -> twilightForestConfig.fieryEnchantability,
            "twilightforest:fiery_ingot"
    );

    public static final Tier KNIGHTMETAL = new SimpleTier(
            "KNIGHTMETAL",
            () -> twilightForestConfig.knightmetalDurability,
            () -> twilightForestConfig.knightmetalMiningSpeedMultiplier,
            () -> twilightForestConfig.knightmetalAttackDamage,
            () -> twilightForestConfig.knightmetalMiningLevel,
            () -> twilightForestConfig.knightmetalEnchantability,
            "twilightforest:knightmetal_ingot"
    );

    static Registrar<Item> TWILIGHT_FOREST_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet STEELEAF_ITEMS = new SwordSet(TWILIGHT_FOREST_ITEMS,"twilight_forest", STEELEAF, SwordItem::new);
    public static final SwordSet FIERY_ITEMS = new SwordSet(TWILIGHT_FOREST_ITEMS,"twilight_forest", FIERY, FierySwordItem::new);
    public static final SwordSet IRONWOOD_TEMS = new SwordSet(TWILIGHT_FOREST_ITEMS,"twilight_forest", IRONWOOD, SwordItem::new);
    public static final SwordSet KNIGHTMETAL_ITEMS = new SwordSet(TWILIGHT_FOREST_ITEMS,"twilight_forest", KNIGHTMETAL, SwordItem::new);

    public static void smartRegister() {
        TWILIGHT_FOREST_ITEMS.init();
    }
}