package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.swords.soulsweapons.TranslucentSwordItem;
import net.knavesneeds.helpers.CompatHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class SoulsWeaponsAdditionsRegister {

    public static final DeferredRegister<Item> SOULS_WEAPONS_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, RegistryKeys.ITEM);

    // Translucent
    public static final RegistrySupplier<Item> TRANSLUCENT_LONGSWORD       = registerTranslucent("longsword");
    public static final RegistrySupplier<Item> TRANSLUCENT_TWINBLADE       = registerTranslucent("twinblade");
    public static final RegistrySupplier<Item> TRANSLUCENT_RAPIER          = registerTranslucent("rapier");
    public static final RegistrySupplier<Item> TRANSLUCENT_KATANA          = registerTranslucent("katana");
    public static final RegistrySupplier<Item> TRANSLUCENT_SAI             = registerTranslucent("sai");
    public static final RegistrySupplier<Item> TRANSLUCENT_SPEAR           = registerTranslucent("spear");
    public static final RegistrySupplier<Item> TRANSLUCENT_GLAIVE          = registerTranslucent("glaive");
    public static final RegistrySupplier<Item> TRANSLUCENT_WARGLAIVE       = registerTranslucent("warglaive");
    public static final RegistrySupplier<Item> TRANSLUCENT_CLAYMORE        = registerTranslucent("claymore");
    public static final RegistrySupplier<Item> TRANSLUCENT_CUTLASS         = registerTranslucent("cutlass");
    public static final RegistrySupplier<Item> TRANSLUCENT_GREATHAMMER     = registerTranslucent("greathammer");
    public static final RegistrySupplier<Item> TRANSLUCENT_GREATAXE        = registerTranslucent("greataxe");
    public static final RegistrySupplier<Item> TRANSLUCENT_CHAKRAM         = registerTranslucent("chakram");
    public static final RegistrySupplier<Item> TRANSLUCENT_SCYTHE          = registerTranslucent("scythe");
    public static final RegistrySupplier<Item> TRANSLUCENT_HALBERD         = registerTranslucent("halberd");

    private static RegistrySupplier<Item> registerTranslucent(String id) {
        return SOULS_WEAPONS_ITEMS.register("soulsweapons/" +
                ToolMaterialCompat.TRANSLUCENT.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new TranslucentSwordItem(ToolMaterialCompat.TRANSLUCENT, KnavesCommon.soulsWeaponsConfig.TRANSLUCENT_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }
}