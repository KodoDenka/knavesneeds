package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesSoulsWeaponsConfig;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
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

    public static final Tier TRANSLUCENT = new SimpleTier(
            "TRANSLUCENT",
            () -> soulsWeaponsConfig.translucentDurability,
            () -> soulsWeaponsConfig.translucentMiningSpeedMultiplier,
            () -> soulsWeaponsConfig.translucentAttackDamage,
            () -> soulsWeaponsConfig.translucentMiningLevel,
            () -> soulsWeaponsConfig.translucentEnchantability,
            "soulsweapons:lost_soul"
    );

    static Registrar<Item> SOULS_WEAPONS_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet TRANSLUCENT_ITEMS = new SwordSet(SOULS_WEAPONS_ITEMS,"soulsweapons", TRANSLUCENT, SwordItem::new);

    public static void smartRegister() {
        SOULS_WEAPONS_ITEMS.init();
    }
}
