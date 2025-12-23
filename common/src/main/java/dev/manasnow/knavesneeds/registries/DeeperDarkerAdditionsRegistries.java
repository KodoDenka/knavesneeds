package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBiomesYoullGoConfig;
import dev.manasnow.knavesneeds.config.KnavesDeeperDarkerConfig;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class DeeperDarkerAdditionsRegistries {
    public static KnavesDeeperDarkerConfig deeperDarkerConfig = ConfigApiJava.registerAndLoadConfig(KnavesDeeperDarkerConfig::new);

    static Registrar<Item> DEEPER_DARKER_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet WARDEN = new SwordSet(DEEPER_DARKER_ITEMS,"deeperdarker", ToolTierHelper.WARDEN, SwordItem::new);

    public static void smartRegister() {
        DEEPER_DARKER_ITEMS.init();
    }
}
