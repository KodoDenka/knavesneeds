package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesAmethystImbuementConfig;
import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class AmethystImbuementAdditionsRegistries {

    public static KnavesAmethystImbuementConfig amethystImbuementConfig = ConfigApiJava.registerAndLoadConfig(KnavesAmethystImbuementConfig::new);

    public static final Tier AMETRINE = new TierHelper(
            "AMETRINE",
            () -> amethystImbuementConfig.ametrineDurability,
            () -> amethystImbuementConfig.ametrineSpeed,
            () -> amethystImbuementConfig.ametrineAttackBonus,
            () -> amethystImbuementConfig.ametrineMiningLevel,
            () -> amethystImbuementConfig.ametrineEnchantability,
            "byg:pendorite_ingot"
    );

    public static final Tier GARNET = new TierHelper(
            "GARNET",
            () -> amethystImbuementConfig.garnetDurability,
            () -> amethystImbuementConfig.garnetSpeed,
            () -> amethystImbuementConfig.garnetAttackBonus,
            () -> amethystImbuementConfig.garnetMiningLevel,
            () -> amethystImbuementConfig.garnetEnchantability,
            "byg:pendorite_ingot"
    );

    public static final Tier GLOWING = new TierHelper(
            "GLOWING",
            () -> amethystImbuementConfig.glowingDurability,
            () -> amethystImbuementConfig.glowingSpeed,
            () -> amethystImbuementConfig.glowingAttackBonus,
            () -> amethystImbuementConfig.glowingMiningLevel,
            () -> amethystImbuementConfig.glowingEnchantability,
            "byg:pendorite_ingot"
    );

    public static final Tier STEEL = new TierHelper(
            "STEEL",
            () -> amethystImbuementConfig.steelDurability,
            () -> amethystImbuementConfig.steelSpeed,
            () -> amethystImbuementConfig.steelAttackBonus,
            () -> amethystImbuementConfig.steelMiningLevel,
            () -> amethystImbuementConfig.steelEnchantability,
            "byg:pendorite_ingot"
    );

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "amethyst_imbuement";

    private static final Registrar<Item> AMETRINE_REGISTRAR = createRegistrar();
    public static final SwordSet AMETRINE_ITEMS = new SwordSet(AMETRINE_REGISTRAR, NAMESPACE, AMETRINE, DynamicSwordItem::new);

    private static final Registrar<Item> GARNET_REGISTRAR = createRegistrar();
    public static final SwordSet GARNET_ITEMS = new SwordSet(GARNET_REGISTRAR, NAMESPACE, GARNET, DynamicSwordItem::new);

    private static final Registrar<Item> GLOWING_REGISTRAR = createRegistrar();
    public static final SwordSet GLOWING_ITEMS = new SwordSet(GLOWING_REGISTRAR, NAMESPACE, GLOWING, DynamicSwordItem::new);

    private static final Registrar<Item> STEEL_REGISTRAR = createRegistrar();
    public static final SwordSet STEEL_ITEMS = new SwordSet(STEEL_REGISTRAR, NAMESPACE, STEEL, DynamicSwordItem::new);

    public static void smartRegistrar() {
        if (amethystImbuementConfig.ametrineEnabled) {
            AMETRINE_REGISTRAR.init();
        }
        if (amethystImbuementConfig.garnetEnabled) {
            GARNET_REGISTRAR.init();
        }
        if (amethystImbuementConfig.glowingEnabled) {
            GLOWING_REGISTRAR.init();
        }
        if (amethystImbuementConfig.steelEnabled) {
            STEEL_REGISTRAR.init();
        }
    }



}