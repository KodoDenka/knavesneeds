package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.swords.amethyst_imbuement.AmetrineSwordItem;
import net.knavesneeds.customitems.swords.amethyst_imbuement.GarnetSwordItem;
import net.knavesneeds.customitems.swords.amethyst_imbuement.GlowingSwordItem;
import net.knavesneeds.customitems.swords.amethyst_imbuement.SteelSwordItem;
import net.knavesneeds.helpers.CompatHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class AmethystImbuementRegister {

    public static final DeferredRegister<Item> AMETHYST_IMBUEMENT_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, RegistryKeys.ITEM);

    //Ametrine
    public static final RegistrySupplier<Item> AMETRINE_LONGSWORD          = registerAmetrine("longsword");
    public static final RegistrySupplier<Item> AMETRINE_TWINBLADE          = registerAmetrine("twinblade");
    public static final RegistrySupplier<Item> AMETRINE_RAPIER             = registerAmetrine("rapier");
    public static final RegistrySupplier<Item> AMETRINE_KATANA             = registerAmetrine("katana");
    public static final RegistrySupplier<Item> AMETRINE_SAI                = registerAmetrine("sai");
    public static final RegistrySupplier<Item> AMETRINE_SPEAR              = registerAmetrine("spear");
    public static final RegistrySupplier<Item> AMETRINE_GLAIVE             = registerAmetrine("glaive");
    public static final RegistrySupplier<Item> AMETRINE_WARGLAIVE          = registerAmetrine("warglaive");
    public static final RegistrySupplier<Item> AMETRINE_CUTLASS            = registerAmetrine("cutlass");
    public static final RegistrySupplier<Item> AMETRINE_CLAYMORE           = registerAmetrine("claymore");
    public static final RegistrySupplier<Item> AMETRINE_GREATHAMMER        = registerAmetrine("greathammer");
    public static final RegistrySupplier<Item> AMETRINE_GREATAXE           = registerAmetrine("greataxe");
    public static final RegistrySupplier<Item> AMETRINE_CHAKRAM            = registerAmetrine("chakram");
    public static final RegistrySupplier<Item> AMETRINE_SCYTHE             = registerAmetrine("scythe");
    public static final RegistrySupplier<Item> AMETRINE_HALBERD            = registerAmetrine("halberd");

    private static RegistrySupplier<Item> registerAmetrine(String id) {
        return AMETHYST_IMBUEMENT_ITEMS.register("amethyst_imbuement/" +
                ToolMaterialCompat.AMETRINE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new AmetrineSwordItem(ToolMaterialCompat.AMETRINE, KnavesCommon.amethystImbuementConfig.AMETRINE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    //Garnet
    public static final RegistrySupplier<Item> GARNET_LONGSWORD            = registerGarnet("longsword");
    public static final RegistrySupplier<Item> GARNET_TWINBLADE            = registerGarnet("twinblade");
    public static final RegistrySupplier<Item> GARNET_RAPIER               = registerGarnet("rapier");
    public static final RegistrySupplier<Item> GARNET_KATANA               = registerGarnet("katana");
    public static final RegistrySupplier<Item> GARNET_SAI                  = registerGarnet("sai");
    public static final RegistrySupplier<Item> GARNET_SPEAR                = registerGarnet("spear");
    public static final RegistrySupplier<Item> GARNET_GLAIVE               = registerGarnet("glaive");
    public static final RegistrySupplier<Item> GARNET_WARGLAIVE            = registerGarnet("warglaive");
    public static final RegistrySupplier<Item> GARNET_CUTLASS              = registerGarnet("cutlass");
    public static final RegistrySupplier<Item> GARNET_CLAYMORE             = registerGarnet("claymore");
    public static final RegistrySupplier<Item> GARNET_GREATHAMMER          = registerGarnet("greathammer");
    public static final RegistrySupplier<Item> GARNET_GREATAXE             = registerGarnet("greataxe");
    public static final RegistrySupplier<Item> GARNET_CHAKRAM              = registerGarnet("chakram");
    public static final RegistrySupplier<Item> GARNET_SCYTHE               = registerGarnet("scythe");
    public static final RegistrySupplier<Item> GARNET_HALBERD              = registerGarnet("halberd");

    private static RegistrySupplier<Item> registerGarnet(String id) {
        return AMETHYST_IMBUEMENT_ITEMS.register("amethyst_imbuement/" +
                ToolMaterialCompat.GARNET.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new GarnetSwordItem(ToolMaterialCompat.GARNET, KnavesCommon.amethystImbuementConfig.GARNET_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    //Glowing
    public static final RegistrySupplier<Item> GLOWING_LONGSWORD            = registerGlowing("longsword");
    public static final RegistrySupplier<Item> GLOWING_TWINBLADE            = registerGlowing("twinblade");
    public static final RegistrySupplier<Item> GLOWING_RAPIER               = registerGlowing("rapier");
    public static final RegistrySupplier<Item> GLOWING_KATANA               = registerGlowing("katana");
    public static final RegistrySupplier<Item> GLOWING_SAI                  = registerGlowing("sai");
    public static final RegistrySupplier<Item> GLOWING_SPEAR                = registerGlowing("spear");
    public static final RegistrySupplier<Item> GLOWING_GLAIVE               = registerGlowing("glaive");
    public static final RegistrySupplier<Item> GLOWING_WARGLAIVE            = registerGlowing("warglaive");
    public static final RegistrySupplier<Item> GLOWING_CUTLASS              = registerGlowing("cutlass");
    public static final RegistrySupplier<Item> GLOWING_CLAYMORE             = registerGlowing("claymore");
    public static final RegistrySupplier<Item> GLOWING_GREATHAMMER          = registerGlowing("greathammer");
    public static final RegistrySupplier<Item> GLOWING_GREATAXE             = registerGlowing("greataxe");
    public static final RegistrySupplier<Item> GLOWING_CHAKRAM              = registerGlowing("chakram");
    public static final RegistrySupplier<Item> GLOWING_SCYTHE               = registerGlowing("scythe");
    public static final RegistrySupplier<Item> GLOWING_HALBERD              = registerGlowing("halberd");

    private static RegistrySupplier<Item> registerGlowing(String id) {
        return AMETHYST_IMBUEMENT_ITEMS.register("amethyst_imbuement/" +
                ToolMaterialCompat.GLOWING.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new GlowingSwordItem(ToolMaterialCompat.GLOWING, KnavesCommon.amethystImbuementConfig.GLOWING_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    //Steel
    public static final RegistrySupplier<Item> STEEL_LONGSWORD              = registerSteel("longsword");
    public static final RegistrySupplier<Item> STEEL_TWINBLADE              = registerSteel("twinblade");
    public static final RegistrySupplier<Item> STEEL_RAPIER                 = registerSteel("rapier");
    public static final RegistrySupplier<Item> STEEL_KATANA                 = registerSteel("katana");
    public static final RegistrySupplier<Item> STEEL_SAI                    = registerSteel("sai");
    public static final RegistrySupplier<Item> STEEL_SPEAR                  = registerSteel("spear");
    public static final RegistrySupplier<Item> STEEL_GLAIVE                 = registerSteel("glaive");
    public static final RegistrySupplier<Item> STEEL_WARGLAIVE              = registerSteel("warglaive");
    public static final RegistrySupplier<Item> STEEL_CUTLASS                = registerSteel("cutlass");
    public static final RegistrySupplier<Item> STEEL_CLAYMORE               = registerSteel("claymore");
    public static final RegistrySupplier<Item> STEEL_GREATHAMMER            = registerSteel("greathammer");
    public static final RegistrySupplier<Item> STEEL_GREATAXE               = registerSteel("greataxe");
    public static final RegistrySupplier<Item> STEEL_CHAKRAM                = registerSteel("chakram");
    public static final RegistrySupplier<Item> STEEL_SCYTHE                 = registerSteel("scythe");
    public static final RegistrySupplier<Item> STEEL_HALBERD                = registerSteel("halberd");

    private static RegistrySupplier<Item> registerSteel(String id) {
        return AMETHYST_IMBUEMENT_ITEMS.register("amethyst_imbuement/" +
                ToolMaterialCompat.STEEL.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new SteelSwordItem(ToolMaterialCompat.STEEL, KnavesCommon.amethystImbuementConfig.STEEL_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }
}
