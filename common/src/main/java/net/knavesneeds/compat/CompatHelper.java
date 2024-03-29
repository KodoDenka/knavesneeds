package net.knavesneeds.compat;

import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.config.KnavesSimplyConfig;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.List;

public class CompatHelper {


    public static int getDamageMod(String weaponType) {
        return DAMAGE_MODS.get(weaponType);
    }

    public static float getAttackSpeedMod(String weaponType) {
        return ATTACK_SPEED_MODS.get(weaponType);
    }

    private static final HashMap<String, Integer> DAMAGE_MODS = new HashMap<>();
    private static final HashMap<String, Float> ATTACK_SPEED_MODS = new HashMap<>();

    static {
        for (String string : List.of("longsword", "twinblade", "rapier", "katana", "sai", "spear", "glaive",
                "warglaive", "cutlass", "claymore", "greathammer", "greataxe", "chakram", "scythe", "halberd")) {
            DAMAGE_MODS.put(string, (int) KnavesSimplyConfig.getWeaponAttributes(string + "_positive_damage_modifier") -
                    (int) KnavesSimplyConfig.getWeaponAttributes(string + "_negative_damage_modifier"));
            ATTACK_SPEED_MODS.put(string, KnavesSimplyConfig.getWeaponAttributes(string + "_attackspeed"));
        }
    }

    public RegistrySupplier<Item> addCompat() {
        //
        return null;
    }

    public static void build() {
        //

    }
}
