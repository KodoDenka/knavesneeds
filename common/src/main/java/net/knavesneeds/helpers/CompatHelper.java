package net.knavesneeds.helpers;

import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.minecraft.item.Item;

import java.util.HashMap;

public class CompatHelper {


    public static int getDamageMod(String weaponType) {
        return DAMAGE_MODS.get(weaponType);
    }

    public static float getAttackSpeedMod(String weaponType) {
        return ATTACK_SPEED_MODS.get(weaponType);
    }

    private static final HashMap<String, Integer> DAMAGE_MODS = new HashMap<>();
    private static final HashMap<String, Float> ATTACK_SPEED_MODS = new HashMap<>();

    /**
    static {
        for (String string : List.of("longsword", "twinblade", "rapier", "katana", "sai", "spear", "glaive",
                "warglaive", "cutlass", "claymore", "greathammer", "greataxe", "chakram", "scythe", "halberd")) {
            DAMAGE_MODS.put(string, (int) KnavesSimplyConfig.getWeaponAttributes(string + "_positive_damage_modifier") -
                    (int) KnavesSimplyConfig.getWeaponAttributes(string + "_negative_damage_modifier"));
            ATTACK_SPEED_MODS.put(string, KnavesSimplyConfig.getWeaponAttributes(string + "_attackspeed"));
        }
    }
    **/


    static {
        DAMAGE_MODS.put("longsword", (int) (KnavesCommon.generalConfig.longsword_positiveDamageModifier - KnavesCommon.generalConfig.longsword_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("longsword", KnavesCommon.generalConfig.longsword_attackSpeed);

        DAMAGE_MODS.put("twinblade", (int) (KnavesCommon.generalConfig.twinblade_positiveDamageModifier - KnavesCommon.generalConfig.twinblade_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("twinblade", KnavesCommon.generalConfig.twinblade_attackSpeed);

        DAMAGE_MODS.put("rapier", (int) (KnavesCommon.generalConfig.rapier_positiveDamageModifier - KnavesCommon.generalConfig.rapier_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("rapier", KnavesCommon.generalConfig.rapier_attackSpeed);

        DAMAGE_MODS.put("katana", (int) (KnavesCommon.generalConfig.katana_positiveDamageModifier - KnavesCommon.generalConfig.katana_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("katana", KnavesCommon.generalConfig.katana_attackSpeed);

        DAMAGE_MODS.put("sai", (int) (KnavesCommon.generalConfig.sai_positiveDamageModifier - KnavesCommon.generalConfig.sai_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("sai", KnavesCommon.generalConfig.twinblade_attackSpeed);

        DAMAGE_MODS.put("spear", (int) (KnavesCommon.generalConfig.spear_positiveDamageModifier - KnavesCommon.generalConfig.spear_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("spear", KnavesCommon.generalConfig.spear_attackSpeed);

        DAMAGE_MODS.put("glaive", (int) (KnavesCommon.generalConfig.glaive_positiveDamageModifier - KnavesCommon.generalConfig.glaive_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("glaive", KnavesCommon.generalConfig.glaive_attackSpeed);

        DAMAGE_MODS.put("warglaive", (int) (KnavesCommon.generalConfig.warglaive_positiveDamageModifier - KnavesCommon.generalConfig.warglaive_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("warglaive", KnavesCommon.generalConfig.warglaive_attackSpeed);

        DAMAGE_MODS.put("cutlass", (int) (KnavesCommon.generalConfig.cutlass_positiveDamageModifier - KnavesCommon.generalConfig.cutlass_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("cutlass", KnavesCommon.generalConfig.cutlass_attackSpeed);

        DAMAGE_MODS.put("claymore", (int) (KnavesCommon.generalConfig.claymore_positiveDamageModifier - KnavesCommon.generalConfig.claymore_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("claymore", KnavesCommon.generalConfig.claymore_attackSpeed);

        DAMAGE_MODS.put("greathammer", (int) (KnavesCommon.generalConfig.greathammer_positiveDamageModifier - KnavesCommon.generalConfig.greathammer_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("greathammer", KnavesCommon.generalConfig.greathammer_attackSpeed);

        DAMAGE_MODS.put("greataxe", (int) (KnavesCommon.generalConfig.greataxe_positiveDamageModifier - KnavesCommon.generalConfig.greataxe_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("greataxe", KnavesCommon.generalConfig.greataxe_attackSpeed);

        DAMAGE_MODS.put("chakram", (int) (KnavesCommon.generalConfig.chakram_positiveDamageModifier - KnavesCommon.generalConfig.chakram_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("chakram", KnavesCommon.generalConfig.chakram_attackSpeed);

        DAMAGE_MODS.put("scythe", (int) (KnavesCommon.generalConfig.scythe_positiveDamageModifier - KnavesCommon.generalConfig.scythe_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("scythe", KnavesCommon.generalConfig.scythe_attackSpeed);

        DAMAGE_MODS.put("halberd", (int) (KnavesCommon.generalConfig.halberd_positiveDamageModifier - KnavesCommon.generalConfig.halberd_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("halberd", KnavesCommon.generalConfig.halberd_attackSpeed);
    }

    public RegistrySupplier<Item> addCompat() {
        //
        return null;
    }

    public static void build() {
        //

    }
}
