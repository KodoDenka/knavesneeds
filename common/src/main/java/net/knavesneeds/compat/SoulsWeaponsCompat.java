package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class SoulsWeaponsCompat {

    public static final DeferredRegister<Item> SOULS_WEAPONS_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Translucent
    public static final RegistrySupplier<Item> TRANSLUCENT_LONGSWORD = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_longsword", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_TWINBLADE = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_twinblade", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_RAPIER = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_rapier", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_KATANA = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_katana", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_SAI = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_sai", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_SPEAR = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_spear", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_GLAIVE = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_glaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_WARGLAIVE = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_warglaive", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_CUTLASS = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_cutlass", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_CLAYMORE = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_claymore", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_GREATHAMMER = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_greathammer", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_GREATAXE = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_greataxe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_CHAKRAM = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_chakram", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED, "soulsweapons:lost_soul"));
    public static final RegistrySupplier<Item> TRANSLUCENT_SCYTHE = SOULS_WEAPONS_ITEMS.register("soulsweapons/translucent/translucent_scythe", () ->
            new KnavesSwordItem(KnavesTeirRegistry.TRANSLUCENT, TRANSLUCENT_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED, "soulsweapons:lost_soul"));

}