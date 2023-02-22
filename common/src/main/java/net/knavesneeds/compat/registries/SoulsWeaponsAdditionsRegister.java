package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class SoulsWeaponsAdditionsRegister {

    public static final DeferredRegister<Item> SOULS_WEAPONS_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Translucent
    public static final RegistrySupplier<Item> TRANSLUCENT_LONGSWORD       = registerTranslucent("longsword");
    public static final RegistrySupplier<Item> TRANSLUCENT_TWINBLADE       = registerTranslucent("twinblade");
    public static final RegistrySupplier<Item> TRANSLUCENT_RAPIER          = registerTranslucent("rapier");
    public static final RegistrySupplier<Item> TRANSLUCENT_KATANA          = registerTranslucent("katana");
    public static final RegistrySupplier<Item> TRANSLUCENT_SAI             = registerTranslucent("sai");
    public static final RegistrySupplier<Item> TRANSLUCENT_SPEAR           = registerTranslucent("spear");
    public static final RegistrySupplier<Item> TRANSLUCENT_GLAIVE          = registerTranslucent("cutlass");
    public static final RegistrySupplier<Item> TRANSLUCENT_WARGLAIVE       = registerTranslucent("warglaive");
    public static final RegistrySupplier<Item> TRANSLUCENT_CLAYMORE        = registerTranslucent("claymore");
    public static final RegistrySupplier<Item> TRANSLUCENT_GREATHAMMER     = registerTranslucent("greathammer");
    public static final RegistrySupplier<Item> TRANSLUCENT_GREATAXE        = registerTranslucent("greataxe");
    public static final RegistrySupplier<Item> TRANSLUCENT_CHAKRAM         = registerTranslucent("chakram");
    public static final RegistrySupplier<Item> TRANSLUCENT_SCYTHE          = registerTranslucent("scythe");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod, String... repairIngredient) {
        return SOULS_WEAPONS_ITEMS.register("soulsweapons/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" +
                tier.toString().toLowerCase(Locale.ROOT) + "_" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id), repairIngredient));
    }

    private static RegistrySupplier<Item> registerTranslucent(String id) {
        return registerMaterial(id, ToolMaterialCompat.TRANSLUCENT, KnavesConfig.TRANSLUCENT_MOD, "soulsweapons:lost_soul");
    }
}