package net.knavesneeds.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


//Stolen code from Simply Swords
public class KnavesSimplyConfig {

    private static final HashMap<String, Float> WEAPON_OPTIONS = new LinkedHashMap<>();

    public static float getWeaponAttributes(String key) {
        if (!WEAPON_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return WEAPON_OPTIONS.get(key);
    }

    public static String readFile(File file) {
        String output = "";
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter("\\Z");
            output = scanner.next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static JsonObject getJsonObject(String json) {
        try {
            return new JsonParser().parse(json).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void loadConfig() {
        //System.out.println("Loading common Simply Swords config");
        JsonObject json;

        File f = new File("config/simplyswords/weapon_attributes.json5");

        if (f.exists()) {
            json = KnavesSimplyConfig.getJsonObject(KnavesSimplyConfig.readFile(f));
            for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
                WEAPON_OPTIONS.put(entry.getKey(), entry.getValue().getAsFloat());
            }
        }

        // Positive backup modifiers.
        WEAPON_OPTIONS.putIfAbsent("longsword_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("twinblade_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("rapier_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("katana_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("sai_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("spear_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("glaive_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("warglaive_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("cutlass_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("claymore_positive_damage_modifier", 2.0f);
        WEAPON_OPTIONS.putIfAbsent("greataxe_positive_damage_modifier", 3.0f);
        WEAPON_OPTIONS.putIfAbsent("greathammer_positive_damage_modifier", 4.0f);
        WEAPON_OPTIONS.putIfAbsent("chakram_positive_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("scythe_positive_damage_modifier", 1.0f);
        WEAPON_OPTIONS.putIfAbsent("halberd_positive_damage_modifier", 3.0f);

        // Negative backup modifiers.
        WEAPON_OPTIONS.putIfAbsent("longsword_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("twinblade_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("rapier_negative_damage_modifier", 1.0f);
        WEAPON_OPTIONS.putIfAbsent("katana_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("sai_negative_damage_modifier", 3.0f);
        WEAPON_OPTIONS.putIfAbsent("spear_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("glaive_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("warglaive_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("cutlass_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("claymore_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("greataxe_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("greathammer_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("chakram_negative_damage_modifier", 1.0f);
        WEAPON_OPTIONS.putIfAbsent("scythe_negative_damage_modifier", 0.0f);
        WEAPON_OPTIONS.putIfAbsent("halberd_negative_damage_modifier", 0.0f);

        // Attackspeed modifiers backup.
        WEAPON_OPTIONS.putIfAbsent("longsword_attackspeed", -2.4f);
        WEAPON_OPTIONS.putIfAbsent("twinblade_attackspeed", -2.0f);
        WEAPON_OPTIONS.putIfAbsent("rapier_attackspeed", -1.8f);
        WEAPON_OPTIONS.putIfAbsent("katana_attackspeed", -2.0f);
        WEAPON_OPTIONS.putIfAbsent("sai_attackspeed", -1.5f);
        WEAPON_OPTIONS.putIfAbsent("spear_attackspeed", -2.7f);
        WEAPON_OPTIONS.putIfAbsent("glaive_attackspeed", -2.6f);
        WEAPON_OPTIONS.putIfAbsent("warglaive_attackspeed", -2.2f);
        WEAPON_OPTIONS.putIfAbsent("cutlass_attackspeed", -2.0f);
        WEAPON_OPTIONS.putIfAbsent("claymore_attackspeed", -2.8f);
        WEAPON_OPTIONS.putIfAbsent("greataxe_attackspeed", -3.1f);
        WEAPON_OPTIONS.putIfAbsent("greathammer_attackspeed", -3.2f);
        WEAPON_OPTIONS.putIfAbsent("chakram_attackspeed", -3.0f);
        WEAPON_OPTIONS.putIfAbsent("scythe_attackspeed", -2.7f);
        WEAPON_OPTIONS.putIfAbsent("halberd_attackspeed", -2.8f);
    }
}

