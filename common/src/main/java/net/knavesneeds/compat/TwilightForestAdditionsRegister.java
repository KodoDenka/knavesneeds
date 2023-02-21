package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class TwilightForestAdditionsRegister {

    public static final DeferredRegister<Item> TWILIGHT_FOREST_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Fiery
    public static final RegistrySupplier<Item> FIERY_LONGSWORD              = registerFiery("longsword");
    public static final RegistrySupplier<Item> FIERY_TWINBLADE              = registerFiery("twinblade");
    public static final RegistrySupplier<Item> FIERY_RAPIER                 = registerFiery("rapier");
    public static final RegistrySupplier<Item> FIERY_KATANA                 = registerFiery("katana");
    public static final RegistrySupplier<Item> FIERY_SAI                    = registerFiery("sai");
    public static final RegistrySupplier<Item> FIERY_SPEAR                  = registerFiery("spear");
    public static final RegistrySupplier<Item> FIERY_GLAIVE                 = registerFiery("cutlass");
    public static final RegistrySupplier<Item> FIERY_WARGLAIVE              = registerFiery("warglaive");
    public static final RegistrySupplier<Item> FIERY_CUTLASS                = registerFiery("cutlass");
    public static final RegistrySupplier<Item> FIERY_CLAYMORE               = registerFiery("claymore");
    public static final RegistrySupplier<Item> FIERY_GREATHAMMER            = registerFiery("greathammer");
    public static final RegistrySupplier<Item> FIERY_GREATAXE               = registerFiery("greataxe");
    public static final RegistrySupplier<Item> FIERY_CHAKRAM                = registerFiery("chakram");
    public static final RegistrySupplier<Item> FIERY_SCYTHE                 = registerFiery("scythe");

    // Ironwood
    public static final RegistrySupplier<Item> IRONWOOD_LONGSWORD           = registerIronwood("longsword");
    public static final RegistrySupplier<Item> IRONWOOD_TWINBLADE           = registerIronwood("twinblade");
    public static final RegistrySupplier<Item> IRONWOOD_RAPIER              = registerIronwood("rapier");
    public static final RegistrySupplier<Item> IRONWOOD_KATANA              = registerIronwood("katana");
    public static final RegistrySupplier<Item> IRONWOOD_SAI                 = registerIronwood("sai");
    public static final RegistrySupplier<Item> IRONWOOD_SPEAR               = registerIronwood("spear");
    public static final RegistrySupplier<Item> IRONWOOD_GLAIVE              = registerIronwood("cutlass");
    public static final RegistrySupplier<Item> IRONWOOD_WARGLAIVE           = registerIronwood("warglaive");
    public static final RegistrySupplier<Item> IRONWOOD_CUTLASS             = registerIronwood("cutlass");
    public static final RegistrySupplier<Item> IRONWOOD_CLAYMORE            = registerIronwood("claymore");
    public static final RegistrySupplier<Item> IRONWOOD_GREATHAMMER         = registerIronwood("greathammer");
    public static final RegistrySupplier<Item> IRONWOOD_GREATAXE            = registerIronwood("greataxe");
    public static final RegistrySupplier<Item> IRONWOOD_CHAKRAM             = registerIronwood("chakram");
    public static final RegistrySupplier<Item> IRONWOOD_SCYTHE              = registerIronwood("scythe");

    // Knightmetal
    public static final RegistrySupplier<Item> KNIGHTMETAL_LONGSWORD        = registerKnightmetal("longsword");
    public static final RegistrySupplier<Item> KNIGHTMETAL_TWINBLADE        = registerKnightmetal("twinblade");
    public static final RegistrySupplier<Item> KNIGHTMETAL_RAPIER           = registerKnightmetal("rapier");
    public static final RegistrySupplier<Item> KNIGHTMETAL_KATANA           = registerKnightmetal("katana");
    public static final RegistrySupplier<Item> KNIGHTMETAL_SAI              = registerKnightmetal("sai");
    public static final RegistrySupplier<Item> KNIGHTMETAL_SPEAR            = registerKnightmetal("spear");
    public static final RegistrySupplier<Item> KNIGHTMETAL_GLAIVE           = registerKnightmetal("cutlass");
    public static final RegistrySupplier<Item> KNIGHTMETAL_WARGLAIVE        = registerKnightmetal("warglaive");
    public static final RegistrySupplier<Item> KNIGHTMETAL_CUTLASS          = registerKnightmetal("cutlass");
    public static final RegistrySupplier<Item> KNIGHTMETAL_CLAYMORE         = registerKnightmetal("claymore");
    public static final RegistrySupplier<Item> KNIGHTMETAL_GREATHAMMER      = registerKnightmetal("greathammer");
    public static final RegistrySupplier<Item> KNIGHTMETAL_GREATAXE         = registerKnightmetal("greataxe");
    public static final RegistrySupplier<Item> KNIGHTMETAL_CHAKRAM          = registerKnightmetal("chakram");
    public static final RegistrySupplier<Item> KNIGHTMETAL_SCYTHE           = registerKnightmetal("scythe");

    // Steeleaf
    public static final RegistrySupplier<Item> STEELEAF_LONGSWORD           = registerSteeleaf("longsword");
    public static final RegistrySupplier<Item> STEELEAF_TWINBLADE           = registerSteeleaf("twinblade");
    public static final RegistrySupplier<Item> STEELEAF_RAPIER              = registerSteeleaf("rapier");
    public static final RegistrySupplier<Item> STEELEAF_KATANA              = registerSteeleaf("katana");
    public static final RegistrySupplier<Item> STEELEAF_SAI                 = registerSteeleaf("sai");
    public static final RegistrySupplier<Item> STEELEAF_SPEAR               = registerSteeleaf("spear");
    public static final RegistrySupplier<Item> STEELEAF_GLAIVE              = registerSteeleaf("cutlass");
    public static final RegistrySupplier<Item> STEELEAF_WARGLAIVE           = registerSteeleaf("warglaive");
    public static final RegistrySupplier<Item> STEELEAF_CUTLASS             = registerSteeleaf("cutlass");
    public static final RegistrySupplier<Item> STEELEAF_CLAYMORE            = registerSteeleaf("claymore");
    public static final RegistrySupplier<Item> STEELEAF_GREATHAMMER         = registerSteeleaf("greathammer");
    public static final RegistrySupplier<Item> STEELEAF_GREATAXE            = registerSteeleaf("greataxe");
    public static final RegistrySupplier<Item> STEELEAF_CHAKRAM             = registerSteeleaf("chakram");
    public static final RegistrySupplier<Item> STEELEAF_SCYTHE              = registerSteeleaf("scythe");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod, String... repairIngredient) {
        return TWILIGHT_FOREST_ITEMS.register("twilight_forest/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" +
                tier.toString().toLowerCase(Locale.ROOT) + "_" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id), repairIngredient));
    }

    private static RegistrySupplier<Item> registerFiery(String id) {
        return registerMaterial(id, ToolMaterialCompat.FIERY, KnavesConfig.FIERY_MOD, "twilightforest:fiery_ingot");
    }

    private static RegistrySupplier<Item> registerIronwood(String id) {
        return registerMaterial(id, ToolMaterialCompat.IRONWOOD, KnavesConfig.IRONWOOD_MOD, "twilightforest:ironwood_ingot");
    }

    private static RegistrySupplier<Item> registerKnightmetal(String id) {
        return registerMaterial(id, ToolMaterialCompat.KNIGHTMETAL, KnavesConfig.KNIGHTMETAL_MOD, "twilightforest:knightmetal_ingot");
    }

    private static RegistrySupplier<Item> registerSteeleaf(String id) {
        return registerMaterial(id, ToolMaterialCompat.STEELEAF, KnavesConfig.STEELEAF_MOD, "twilightforest:steeleaf_ingot");
    }
}
