package net.knavesneeds.registry;

import net.knavesneeds.config.KanvesSimplyConfig;



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
    public static final int ARCANE_GOLDEN_MOD = 0;
    public static final int DRACO_ARCANUS_MOD = 0;
    public static final int REINFORCED_ARCANE_GOLDEN_MOD = 0;

    //Blue Skies Ores
    public static final int AQUITE_MOD = 0;
    public static final int CHAROITE_MOD = 0;
    public static final int DIOPSIDE_MOD = 0;
    public static final int HORIZONITE_MOD = 0;
    public static final int PYROPE_MOD = 0;

    //Blue Skies Stone
    public static final int LUNAR_STONE_MOD = 0;
    public static final int TURQUOISE_STONE_MOD = 0;

    //Blue Skies Wood
    public static final int BLUEBRIGHT_WOOD_MOD = 0;
    public static final int CHERRY_WOOD_MOD = 0;
    public static final int DUSK_WOOD_MOD= 0;
    public static final int FROSTBRIGHT_WOOD_MOD = 0;
    public static final int LUNAR_WOOD_MOD = 0;
    public static final int MAPLE_WOOD_MOD = 0;
    public static final int STARLIT_WOOD_MOD = 0;

    //Plus The End
    public static final int ENDRONIUM_MOD = 0;

    //Twilight Forest
    public static final int STEELEAF_MOD = 0;
    public static final int IRONWOOD_MOD = 0;
    public static final int FIERY_MOD= 0;
    public static final int KNIGHTMETAL_MOD = 0;

    //Undergarden
    public static final int CLOGGRUM_MOD = 0;
    public static final int FORGOTTEN_MOD = 0;
    public static final int FROSTSTEEL_MOD= 0;
    public static final int UTHERIUM_MOD = 0;

}
