package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;

public class ForbiddenArcanusCompat {

    //weapon type modifiers.
    static int longsword_damage_mod = 0;
    static float longsword_speed_mod = -2.4F;
    static int twinblade_damage_mod = 0;
    static float twinblade_speed_mod = -1.7f;
    static int rapier_damage_mod = -1;
    static float rapier_speed_mod = -1.6f;
    static int katana_damage_mod = 0;
    static float katana_speed_mod = -2.0f;
    static int sai_damage_mod = -3;
    static float sai_speed_mod = -1.1f;
    static int spear_damage_mod = 0;
    static float spear_speed_mod = -2.7f;
    static int glaive_damage_mod = 0;
    static float glaive_speed_mod = -2.6f;
    static int warglaive_damage_mod = 0;
    static float warglaive_speed_mod = -2.2f;
    static int cutlass_damage_mod = 0;
    static float cutlass_speed_mod = -2.0f;
    static int claymore_damage_mod = 2;
    static float claymore_speed_mod = -2.8f;
    static int greataxe_damage_mod = 3;
    static float greataxe_speed_mod = -3.1f;
    static int greathammer_damage_mod = 4;
    static float greathammer_speed_mod = -3.2f;
    static int chakram_damage_mod = -1;
    static float chakram_speed_mod = -3.0f;
    static int scythe_damage_mod = 1;
    static float scythe_speed_mod = -2.7f;


    //Mod Tier damage modifier
    //Forbidden Arcanus
    static int ARCANE_GOLDEN_MOD = 0;
    static int DRACO_ARCANUS_MOD = 0;
    static int REINFORCED_ARCANE_GOLDEN_MOD = 0;


    public static final DeferredRegister<Item> FORBIDDEN_ARCANUS_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Arcane Golden
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_LONGSWORD = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_TWINBLADE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_RAPIER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_KATANA = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_SAI = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_SPEAR = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_GLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_WARGLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_CUTLASS = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_CLAYMORE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_GREATHAMMER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_GREATAXE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_CHAKRAM = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> ARCANE_GOLDEN_SCYTHE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/arcane_golden/arcane_golden_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + scythe_damage_mod, scythe_speed_mod));

    //Draco Arcanus
    public static final RegistrySupplier<Item> DRACO_ARCANUS_LONGSWORD = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_TWINBLADE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_RAPIER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_KATANA = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SAI = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SPEAR = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_WARGLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CUTLASS = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CLAYMORE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GREATHAMMER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GREATAXE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CHAKRAM = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SCYTHE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/draco_arcanus/draco_arcanus_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.DRACO_ARCANUS, DRACO_ARCANUS_MOD + scythe_damage_mod, scythe_speed_mod));

    //Reinforced Arcane Golden
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_LONGSWORD = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_TWINBLADE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_RAPIER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_KATANA = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_SAI = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_SPEAR = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_GLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_WARGLAIVE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_CUTLASS = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_CLAYMORE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_GREATHAMMER = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_GREATAXE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_CHAKRAM = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> REINFORCED_ARCANE_GOLDEN_SCYTHE = FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/reinforced_arcane_golden/reinforced_arcane_golden_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + scythe_damage_mod, scythe_speed_mod));

}
