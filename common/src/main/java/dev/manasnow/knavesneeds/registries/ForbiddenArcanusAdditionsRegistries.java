package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesForbiddenArcanusConfig;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class ForbiddenArcanusAdditionsRegistries {
    public static KnavesForbiddenArcanusConfig forbiddenArcanusConfig = ConfigApiJava.registerAndLoadConfig(KnavesForbiddenArcanusConfig::new);

    public static final Tier DRACO_ARCANUS = new TierHelper(
            "DRACO_ARCANUS",
            () -> forbiddenArcanusConfig.dracoArcanusDurability,
            () -> forbiddenArcanusConfig.dracoArcanusSpeed,
            () -> forbiddenArcanusConfig.dracoArcanusAttackBonus,
            () -> forbiddenArcanusConfig.dracoArcanusMiningLevel,
            () -> forbiddenArcanusConfig.dracoArcanusEnchantability,
            "forbidden_arcanus:stellarite_piece"
    );

    //TODO add support for the other Forbidden Arcanus items

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "forbidden_arcanus";

    private static final Registrar<Item> DRACO_ARCANUS_REGISTRAR = createRegistrar();
    public static final SwordSet DRACO_ARCANUS_ITEMS = new SwordSet(DRACO_ARCANUS_REGISTRAR, NAMESPACE, DRACO_ARCANUS, SwordItem::new);

    public static void smartRegister() {
        if (forbiddenArcanusConfig.dracoArcanusEnabled) {
            DRACO_ARCANUS_REGISTRAR.init();
        }
    }
}
