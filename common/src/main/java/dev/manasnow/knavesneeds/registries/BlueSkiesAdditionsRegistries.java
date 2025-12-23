package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBiomesYoullGoConfig;
import dev.manasnow.knavesneeds.config.KnavesBlueSkiesConfig;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class BlueSkiesAdditionsRegistries {

    public static KnavesBlueSkiesConfig blueSkiesConfig = ConfigApiJava.registerAndLoadConfig(KnavesBlueSkiesConfig::new);

    //TODO Blue skies needa a diffrent MOD_ID
    static Registrar<Item> BLUE_SKIES_ITEMS  = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    //TODO Blue skies needa a different namespace.
    public static final SwordSet AQUITE = new SwordSet(BLUE_SKIES_ITEMS ,"betternether", ToolTierHelper.AQUITE, SwordItem::new);
    //public static final SwordSet AQUITE = new SwordSet(BLUE_SKIES_ITEMS ,"betternether", ToolTierHelper.AQUITE, SwordItem::new);

    public static void smartRegister() {
        BLUE_SKIES_ITEMS .init();
    }
}