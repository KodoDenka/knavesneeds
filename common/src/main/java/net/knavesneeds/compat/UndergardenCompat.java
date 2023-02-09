package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;


import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class UndergardenCompat {

    public static final DeferredRegister<Item> UNDERGARDEN_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Clogrum
    public static final RegistrySupplier<Item> CLOGGRUM_LONGSWORD = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_TWINBLADE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_RAPIER = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_KATANA = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_SAI = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_SPEAR = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_GLAIVE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_WARGLAIVE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_CUTLASS = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_CLAYMORE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_GREATHAMMER = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_GREATAXE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_CHAKRAM = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> CLOGGRUM_SCYTHE = UNDERGARDEN_ITEMS.register("undergarden/cloggrum/cloggrum_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.CLOGGRUM, CLOGGRUM_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //Forgotten
    public static final RegistrySupplier<Item> FORGOTTEN_LONGSWORD = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_TWINBLADE = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_RAPIER = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_KATANA = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_SAI = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_SPEAR = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_GLAIVE = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_WARGLAIVE = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_CUTLASS = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_CLAYMORE = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_GREATHAMMER = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_GREATAXE = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_CHAKRAM = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> FORGOTTEN_SCYTHE = UNDERGARDEN_ITEMS.register("undergarden/forgotten/forgotten_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.FORGOTTEN, FORGOTTEN_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //Froststeel
    public static final RegistrySupplier<Item> FROSTSTEEL_LONGSWORD = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_TWINBLADE = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_RAPIER = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_KATANA = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_SAI = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_SPEAR = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_GLAIVE = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_WARGLAIVE = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_CUTLASS = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_CLAYMORE = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_GREATHAMMER = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_GREATAXE = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_CHAKRAM = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> FROSTSTEEL_SCYTHE = UNDERGARDEN_ITEMS.register("undergarden/froststeel/froststeel_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.FROSTSTEEL, FROSTSTEEL_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //Utherium
    public static final RegistrySupplier<Item> UTHERIUM_LONGSWORD = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_TWINBLADE = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_RAPIER = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_KATANA = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_SAI = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_SPEAR = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_GLAIVE = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_WARGLAIVE = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_CUTLASS = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_CLAYMORE = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_GREATHAMMER = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_GREATAXE = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_CHAKRAM = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> UTHERIUM_SCYTHE = UNDERGARDEN_ITEMS.register("undergarden/utherium/utherium_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.UTHERIUM, UTHERIUM_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

}
