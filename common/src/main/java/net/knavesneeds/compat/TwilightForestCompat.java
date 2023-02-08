package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;


import static net.knavesneeds.KnavesCommon.MOD_ID;


public class TwilightForestCompat {

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
    //Twilight Forest
    static int STEELEAF_MOD = 0;
    static int IRONWOOD_MOD = 0;
    static int FIERY_MOD= 0;
    static int KNIGHTMETAL_MOD = 0;

    public static final DeferredRegister<Item> TWILIGHT_FOREST_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);


    //Fiery
    public static final RegistrySupplier<Item> FIERY_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> FIERY_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> FIERY_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> FIERY_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> FIERY_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> FIERY_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> FIERY_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> FIERY_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> FIERY_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> FIERY_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> FIERY_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> FIERY_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> FIERY_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> FIERY_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/fiery/fiery_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + scythe_damage_mod, scythe_speed_mod));

    //Ironwood
    public static final RegistrySupplier<Item> IRONWOOD_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> IRONWOOD_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/ironwood/ironwood_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.IRONWOOD, IRONWOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Knightmetal
    public static final RegistrySupplier<Item> KNIGHTMETAL_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> KNIGHTMETAL_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/knightmetal/knightmetal_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.KNIGHTMETAL, KNIGHTMETAL_MOD + scythe_damage_mod, scythe_speed_mod));

    //Steeleaf
    public static final RegistrySupplier<Item> STEELEAF_LONGSWORD = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_TWINBLADE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_RAPIER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_KATANA = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_SAI = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_SPEAR = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_GLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_WARGLAIVE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_CUTLASS = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_CLAYMORE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_GREATHAMMER = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_GREATAXE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_CHAKRAM = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> STEELEAF_SCYTHE = TWILIGHT_FOREST_ITEMS.register("twilight_forest/steeleaf/steeleaf_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.STEELEAF, STEELEAF_MOD + scythe_damage_mod, scythe_speed_mod));

}
