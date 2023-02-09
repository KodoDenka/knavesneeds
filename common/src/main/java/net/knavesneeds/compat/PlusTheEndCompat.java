package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class PlusTheEndCompat {

    public static final DeferredRegister<Item> PLUS_THE_END_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Normal Endronium
    public static final RegistrySupplier<Item> ENDRONIUM_LONGSWORD = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_TWINBLADE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_RAPIER = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_KATANA = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_SAI = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_SPEAR = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_GLAIVE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_WARGLAIVE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_CUTLASS = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_CLAYMORE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_GREATHAMMER = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_GREATAXE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_CHAKRAM = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> ENDRONIUM_SCYTHE = PLUS_THE_END_ITEMS.register("plus_the_end/endronium/endronium_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.ENDRONIUM, ENDRONIUM_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

}
