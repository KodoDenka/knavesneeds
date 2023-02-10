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

    //Fiery
    public static final RegistrySupplier<Item> FIERY_LONGSWORD = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_TWINBLADE = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_RAPIER = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_KATANA = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_SAI = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_SPEAR = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_GLAIVE = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_WARGLAIVE = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_CUTLASS = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_CLAYMORE = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_GREATHAMMER = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_GREATAXE = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_CHAKRAM = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_SCYTHE = SOULS_WEAPONS_ITEMS.register("soulsweapons/fiery/fiery_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

}
