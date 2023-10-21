package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.swords.forbidden_arcanus.DracoArcanusSwordItem;
import net.knavesneeds.customitems.swords.forbidden_arcanus.ReinforcedDeorumSwordItem;
import net.knavesneeds.helpers.CompatHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class ForbiddenArcanusAdditionsRegister {

    public static final DeferredRegister<Item> FORBIDDEN_ARCANUS_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, RegistryKeys.ITEM);

    /**
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
    public static final RegistrySupplier<Item> DEORUM_HALBERD                   = registerDeorum("halberd");

    private static RegistrySupplier<Item> registerDeorum(String id) {
        return FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/" +
                ToolMaterialCompat.DEORUM.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new DeorumSwordItem(ToolMaterialCompat.DEORUM, KnavesCommon.forbiddenArcanusConfig.DEORUM_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }
     **/

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
    public static final RegistrySupplier<Item> DRACO_ARCANUS_HALBERD            = registerDracoArcanus("halberd");

    private static RegistrySupplier<Item> registerDracoArcanus(String id) {
        return FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/" +
                ToolMaterialCompat.DRACO_ARCANUS.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new DracoArcanusSwordItem(ToolMaterialCompat.DRACO_ARCANUS, KnavesCommon.forbiddenArcanusConfig.DRACO_ARCANUS_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

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
    public static final RegistrySupplier<Item> REINFORCE_DEORUM_HALBERD         = registerReinforcedDeorum("halberd");

    private static RegistrySupplier<Item> registerReinforcedDeorum(String id) {
        return FORBIDDEN_ARCANUS_ITEMS.register("forbidden_arcanus/" +
                ToolMaterialCompat.REINFORCED_DEORUM.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new ReinforcedDeorumSwordItem(ToolMaterialCompat.REINFORCED_DEORUM, KnavesCommon.forbiddenArcanusConfig.REINFORCED_DEORUM_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }
}