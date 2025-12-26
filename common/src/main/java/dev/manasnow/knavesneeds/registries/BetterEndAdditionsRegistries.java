package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBetterEndConfig;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class BetterEndAdditionsRegistries {

    public static KnavesBetterEndConfig betterEndConfig = ConfigApiJava.registerAndLoadConfig(KnavesBetterEndConfig::new);

    public static final Tier AETERNIUM = new TierHelper(
            "AETERNIUM",
            () -> betterEndConfig.aeterniumDurability,
            () -> betterEndConfig.aeterniumSpeed,
            () -> betterEndConfig.aeterniumAttackBonus,
            () -> betterEndConfig.aeterniumMiningLevel,
            () -> betterEndConfig.aeterniumEnchantability,
            "betterend:aeternium_ingot"
    );

    public static final Tier TERMINITE = new TierHelper(
            "TERMINITE",
            () -> betterEndConfig.terminiteDurability,
            () -> betterEndConfig.terminiteSpeed,
            () -> betterEndConfig.terminiteAttackBonus,
            () -> betterEndConfig.terminiteMiningLevel,
            () -> betterEndConfig.terminiteEnchantability,
            "betterend:terminite_ingot"
    );

    public static final Tier THALLASIUM = new TierHelper(
            "THALLASIUM",
            () -> betterEndConfig.thallasiumDurability,
            () -> betterEndConfig.thallasiumSpeed,
            () -> betterEndConfig.thallasiumAttackBonus,
            () -> betterEndConfig.thallasiumMiningLevel,
            () -> betterEndConfig.thallasiumEnchantability,
            "betterend:thallasium_ingot"
    );

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "betterend";

    private static final Registrar<Item> AETERNIUM_REGISTRAR = createRegistrar();
    public static final SwordSet AETERNIUM_ITEMS = new SwordSet(AETERNIUM_REGISTRAR, NAMESPACE, AETERNIUM, SwordItem::new);

    private static final Registrar<Item> TERMINITE_REGISTRAR = createRegistrar();
    public static final SwordSet TERMINITE_ITEMS = new SwordSet(TERMINITE_REGISTRAR, NAMESPACE, TERMINITE, SwordItem::new);

    private static final Registrar<Item> THALLASIUM_REGISTRAR = createRegistrar();
    public static final SwordSet THALLASIUM_ITEMS = new SwordSet(THALLASIUM_REGISTRAR, NAMESPACE, THALLASIUM, SwordItem::new);

    public static void smartRegister() {
        if (betterEndConfig.aeterniumEnabled) {
            AETERNIUM_REGISTRAR.init();
        }
        if (betterEndConfig.terminiteEnabled) {
            TERMINITE_REGISTRAR.init();
        }
        if (betterEndConfig.thallasiumEnabled) {
            THALLASIUM_REGISTRAR.init();
        }
    }

}
