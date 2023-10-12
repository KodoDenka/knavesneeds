package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.swords.plus_the_end.EndroniumSwordItem;
import net.knavesneeds.helpers.CompatHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class PlusTheEndAdditionsRegister {

    public static final DeferredRegister<Item> PLUS_THE_END_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, RegistryKeys.ITEM);

    // Normal Endronium
    public static final RegistrySupplier<Item> ENDRONIUM_LONGSWORD       = registerEndronium("longsword");
    public static final RegistrySupplier<Item> ENDRONIUM_TWINBLADE       = registerEndronium("twinblade");
    public static final RegistrySupplier<Item> ENDRONIUM_RAPIER          = registerEndronium("rapier");
    public static final RegistrySupplier<Item> ENDRONIUM_KATANA          = registerEndronium("katana");
    public static final RegistrySupplier<Item> ENDRONIUM_SAI             = registerEndronium("sai");
    public static final RegistrySupplier<Item> ENDRONIUM_SPEAR           = registerEndronium("spear");
    public static final RegistrySupplier<Item> ENDRONIUM_GLAIVE          = registerEndronium("glaive");
    public static final RegistrySupplier<Item> ENDRONIUM_WARGLAIVE       = registerEndronium("warglaive");
    public static final RegistrySupplier<Item> ENDRONIUM_CUTLASS         = registerEndronium("cutlass");
    public static final RegistrySupplier<Item> ENDRONIUM_CLAYMORE        = registerEndronium("claymore");
    public static final RegistrySupplier<Item> ENDRONIUM_GREATHAMMER     = registerEndronium("greathammer");
    public static final RegistrySupplier<Item> ENDRONIUM_GREATAXE        = registerEndronium("greataxe");
    public static final RegistrySupplier<Item> ENDRONIUM_CHAKRAM         = registerEndronium("chakram");
    public static final RegistrySupplier<Item> ENDRONIUM_SCYTHE          = registerEndronium("scythe");

    private static RegistrySupplier<Item> registerEndronium(String id) {
        return PLUS_THE_END_ITEMS.register("plus_the_end/" +
                ToolMaterialCompat.ENDRONIUM.toString().toLowerCase(Locale.ROOT) + "/" +
                ToolMaterialCompat.ENDRONIUM.toString().toLowerCase(Locale.ROOT) + "_" + id, ()->
                new EndroniumSwordItem(ToolMaterialCompat.ENDRONIUM, KnavesCommon.plusTheEndConfig.ENDRONIUM_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }
}
