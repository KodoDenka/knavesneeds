package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesTwilightForestConfig;
import dev.manasnow.knavesneeds.customitems.swords.twilight_forest.FierySwordItem;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;


import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class TwilightForestAdditionsRegistries {

    //Load config for Twilight Forest
    public static KnavesTwilightForestConfig twilightForestConfig = ConfigApiJava.registerAndLoadConfig(KnavesTwilightForestConfig::new);

    static Registrar<Item> TWILIGHT_FOREST_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);


    //TODO fix ToolTier loading incorrectly.
    public static final SwordSet FIERY = new SwordSet(TWILIGHT_FOREST_ITEMS,"twilight_forest", ToolTierHelper.FIERY, FierySwordItem::new);
    public static final SwordSet IRONWOOD = new SwordSet(TWILIGHT_FOREST_ITEMS,"twilight_forest", ToolTierHelper.IRONWOOD, SwordItem::new);
    public static final SwordSet KNIGHTMETAL = new SwordSet(TWILIGHT_FOREST_ITEMS,"twilight_forest", ToolTierHelper.KNIGHTMETAL, SwordItem::new);

    public static void smartRegister() {
        TWILIGHT_FOREST_ITEMS.init();
    }
}