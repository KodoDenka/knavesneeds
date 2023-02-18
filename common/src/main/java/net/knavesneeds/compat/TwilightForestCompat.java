package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;


import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class TwilightForestCompat {

    public static final DeferredRegister<Item> TWILIGHT_FOREST_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Fiery
    public static final RegistrySupplier<Item> FIERY_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "twilightforest:fiery_ingot"));
    public static final RegistrySupplier<Item> FIERY_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "twilightforest:fiery_ingot"));

    //Ironwood
    public static final RegistrySupplier<Item> IRONWOOD_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "twilightforest:ironwood_ingot"));
    public static final RegistrySupplier<Item> IRONWOOD_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "twilightforest:ironwood_ingot"));

    //Knightmetal
    public static final RegistrySupplier<Item> KNIGHTMETAL_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "twilightforest:knightmetal_ingot"));
    public static final RegistrySupplier<Item> KNIGHTMETAL_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "twilightforest:knightmetal_ingot"));

    //Steeleaf
    public static final RegistrySupplier<Item> STEELEAF_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "twilightforest:steeleaf_ingot"));
    public static final RegistrySupplier<Item> STEELEAF_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "twilightforest:steeleaf_ingot"));

}
