package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesTwilightForestConfig;
import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.twilight_forest.FierySwordItem;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class TwilightForestAdditionsRegistries {

    //Load config for Twilight Forest
    public static KnavesTwilightForestConfig twilightForestConfig = ConfigApiJava.registerAndLoadConfig(KnavesTwilightForestConfig::new);

    public static final Tier STEELEAF = new TierHelper(
            "STEELEAF",
            () -> twilightForestConfig.steeleafDurability,
            () -> twilightForestConfig.steeleafSpeed,
            () -> twilightForestConfig.steeleafAttackBonus,
            () -> twilightForestConfig.steeleafMiningLevel,
            () -> twilightForestConfig.steeleafEnchantability,
            "twilightforest:steeleaf_ingot"
    );

    public static final Tier IRONWOOD = new TierHelper(
            "IRONWOOD",
            () -> twilightForestConfig.ironwoodDurability,
            () -> twilightForestConfig.ironwoodSpeed,
            () -> twilightForestConfig.ironwoodAttackBonus,
            () -> twilightForestConfig.ironwoodMiningLevel,
            () -> twilightForestConfig.ironwoodEnchantability,
            "twilightforest:ironwood_ingot"
    );

    public static final Tier FIERY = new TierHelper(
            "FIERY",
            () -> twilightForestConfig.fieryDurability,
            () -> twilightForestConfig.fierySpeed,
            () -> twilightForestConfig.fieryAttackBonus,
            () -> twilightForestConfig.fieryMiningLevel,
            () -> twilightForestConfig.fieryEnchantability,
            "twilightforest:fiery_ingot"
    );

    public static final Tier KNIGHTMETAL = new TierHelper(
            "KNIGHTMETAL",
            () -> twilightForestConfig.knightmetalDurability,
            () -> twilightForestConfig.knightmetalSpeed,
            () -> twilightForestConfig.knightmetalAttackBonus,
            () -> twilightForestConfig.knightmetalMiningLevel,
            () -> twilightForestConfig.knightmetalEnchantability,
            "twilightforest:knightmetal_ingot"
    );

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "twilight_forest";

    private static final Registrar<Item> STEELEAF_REGISTRAR = createRegistrar();
    public static final SwordSet STEELEAF_ITEMS = new SwordSet(STEELEAF_REGISTRAR, NAMESPACE, STEELEAF, DynamicSwordItem::new);

    private static final Registrar<Item> FIERY_REGISTRAR = createRegistrar();
    public static final SwordSet FIERY_ITEMS = new SwordSet(FIERY_REGISTRAR, NAMESPACE, FIERY, FierySwordItem::new);

    private static final Registrar<Item> IRONWOOD_REGISTRAR = createRegistrar();
    public static final SwordSet IRONWOOD_ITEMS = new SwordSet(IRONWOOD_REGISTRAR, NAMESPACE, IRONWOOD, DynamicSwordItem::new);

    private static final Registrar<Item> KNIGHTMETAL_REGISTRAR = createRegistrar();
    public static final SwordSet KNIGHTMETAL_ITEMS = new SwordSet(KNIGHTMETAL_REGISTRAR, NAMESPACE, KNIGHTMETAL, DynamicSwordItem::new);

    public static void smartRegister() {
        if (twilightForestConfig.fieryEnabled) {
            FIERY_REGISTRAR.init();
        }
        if (twilightForestConfig.ironwoodEnabled) {
            IRONWOOD_REGISTRAR.init();
        }
        if (twilightForestConfig.knightmetalEnabled) {
            KNIGHTMETAL_REGISTRAR.init();
        }
        if (twilightForestConfig.steeleafEnabled) {
            STEELEAF_REGISTRAR.init();
        }
    }
}