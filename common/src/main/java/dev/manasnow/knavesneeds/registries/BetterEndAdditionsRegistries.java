package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBetterEndConfig;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
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

    public static final Tier AETERNIUM = new SimpleTier(
            "AETERNIUM",
            () -> betterEndConfig.aeterniumDurability,
            () -> betterEndConfig.aeterniumSpeed,
            () -> betterEndConfig.aeterniumAttackDamage,
            () -> betterEndConfig.aeterniumMiningLevel,
            () -> betterEndConfig.aeterniumEnchantability,
            "betterend:aeternium_ingot"
    );

    public static final Tier TERMINITE = new SimpleTier(
            "TERMINITE",
            () -> betterEndConfig.terminiteDurability,
            () -> betterEndConfig.terminiteMiningSpeedMultiplier,
            () -> betterEndConfig.terminiteAttackDamage,
            () -> betterEndConfig.terminiteMiningLevel,
            () -> betterEndConfig.terminiteEnchantability,
            "betterend:terminite_ingot"
    );

    public static final Tier THALLASIUM = new SimpleTier(
            "THALLASIUM",
            () -> betterEndConfig.thallasiumDurability,
            () -> betterEndConfig.thallasiumMiningSpeedMultiplier,
            () -> betterEndConfig.thallasiumAttackDamage,
            () -> betterEndConfig.thallasiumMiningLevel,
            () -> betterEndConfig.thallasiumEnchantability,
            "betterend:thallasium_ingot"
    );

    static Registrar<Item> BETTER_END_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet AETERNIUM_ITEMS = new SwordSet(BETTER_END_ITEMS,"betterend", AETERNIUM, SwordItem::new);
    public static final SwordSet TERMINITE_ITEMS = new SwordSet(BETTER_END_ITEMS,"betterend", TERMINITE, SwordItem::new);
    public static final SwordSet THALLASIUM_ITEMS = new SwordSet(BETTER_END_ITEMS,"betterend", THALLASIUM, SwordItem::new);

    public static void smartRegister() {
        BETTER_END_ITEMS.init();
    }
}
