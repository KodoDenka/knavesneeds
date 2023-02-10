package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class BetterNetherCompat {

    public static final DeferredRegister<Item> BETTER_NETHER_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //Fiery
    public static final RegistrySupplier<Item> FIERY_LONGSWORD = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_TWINBLADE = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_RAPIER = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_KATANA = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_SAI = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_SPEAR = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_GLAIVE = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_WARGLAIVE = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_CUTLASS = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_CLAYMORE = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_GREATHAMMER = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_GREATAXE = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_CHAKRAM = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> FIERY_SCYTHE = BETTER_NETHER_ITEMS.register("betternether/fiery/fiery_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.FIERY, FIERY_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

}
