package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesAmethystImbuementConfig;
import dev.manasnow.knavesneeds.config.KnavesUndergardenConfig;
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

public class AmethystImbuementAdditionsRegistries {

    public static KnavesAmethystImbuementConfig amethystImbuementConfig = ConfigApiJava.registerAndLoadConfig(KnavesAmethystImbuementConfig::new);

    static Registrar<Item> AMETHYST_IMBUEMENT_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet AMETRINE = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", ToolTierHelper.AMETRINE, SwordItem::new);
    public static final SwordSet GARNET = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", ToolTierHelper.GARNET, SwordItem::new);
    public static final SwordSet GLOWING = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", ToolTierHelper.GLOWING, SwordItem::new);
    public static final SwordSet STEEL = new SwordSet(AMETHYST_IMBUEMENT_ITEMS,"amethyst_imbuement", ToolTierHelper.STEEL, SwordItem::new);

    public static void smartRegister() {
        AMETHYST_IMBUEMENT_ITEMS.init();
    }
}