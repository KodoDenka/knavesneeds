package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.swords.betternether.CincinnasiteDiamondSwordItem;
import net.knavesneeds.customitems.swords.betternether.CincinnasiteSwordItem;
import net.knavesneeds.customitems.swords.betternether.NetherRubySwordItem;
import net.knavesneeds.helpers.CompatHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class BetterNetherAdditionsRegister {

    public static final DeferredRegister<Item> BETTER_NETHER_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, RegistryKeys.ITEM);

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
    public static final RegistrySupplier<Item> CINCINNASITE_HALBERD             = registerCincinnasite("halberd");

    private static RegistrySupplier<Item> registerCincinnasite(String id) {
        return BETTER_NETHER_ITEMS.register("betternether/" +
                ToolMaterialCompat.CINCINNASITE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new CincinnasiteSwordItem(ToolMaterialCompat.CINCINNASITE, KnavesCommon.betterNetherConfig.CINCINNASITE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id) + 0.2F));
    }

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
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_HALBERD     = registerCincinnasiteDiamond("halberd");

    private static RegistrySupplier<Item> registerCincinnasiteDiamond(String id) {
        return BETTER_NETHER_ITEMS.register("betternether/" +
                ToolMaterialCompat.CINCINNASITE_DIAMOND.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new CincinnasiteDiamondSwordItem(ToolMaterialCompat.CINCINNASITE_DIAMOND, KnavesCommon.betterNetherConfig.CINCINNASITE_DIAMOND_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id) + 0.3F));
    }

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
    public static final RegistrySupplier<Item> NETHER_RUBY_HALBERD              = registerNetherRuby("halberd");

    private static RegistrySupplier<Item> registerNetherRuby(String id) {
        return BETTER_NETHER_ITEMS.register("betternether/" +
                ToolMaterialCompat.NETHER_RUBY.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new NetherRubySwordItem(ToolMaterialCompat.NETHER_RUBY, KnavesCommon.betterNetherConfig.NETHER_RUBY_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id) + 0.4F));
    }

    /**
    // Flaming Nether Ruby
    public static final RegistrySupplier<Item> FLAMING_RUBY_LONGSWORD            = registerFlamingRuby("longsword");
    public static final RegistrySupplier<Item> FLAMING_RUBY_TWINBLADE            = registerFlamingRuby("twinblade");
    public static final RegistrySupplier<Item> FLAMING_RUBY_RAPIER               = registerFlamingRuby("rapier");
    public static final RegistrySupplier<Item> FLAMING_RUBY_KATANA               = registerFlamingRuby("katana");
    public static final RegistrySupplier<Item> FLAMING_RUBY_SAI                  = registerFlamingRuby("sai");
    public static final RegistrySupplier<Item> FLAMING_RUBY_SPEAR                = registerFlamingRuby("spear");
    public static final RegistrySupplier<Item> FLAMING_RUBY_GLAIVE               = registerFlamingRuby("glaive");
    public static final RegistrySupplier<Item> FLAMING_RUBY_WARGLAIVE            = registerFlamingRuby("warglaive");
    public static final RegistrySupplier<Item> FLAMING_RUBY_CUTLASS              = registerFlamingRuby("cutlass");
    public static final RegistrySupplier<Item> FLAMING_RUBY_CLAYMORE             = registerFlamingRuby("claymore");
    public static final RegistrySupplier<Item> FLAMING_RUBY_GREATHAMMER          = registerFlamingRuby("greathammer");
    public static final RegistrySupplier<Item> FLAMING_RUBY_GREATAXE             = registerFlamingRuby("greataxe");
    public static final RegistrySupplier<Item> FLAMING_RUBY_CHAKRAM              = registerFlamingRuby("chakram");
    public static final RegistrySupplier<Item> FLAMING_RUBY_SCYTHE               = registerFlamingRuby("scythe");
    public static final RegistrySupplier<Item> FLAMING_RUBY_HALBERD              = registerFlamingRuby("halberd");

     private static RegistrySupplier<Item> registerFlamingRuby(String id) {
     return BETTER_NETHER_ITEMS.register("betternether/" +
     ToolMaterialCompat.FLAMING_RUBY.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
     new FlamingRubySwordItem(ToolMaterialCompat.FLAMING_RUBY, KnavesCommon.betterNetherConfig.FLAMING_RUBY_MOD + CompatHelper.getDamageMod(id),
     CompatHelper.getAttackSpeedMod(id) + 0.3F));
     }
     **/
}
