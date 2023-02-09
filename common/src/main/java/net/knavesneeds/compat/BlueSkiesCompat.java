package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class BlueSkiesCompat {

    public static final DeferredRegister<Item> UNDERGARDEN_ITEMS = DeferredRegister.create("blue_skies", Registry.ITEM_KEY);

    //Aquite
    public static final RegistrySupplier<Item> AQUITE_LONGSWORD = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_TWINBLADE = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_RAPIER = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_KATANA = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_SAI = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_SPEAR = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_GLAIVE = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_WARGLAIVE = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_CUTLASS = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_CLAYMORE = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_GREATHAMMER = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_GREATAXE = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_CHAKRAM = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> AQUITE_SCYTHE = UNDERGARDEN_ITEMS.register("blue_skies/aquite/aquite_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.AQUITE, AQUITE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

}
