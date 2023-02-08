package net.knavesneeds;

import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.compat.TwilightForestCompat;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.config.KnavesConfigWrapper;
import net.knavesneeds.registry.KnavesItemsRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KnavesCommon {
    //Declare mod ID/namespace
    public static final String MOD_ID = "knavesneeds";

    //Calling for configuration
    public static KnavesConfig config;


    //Stolen code from SimplySwords

    /*
    String version = KnavesExpectPlatform.getVersion();
    String defaultConfig = String.format("""
                {
                  "regen_simplyswords_config_file": false,
                  "config_version": %s
                }""", version.substring(0, 4));

    File configFile = KanvesSimplyConfig.createFile("config/simplyswords/backupconfig.json", defaultConfig, false);
    JsonObject json = KanvesSimplyConfig.getJsonObject(KanvesSimplyConfig.readFile(configFile));

     */

    //KanvesSimplyConfig.loadConfig();


    // Registering a new creative tab
    public static final ItemGroup KNAVES_TAB = CreativeTabRegistry.create(new Identifier(MOD_ID, "knaves_tab"), () ->
            new ItemStack(KnavesCommon.EXAMPLE_ITEM.get()));


    //Exmaple mod stuffffff
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Settings().group(KnavesCommon.KNAVES_TAB)));

    //Undergarden Tags
    public static final TagKey<Item> FORGOTTEN_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "forgotten_weapons"));
    public static final TagKey<Item> FROSTSTEEL_WEAPON = TagKey.of(Registry.ITEM_KEY,new Identifier("knavesneeds", "froststeel_weapons"));
    public static final TagKey<Item> UTHERIUM_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "utherium_weapons"));

    //Twilight Forest Tags
    public static final TagKey<Item> FIERY_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "utherium_weapons"));
    public static final TagKey<Item> IRONWOOD_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "utherium_weapons"));
    public static final TagKey<Item> KNIGHTMETAL_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "utherium_weapons"));
    public static final TagKey<Item> STEELEAF_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "utherium_weapons"));


    //Run when mod is loaded.
    public static void init() {
        AutoConfig.register(KnavesConfigWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        config = AutoConfig.getConfigHolder(KnavesConfigWrapper.class).getConfig().client;


        KnavesItemsRegistry.TwilightItemReg();

        ITEMS.register();
        KnavesItemsRegistry.KNAVES_ITEMS.register();


        if (Platform.isModLoaded("twilightforest")) {
            TwilightForestCompat.TWILIGHT_FOREST_ITEMS.register();
        }

        System.out.println(KnavesExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
