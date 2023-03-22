package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.CompatHelper;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class BiomesYoullGoRegister {
    public static final DeferredRegister<Item> BYG_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Translucent
    public static final RegistrySupplier<Item> PENDORITE_LONGSWORD       = registerPendorite("longsword");
    public static final RegistrySupplier<Item> PENDORITE_TWINBLADE       = registerPendorite("twinblade");
    public static final RegistrySupplier<Item> PENDORITE_RAPIER          = registerPendorite("rapier");
    public static final RegistrySupplier<Item> PENDORITE_KATANA          = registerPendorite("katana");
    public static final RegistrySupplier<Item> PENDORITE_SAI             = registerPendorite("sai");
    public static final RegistrySupplier<Item> PENDORITE_SPEAR           = registerPendorite("spear");
    public static final RegistrySupplier<Item> PENDORITE_GLAIVE          = registerPendorite("glaive");
    public static final RegistrySupplier<Item> PENDORITE_WARGLAIVE       = registerPendorite("warglaive");
    public static final RegistrySupplier<Item> PENDORITE_CUTLASS         = registerPendorite("cutlass");
    public static final RegistrySupplier<Item> PENDORITE_CLAYMORE        = registerPendorite("claymore");
    public static final RegistrySupplier<Item> PENDORITE_GREATHAMMER     = registerPendorite("greathammer");
    public static final RegistrySupplier<Item> PENDORITE_GREATAXE        = registerPendorite("greataxe");
    public static final RegistrySupplier<Item> PENDORITE_CHAKRAM         = registerPendorite("chakram");
    public static final RegistrySupplier<Item> PENDORITE_SCYTHE          = registerPendorite("scythe");
    public static final RegistrySupplier<Item> PENDORITE_HALBERD         = registerPendorite("halberd");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod) {
        return BYG_ITEMS.register("byg/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    private static RegistrySupplier<Item> registerPendorite(String id) {
        return registerMaterial(id, ToolMaterialCompat.PENDORITE, KnavesConfig.PENDORITE_MOD);
    }
}
