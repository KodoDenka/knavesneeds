package net.knavesneeds;

import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.compat.registries.*;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.config.KnavesConfigWrapper;
import net.knavesneeds.config.KnavesSimplyConfig;
import net.knavesneeds.customitems.KnavesNeedsItemGroup;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KnavesCommon {

    //Declare mod ID/namespace
    public static final String MOD_ID = "knavesneeds";

    //Calling for configuration
    public static KnavesConfig config;

    //Run when mod is loaded.
    public static void init() {
        AutoConfig.register(KnavesConfigWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        config = AutoConfig.getConfigHolder(KnavesConfigWrapper.class).getConfig().client;

        KnavesSimplyConfig.loadConfig();

        KnavesNeedsItemGroup.ItemGroupsRegistry();

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
            //Item recipe generation is called in the KnavesFabric call.
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
