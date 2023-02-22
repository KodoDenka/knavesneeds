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

public class PlusTheEndAdditionsRegister {

    public static final DeferredRegister<Item> PLUS_THE_END_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Normal Endronium
    public static final RegistrySupplier<Item> ENDRONIUM_LONGSWORD       = registerEndronium("longsword");
    public static final RegistrySupplier<Item> ENDRONIUM_TWINBLADE       = registerEndronium("twinblade");
    public static final RegistrySupplier<Item> ENDRONIUM_RAPIER          = registerEndronium("rapier");
    public static final RegistrySupplier<Item> ENDRONIUM_KATANA          = registerEndronium("katana");
    public static final RegistrySupplier<Item> ENDRONIUM_SAI             = registerEndronium("sai");
    public static final RegistrySupplier<Item> ENDRONIUM_SPEAR           = registerEndronium("spear");
    public static final RegistrySupplier<Item> ENDRONIUM_GLAIVE          = registerEndronium("cutlass");
    public static final RegistrySupplier<Item> ENDRONIUM_WARGLAIVE       = registerEndronium("warglaive");
    public static final RegistrySupplier<Item> ENDRONIUM_CUTLASS         = registerEndronium("cutlass");
    public static final RegistrySupplier<Item> ENDRONIUM_CLAYMORE        = registerEndronium("claymore");
    public static final RegistrySupplier<Item> ENDRONIUM_GREATHAMMER     = registerEndronium("greathammer");
    public static final RegistrySupplier<Item> ENDRONIUM_GREATAXE        = registerEndronium("greataxe");
    public static final RegistrySupplier<Item> ENDRONIUM_CHAKRAM         = registerEndronium("chakram");
    public static final RegistrySupplier<Item> ENDRONIUM_SCYTHE          = registerEndronium("scythe");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod, String... repairIngredient) {
        return PLUS_THE_END_ITEMS.register("plus_the_end/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" +
                tier.toString().toLowerCase(Locale.ROOT) + "_" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id), repairIngredient));
    }

    private static RegistrySupplier<Item> registerEndronium(String id) {
        return registerMaterial(id, ToolMaterialCompat.ENDRONIUM, KnavesConfig.ENDRONIUM_MOD, "plus_the_end:endronium_ingot");
    }
}
