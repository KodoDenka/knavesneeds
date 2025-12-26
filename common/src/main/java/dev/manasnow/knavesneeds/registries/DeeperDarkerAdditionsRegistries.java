package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesDeeperDarkerConfig;
import dev.manasnow.knavesneeds.helpers.TierHelper;
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

    public static final Tier WARDEN = new TierHelper(
            "WARDEN",
            () -> deeperDarkerConfig.wardenDurability,
            () -> deeperDarkerConfig.wardenSpeed,
            () -> deeperDarkerConfig.wardenAttackBonus,
            () -> deeperDarkerConfig.wardenMiningLevel,
            () -> deeperDarkerConfig.wardenEnchantability,
            "deeperdarker:reinforced_echo_shard"
    );

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "deeperdarker";

    private static final Registrar<Item> WARDEN_REGISTRAR = createRegistrar();
    public static final SwordSet WARDEN_ITEMS = new SwordSet(WARDEN_REGISTRAR, NAMESPACE, WARDEN, SwordItem::new);

    public static void smartRegister() {
        WARDEN_REGISTRAR.init();
    }

}
