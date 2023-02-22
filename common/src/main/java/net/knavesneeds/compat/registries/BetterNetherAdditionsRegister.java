package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class BetterNetherAdditionsRegister {

    public static final DeferredRegister<Item> BETTER_NETHER_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Cincinnasite
    public static final RegistrySupplier<Item> CINCINNASITE_LONGSWORD           = registerCincinnasite("longsword");
    public static final RegistrySupplier<Item> CINCINNASITE_TWINBLADE           = registerCincinnasite("twinblade");
    public static final RegistrySupplier<Item> CINCINNASITE_RAPIER              = registerCincinnasite("rapier");
    public static final RegistrySupplier<Item> CINCINNASITE_KATANA              = registerCincinnasite("katana");
    public static final RegistrySupplier<Item> CINCINNASITE_SAI                 = registerCincinnasite("sai");
    public static final RegistrySupplier<Item> CINCINNASITE_SPEAR               = registerCincinnasite("spear");
    public static final RegistrySupplier<Item> CINCINNASITE_GLAIVE              = registerCincinnasite("glaive");
    public static final RegistrySupplier<Item> CINCINNASITE_WARGLAIVE           = registerCincinnasite("warglaive");
    public static final RegistrySupplier<Item> CINCINNASITE_CUTLASS             = registerCincinnasite("cutlass");
    public static final RegistrySupplier<Item> CINCINNASITE_CLAYMORE            = registerCincinnasite("claymore");
    public static final RegistrySupplier<Item> CINCINNASITE_GREATHAMMER         = registerCincinnasite("greathammer");
    public static final RegistrySupplier<Item> CINCINNASITE_GREATAXE            = registerCincinnasite("greataxe");
    public static final RegistrySupplier<Item> CINCINNASITE_CHAKRAM             = registerCincinnasite("chakram");
    public static final RegistrySupplier<Item> CINCINNASITE_SCYTHE              = registerCincinnasite("scythe");

    // Cincinnasite Diamond
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_LONGSWORD   = registerCincinnasiteDiamond("longsword");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_TWINBLADE   = registerCincinnasiteDiamond("twinblade");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_RAPIER      = registerCincinnasiteDiamond("rapier");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_KATANA      = registerCincinnasiteDiamond("katana");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_SAI         = registerCincinnasiteDiamond("sai");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_SPEAR       = registerCincinnasiteDiamond("spear");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_GLAIVE      = registerCincinnasiteDiamond("glaive");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_WARGLAIVE   = registerCincinnasiteDiamond("warglaive");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_CUTLASS     = registerCincinnasiteDiamond("cutlass");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_CLAYMORE    = registerCincinnasiteDiamond("claymore");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_GREATHAMMER = registerCincinnasiteDiamond("greathammer");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_GREATAXE    = registerCincinnasiteDiamond("greataxe");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_CHAKRAM     = registerCincinnasiteDiamond("chakram");
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_SCYTHE      = registerCincinnasiteDiamond("scythe");

    // Nether Ruby
    public static final RegistrySupplier<Item> NETHER_RUBY_LONGSWORD            = registerNetherRuby("longsword");
    public static final RegistrySupplier<Item> NETHER_RUBY_TWINBLADE            = registerNetherRuby("twinblade");
    public static final RegistrySupplier<Item> NETHER_RUBY_RAPIER               = registerNetherRuby("rapier");
    public static final RegistrySupplier<Item> NETHER_RUBY_KATANA               = registerNetherRuby("katana");
    public static final RegistrySupplier<Item> NETHER_RUBY_SAI                  = registerNetherRuby("sai");
    public static final RegistrySupplier<Item> NETHER_RUBY_SPEAR                = registerNetherRuby("spear");
    public static final RegistrySupplier<Item> NETHER_RUBY_GLAIVE               = registerNetherRuby("glaive");
    public static final RegistrySupplier<Item> NETHER_RUBY_WARGLAIVE            = registerNetherRuby("warglaive");
    public static final RegistrySupplier<Item> NETHER_RUBY_CUTLASS              = registerNetherRuby("cutlass");
    public static final RegistrySupplier<Item> NETHER_RUBY_CLAYMORE             = registerNetherRuby("claymore");
    public static final RegistrySupplier<Item> NETHER_RUBY_GREATHAMMER          = registerNetherRuby("greathammer");
    public static final RegistrySupplier<Item> NETHER_RUBY_GREATAXE             = registerNetherRuby("greataxe");
    public static final RegistrySupplier<Item> NETHER_RUBY_CHAKRAM              = registerNetherRuby("chakram");
    public static final RegistrySupplier<Item> NETHER_RUBY_SCYTHE               = registerNetherRuby("scythe");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod, String... repairIngredient) {
        return BETTER_NETHER_ITEMS.register("betternether/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" +
                tier.toString().toLowerCase(Locale.ROOT) + "_" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id), repairIngredient));
    }

    private static RegistrySupplier<Item> registerCincinnasite(String id) {
        return registerMaterial(id, ToolMaterialCompat.CINCINNASITE, KnavesConfig.CINCINNASITE_MOD, "betternether:cincinnasite_ingot");
    }

    private static RegistrySupplier<Item> registerCincinnasiteDiamond(String id) {
        return registerMaterial(id, ToolMaterialCompat.CINCINNASITE_DIAMOND, KnavesConfig.CINCINNASITE_DIAMOND_MOD, "minecraft:diamond");
    }

    private static RegistrySupplier<Item> registerNetherRuby(String id) {
        return registerMaterial(id, ToolMaterialCompat.NETHER_RUBY, KnavesConfig.NETHER_RUBY_MOD, "betternether:nether_ruby");
    }
}
