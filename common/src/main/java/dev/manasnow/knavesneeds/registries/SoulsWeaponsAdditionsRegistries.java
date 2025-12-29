package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesSoulsWeaponsConfig;
import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class SoulsWeaponsAdditionsRegistries {

    public static KnavesSoulsWeaponsConfig soulsWeaponsConfig = ConfigApiJava.registerAndLoadConfig(KnavesSoulsWeaponsConfig::new);

    public static final Tier TRANSLUCENT = new TierHelper(
            "TRANSLUCENT",
            () -> soulsWeaponsConfig.translucentDurability,
            () -> soulsWeaponsConfig.translucentSpeed,
            () -> soulsWeaponsConfig.translucentAttackBonus,
            () -> soulsWeaponsConfig.translucentMiningLevel,
            () -> soulsWeaponsConfig.translucentEnchantability,
            "soulsweapons:lost_soul"
    );

    //TODO add silver weapons

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "soulsweapons";

    private static final Registrar<Item> TRANSLUCENT_REGISTRAR = createRegistrar();
    public static final SwordSet TRANSLUCENT_ITEMS = new SwordSet(TRANSLUCENT_REGISTRAR, NAMESPACE, TRANSLUCENT, DynamicSwordItem::new);

    public static void smartRegister() {
        if (soulsWeaponsConfig.translucentEnabled) {
            TRANSLUCENT_REGISTRAR.init();
        }
    }
}
