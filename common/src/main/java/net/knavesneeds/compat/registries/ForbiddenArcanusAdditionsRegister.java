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

public class ForbiddenArcanusAdditionsRegister {

    public static final DeferredRegister<Item> FORBIDDEN_ARCANUS_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

    // Deorum
    // Should these be Slimec Items? There are no Deorum Items, but the Slimec Items are made from Deorum Ingots
    public static final RegistrySupplier<Item> DEORUM_LONGSWORD                 = registerDeorum("longsword");
    public static final RegistrySupplier<Item> DEORUM_TWINBLADE                 = registerDeorum("twinblade");
    public static final RegistrySupplier<Item> DEORUM_RAPIER                    = registerDeorum("rapier");
    public static final RegistrySupplier<Item> DEORUM_KATANA                    = registerDeorum("katana");
    public static final RegistrySupplier<Item> DEORUM_SAI                       = registerDeorum("sai");
    public static final RegistrySupplier<Item> DEORUM_SPEAR                     = registerDeorum("spear");
    public static final RegistrySupplier<Item> DEORUM_GLAIVE                    = registerDeorum("glaive");
    public static final RegistrySupplier<Item> DEORUM_WARGLAIVE                 = registerDeorum("warglaive");
    public static final RegistrySupplier<Item> DEORUM_CUTLASS                   = registerDeorum("cutlass");
    public static final RegistrySupplier<Item> DEORUM_CLAYMORE                  = registerDeorum("claymore");
    public static final RegistrySupplier<Item> DEORUM_GREATHAMMER               = registerDeorum("greathammer");
    public static final RegistrySupplier<Item> DEORUM_GREATAXE                  = registerDeorum("greataxe");
    public static final RegistrySupplier<Item> DEORUM_CHAKRAM                   = registerDeorum("chakram");
    public static final RegistrySupplier<Item> DEORUM_SCYTHE                    = registerDeorum("scythe");

    // Draco Arcanus
    public static final RegistrySupplier<Item> DRACO_ARCANUS_LONGSWORD          = registerDracoArcanus("longsword");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_TWINBLADE          = registerDracoArcanus("twinblade");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_RAPIER             = registerDracoArcanus("rapier");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_KATANA             = registerDracoArcanus("katana");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SAI                = registerDracoArcanus("sai");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SPEAR              = registerDracoArcanus("spear");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GLAIVE             = registerDracoArcanus("glaive");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_WARGLAIVE          = registerDracoArcanus("warglaive");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CUTLASS            = registerDracoArcanus("cutlass");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CLAYMORE           = registerDracoArcanus("claymore");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GREATHAMMER        = registerDracoArcanus("greathammer");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_GREATAXE           = registerDracoArcanus("greataxe");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_CHAKRAM            = registerDracoArcanus("chakram");
    public static final RegistrySupplier<Item> DRACO_ARCANUS_SCYTHE             = registerDracoArcanus("scythe");

    // Reinforced Deorum
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_LONGSWORD       = registerReinforcedDeorum("longsword");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_TWINBLADE       = registerReinforcedDeorum("twinblade");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_RAPIER          = registerReinforcedDeorum("rapier");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_KATANA          = registerReinforcedDeorum("katana");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_SAI             = registerReinforcedDeorum("sai");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_SPEAR           = registerReinforcedDeorum("spear");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_GLAIVE          = registerReinforcedDeorum("glaive");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_WARGLAIVE       = registerReinforcedDeorum("warglaive");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_CUTLASS         = registerReinforcedDeorum("cutlass");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_CLAYMORE        = registerReinforcedDeorum("claymore");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_GREATHAMMER     = registerReinforcedDeorum("greathammer");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_GREATAXE        = registerReinforcedDeorum("greataxe");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_CHAKRAM         = registerReinforcedDeorum("chakram");
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_SCYTHE          = registerReinforcedDeorum("scythe");

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod, String... repairIngredient) {
        return FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/" +
                tier.toString().toLowerCase(Locale.ROOT) + "/" +
                tier.toString().toLowerCase(Locale.ROOT) + "_" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id), repairIngredient));
    }

    private static RegistrySupplier<Item> registerDeorum(String id) {
        return registerMaterial(id, ToolMaterialCompat.DEORUM, KnavesConfig.DEORUM_MOD, "forbidden_arcanus:deorum_ingot");
    }

    private static RegistrySupplier<Item> registerDracoArcanus(String id) {
        return registerMaterial(id, ToolMaterialCompat.DRACO_ARCANUS, KnavesConfig.DRACO_ARCANUS_MOD, "forbidden_arcanus:dragon_scale");
    }

    private static RegistrySupplier<Item> registerReinforcedDeorum(String id) {
        return registerMaterial(id, ToolMaterialCompat.REINFORCED_DEORUM, KnavesConfig.REINFORCED_DEORUM_MOD, "forbidden_arcanus:stellarite_piece");
    }
}
