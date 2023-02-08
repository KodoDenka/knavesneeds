package net.knavesneeds.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


//Stolen code from Simply Swords
public class KanvesSimplyConfig {

    private static final HashMap<String, Boolean> BOOLEAN_OPTIONS = new LinkedHashMap<>();
    private static final HashMap<String, Float> GENERAL_OPTIONS = new LinkedHashMap<>();
    private static final HashMap<String, Float> FLOAT_OPTIONS = new LinkedHashMap<>();
    private static final HashMap<String, Float> WEAPON_OPTIONS = new LinkedHashMap<>();

    public static boolean getBooleanValue(String key) {
        if (!BOOLEAN_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return BOOLEAN_OPTIONS.getOrDefault(key, null);
    }

    public static float getGeneralSettings(String key) {
        if (!GENERAL_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return GENERAL_OPTIONS.getOrDefault(key, null);
    }

    public static float getFloatValue(String key) {
        if (!FLOAT_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return FLOAT_OPTIONS.getOrDefault(key, null);
    }

    public static float getWeaponAttributes(String key) {
        if (!WEAPON_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return WEAPON_OPTIONS.get(key);
    }

    public static File createFile(String path, String contents, boolean overwrite) {
        File file = new File(path);
        if (file.exists() && !overwrite) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.setReadable(true);
        file.setWritable(true);
        file.setExecutable(true);
        if (contents == null || "".equals(contents)) {
            return file;
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(contents);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
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
        json = KanvesSimplyConfig.getJsonObject(KanvesSimplyConfig.readFile(new File("config/simplyswords/booleans.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            BOOLEAN_OPTIONS.put(entry.getKey(), entry.getValue().getAsBoolean());
        }

        json = KanvesSimplyConfig.getJsonObject(KanvesSimplyConfig.readFile(new File("config/simplyswords/general_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            GENERAL_OPTIONS.put(entry.getKey(), entry.getValue().getAsFloat());
        }

        json = KanvesSimplyConfig.getJsonObject(KanvesSimplyConfig.readFile(new File("config/simplyswords/effects_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            FLOAT_OPTIONS.put(entry.getKey(), entry.getValue().getAsFloat());
        }

        json = KanvesSimplyConfig.getJsonObject(KanvesSimplyConfig.readFile(new File("config/simplyswords/weapon_attributes.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            WEAPON_OPTIONS.put(entry.getKey(), entry.getValue().getAsFloat());
        }

    }
}

