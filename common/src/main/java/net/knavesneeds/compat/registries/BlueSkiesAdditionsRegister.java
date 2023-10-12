package net.knavesneeds.compat.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.swords.blue_skies.*;
import net.knavesneeds.helpers.CompatHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import java.util.Locale;

public class BlueSkiesAdditionsRegister {

    public static final DeferredRegister<Item> BLUE_SKIES_ITEMS = DeferredRegister.create("blue_skies", RegistryKeys.ITEM);

    // Aquite
    public static final RegistrySupplier<Item> AQUITE_LONGSWORD                 = registerAquite("longsword");
    public static final RegistrySupplier<Item> AQUITE_TWINBLADE                 = registerAquite("twinblade");
    public static final RegistrySupplier<Item> AQUITE_RAPIER                    = registerAquite("rapier");
    public static final RegistrySupplier<Item> AQUITE_KATANA                    = registerAquite("katana");
    public static final RegistrySupplier<Item> AQUITE_SAI                       = registerAquite("sai");
    public static final RegistrySupplier<Item> AQUITE_SPEAR                     = registerAquite("spear");
    public static final RegistrySupplier<Item> AQUITE_GLAIVE                    = registerAquite("glaive");
    public static final RegistrySupplier<Item> AQUITE_WARGLAIVE                 = registerAquite("warglaive");
    public static final RegistrySupplier<Item> AQUITE_CUTLASS                   = registerAquite("cutlass");
    public static final RegistrySupplier<Item> AQUITE_CLAYMORE                  = registerAquite("claymore");
    public static final RegistrySupplier<Item> AQUITE_GREATHAMMER               = registerAquite("greathammer");
    public static final RegistrySupplier<Item> AQUITE_GREATAXE                  = registerAquite("greataxe");
    public static final RegistrySupplier<Item> AQUITE_CHAKRAM                   = registerAquite("chakram");
    public static final RegistrySupplier<Item> AQUITE_SCYTHE                    = registerAquite("scythe");
    public static final RegistrySupplier<Item> AQUITE_HALBERD                   = registerAquite("halberd");

