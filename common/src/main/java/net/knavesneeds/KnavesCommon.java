package net.knavesneeds;

import com.google.gson.JsonObject;
import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.compat.*;
import net.knavesneeds.config.KanvesSimplyConfig;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.config.KnavesConfigWrapper;
import net.knavesneeds.registry.KnavesItemsRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.File;

public class KnavesCommon {

    //Declare mod ID/namespace
    public static final String MOD_ID = "knavesneeds";

    //Calling for configuration
    public static KnavesConfig config;

    // Registering a new creative tab
    public static final ItemGroup KNAVES_TAB = CreativeTabRegistry.create(new Identifier(MOD_ID, "knaves_tab"), () ->
            new ItemStack(ForbiddenArcanusCompat.REINFORCED_ARCANE_GOLDEN_CHAKRAM.get()));

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

        KanvesSimplyConfig.loadConfig();

        if (Platform.isModLoaded("twilightforest")) {
            TwilightForestCompat.TWILIGHT_FOREST_ITEMS.register();
        }

        if (Platform.isModLoaded("undergarden")) {
            UndergardenCompat.UNDERGARDEN_ITEMS.register();
        }

        if (Platform.isModLoaded("plus_the_end")) {
            PlusTheEndCompat.PLUS_THE_END_ITEMS.register();
        }

        if (Platform.isModLoaded("forbidden_arcanus")) {
            ForbiddenArcanusCompat.FORBIDDEN_ARCANUS_ITEMS.register();
        }

        if (Platform.isModLoaded("blue_skies")) {
            BlueSkiesCompat.BLUE_SKIES_ITEMS.register();
        }

        if (Platform.isModLoaded("betterend")) {
            BetterEndCompat.BETTER_END_ITEMS.register();
        }

        if (Platform.isModLoaded("betternether")) {
            BetterNetherCompat.BETTER_NETHER_ITEMS.register();
        }


        System.out.println(KnavesExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
