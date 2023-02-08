package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;

public class PlusTheEndCompat {

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
    //Plus The End
    static int ENDRONIUM_MOD = 0;


    public static final DeferredRegister<Item> PLUS_THE_END_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Normal Endronium
    public static final RegistrySupplier<Item> ENDRONIUM_LONGSWORD = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_TWINBLADE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD +  twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_RAPIER = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_KATANA = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_SAI = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_SPEAR = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_GLAIVE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_WARGLAIVE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_CUTLASS = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_CLAYMORE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_GREATHAMMER = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_GREATAXE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_CHAKRAM = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistrySupplier<Item> ENDRONIUM_SCYTHE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + scythe_damage_mod, scythe_speed_mod));

}
