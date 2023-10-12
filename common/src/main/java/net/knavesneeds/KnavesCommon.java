package net.knavesneeds;

import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.knavesneeds.compat.registries.*;
import net.knavesneeds.config.*;
import net.knavesneeds.helpers.IconHelper;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;


public class KnavesCommon {

    //Logging and debugging.
    public static final Logger PUBLIC_LOGGER = LogManager.getLogger("Knaves' Needs");

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

    //Config values
    public static boolean isConfigOutdated;
    public static GeneralConfigs generalConfig;
    public static AmethystImbuementConfig amethystImbuementConfig;
    public static BetterEndConfig betterEndConfig;
    public static BetterNetherConfig betterNetherConfig;
    public static BiomesYoullGoConfig biomesYoullGoConfig;
    public static BlueSkiesConfig blueSkiesConfig;
    public static DeeperDarkerConfig deeperDarkerConfig;
    public static ForbiddenArcanusConfig forbiddenArcanusConfig;
    public static PlusTheEndConfig plusTheEndConfig;
    public static SoulsWeaponsConfig soulsWeaponsConfig;
    public static TwilightForestConfig twilightForestConfig;
    public static UndergardenConfig undergardenConfig;


    //Run when mod is loaded.
    public static void init() {

        //Load config
        AutoConfig.register(GeneralWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        generalConfig = AutoConfig.getConfigHolder(GeneralWrapper.class).getConfig().general;

        String version = KnavesExpectPlatform.getVersion();

        int compatsLoaded = 0;

        if (Platform.getOptionalMod("twilightforest").isPresent()) {
            AutoConfig.register(TwilightForestWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            twilightForestConfig = AutoConfig.getConfigHolder(TwilightForestWrapper.class).getConfig().twilight_forest;
            TwilightForestAdditionsRegister.TWILIGHT_FOREST_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("undergarden").isPresent()) {
            AutoConfig.register(UndergardenWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            undergardenConfig = AutoConfig.getConfigHolder(UndergardenWrapper.class).getConfig().undergarden;
            UndergardenAdditionsRegister.UNDERGARDEN_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("forbidden_arcanus").isPresent()) {
            AutoConfig.register(ForbiddenArcanusWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            forbiddenArcanusConfig = AutoConfig.getConfigHolder(ForbiddenArcanusWrapper.class).getConfig().forbidden_arcanus;
            ForbiddenArcanusAdditionsRegister.FORBIDDEN_ARCANUS_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("blue_skies").isPresent()) {
            AutoConfig.register(BlueSkiesWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            blueSkiesConfig = AutoConfig.getConfigHolder(BlueSkiesWrapper.class).getConfig().blue_skies;
            BlueSkiesAdditionsRegister.BLUE_SKIES_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("betterend").isPresent()) {
            AutoConfig.register(BetterEndWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            betterEndConfig = AutoConfig.getConfigHolder(BetterEndWrapper.class).getConfig().better_end;
            BetterEndAdditionsRegister.BETTER_END_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("betternether").isPresent()) {
            AutoConfig.register(BetterNetherWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            betterNetherConfig = AutoConfig.getConfigHolder(BetterNetherWrapper.class).getConfig().better_nether;
            BetterNetherAdditionsRegister.BETTER_NETHER_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("soulsweapons").isPresent()) {
            AutoConfig.register(SoulsWeaponsWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            soulsWeaponsConfig = AutoConfig.getConfigHolder(SoulsWeaponsWrapper.class).getConfig().souls_weapons;
            SoulsWeaponsAdditionsRegister.SOULS_WEAPONS_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("byg").isPresent()) {
            AutoConfig.register(BiomesYoullGoWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            biomesYoullGoConfig = AutoConfig.getConfigHolder(BiomesYoullGoWrapper.class).getConfig().byg;
            BiomesYoullGoRegister.BYG_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("deeperdarker").isPresent()) {
            AutoConfig.register(DeeperDarkerWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            deeperDarkerConfig = AutoConfig.getConfigHolder(DeeperDarkerWrapper.class).getConfig().deeperdarker;
            DeeperDarkerRegister.DEEPER_DARKER_ITEMS.register();
            compatsLoaded += 1;
        }

        if (Platform.getOptionalMod("amethyst_imbuement").isPresent()) {
            AutoConfig.register(AmethystImbuementWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
            amethystImbuementConfig = AutoConfig.getConfigHolder(AmethystImbuementWrapper.class).getConfig().amethyst_imbuement;
            AmethystImbuementRegister.AMETHYST_IMBUEMENT_ITEMS.register();
            compatsLoaded += 1;
        }

        //Register item group
        if (compatsLoaded > 0) {
            KnavesCommon.CREATIVE_TAB.register();
        }

        System.out.println(KnavesExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
