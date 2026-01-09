package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesUndergardenConfig;
import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.ForgottenSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.FroststeelSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.undergarden.UtheriumSwordItem;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class UndergardenAdditionsRegistries {

    public static KnavesUndergardenConfig undergardenConfig = ConfigApiJava.registerAndLoadConfig(KnavesUndergardenConfig::new);

    public static final Tier CLOGGRUM = new TierHelper(
            "CLOGGRUM",
            () -> undergardenConfig.cloggrumDurability,
            () -> undergardenConfig.cloggrumSpeed,
            () -> undergardenConfig.cloggrumAttackBonus,
            () -> undergardenConfig.cloggrumMiningLevel,
            () -> undergardenConfig.cloggrumEnchantability,
            "undergarden:cloggrum_ingot"
    );

    public static final Tier FORGOTTEN = new TierHelper(
            "FORGOTTEN",
            () -> undergardenConfig.forgottenDurability,
            () -> undergardenConfig.forgottenSpeed,
            () -> undergardenConfig.forgottenAttackBonus,
            () -> undergardenConfig.forgottenMiningLevel,
            () -> undergardenConfig.forgottenEnchantability,
            "undergarden:froststeel_ingot"
    );

    public static final Tier FROSTSTEEL = new TierHelper(
            "FROSTSTEEL",
            () -> undergardenConfig.froststeelDurability,
            () -> undergardenConfig.froststeelSpeed,
            () -> undergardenConfig.froststeelAttackBonus,
            () -> undergardenConfig.froststeelMiningLevel,
            () -> undergardenConfig.froststeelEnchantability,
            "undergarden:utheric_shard"
    );

    public static final Tier UTHERIUM = new TierHelper(
            "UTHERIUM",
            () -> undergardenConfig.utheriumDurability,
            () -> undergardenConfig.utheriumSpeed,
            () -> undergardenConfig.utheriumAttackBonus,
            () -> undergardenConfig.utheriumMiningLevel,
            () -> undergardenConfig.utheriumEnchantability,
            "undergarden:forgotten_ingot"
    );

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "undergarden";

    private static final Registrar<Item> CLOGGRUM_REGISTRAR = createRegistrar();
    public static final SwordSet CLOGGRUM_ITEMS = new SwordSet(CLOGGRUM_REGISTRAR, NAMESPACE, CLOGGRUM, DynamicSwordItem::new);

    private static final Registrar<Item> FORGOTTEN_REGISTRAR = createRegistrar();
    public static final SwordSet FORGOTTEN_ITEMS = new SwordSet(FORGOTTEN_REGISTRAR, NAMESPACE, FORGOTTEN, ForgottenSwordItem::new);

    private static final Registrar<Item> FROSTSTEEL_REGISTRAR = createRegistrar();
    public static final SwordSet FROSTSTEEL_ITEMS = new SwordSet(FROSTSTEEL_REGISTRAR, NAMESPACE, FROSTSTEEL, FroststeelSwordItem::new);

    private static final Registrar<Item> UTHERIUM_REGISTRAR = createRegistrar();
    public static final SwordSet UTHERIUM_ITEMS = new SwordSet(UTHERIUM_REGISTRAR, NAMESPACE, UTHERIUM, UtheriumSwordItem::new);

    public static void smartRegistrar() {
        if (undergardenConfig.cloggrumEnabled) {
            CLOGGRUM_REGISTRAR.init();
        }
        if (undergardenConfig.forgottenEnabled) {
            FORGOTTEN_REGISTRAR.init();
        }
        if (undergardenConfig.froststeelEnabled) {
            FROSTSTEEL_REGISTRAR.init();
        }
        if (undergardenConfig.utheriumEnabled) {
            UTHERIUM_REGISTRAR.init();
        }
    }
}