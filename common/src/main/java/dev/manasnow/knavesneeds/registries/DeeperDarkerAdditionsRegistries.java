package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesDeeperDarkerConfig;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class DeeperDarkerAdditionsRegistries {
    public static KnavesDeeperDarkerConfig deeperDarkerConfig = ConfigApiJava.registerAndLoadConfig(KnavesDeeperDarkerConfig::new);

    static Registrar<Item> DEEPER_DARKER_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final Tier WARDEN = new SimpleTier(
            "WARDEN",
            () -> deeperDarkerConfig.wardenDurability,
            () -> deeperDarkerConfig.wardenMiningSpeedMultiplier,
            () -> deeperDarkerConfig.wardenAttackDamage,
            () -> deeperDarkerConfig.wardenMiningLevel,
            () -> deeperDarkerConfig.wardenEnchantability,
            "deeperdarker:reinforced_echo_shard"
    );

    public static final SwordSet WARDEN_ITEMS = new SwordSet(DEEPER_DARKER_ITEMS,"deeperdarker", WARDEN, SwordItem::new);

    public static void smartRegister() {
        DEEPER_DARKER_ITEMS.init();
    }
}
