package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesUndergardenConfig;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.ForgottenSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.FroststeelSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.UtheriumSwordItem;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class UndergardenAdditionsRegistries {

    public static KnavesUndergardenConfig undergardenConfig = ConfigApiJava.registerAndLoadConfig(KnavesUndergardenConfig::new);

    public static final Tier CLOGGRUM = new SimpleTier(
            "CLOGGRUM",
            () -> undergardenConfig.cloggrumDurability,
            () -> undergardenConfig.cloggrumMiningSpeedMultiplier,
            () -> undergardenConfig.cloggrumAttackDamage,
            () -> undergardenConfig.cloggrumMiningLevel,
            () -> undergardenConfig.cloggrumEnchantability,
            "undergarden:cloggrum_ingot"
    );

    public static final Tier FORGOTTEN = new SimpleTier(
            "FORGOTTEN",
            () -> undergardenConfig.forgottenDurability,
            () -> undergardenConfig.forgottenMiningSpeedMultiplier,
            () -> undergardenConfig.forgottenAttackDamage,
            () -> undergardenConfig.forgottenMiningLevel,
            () -> undergardenConfig.forgottenEnchantability,
            "undergarden:froststeel_ingot"
    );

    public static final Tier FROSTSTEEL = new SimpleTier(
            "FROSTSTEEL",
            () -> undergardenConfig.froststeelDurability,
            () -> undergardenConfig.froststeelMiningSpeedMultiplier,
            () -> undergardenConfig.froststeelAttackDamage,
            () -> undergardenConfig.froststeelMiningLevel,
            () -> undergardenConfig.froststeelEnchantability,
            "undergarden:utherium_crystal"
    );

    public static final Tier UTHERIUM = new SimpleTier(
            "UTHERIUM",
            () -> undergardenConfig.utheriumDurability,
            () -> undergardenConfig.utheriumMiningSpeedMultiplier,
            () -> undergardenConfig.utheriumAttackDamage,
            () -> undergardenConfig.utheriumMiningLevel,
            () -> undergardenConfig.utheriumEnchantability,
            "undergarden:forgotten_ingot"
    );

    static Registrar<Item> UNDERGARDEN_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    
    public static final SwordSet CLOGGRUM_ITEMS = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", CLOGGRUM, SwordItem::new);
    public static final SwordSet FORGOTTEN_ITEMS = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", FORGOTTEN, ForgottenSwordItem::new);
    public static final SwordSet FROSTSTEEL_ITEMS = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", FROSTSTEEL, FroststeelSwordItem::new);
    public static final SwordSet UTHERIUM_ITEMS = new SwordSet(UNDERGARDEN_ITEMS,"undergarden", UTHERIUM, UtheriumSwordItem::new);

    public static void smartRegister() {
        UNDERGARDEN_ITEMS.init();
    }
}