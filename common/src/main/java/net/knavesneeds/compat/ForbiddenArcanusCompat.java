package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class ForbiddenArcanusCompat {

    public static final DeferredRegister<Item> FORBIDDEN_ARCANUS_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Deorum
    public static final RegistrySupplier<Item> DEORUM_LONGSWORD = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_TWINBLADE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_RAPIER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_KATANA = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_SAI = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_SPEAR = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_GLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_WARGLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_CUTLASS = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_CLAYMORE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_GREATHAMMER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_GREATAXE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_CHAKRAM = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> DEORUM_SCYTHE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/deorum/deorum_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DEORUM, DEORUM_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //Draco Arcanus
    public static final RegistrySupplier<Item> DRACO_ARCANUS_LONGSWORD = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_TWINBLADE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_RAPIER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_KATANA = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SAI = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SPEAR = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_WARGLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CUTLASS = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CLAYMORE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GREATHAMMER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GREATAXE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CHAKRAM = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SCYTHE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //Reinforced Deorum
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_LONGSWORD = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_TWINBLADE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_RAPIER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_KATANA = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_SAI = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_SPEAR = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_GLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_WARGLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_CUTLASS = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_CLAYMORE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_GREATHAMMER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_GREATAXE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_CHAKRAM = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> REINFORCED_DEORUM_SCYTHE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_deorum/reinforced_deorum_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_DEORUM, REINFORCED_DEORUM_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

}
