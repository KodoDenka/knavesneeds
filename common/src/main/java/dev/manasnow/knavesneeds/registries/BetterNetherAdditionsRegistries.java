package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.config.KnavesBetterNetherConfig;
import dev.manasnow.knavesneeds.helpers.SimpleTier;
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
    public static final Tier CINCINNASITE = new SimpleTier(
            "CINCINNASITE",
            () -> betterNetherConfig.cincinnasiteDurability,
            () -> betterNetherConfig.cincinnasiteMiningSpeedMultiplier,
            () -> betterNetherConfig.cincinnasiteAttackDamage,
            () -> betterNetherConfig.cincinnasiteMiningLevel,
            () -> betterNetherConfig.cincinnasiteEnchantability,
            "betterend:aeternium_ingot"
    );

    public static final Tier CINCINNASITE_DIAMOND = new SimpleTier(
            "CINCINNASITE_DIAMOND",
            () -> betterNetherConfig.cincinnasiteDiamondDurability,
            () -> betterNetherConfig.cincinnasiteDiamondMiningSpeedMultiplier,
            () -> betterNetherConfig.cincinnasiteDiamondAttackDamage,
            () -> betterNetherConfig.cincinnasiteDiamondMiningLevel,
            () -> betterNetherConfig.cincinnasiteDiamondEnchantability,
            "minecraft:diamond"
    );

    public static final Tier NETHER_RUBY = new SimpleTier(
            "NETHER_RUBY",
            () -> betterNetherConfig.netherRubyDurability,
            () -> betterNetherConfig.netherRubyMiningSpeedMultiplier,
            () -> betterNetherConfig.netherRubyAttackDamage,
            () -> betterNetherConfig.netherRubyMiningLevel,
            () -> betterNetherConfig.netherRubyEnchantability,
            "betternether:nether_ruby"
    );

    static Registrar<Item> BETTER_NETHER_ITEMS = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static final SwordSet CINCINNASITE_ITEMS = new SwordSet(BETTER_NETHER_ITEMS,"betternether", CINCINNASITE, SwordItem::new);
    public static final SwordSet CINCINNASITE_DIAMOND_ITEMS = new SwordSet(BETTER_NETHER_ITEMS,"betternether", CINCINNASITE_DIAMOND, SwordItem::new);
    public static final SwordSet NETHER_RUBY_ITEMS = new SwordSet(BETTER_NETHER_ITEMS,"betternether", NETHER_RUBY, SwordItem::new);

    public static void smartRegister() {
        BETTER_NETHER_ITEMS.init();
    }
}
