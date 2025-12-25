package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesAmethystImbuementConfig;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class AmethystImbuementAdditionsRegistries {

    public static KnavesAmethystImbuementConfig amethystImbuementConfig = ConfigApiJava.registerAndLoadConfig(KnavesAmethystImbuementConfig::new);

    public static final Tier AMETRINE = new SimpleTier(
            "AMETRINE",
            () -> amethystImbuementConfig.ametrineDurability,
            () -> amethystImbuementConfig.ametrineSpeed,
            () -> amethystImbuementConfig.ametrineAttackBonus,
            () -> amethystImbuementConfig.ametrineMiningLevel,
            () -> amethystImbuementConfig.ametrineEnchantability,
            "byg:pendorite_ingot"
    );

    public static final Tier GARNET = new SimpleTier(
            "GARNET",
            () -> amethystImbuementConfig.garnetDurability,
            () -> amethystImbuementConfig.garnetSpeed,
            () -> amethystImbuementConfig.garnetAttackBonus,
            () -> amethystImbuementConfig.garnetMiningLevel,
            () -> amethystImbuementConfig.garnetEnchantability,
            "byg:pendorite_ingot"
    );

    public static final Tier GLOWING = new SimpleTier(
            "GLOWING",
            () -> amethystImbuementConfig.glowingDurability,
            () -> amethystImbuementConfig.glowingSpeed,
            () -> amethystImbuementConfig.glowingAttackBonus,
            () -> amethystImbuementConfig.glowingMiningLevel,
            () -> amethystImbuementConfig.glowingEnchantability,
            "byg:pendorite_ingot"
    );

    public static final Tier STEEL = new SimpleTier(
            "STEEL",
            () -> amethystImbuementConfig.steelDurability,
            () -> amethystImbuementConfig.steelSpeed,
            () -> amethystImbuementConfig.steelAttackBonus,
            () -> amethystImbuementConfig.steelMiningLevel,
            () -> amethystImbuementConfig.steelEnchantability,
            "byg:pendorite_ingot"
    );

    static Registrar<Item> AMETHYST_IMBUEMENT_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet AMETRINE_ITEMS = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", AMETRINE, SwordItem::new);
    public static final SwordSet GARNET_ITEMS = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", GARNET, SwordItem::new);
    public static final SwordSet GLOWING_ITEMS = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", GLOWING, SwordItem::new);
    public static final SwordSet STEEL_ITEMS = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", STEEL, SwordItem::new);

    public static void smartRegister() {
        AMETHYST_IMBUEMENT_ITEMS.init();
    }
}