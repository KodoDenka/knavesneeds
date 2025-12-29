package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBetterNetherConfig;
import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import dev.manasnow.knavesneeds.helpers.TierHelper;
import dev.manasnow.knavesneeds.helpers.SwordSet;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class BetterNetherAdditionsRegistries {

    public static KnavesBetterNetherConfig betterNetherConfig = ConfigApiJava.registerAndLoadConfig(KnavesBetterNetherConfig::new);

    //TODO fix repair ingredient so it works with EvenBetterNether
    public static final Tier CINCINNASITE = new TierHelper(
            "CINCINNASITE",
            () -> betterNetherConfig.cincinnasiteDurability,
            () -> betterNetherConfig.cincinnasiteMiningSpeedMultiplier,
            () -> betterNetherConfig.cincinnasiteAttackDamage,
            () -> betterNetherConfig.cincinnasiteMiningLevel,
            () -> betterNetherConfig.cincinnasiteEnchantability,
            "betterend:aeternium_ingot"
    );

    public static final Tier CINCINNASITE_DIAMOND = new TierHelper(
            "CINCINNASITE_DIAMOND",
            () -> betterNetherConfig.cincinnasiteDiamondDurability,
            () -> betterNetherConfig.cincinnasiteDiamondMiningSpeedMultiplier,
            () -> betterNetherConfig.cincinnasiteDiamondAttackDamage,
            () -> betterNetherConfig.cincinnasiteDiamondMiningLevel,
            () -> betterNetherConfig.cincinnasiteDiamondEnchantability,
            "minecraft:diamond"
    );

    public static final Tier NETHER_RUBY = new TierHelper(
            "NETHER_RUBY",
            () -> betterNetherConfig.netherRubyDurability,
            () -> betterNetherConfig.netherRubyMiningSpeedMultiplier,
            () -> betterNetherConfig.netherRubyAttackDamage,
            () -> betterNetherConfig.netherRubyMiningLevel,
            () -> betterNetherConfig.netherRubyEnchantability,
            "betternether:nether_ruby"
    );

    private static Registrar<Item> createRegistrar() {
        return ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);
    }

    private static final String NAMESPACE = "betternether";

    private static final Registrar<Item> CINCINNASITE_REGISTRAR = createRegistrar();
    public static final SwordSet CINCINNASITE_ITEMS = new SwordSet(createRegistrar(), NAMESPACE, CINCINNASITE, DynamicSwordItem::new);

    private static final Registrar<Item> CINCINNASITE_DIAMOND_REGISTRAR = createRegistrar();
    public static final SwordSet CINCINNASITE_DIAMOND_ITEMS = new SwordSet(CINCINNASITE_DIAMOND_REGISTRAR, NAMESPACE, CINCINNASITE_DIAMOND, DynamicSwordItem::new);

    private static final Registrar<Item> NETHER_RUBY_REGISTRAR = createRegistrar();
    public static final SwordSet NETHER_RUBY_ITEMS = new SwordSet(NETHER_RUBY_REGISTRAR, NAMESPACE, NETHER_RUBY, DynamicSwordItem::new);

    public static void smartRegister() {
        if (betterNetherConfig.cincinnasiteEnabled) {
            CINCINNASITE_REGISTRAR.init();
        }
        if (betterNetherConfig.netherRubyEnabled) {
            NETHER_RUBY_REGISTRAR.init();
        }
        if (betterNetherConfig.cincinnasiteDiamondEnabled) {
            CINCINNASITE_DIAMOND_REGISTRAR.init();
        }
    }


}
