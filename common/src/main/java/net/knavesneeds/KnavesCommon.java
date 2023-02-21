package net.knavesneeds;

import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.compat.*;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.config.KnavesConfigWrapper;
import net.knavesneeds.config.KnavesSimplyConfig;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KnavesCommon {

    //Declare mod ID/namespace
    public static final String MOD_ID = "knavesneeds";

    //Calling for configuration
    public static KnavesConfig config;

    //Undergarden Tags
    public static final TagKey<Item> FORGOTTEN_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "forgotten_weapons"));
    public static final TagKey<Item> FROSTSTEEL_WEAPON = TagKey.of(Registry.ITEM_KEY,new Identifier("knavesneeds", "froststeel_weapons"));
    public static final TagKey<Item> UTHERIUM_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "utherium_weapons"));

    //Twilight Forest Tags
    public static final TagKey<Item> FIERY_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "fiery_weapons"));
    public static final TagKey<Item> IRONWOOD_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "ironwood_weapons"));
    public static final TagKey<Item> KNIGHTMETAL_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "utherium_weapons"));
    public static final TagKey<Item> STEELEAF_WEAPON = TagKey.of(Registry.ITEM_KEY, new Identifier("knavesneeds", "steeleaf_weapons"));

    //Run when mod is loaded.
    public static void init() {
        AutoConfig.register(KnavesConfigWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        config = AutoConfig.getConfigHolder(KnavesConfigWrapper.class).getConfig().client;

        KnavesSimplyConfig.loadConfig();


        if (Platform.getOptionalMod("twilightforest").isPresent()) {
            TwilightForestAdditionsRegister.TWILIGHT_FOREST_ITEMS.register();
        }

        if (Platform.getOptionalMod("undergarden").isPresent()) {
            UndergardenAdditionsRegister.UNDERGARDEN_ITEMS.register();
        }

        if (Platform.getOptionalMod("plus_the_end").isPresent()) {
            PlusTheEndAdditionsRegister.PLUS_THE_END_ITEMS.register();
        }

        if (Platform.getOptionalMod("forbidden_arcanus").isPresent()) {
            ForbiddenArcanusAdditionsRegister.FORBIDDEN_ARCANUS_ITEMS.register();
        }

        if (Platform.getOptionalMod("blue_skies").isPresent()) {
            BlueSkiesAdditionsRegister.BLUE_SKIES_ITEMS.register();
        }

        if (Platform.getOptionalMod("betterend").isPresent()) {
            BetterEndAdditionsRegister.BETTER_END_ITEMS.register();
        }

        if (Platform.getOptionalMod("betternether").isPresent()) {
            BetterNetherAdditionsRegister.BETTER_NETHER_ITEMS.register();
        }

        if (Platform.getOptionalMod("soulsweapons").isPresent()) {
            SoulsWeaponsAdditionsRegister.SOULS_WEAPONS_ITEMS.register();
        }


        System.out.println(KnavesExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
