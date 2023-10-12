package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.swords.deeperdarker.WardenSwordItem;
import net.knavesneeds.helpers.CompatHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class DeeperDarkerRegister {
    public static final DeferredRegister<Item> DEEPER_DARKER_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, RegistryKeys.ITEM);

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
                new WardenSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    private static RegistrySupplier<Item> registerWarden(String id) {
        return registerMaterial(id, ToolMaterialCompat.WARDEN, KnavesCommon.deeperDarkerConfig.WARDEN_MOD);
    }
}
