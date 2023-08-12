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

public class UndergardenAdditionsRegister {

    public static final DeferredRegister<Item> UNDERGARDEN_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Cloggrum
    public static final RegistrySupplier<Item> CLOGGRUM_LONGSWORD       = registerCloggrum("longsword");
    public static final RegistrySupplier<Item> CLOGGRUM_TWINBLADE       = registerCloggrum("twinblade");
    public static final RegistrySupplier<Item> CLOGGRUM_RAPIER          = registerCloggrum("rapier");
    public static final RegistrySupplier<Item> CLOGGRUM_KATANA          = registerCloggrum("katana");
    public static final RegistrySupplier<Item> CLOGGRUM_SAI             = registerCloggrum("sai");
    public static final RegistrySupplier<Item> CLOGGRUM_SPEAR           = registerCloggrum("spear");
    public static final RegistrySupplier<Item> CLOGGRUM_GLAIVE          = registerCloggrum("glaive");
    public static final RegistrySupplier<Item> CLOGGRUM_WARGLAIVE       = registerCloggrum("warglaive");
    public static final RegistrySupplier<Item> CLOGGRUM_CUTLASS         = registerCloggrum("cutlass");
    public static final RegistrySupplier<Item> CLOGGRUM_CLAYMORE        = registerCloggrum("claymore");
    public static final RegistrySupplier<Item> CLOGGRUM_GREATHAMMER     = registerCloggrum("greathammer");
    public static final RegistrySupplier<Item> CLOGGRUM_GREATAXE        = registerCloggrum("greataxe");
    public static final RegistrySupplier<Item> CLOGGRUM_CHAKRAM         = registerCloggrum("chakram");
    public static final RegistrySupplier<Item> CLOGGRUM_SCYTHE          = registerCloggrum("scythe");

    // Forgotten
    public static final RegistrySupplier<Item> FORGOTTEN_LONGSWORD      = registerForgotten("longsword");
    public static final RegistrySupplier<Item> FORGOTTEN_TWINBLADE      = registerForgotten("twinblade");
    public static final RegistrySupplier<Item> FORGOTTEN_RAPIER         = registerForgotten("rapier");
    public static final RegistrySupplier<Item> FORGOTTEN_KATANA         = registerForgotten("katana");
    public static final RegistrySupplier<Item> FORGOTTEN_SAI            = registerForgotten("sai");
    public static final RegistrySupplier<Item> FORGOTTEN_SPEAR          = registerForgotten("spear");
    public static final RegistrySupplier<Item> FORGOTTEN_GLAIVE         = registerForgotten("glaive");
    public static final RegistrySupplier<Item> FORGOTTEN_WARGLAIVE      = registerForgotten("warglaive");
    public static final RegistrySupplier<Item> FORGOTTEN_CUTLASS        = registerForgotten("cutlass");
    public static final RegistrySupplier<Item> FORGOTTEN_CLAYMORE       = registerForgotten("claymore");
    public static final RegistrySupplier<Item> FORGOTTEN_GREATHAMMER    = registerForgotten("greathammer");
    public static final RegistrySupplier<Item> FORGOTTEN_GREATAXE       = registerForgotten("greataxe");
    public static final RegistrySupplier<Item> FORGOTTEN_CHAKRAM        = registerForgotten("chakram");
    public static final RegistrySupplier<Item> FORGOTTEN_SCYTHE         = registerForgotten("scythe");

    // Froststeel
    public static final RegistrySupplier<Item> FROSTSTEEL_LONGSWORD     = registerFroststeel("longsword");
    public static final RegistrySupplier<Item> FROSTSTEEL_TWINBLADE     = registerFroststeel("twinblade");
    public static final RegistrySupplier<Item> FROSTSTEEL_RAPIER        = registerFroststeel("rapier");
    public static final RegistrySupplier<Item> FROSTSTEEL_KATANA        = registerFroststeel("katana");
    public static final RegistrySupplier<Item> FROSTSTEEL_SAI           = registerFroststeel("sai");
    public static final RegistrySupplier<Item> FROSTSTEEL_SPEAR         = registerFroststeel("spear");
    public static final RegistrySupplier<Item> FROSTSTEEL_GLAIVE        = registerFroststeel("glaive");
    public static final RegistrySupplier<Item> FROSTSTEEL_WARGLAIVE     = registerFroststeel("warglaive");
    public static final RegistrySupplier<Item> FROSTSTEEL_CUTLASS       = registerFroststeel("cutlass");
    public static final RegistrySupplier<Item> FROSTSTEEL_CLAYMORE      = registerFroststeel("claymore");
    public static final RegistrySupplier<Item> FROSTSTEEL_GREATHAMMER   = registerFroststeel("greathammer");
    public static final RegistrySupplier<Item> FROSTSTEEL_GREATAXE      = registerFroststeel("greataxe");
    public static final RegistrySupplier<Item> FROSTSTEEL_CHAKRAM       = registerFroststeel("chakram");
    public static final RegistrySupplier<Item> FROSTSTEEL_SCYTHE        = registerFroststeel("scythe");

    // Utherium
    public static final RegistrySupplier<Item> UTHERIUM_LONGSWORD       = registerUtherium("longsword");
    public static final RegistrySupplier<Item> UTHERIUM_TWINBLADE       = registerUtherium("twinblade");
    public static final RegistrySupplier<Item> UTHERIUM_RAPIER          = registerUtherium("rapier");
    public static final RegistrySupplier<Item> UTHERIUM_KATANA          = registerUtherium("katana");
    public static final RegistrySupplier<Item> UTHERIUM_SAI             = registerUtherium("sai");
    public static final RegistrySupplier<Item> UTHERIUM_SPEAR           = registerUtherium("spear");
    public static final RegistrySupplier<Item> UTHERIUM_GLAIVE          = registerUtherium("glaive");
    public static final RegistrySupplier<Item> UTHERIUM_WARGLAIVE       = registerUtherium("warglaive");
    public static final RegistrySupplier<Item> UTHERIUM_CUTLASS         = registerUtherium("cutlass");
    public static final RegistrySupplier<Item> UTHERIUM_CLAYMORE        = registerUtherium("claymore");
    public static final RegistrySupplier<Item> UTHERIUM_GREATHAMMER     = registerUtherium("greathammer");
    public static final RegistrySupplier<Item> UTHERIUM_GREATAXE        = registerUtherium("greataxe");
    public static final RegistrySupplier<Item> UTHERIUM_CHAKRAM         = registerUtherium("chakram");
    public static final RegistrySupplier<Item> UTHERIUM_SCYTHE          = registerUtherium("scythe");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod) {
        return UNDERGARDEN_ITEMS.register("undergarden/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    private static RegistrySupplier<Item> registerCloggrum(String id) {
        return registerMaterial(id, ToolMaterialCompat.CLOGGRUM, KnavesConfig.CLOGGRUM_MOD);
    }

    private static RegistrySupplier<Item> registerForgotten(String id) {
        return registerMaterial(id, ToolMaterialCompat.FORGOTTEN, KnavesConfig.FORGOTTEN_MOD);
    }

    private static RegistrySupplier<Item> registerFroststeel(String id) {
        return registerMaterial(id, ToolMaterialCompat.FROSTSTEEL, KnavesConfig.FROSTSTEEL_MOD);
    }

    private static RegistrySupplier<Item> registerUtherium(String id) {
        return registerMaterial(id, ToolMaterialCompat.UTHERIUM, KnavesConfig.UTHERIUM_MOD);
    }
}
