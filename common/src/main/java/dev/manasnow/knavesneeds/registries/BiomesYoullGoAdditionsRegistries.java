package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBetterEndConfig;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class BiomesYoullGoAdditionsRegistries {

    public static KnavesBetterEndConfig betterNetherConfig = ConfigApiJava.registerAndLoadConfig(KnavesBetterEndConfig::new);

    static Registrar<Item> BYG_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet PENDORITE = new SwordSet(BYG_ITEMS,"betternether", ToolTierHelper.PENDORITE, SwordItem::new);

    public static void smartRegister() {
        BYG_ITEMS.init();
    }
}