    private static RegistrySupplier<Item> registerAquite(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.AQUITE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new AquiteSwordItem(ToolMaterialCompat.AQUITE, KnavesCommon.blueSkiesConfig.AETERNIUM_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Bluebright Wood
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_LONGSWORD        = registerBluebrightWood("longsword");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_TWINBLADE        = registerBluebrightWood("twinblade");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_RAPIER           = registerBluebrightWood("rapier");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_KATANA           = registerBluebrightWood("katana");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_SAI              = registerBluebrightWood("sai");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_SPEAR            = registerBluebrightWood("spear");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_GLAIVE           = registerBluebrightWood("glaive");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_WARGLAIVE        = registerBluebrightWood("warglaive");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_CUTLASS          = registerBluebrightWood("cutlass");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_CLAYMORE         = registerBluebrightWood("claymore");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_GREATHAMMER      = registerBluebrightWood("greathammer");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_GREATAXE         = registerBluebrightWood("greataxe");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_CHAKRAM          = registerBluebrightWood("chakram");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_SCYTHE           = registerBluebrightWood("scythe");
    public static final RegistrySupplier<Item> BLUEBRIGHT_WOOD_HALBERD          = registerBluebrightWood("halberd");

    private static RegistrySupplier<Item> registerBluebrightWood(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.BLUEBRIGHT_WOOD.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new BluebrightWoodSwordItem(ToolMaterialCompat.BLUEBRIGHT_WOOD, KnavesCommon.blueSkiesConfig.BLUEBRIGHT_WOOD_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Charoite
    public static final RegistrySupplier<Item> CHAROITE_LONGSWORD               = registerCharoite("longsword");
    public static final RegistrySupplier<Item> CHAROITE_TWINBLADE               = registerCharoite("twinblade");
    public static final RegistrySupplier<Item> CHAROITE_RAPIER                  = registerCharoite("rapier");
    public static final RegistrySupplier<Item> CHAROITE_KATANA                  = registerCharoite("katana");
    public static final RegistrySupplier<Item> CHAROITE_SAI                     = registerCharoite("sai");
    public static final RegistrySupplier<Item> CHAROITE_SPEAR                   = registerCharoite("spear");
    public static final RegistrySupplier<Item> CHAROITE_GLAIVE                  = registerCharoite("glaive");
    public static final RegistrySupplier<Item> CHAROITE_WARGLAIVE               = registerCharoite("warglaive");
    public static final RegistrySupplier<Item> CHAROITE_CUTLASS                 = registerCharoite("cutlass");
    public static final RegistrySupplier<Item> CHAROITE_CLAYMORE                = registerCharoite("claymore");
    public static final RegistrySupplier<Item> CHAROITE_GREATHAMMER             = registerCharoite("greathammer");
    public static final RegistrySupplier<Item> CHAROITE_GREATAXE                = registerCharoite("greataxe");
    public static final RegistrySupplier<Item> CHAROITE_CHAKRAM                 = registerCharoite("chakram");
    public static final RegistrySupplier<Item> CHAROITE_SCYTHE                  = registerCharoite("scythe");
    public static final RegistrySupplier<Item> CHAROITE_HALBERD                 = registerCharoite("halberd");

    private static RegistrySupplier<Item> registerCharoite(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.CHAROITE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new CharoiteSwordItem(ToolMaterialCompat.CHAROITE, KnavesCommon.blueSkiesConfig.CHAROITE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Cherry Wood
    public static final RegistrySupplier<Item> CHERRY_WOOD_LONGSWORD            = registerCherryWood("longsword");
    public static final RegistrySupplier<Item> CHERRY_WOOD_TWINBLADE            = registerCherryWood("twinblade");
    public static final RegistrySupplier<Item> CHERRY_WOOD_RAPIER               = registerCherryWood("rapier");
    public static final RegistrySupplier<Item> CHERRY_WOOD_KATANA               = registerCherryWood("katana");
    public static final RegistrySupplier<Item> CHERRY_WOOD_SAI                  = registerCherryWood("sai");
    public static final RegistrySupplier<Item> CHERRY_WOOD_SPEAR                = registerCherryWood("spear");
    public static final RegistrySupplier<Item> CHERRY_WOOD_GLAIVE               = registerCherryWood("glaive");
    public static final RegistrySupplier<Item> CHERRY_WOOD_WARGLAIVE            = registerCherryWood("warglaive");
    public static final RegistrySupplier<Item> CHERRY_WOOD_CUTLASS              = registerCherryWood("cutlass");
    public static final RegistrySupplier<Item> CHERRY_WOOD_CLAYMORE             = registerCherryWood("claymore");
    public static final RegistrySupplier<Item> CHERRY_WOOD_GREATHAMMER          = registerCherryWood("greathammer");
    public static final RegistrySupplier<Item> CHERRY_WOOD_GREATAXE             = registerCherryWood("greataxe");
    public static final RegistrySupplier<Item> CHERRY_WOOD_CHAKRAM              = registerCherryWood("chakram");
    public static final RegistrySupplier<Item> CHERRY_WOOD_SCYTHE               = registerCherryWood("scythe");
    public static final RegistrySupplier<Item> CHERRY_WOOD_HALBERD              = registerCherryWood("halberd");

    private static RegistrySupplier<Item> registerCherryWood(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.CHERRY_WOOD.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new CherryWoodSwordItem(ToolMaterialCompat.CHERRY_WOOD, KnavesCommon.blueSkiesConfig.CHERRY_WOOD_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Diopside
    public static final RegistrySupplier<Item> DIOPSIDE_LONGSWORD               = registerDiopside("longsword");
    public static final RegistrySupplier<Item> DIOPSIDE_TWINBLADE               = registerDiopside("twinblade");
    public static final RegistrySupplier<Item> DIOPSIDE_RAPIER                  = registerDiopside("rapier");
    public static final RegistrySupplier<Item> DIOPSIDE_KATANA                  = registerDiopside("katana");
    public static final RegistrySupplier<Item> DIOPSIDE_SAI                     = registerDiopside("sai");
    public static final RegistrySupplier<Item> DIOPSIDE_SPEAR                   = registerDiopside("spear");
    public static final RegistrySupplier<Item> DIOPSIDE_GLAIVE                  = registerDiopside("glaive");
    public static final RegistrySupplier<Item> DIOPSIDE_WARGLAIVE               = registerDiopside("warglaive");
    public static final RegistrySupplier<Item> DIOPSIDE_CUTLASS                 = registerDiopside("cutlass");
    public static final RegistrySupplier<Item> DIOPSIDE_CLAYMORE                = registerDiopside("claymore");
    public static final RegistrySupplier<Item> DIOPSIDE_GREATHAMMER             = registerDiopside("greathammer");
    public static final RegistrySupplier<Item> DIOPSIDE_GREATAXE                = registerDiopside("greataxe");
    public static final RegistrySupplier<Item> DIOPSIDE_CHAKRAM                 = registerDiopside("chakram");
    public static final RegistrySupplier<Item> DIOPSIDE_SCYTHE                  = registerDiopside("scythe");
    public static final RegistrySupplier<Item> DIOPSIDE_HALBERD                 = registerDiopside("halberd");

    private static RegistrySupplier<Item> registerDiopside(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.DIOPSIDE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new DiopsideSwordItem(ToolMaterialCompat.DIOPSIDE, KnavesCommon.blueSkiesConfig.DIOPSIDE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id) - 0.4F));
    }

    // Dusk Wood
    public static final RegistrySupplier<Item> DUSK_WOOD_LONGSWORD              = registerDuskWood("longsword");
    public static final RegistrySupplier<Item> DUSK_WOOD_TWINBLADE              = registerDuskWood("twinblade");
    public static final RegistrySupplier<Item> DUSK_WOOD_RAPIER                 = registerDuskWood("rapier");
    public static final RegistrySupplier<Item> DUSK_WOOD_KATANA                 = registerDuskWood("katana");
    public static final RegistrySupplier<Item> DUSK_WOOD_SAI                    = registerDuskWood("sai");
    public static final RegistrySupplier<Item> DUSK_WOOD_SPEAR                  = registerDuskWood("spear");
    public static final RegistrySupplier<Item> DUSK_WOOD_GLAIVE                 = registerDuskWood("glaive");
    public static final RegistrySupplier<Item> DUSK_WOOD_WARGLAIVE              = registerDuskWood("warglaive");
    public static final RegistrySupplier<Item> DUSK_WOOD_CUTLASS                = registerDuskWood("cutlass");
    public static final RegistrySupplier<Item> DUSK_WOOD_CLAYMORE               = registerDuskWood("claymore");
    public static final RegistrySupplier<Item> DUSK_WOOD_GREATHAMMER            = registerDuskWood("greathammer");
    public static final RegistrySupplier<Item> DUSK_WOOD_GREATAXE               = registerDuskWood("greataxe");
    public static final RegistrySupplier<Item> DUSK_WOOD_CHAKRAM                = registerDuskWood("chakram");
    public static final RegistrySupplier<Item> DUSK_WOOD_SCYTHE                 = registerDuskWood("scythe");
    public static final RegistrySupplier<Item> DUSK_WOOD_HALBERD                = registerDuskWood("halberd");

    private static RegistrySupplier<Item> registerDuskWood(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.DUSK_WOOD.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new DuskWoodSwordItem(ToolMaterialCompat.DUSK_WOOD, KnavesCommon.blueSkiesConfig.DUSK_WOOD_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Frostbright Wood
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_LONGSWORD       = registerFrostbrightWood("longsword");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_TWINBLADE       = registerFrostbrightWood("twinblade");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_RAPIER          = registerFrostbrightWood("rapier");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_KATANA          = registerFrostbrightWood("katana");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_SAI             = registerFrostbrightWood("sai");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_SPEAR           = registerFrostbrightWood("spear");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_GLAIVE          = registerFrostbrightWood("glaive");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_WARGLAIVE       = registerFrostbrightWood("warglaive");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_CUTLASS         = registerFrostbrightWood("cutlass");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_CLAYMORE        = registerFrostbrightWood("claymore");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_GREATHAMMER     = registerFrostbrightWood("greathammer");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_GREATAXE        = registerFrostbrightWood("greataxe");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_CHAKRAM         = registerFrostbrightWood("chakram");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_SCYTHE          = registerFrostbrightWood("scythe");
    public static final RegistrySupplier<Item> FROSTBRIGHT_WOOD_HALBERD         = registerFrostbrightWood("halberd");

    private static RegistrySupplier<Item> registerFrostbrightWood(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.FROSTBRIGHT_WOOD.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new FrostbrightWoodSwordItem(ToolMaterialCompat.FROSTBRIGHT_WOOD, KnavesCommon.blueSkiesConfig.FROSTBRIGHT_WOOD_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Horizonite
    public static final RegistrySupplier<Item> HORIZONITE_LONGSWORD             = registerHorizonite("longsword");
    public static final RegistrySupplier<Item> HORIZONITE_TWINBLADE             = registerHorizonite("twinblade");
    public static final RegistrySupplier<Item> HORIZONITE_RAPIER                = registerHorizonite("rapier");
    public static final RegistrySupplier<Item> HORIZONITE_KATANA                = registerHorizonite("katana");
    public static final RegistrySupplier<Item> HORIZONITE_SAI                   = registerHorizonite("sai");
    public static final RegistrySupplier<Item> HORIZONITE_SPEAR                 = registerHorizonite("spear");
    public static final RegistrySupplier<Item> HORIZONITE_GLAIVE                = registerHorizonite("glaive");
    public static final RegistrySupplier<Item> HORIZONITE_WARGLAIVE             = registerHorizonite("warglaive");
    public static final RegistrySupplier<Item> HORIZONITE_CUTLASS               = registerHorizonite("cutlass");
    public static final RegistrySupplier<Item> HORIZONITE_CLAYMORE              = registerHorizonite("claymore");
    public static final RegistrySupplier<Item> HORIZONITE_GREATHAMMER           = registerHorizonite("greathammer");
    public static final RegistrySupplier<Item> HORIZONITE_GREATAXE              = registerHorizonite("greataxe");
    public static final RegistrySupplier<Item> HORIZONITE_CHAKRAM               = registerHorizonite("chakram");
    public static final RegistrySupplier<Item> HORIZONITE_SCYTHE                = registerHorizonite("scythe");
    public static final RegistrySupplier<Item> HORIZONITE_HALBERD               = registerHorizonite("halberd");

    private static RegistrySupplier<Item> registerHorizonite(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.HORIZONITE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new HorizoniteSwordItem(ToolMaterialCompat.HORIZONITE, KnavesCommon.blueSkiesConfig.HORIZONITE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Lunar Stone
    public static final RegistrySupplier<Item> LUNAR_STONE_LONGSWORD            = registerLunarStone("longsword");
    public static final RegistrySupplier<Item> LUNAR_STONE_TWINBLADE            = registerLunarStone("twinblade");
    public static final RegistrySupplier<Item> LUNAR_STONE_RAPIER               = registerLunarStone("rapier");
    public static final RegistrySupplier<Item> LUNAR_STONE_KATANA               = registerLunarStone("katana");
    public static final RegistrySupplier<Item> LUNAR_STONE_SAI                  = registerLunarStone("sai");
    public static final RegistrySupplier<Item> LUNAR_STONE_SPEAR                = registerLunarStone("spear");
    public static final RegistrySupplier<Item> LUNAR_STONE_GLAIVE               = registerLunarStone("glaive");
    public static final RegistrySupplier<Item> LUNAR_STONE_WARGLAIVE            = registerLunarStone("warglaive");
    public static final RegistrySupplier<Item> LUNAR_STONE_CUTLASS              = registerLunarStone("cutlass");
    public static final RegistrySupplier<Item> LUNAR_STONE_CLAYMORE             = registerLunarStone("claymore");
    public static final RegistrySupplier<Item> LUNAR_STONE_GREATHAMMER          = registerLunarStone("greathammer");
    public static final RegistrySupplier<Item> LUNAR_STONE_GREATAXE             = registerLunarStone("greataxe");
    public static final RegistrySupplier<Item> LUNAR_STONE_CHAKRAM              = registerLunarStone("chakram");
    public static final RegistrySupplier<Item> LUNAR_STONE_SCYTHE               = registerLunarStone("scythe");
    public static final RegistrySupplier<Item> LUNAR_STONE_HALBERD              = registerLunarStone("halberd");

    private static RegistrySupplier<Item> registerLunarStone(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.LUNAR_STONE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new LunarStoneSwordItem(ToolMaterialCompat.LUNAR_STONE, KnavesCommon.blueSkiesConfig.LUNAR_STONE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Lunar Wood
    public static final RegistrySupplier<Item> LUNAR_WOOD_LONGSWORD             = registerLunarWood("longsword");
    public static final RegistrySupplier<Item> LUNAR_WOOD_TWINBLADE             = registerLunarWood("twinblade");
    public static final RegistrySupplier<Item> LUNAR_WOOD_RAPIER                = registerLunarWood("rapier");
    public static final RegistrySupplier<Item> LUNAR_WOOD_KATANA                = registerLunarWood("katana");
    public static final RegistrySupplier<Item> LUNAR_WOOD_SAI                   = registerLunarWood("sai");
    public static final RegistrySupplier<Item> LUNAR_WOOD_SPEAR                 = registerLunarWood("spear");
    public static final RegistrySupplier<Item> LUNAR_WOOD_GLAIVE                = registerLunarWood("glaive");
    public static final RegistrySupplier<Item> LUNAR_WOOD_WARGLAIVE             = registerLunarWood("warglaive");
    public static final RegistrySupplier<Item> LUNAR_WOOD_CUTLASS               = registerLunarWood("cutlass");
    public static final RegistrySupplier<Item> LUNAR_WOOD_CLAYMORE              = registerLunarWood("claymore");
    public static final RegistrySupplier<Item> LUNAR_WOOD_GREATHAMMER           = registerLunarWood("greathammer");
    public static final RegistrySupplier<Item> LUNAR_WOOD_GREATAXE              = registerLunarWood("greataxe");
    public static final RegistrySupplier<Item> LUNAR_WOOD_CHAKRAM               = registerLunarWood("chakram");
    public static final RegistrySupplier<Item> LUNAR_WOOD_SCYTHE                = registerLunarWood("scythe");
    public static final RegistrySupplier<Item> LUNAR_WOOD_HALBERD               = registerLunarWood("halberd");

    private static RegistrySupplier<Item> registerLunarWood(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.LUNAR_WOOD.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new LunarWoodSwordItem(ToolMaterialCompat.LUNAR_WOOD, KnavesCommon.blueSkiesConfig.LUNAR_WOOD_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Maple Wood
    public static final RegistrySupplier<Item> MAPLE_WOOD_LONGSWORD             = registerMapleWood("longsword");
    public static final RegistrySupplier<Item> MAPLE_WOOD_TWINBLADE             = registerMapleWood("twinblade");
    public static final RegistrySupplier<Item> MAPLE_WOOD_RAPIER                = registerMapleWood("rapier");
    public static final RegistrySupplier<Item> MAPLE_WOOD_KATANA                = registerMapleWood("katana");
    public static final RegistrySupplier<Item> MAPLE_WOOD_SAI                   = registerMapleWood("sai");
    public static final RegistrySupplier<Item> MAPLE_WOOD_SPEAR                 = registerMapleWood("spear");
    public static final RegistrySupplier<Item> MAPLE_WOOD_GLAIVE                = registerMapleWood("glaive");
    public static final RegistrySupplier<Item> MAPLE_WOOD_WARGLAIVE             = registerMapleWood("warglaive");
    public static final RegistrySupplier<Item> MAPLE_WOOD_CUTLASS               = registerMapleWood("cutlass");
    public static final RegistrySupplier<Item> MAPLE_WOOD_CLAYMORE              = registerMapleWood("claymore");
    public static final RegistrySupplier<Item> MAPLE_WOOD_GREATHAMMER           = registerMapleWood("greathammer");
    public static final RegistrySupplier<Item> MAPLE_WOOD_GREATAXE              = registerMapleWood("greataxe");
    public static final RegistrySupplier<Item> MAPLE_WOOD_CHAKRAM               = registerMapleWood("chakram");
    public static final RegistrySupplier<Item> MAPLE_WOOD_SCYTHE                = registerMapleWood("scythe");
    public static final RegistrySupplier<Item> MAPLE_WOOD_HALBERD               = registerMapleWood("halberd");

    private static RegistrySupplier<Item> registerMapleWood(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.MAPLE_WOOD.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new MapleWoodSwordItem(ToolMaterialCompat.MAPLE_WOOD, KnavesCommon.blueSkiesConfig.MAPLE_WOOD_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Pyrope
    public static final RegistrySupplier<Item> PYROPE_LONGSWORD                 = registerPyrope("longsword");
    public static final RegistrySupplier<Item> PYROPE_TWINBLADE                 = registerPyrope("twinblade");
    public static final RegistrySupplier<Item> PYROPE_RAPIER                    = registerPyrope("rapier");
    public static final RegistrySupplier<Item> PYROPE_KATANA                    = registerPyrope("katana");
    public static final RegistrySupplier<Item> PYROPE_SAI                       = registerPyrope("sai");
    public static final RegistrySupplier<Item> PYROPE_SPEAR                     = registerPyrope("spear");
    public static final RegistrySupplier<Item> PYROPE_GLAIVE                    = registerPyrope("glaive");
    public static final RegistrySupplier<Item> PYROPE_WARGLAIVE                 = registerPyrope("warglaive");
    public static final RegistrySupplier<Item> PYROPE_CUTLASS                   = registerPyrope("cutlass");
    public static final RegistrySupplier<Item> PYROPE_CLAYMORE                  = registerPyrope("claymore");
    public static final RegistrySupplier<Item> PYROPE_GREATHAMMER               = registerPyrope("greathammer");
    public static final RegistrySupplier<Item> PYROPE_GREATAXE                  = registerPyrope("greataxe");
    public static final RegistrySupplier<Item> PYROPE_CHAKRAM                   = registerPyrope("chakram");
    public static final RegistrySupplier<Item> PYROPE_SCYTHE                    = registerPyrope("scythe");
    public static final RegistrySupplier<Item> PYROPE_HALBERD                   = registerPyrope("halberd");

    private static RegistrySupplier<Item> registerPyrope(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.PYROPE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new PyropeSwordItem(ToolMaterialCompat.PYROPE, KnavesCommon.blueSkiesConfig.PYROPE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id) + 0.4F));
    }

    // Starlit Wood
    public static final RegistrySupplier<Item> STARLIT_WOOD_LONGSWORD           = registerStarlitWood("longsword");
    public static final RegistrySupplier<Item> STARLIT_WOOD_TWINBLADE           = registerStarlitWood("twinblade");
    public static final RegistrySupplier<Item> STARLIT_WOOD_RAPIER              = registerStarlitWood("rapier");
    public static final RegistrySupplier<Item> STARLIT_WOOD_KATANA              = registerStarlitWood("katana");
    public static final RegistrySupplier<Item> STARLIT_WOOD_SAI                 = registerStarlitWood("sai");
    public static final RegistrySupplier<Item> STARLIT_WOOD_SPEAR               = registerStarlitWood("spear");
    public static final RegistrySupplier<Item> STARLIT_WOOD_GLAIVE              = registerStarlitWood("glaive");
    public static final RegistrySupplier<Item> STARLIT_WOOD_WARGLAIVE           = registerStarlitWood("warglaive");
    public static final RegistrySupplier<Item> STARLIT_WOOD_CUTLASS             = registerStarlitWood("cutlass");
    public static final RegistrySupplier<Item> STARLIT_WOOD_CLAYMORE            = registerStarlitWood("claymore");
    public static final RegistrySupplier<Item> STARLIT_WOOD_GREATHAMMER         = registerStarlitWood("greathammer");
    public static final RegistrySupplier<Item> STARLIT_WOOD_GREATAXE            = registerStarlitWood("greataxe");
    public static final RegistrySupplier<Item> STARLIT_WOOD_CHAKRAM             = registerStarlitWood("chakram");
    public static final RegistrySupplier<Item> STARLIT_WOOD_SCYTHE              = registerStarlitWood("scythe");
    public static final RegistrySupplier<Item> STARLIT_WOOD_HALBERD             = registerStarlitWood("halberd");

    private static RegistrySupplier<Item> registerStarlitWood(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.STARLIT_WOOD.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new StarlitWoodSwordItem(ToolMaterialCompat.STARLIT_WOOD, KnavesCommon.blueSkiesConfig.STARLIT_WOOD_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }

    // Turquoise Stone
    public static final RegistrySupplier<Item> TURQUOISE_STONE_LONGSWORD        = registerTurquoiseStone("longsword");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_TWINBLADE        = registerTurquoiseStone("twinblade");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_RAPIER           = registerTurquoiseStone("rapier");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_KATANA           = registerTurquoiseStone("katana");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_SAI              = registerTurquoiseStone("sai");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_SPEAR            = registerTurquoiseStone("spear");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_GLAIVE           = registerTurquoiseStone("glaive");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_WARGLAIVE        = registerTurquoiseStone("warglaive");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_CUTLASS          = registerTurquoiseStone("cutlass");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_CLAYMORE         = registerTurquoiseStone("claymore");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_GREATHAMMER      = registerTurquoiseStone("greathammer");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_GREATAXE         = registerTurquoiseStone("greataxe");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_CHAKRAM          = registerTurquoiseStone("chakram");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_SCYTHE           = registerTurquoiseStone("scythe");
    public static final RegistrySupplier<Item> TURQUOISE_STONE_HALBERD          = registerTurquoiseStone("halberd");

    private static RegistrySupplier<Item> registerTurquoiseStone(String id) {
        return BLUE_SKIES_ITEMS.register(ToolMaterialCompat.TURQUOISE_STONE.toString().toLowerCase(Locale.ROOT) + "/" + id, ()->
                new TurquoiseStoneSwordItem(ToolMaterialCompat.TURQUOISE_STONE, KnavesCommon.blueSkiesConfig.TURQUOISE_STONE_MOD + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id)));
    }
}
