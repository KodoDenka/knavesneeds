package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesAmethystImbuementConfig;
import dev.manasnow.knavesneeds.config.KnavesBetterEndConfig;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class BetterEndAdditionsRegistries {

    public static KnavesBetterEndConfig betterEndConfig = ConfigApiJava.registerAndLoadConfig(KnavesBetterEndConfig::new);

    static Registrar<Item> BETTER_END_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet AETERNIUM = new SwordSet(BETTER_END_ITEMS,"betterend", ToolTierHelper.AETERNIUM, SwordItem::new);
    public static final SwordSet TERMINITE = new SwordSet(BETTER_END_ITEMS,"betterend", ToolTierHelper.TERMINITE, SwordItem::new);
    public static final SwordSet THALLASIUM = new SwordSet(BETTER_END_ITEMS,"betterend", ToolTierHelper.THALLASIUM, SwordItem::new);

    public static void smartRegister() {
        BETTER_END_ITEMS.init();
    }
}
