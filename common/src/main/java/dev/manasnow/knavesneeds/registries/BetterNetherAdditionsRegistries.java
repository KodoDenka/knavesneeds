package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBetterEndConfig;
import dev.manasnow.knavesneeds.config.KnavesBetterNetherConfig;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class BetterNetherAdditionsRegistries {

    public static KnavesBetterNetherConfig betterNetherConfig = ConfigApiJava.registerAndLoadConfig(KnavesBetterNetherConfig::new);

    static Registrar<Item> BETTER_NETHER_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet CINCINNASITE = new SwordSet(BETTER_NETHER_ITEMS,"betternether", ToolTierHelper.CINCINNASITE, SwordItem::new);
    public static final SwordSet CINCINNASITE_DIAMOND = new SwordSet(BETTER_NETHER_ITEMS,"betternether", ToolTierHelper.CINCINNASITE_DIAMOND, SwordItem::new);
    public static final SwordSet NETHER_RUBY = new SwordSet(BETTER_NETHER_ITEMS,"betternether", ToolTierHelper.NETHER_RUBY, SwordItem::new);

    public static void smartRegister() {
        BETTER_NETHER_ITEMS.init();
    }
}
