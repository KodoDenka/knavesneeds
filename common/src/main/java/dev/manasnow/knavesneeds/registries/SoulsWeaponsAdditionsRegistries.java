package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesForbiddenArcanusConfig;
import dev.manasnow.knavesneeds.config.KnavesSoulsWeaponsConfig;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class SoulsWeaponsAdditionsRegistries {
    public static KnavesSoulsWeaponsConfig soulsWeaponsConfig = ConfigApiJava.registerAndLoadConfig(KnavesSoulsWeaponsConfig::new);

    static Registrar<Item> SOULS_WEAPONS_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet TRANSLUCENT = new SwordSet(SOULS_WEAPONS_ITEMS,"soulsweapons", ToolTierHelper.TRANSLUCENT, SwordItem::new);

    public static void smartRegister() {
        SOULS_WEAPONS_ITEMS.init();
    }
}
