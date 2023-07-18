package net.knavesneeds;

import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.compat.registries.*;
import net.knavesneeds.config.KnavesConfig;
import net.knavesneeds.config.KnavesConfigWrapper;
import net.knavesneeds.config.KnavesSimplyConfig;
import net.knavesneeds.helpers.IconHelper;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;


public class KnavesCommon {

    //Declare mod ID/namespace
    public static final String MOD_ID = "knavesneeds";

    //Create ItemGroup
    public static final DeferredRegister<ItemGroup> CREATIVE_TAB =
            DeferredRegister.create(MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> KNAVESNEEDS = CREATIVE_TAB.register(
            "knavesneeds", // Tab ID
            () -> CreativeTabRegistry.create(
                    Text.translatable("itemGroup.knavesneeds.knavestab"), IconHelper.knavesNeeds$IconHelper() // Icon
            )
    );


    //Calling for configuration
    public static KnavesConfig config;

    //Run when mod is loaded.
    public static void init() {

        AutoConfig.register(KnavesConfigWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        config = AutoConfig.getConfigHolder(KnavesConfigWrapper.class).getConfig().client;

        KnavesSimplyConfig.loadConfig();

        int compatsLoaded = 0;

        if (Platform.getOptionalMod("twilightforest").isPresent()) {
            TwilightForestAdditionsRegister.TWILIGHT_FOREST_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("undergarden").isPresent()) {
            UndergardenAdditionsRegister.UNDERGARDEN_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("forbidden_arcanus").isPresent()) {
            ForbiddenArcanusAdditionsRegister.FORBIDDEN_ARCANUS_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("blue_skies").isPresent()) {
            BlueSkiesAdditionsRegister.BLUE_SKIES_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("betterend").isPresent()) {
            //Item recipe generation is called in the KnavesFabric call.
            BetterEndAdditionsRegister.BETTER_END_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("betternether").isPresent()) {
            BetterNetherAdditionsRegister.BETTER_NETHER_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("soulsweapons").isPresent()) {
            SoulsWeaponsAdditionsRegister.SOULS_WEAPONS_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("byg").isPresent()) {
            BiomesYoullGoRegister.BYG_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("deeperdarker").isPresent()) {
            DeeperAndDarkerRegister.DEEPER_DARKER_ITEMS.register();
            compatsLoaded += 1;
        }

        //Register item group
        if (compatsLoaded > 0) {
            KnavesCommon.CREATIVE_TAB.register();
        }

        System.out.println(KnavesExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
