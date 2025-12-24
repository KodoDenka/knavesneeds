package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesForbiddenArcanusConfig;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
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

    public static final Tier DRACO_ARCANUS = new SimpleTier(
            "DRACO_ARCANUS",
            () -> forbiddenArcanusConfig.dracoArcanusDurability,
            () -> forbiddenArcanusConfig.dracoArcanusMiningSpeedMultiplier,
            () -> forbiddenArcanusConfig.dracoArcanusAttackDamage,
            () -> forbiddenArcanusConfig.dracoArcanusMiningLevel,
            () -> forbiddenArcanusConfig.dracoArcanusEnchantability,
            "forbidden_arcanus:stellarite_piece"
    );

    static Registrar<Item> FORBIDDEN_ARCANUS_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet DRACO_ARCANUS_ITEMS = new SwordSet(FORBIDDEN_ARCANUS_ITEMS,"forbidden_arcanus", DRACO_ARCANUS, SwordItem::new);

    public static void smartRegister() {
        FORBIDDEN_ARCANUS_ITEMS.init();
    }
}
