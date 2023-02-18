package net.knavesneeds.registry;

import net.knavesneeds.config.KanvesSimplyConfig;
import net.knavesneeds.config.KnavesConfig;

public class KnavesItemsRegistry {

    //weapon type modifiers.
    public static final int LONGSWORD_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("longsword_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("longsword_negative_damage_modifier");
    public static final float LONGSWORD_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("longsword_attackspeed");
    public static final int TWINBLADE_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("twinblade_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("twinblade_negative_damage_modifier");
    public static final float TWINBLADE_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("twinblade_attackspeed");
    public static final int RAPIER_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("rapier_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("rapier_negative_damage_modifier");
    public static final float RAPIER_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("rapier_attackspeed");
    public static final int KATANA_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("katana_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("katana_negative_damage_modifier");
    public static final float KATANA_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("katana_attackspeed");
    public static final int SAI_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("sai_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("sai_negative_damage_modifier");
    public static final float SAI_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("sai_attackspeed");
    public static final int SPEAR_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("spear_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("spear_negative_damage_modifier");
    public static final float SPEAR_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("spear_attackspeed");
    public static final int GLAIVE_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("glaive_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("glaive_negative_damage_modifier");
    public static final float GLAIVE_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("glaive_attackspeed");
    public static final int WARGLAIVE_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("warglaive_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("warglaive_negative_damage_modifier");
    public static final float WARGLAIVE_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("warglaive_attackspeed");
    public static final int CUTLASS_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("cutlass_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("cutlass_negative_damage_modifier");
    public static final float CUTLASS_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("cutlass_attackspeed");
    public static final int CLAYMORE_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("claymore_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("claymore_negative_damage_modifier");
    public static final float CLAYMORE_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("claymore_attackspeed");
    public static final int GREATAXE_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("greataxe_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("greataxe_negative_damage_modifier");
    public static final float GREATAXE_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("greataxe_attackspeed");
    public static final int GREATHAMMER_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("greathammer_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("greathammer_negative_damage_modifier");
    public static final float GREATHAMMER_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("greathammer_attackspeed");
    public static final int CHAKRAM_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("chakram_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("chakram_negative_damage_modifier");
    public static final float CHAKRAM_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("chakram_attackspeed");
    public static final int SCYTHE_DAMAGE_MOD = (int) KanvesSimplyConfig.getWeaponAttributes("scythe_positive_damage_modifier") + (int) KanvesSimplyConfig.getWeaponAttributes("scythe_negative_damage_modifier");
    public static final float SCYTHE_ATTACKSPEED = KanvesSimplyConfig.getWeaponAttributes("scythe_attackspeed");

    //Mod Tier damage modifier
    //Forbidden Arcanus
    public static final int DEORUM_MOD = KnavesConfig.DEORUM_MOD;
    public static final int DRACO_ARCANUS_MOD = KnavesConfig.DRACO_ARCANUS_MOD;
    public static final int REINFORCED_DEORUM_MOD = KnavesConfig.REINFORCED_DEORUM_MOD;

    //Blue Skies Ores
    public static final int AQUITE_MOD = KnavesConfig.AQUITE_MOD;
    public static final int CHAROITE_MOD = KnavesConfig.CHAROITE_MOD;
    public static final int DIOPSIDE_MOD = KnavesConfig.DIOPSIDE_MOD;
    public static final int HORIZONITE_MOD = KnavesConfig.HORIZONITE_MOD;
    public static final int PYROPE_MOD = KnavesConfig.PYROPE_MOD;

    //Blue Skies Stone
    public static final int LUNAR_STONE_MOD = KnavesConfig.LUNAR_STONE_MOD;
    public static final int TURQUOISE_STONE_MOD = KnavesConfig.TURQUOISE_STONE_MOD;

    //Blue Skies Wood
    public static final int BLUEBRIGHT_WOOD_MOD = KnavesConfig.BLUEBRIGHT_WOOD_MOD;
    public static final int CHERRY_WOOD_MOD = KnavesConfig.CHERRY_WOOD_MOD;
    public static final int DUSK_WOOD_MOD= KnavesConfig.DUSK_WOOD_MOD;
    public static final int FROSTBRIGHT_WOOD_MOD = KnavesConfig.FROSTBRIGHT_WOOD_MOD;
    public static final int LUNAR_WOOD_MOD = KnavesConfig.LUNAR_WOOD_MOD;
    public static final int MAPLE_WOOD_MOD = KnavesConfig.MAPLE_WOOD_MOD;
    public static final int STARLIT_WOOD_MOD = KnavesConfig.STARLIT_WOOD_MOD;

    //Plus The End
    public static final int ENDRONIUM_MOD = KnavesConfig.ENDRONIUM_MOD;

    //Twilight Forest
    public static final int STEELEAF_MOD = KnavesConfig.STEELEAF_MOD;
    public static final int IRONWOOD_MOD = KnavesConfig.IRONWOOD_MOD;
    public static final int FIERY_MOD= KnavesConfig.FIERY_MOD;
    public static final int KNIGHTMETAL_MOD = KnavesConfig.KNIGHTMETAL_MOD;

    //Undergarden
    public static final int CLOGGRUM_MOD = KnavesConfig.CLOGGRUM_MOD;
    public static final int FORGOTTEN_MOD = KnavesConfig.FORGOTTEN_MOD;
    public static final int FROSTSTEEL_MOD= KnavesConfig.FROSTSTEEL_MOD;
    public static final int UTHERIUM_MOD = KnavesConfig.UTHERIUM_MOD;

    //BetterEnd
    public static final int AETERNIUM_MOD = KnavesConfig.AETERNIUM_MOD;
    public static final int TERMINITE_MOD = KnavesConfig.TERMINITE_MOD;
    public static final int THALLASIUM_MOD = KnavesConfig.THALLASIUM_MOD;

    //BetterNether
    public static final int CINCINNASITE_MOD = KnavesConfig.CINCINNASITE_MOD;
    public static final int CINCINNASITE_DIAMOND_MOD = KnavesConfig.CINCINNASITE_DIAMOND_MOD;
    public static final int NETHER_RUBY_MOD = KnavesConfig.NETHER_RUBY_MOD;

    //SoulsLikeWeapons
    public static final int TRANSLUCENT_MOD = KnavesConfig.TRANSLUCENT_MOD;

}
