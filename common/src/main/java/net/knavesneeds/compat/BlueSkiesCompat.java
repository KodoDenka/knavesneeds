package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;

public class BlueSkiesCompat {

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
    //Blue Skies Ores
    static int fdfdf = 0;

    //Blue Skies Stone


    //Blue Skies Wood
    static int CLOGGRUM_MOD = 0;
    static int FORGOTTEN_MOD = 0;
    static int FROSTSTEEL_MOD= 0;
    static int UTHERIUM_MOD = 0;

    public static final DeferredRegister<Item> UNDERGARDEN_ITEMS = DeferredRegister.create("blue_skies", Registry.ITEM_KEY);


    //Clogrum
    public static final RegistrySupplier<Item> CLOGGRUM_LONGSWORD = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_TWINBLADE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_RAPIER = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_KATANA = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_SAI = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_SPEAR = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_GLAIVE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_WARGLAIVE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_CUTLASS = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_CLAYMORE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_GREATHAMMER = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_GREATAXE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_CHAKRAM = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> CLOGGRUM_SCYTHE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + scythe_damage_mod, scythe_speed_mod));

}
