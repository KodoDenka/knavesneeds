package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesUndergardenConfig;
import dev.manasnow.knavesneeds.customitems.swords.twilight_forest.FierySwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.ForgottenSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.FroststeelSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.UtheriumSwordItem;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class UndergardenAdditionsRegistries {

    public static KnavesUndergardenConfig undergardenConfig = ConfigApiJava.registerAndLoadConfig(KnavesUndergardenConfig::new);

    static Registrar<Item> UNDERGARDEN_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet CLOGGRUM = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", ToolTierHelper.CLOGGRUM, SwordItem::new);
    public static final SwordSet FORGOTTEN = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", ToolTierHelper.FORGOTTEN, ForgottenSwordItem::new);
    public static final SwordSet FROSTSTEEL = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", ToolTierHelper.FROSTSTEEL, FroststeelSwordItem::new);
    public static final SwordSet UTHERIUM = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", ToolTierHelper.UTHERIUM, UtheriumSwordItem::new);

    public static void smartRegister() {
        UNDERGARDEN_ITEMS.init();
    }
}