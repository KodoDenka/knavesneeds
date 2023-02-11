package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class BetterEndCompat {

    public static final DeferredRegister<Item> BETTER_END_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);


    //aeternium
    public static final RegistrySupplier<Item> AETERNIUM_LONGSWORD = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_TWINBLADE = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_RAPIER = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_KATANA = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_SAI = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_SPEAR = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_GLAIVE = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_WARGLAIVE = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_CUTLASS = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_CLAYMORE = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_GREATHAMMER = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_GREATAXE = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_CHAKRAM = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> AETERNIUM_SCYTHE = BETTER_END_ITEMS.register("betterend/aeternium/aeternium_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.AETERNIUM, AETERNIUM_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //terminite
    public static final RegistrySupplier<Item> TERMINITE_LONGSWORD = BETTER_END_ITEMS.register("betterend/terminite/terminite_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_TWINBLADE = BETTER_END_ITEMS.register("betterend/terminite/terminite_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_RAPIER = BETTER_END_ITEMS.register("betterend/terminite/terminite_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_KATANA = BETTER_END_ITEMS.register("betterend/terminite/terminite_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_SAI = BETTER_END_ITEMS.register("betterend/terminite/terminite_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_SPEAR = BETTER_END_ITEMS.register("betterend/terminite/terminite_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_GLAIVE = BETTER_END_ITEMS.register("betterend/terminite/terminite_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_WARGLAIVE = BETTER_END_ITEMS.register("betterend/terminite/terminite_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_CUTLASS = BETTER_END_ITEMS.register("betterend/terminite/terminite_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_CLAYMORE = BETTER_END_ITEMS.register("betterend/terminite/terminite_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_GREATHAMMER = BETTER_END_ITEMS.register("betterend/terminite/terminite_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_GREATAXE = BETTER_END_ITEMS.register("betterend/terminite/terminite_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_CHAKRAM = BETTER_END_ITEMS.register("betterend/terminite/terminite_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> TERMINITE_SCYTHE = BETTER_END_ITEMS.register("betterend/terminite/terminite_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.TERMINITE, TERMINITE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //thallasium
    public static final RegistrySupplier<Item> THALLASIUM_LONGSWORD = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_TWINBLADE = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_RAPIER = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_KATANA = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_SAI = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_SPEAR = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_GLAIVE = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_WARGLAIVE = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_CUTLASS = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_CLAYMORE = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_GREATHAMMER = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_GREATAXE = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_CHAKRAM = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> THALLASIUM_SCYTHE = BETTER_END_ITEMS.register("betterend/thallasium/thallasium_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.THALLASIUM, THALLASIUM_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));
}
