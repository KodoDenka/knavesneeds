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

public class DeeperAndDarkerRegister {
    public static final DeferredRegister<Item> DEEPER_DARKER_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Translucent
    public static final RegistrySupplier<Item> WARDEN_LONGSWORD       = registerWarden("longsword");
    public static final RegistrySupplier<Item> WARDEN_TWINBLADE       = registerWarden("twinblade");
    public static final RegistrySupplier<Item> WARDEN_RAPIER          = registerWarden("rapier");
    public static final RegistrySupplier<Item> WARDEN_KATANA          = registerWarden("katana");
    public static final RegistrySupplier<Item> WARDEN_SAI             = registerWarden("sai");
    public static final RegistrySupplier<Item> WARDEN_SPEAR           = registerWarden("spear");
    public static final RegistrySupplier<Item> WARDEN_GLAIVE          = registerWarden("glaive");
    public static final RegistrySupplier<Item> WARDEN_WARGLAIVE       = registerWarden("warglaive");
    public static final RegistrySupplier<Item> WARDEN_CUTLASS         = registerWarden("cutlass");
    public static final RegistrySupplier<Item> WARDEN_CLAYMORE        = registerWarden("claymore");
    public static final RegistrySupplier<Item> WARDEN_GREATHAMMER     = registerWarden("greathammer");
    public static final RegistrySupplier<Item> WARDEN_GREATAXE        = registerWarden("greataxe");
    public static final RegistrySupplier<Item> WARDEN_CHAKRAM         = registerWarden("chakram");
    public static final RegistrySupplier<Item> WARDEN_SCYTHE          = registerWarden("scythe");
    public static final RegistrySupplier<Item> WARDEN_HALBERD         = registerWarden("halberd");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod) {
        return DEEPER_DARKER_ITEMS.register("deeperdarker/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    private static RegistrySupplier<Item> registerWarden(String id) {
        return registerMaterial(id, ToolMaterialCompat.WARDEN, KnavesConfig.WARDEN_MOD);
    }
}
