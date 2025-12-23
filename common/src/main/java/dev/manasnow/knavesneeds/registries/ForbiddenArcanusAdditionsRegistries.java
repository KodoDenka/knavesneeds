package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesDeeperDarkerConfig;
import dev.manasnow.knavesneeds.config.KnavesForbiddenArcanusConfig;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class ForbiddenArcanusAdditionsRegistries {
    public static KnavesForbiddenArcanusConfig forbiddenArcanusConfig = ConfigApiJava.registerAndLoadConfig(KnavesForbiddenArcanusConfig::new);

    static Registrar<Item> FORBIDDEN_ARCANUS_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet DRACO_ARCANUS = new SwordSet(FORBIDDEN_ARCANUS_ITEMS,"forbidden_arcanus", ToolTierHelper.DRACO_ARCANUS, SwordItem::new);

    public static void smartRegister() {
        FORBIDDEN_ARCANUS_ITEMS.init();
    }
}
