package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.helpers.CompatHelper;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class BetterEndAdditionsRegister {

    public static final DeferredRegister<Item> BETTER_END_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, RegistryKeys.ITEM);

    // Aeternium Heads
    public static final RegistrySupplier<Item> AETERNIUM_LONGSWORD_HEAD     = registerHead("longsword", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_TWINBLADE_HEAD     = registerHead("twinblade", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_RAPIER_HEAD        = registerHead("rapier", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_KATANA_HEAD        = registerHead("katana", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_SAI_HEAD           = registerHead("sai", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_SPEAR_HEAD         = registerHead("spear", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_GLAIVE_HEAD        = registerHead("glaive", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_WARGLAIVE_HEAD     = registerHead("warglaive", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_CUTLASS_HEAD       = registerHead("cutlass", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_CLAYMORE_HEAD      = registerHead("claymore", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_GREATHAMMER_HEAD   = registerHead("greathammer", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_GREATAXE_HEAD      = registerHead("greataxe", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_CHAKRAM_HEAD       = registerHead("chakram", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_SCYTHE_HEAD        = registerHead("scythe", ToolMaterialCompat.AETERNIUM);
    public static final RegistrySupplier<Item> AETERNIUM_HALBERD_HEAD       = registerHead("halberd", ToolMaterialCompat.AETERNIUM);

    // Aeternium
    public static final RegistrySupplier<Item> AETERNIUM_LONGSWORD          = registerAeternium("longsword");
    public static final RegistrySupplier<Item> AETERNIUM_TWINBLADE          = registerAeternium("twinblade");
    public static final RegistrySupplier<Item> AETERNIUM_RAPIER             = registerAeternium("rapier");
    public static final RegistrySupplier<Item> AETERNIUM_KATANA             = registerAeternium("katana");
    public static final RegistrySupplier<Item> AETERNIUM_SAI                = registerAeternium("sai");
    public static final RegistrySupplier<Item> AETERNIUM_SPEAR              = registerAeternium("spear");
    public static final RegistrySupplier<Item> AETERNIUM_GLAIVE             = registerAeternium("glaive");
    public static final RegistrySupplier<Item> AETERNIUM_WARGLAIVE          = registerAeternium("warglaive");
    public static final RegistrySupplier<Item> AETERNIUM_CUTLASS            = registerAeternium("cutlass");
    public static final RegistrySupplier<Item> AETERNIUM_CLAYMORE           = registerAeternium("claymore");
    public static final RegistrySupplier<Item> AETERNIUM_GREATHAMMER        = registerAeternium("greathammer");
    public static final RegistrySupplier<Item> AETERNIUM_GREATAXE           = registerAeternium("greataxe");
    public static final RegistrySupplier<Item> AETERNIUM_CHAKRAM            = registerAeternium("chakram");
    public static final RegistrySupplier<Item> AETERNIUM_SCYTHE             = registerAeternium("scythe");
    public static final RegistrySupplier<Item> AETERNIUM_HALBERD            = registerAeternium("halberd");

    // Terminite Heads
    public static final RegistrySupplier<Item> TERMINITE_LONGSWORD_HEAD     = registerHead("longsword", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_TWINBLADE_HEAD     = registerHead("twinblade", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_RAPIER_HEAD        = registerHead("rapier", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_KATANA_HEAD        = registerHead("katana", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_SAI_HEAD           = registerHead("sai", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_SPEAR_HEAD         = registerHead("spear", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_GLAIVE_HEAD        = registerHead("glaive", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_WARGLAIVE_HEAD     = registerHead("warglaive", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_CUTLASS_HEAD       = registerHead("cutlass", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_CLAYMORE_HEAD      = registerHead("claymore", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_GREATHAMMER_HEAD   = registerHead("greathammer", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_GREATAXE_HEAD      = registerHead("greataxe", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_CHAKRAM_HEAD       = registerHead("chakram", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_SCYTHE_HEAD        = registerHead("scythe", ToolMaterialCompat.TERMINITE);
    public static final RegistrySupplier<Item> TERMINITE_HALBERD_HEAD       = registerHead("halberd", ToolMaterialCompat.TERMINITE);



    // Terminite
    public static final RegistrySupplier<Item> TERMINITE_LONGSWORD          = registerTerminite("longsword");
    public static final RegistrySupplier<Item> TERMINITE_TWINBLADE          = registerTerminite("twinblade");
    public static final RegistrySupplier<Item> TERMINITE_RAPIER             = registerTerminite("rapier");
    public static final RegistrySupplier<Item> TERMINITE_KATANA             = registerTerminite("katana");
    public static final RegistrySupplier<Item> TERMINITE_SAI                = registerTerminite("sai");
    public static final RegistrySupplier<Item> TERMINITE_SPEAR              = registerTerminite("spear");
    public static final RegistrySupplier<Item> TERMINITE_GLAIVE             = registerTerminite("glaive");
    public static final RegistrySupplier<Item> TERMINITE_WARGLAIVE          = registerTerminite("warglaive");
    public static final RegistrySupplier<Item> TERMINITE_CUTLASS            = registerTerminite("cutlass");
    public static final RegistrySupplier<Item> TERMINITE_CLAYMORE           = registerTerminite("claymore");
    public static final RegistrySupplier<Item> TERMINITE_GREATHAMMER        = registerTerminite("greathammer");
    public static final RegistrySupplier<Item> TERMINITE_GREATAXE           = registerTerminite("greataxe");
    public static final RegistrySupplier<Item> TERMINITE_CHAKRAM            = registerTerminite("chakram");
    public static final RegistrySupplier<Item> TERMINITE_SCYTHE             = registerTerminite("scythe");
    public static final RegistrySupplier<Item> TERMINITE_HALBERD            = registerTerminite("halberd");

    // Thallasium Heads
    public static final RegistrySupplier<Item> THALLASIUM_LONGSWORD_HEAD    = registerHead("longsword", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_TWINBLADE_HEAD    = registerHead("twinblade", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_RAPIER_HEAD       = registerHead("rapier", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_KATANA_HEAD       = registerHead("katana", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_SAI_HEAD          = registerHead("sai", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_SPEAR_HEAD        = registerHead("spear", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_GLAIVE_HEAD       = registerHead("glaive", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_WARGLAIVE_HEAD    = registerHead("warglaive", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_CUTLASS_HEAD      = registerHead("cutlass", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_CLAYMORE_HEAD     = registerHead("claymore", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_GREATHAMMER_HEAD  = registerHead("greathammer", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_GREATAXE_HEAD     = registerHead("greataxe", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_CHAKRAM_HEAD      = registerHead("chakram", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_SCYTHE_HEAD       = registerHead("scythe", ToolMaterialCompat.THALLASIUM);
    public static final RegistrySupplier<Item> THALLASIUM_HALBERD_HEAD      = registerHead("halberd", ToolMaterialCompat.THALLASIUM);

    // Thallasium
    public static final RegistrySupplier<Item> THALLASIUM_LONGSWORD         = registerThallasium("longsword");
    public static final RegistrySupplier<Item> THALLASIUM_TWINBLADE         = registerThallasium("twinblade");
    public static final RegistrySupplier<Item> THALLASIUM_RAPIER            = registerThallasium("rapier");
    public static final RegistrySupplier<Item> THALLASIUM_KATANA            = registerThallasium("katana");
    public static final RegistrySupplier<Item> THALLASIUM_SAI               = registerThallasium("sai");
    public static final RegistrySupplier<Item> THALLASIUM_SPEAR             = registerThallasium("spear");
    public static final RegistrySupplier<Item> THALLASIUM_GLAIVE            = registerThallasium("glaive");
    public static final RegistrySupplier<Item> THALLASIUM_WARGLAIVE         = registerThallasium("warglaive");
    public static final RegistrySupplier<Item> THALLASIUM_CUTLASS           = registerThallasium("cutlass");
    public static final RegistrySupplier<Item> THALLASIUM_CLAYMORE          = registerThallasium("claymore");
    public static final RegistrySupplier<Item> THALLASIUM_GREATHAMMER       = registerThallasium("greathammer");
    public static final RegistrySupplier<Item> THALLASIUM_GREATAXE          = registerThallasium("greataxe");
    public static final RegistrySupplier<Item> THALLASIUM_CHAKRAM           = registerThallasium("chakram");
    public static final RegistrySupplier<Item> THALLASIUM_SCYTHE            = registerThallasium("scythe");
    public static final RegistrySupplier<Item> THALLASIUM_HALBERD           = registerThallasium("halberd");

    private static RegistrySupplier<Item> registerHead(String id, ToolMaterialCompat tier) {
        return BETTER_END_ITEMS.register("betterend/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" + id + "_head", ()->
                new Item(new Item.Settings().arch$tab(KnavesCommon.KNAVESNEEDS)));
    }

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod) {
        return BETTER_END_ITEMS.register("betterend/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    private static RegistrySupplier<Item> registerAeternium(String id) {
        return registerMaterial(id, ToolMaterialCompat.AETERNIUM, KnavesConfig.AETERNIUM_MOD);
    }

    private static RegistrySupplier<Item> registerTerminite(String id) {
        return registerMaterial(id, ToolMaterialCompat.TERMINITE, KnavesConfig.TERMINITE_MOD);
    }

    private static RegistrySupplier<Item> registerThallasium(String id) {
        return registerMaterial(id, ToolMaterialCompat.THALLASIUM, KnavesConfig.THALLASIUM_MOD);
    }
}
