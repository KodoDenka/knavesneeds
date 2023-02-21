package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class BlueSkiesAdditionsRegister {

    public static final DeferredRegister<Item> BLUE_SKIES_ITEMS = DeferredRegister.create(KnavesCommon.MOD_ID, Registry.ITEM_KEY);

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

    private static RegistrySupplier<Item> registerMaterial(String id, ToolMaterialCompat tier, int materialMod, String... repairIngredient) {
        return BLUE_SKIES_ITEMS.register(tier.toString().toLowerCase(Locale.ROOT) + "/" +
                tier.toString().toLowerCase(Locale.ROOT) + "_" + id, ()->
                new KnavesSwordItem(tier, materialMod + CompatHelper.getDamageMod(id),
                        CompatHelper.getAttackSpeedMod(id), repairIngredient));
    }

    private static RegistrySupplier<Item> registerAquite(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:aquite");
    }

    private static RegistrySupplier<Item> registerBluebrightWood(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:bluebright_planks");
    }

    private static RegistrySupplier<Item> registerCharoite(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:charoite");
    }

    private static RegistrySupplier<Item> registerCherryWood(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:cherry_planks");
    }

    private static RegistrySupplier<Item> registerDiopside(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:diopside_gem");
    }

    private static RegistrySupplier<Item> registerDuskWood(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:dusk_planks");
    }

    private static RegistrySupplier<Item> registerFrostbrightWood(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:frostbright_planks");
    }

    private static RegistrySupplier<Item> registerHorizonite(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:horizonite_ingot");
    }

    private static RegistrySupplier<Item> registerLunarStone(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:lunar_cobblestone");
    }

    private static RegistrySupplier<Item> registerLunarWood(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:lunar_planks");
    }

    private static RegistrySupplier<Item> registerMapleWood(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:maple_planks");
    }

    private static RegistrySupplier<Item> registerPyrope(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:pyrope_gem");
    }

    private static RegistrySupplier<Item> registerStarlitWood(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:starlit_planks");
    }

    private static RegistrySupplier<Item> registerTurquoiseStone(String id) {
        return registerMaterial(id, ToolMaterialCompat.TURQUOISE_STONE, KnavesConfig.TURQUOISE_STONE_MOD, "blue_skies:turquoise_cobblestone");
    }

}
