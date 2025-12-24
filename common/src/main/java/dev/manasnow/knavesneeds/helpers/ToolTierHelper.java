package dev.manasnow.knavesneeds.helpers;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

import static dev.manasnow.knavesneeds.registries.AmethystImbuementAdditionsRegistries.amethystImbuementConfig;
import static dev.manasnow.knavesneeds.registries.BetterEndAdditionsRegistries.betterEndConfig;
import static dev.manasnow.knavesneeds.registries.BetterNetherAdditionsRegistries.betterNetherConfig;
import static dev.manasnow.knavesneeds.registries.BiomesYoullGoAdditionsRegistries.biomesYoullGoConfig;
import static dev.manasnow.knavesneeds.registries.BlueSkiesAdditionsRegistries.blueSkiesConfig;
import static dev.manasnow.knavesneeds.registries.DeeperDarkerAdditionsRegistries.deeperDarkerConfig;
import static dev.manasnow.knavesneeds.registries.ForbiddenArcanusAdditionsRegistries.forbiddenArcanusConfig;
import static dev.manasnow.knavesneeds.registries.SoulsWeaponsAdditionsRegistries.soulsWeaponsConfig;
import static dev.manasnow.knavesneeds.registries.TwilightForestAdditionsRegistries.twilightForestConfig;
import static dev.manasnow.knavesneeds.registries.UndergardenAdditionsRegistries.undergardenConfig;

public enum ToolTierHelper implements Tier {

    //TODO: Divide this enum into multiple enums for each mod to work with config.


    //Twilight Forest Tiers
    STEELEAF(() -> twilightForestConfig.steeleafDurability, () -> twilightForestConfig.steeleafMiningSpeedMultiplier, () -> twilightForestConfig.steeleafAttackDamage, () -> twilightForestConfig.steeleafMiningLevel, () -> twilightForestConfig.steeleafEnchantability, "twilightforest:steeleaf_ingot"),
    IRONWOOD(() -> twilightForestConfig.ironwoodDurability, () -> twilightForestConfig.ironwoodMiningSpeedMultiplier, () -> twilightForestConfig.ironwoodAttackDamage, () -> twilightForestConfig.ironwoodMiningLevel, () -> twilightForestConfig.ironwoodEnchantability, "twilightforest:ironwood_ingot"),
    FIERY(() -> twilightForestConfig.fieryDurability, () -> twilightForestConfig.fieryMiningSpeedMultiplier, () -> twilightForestConfig.fieryAttackDamage, () -> twilightForestConfig.fieryMiningLevel, () -> twilightForestConfig.fieryEnchantability, "twilightforest:fiery_ingot"),
    KNIGHTMETAL(() -> twilightForestConfig.knightmetalDurability, () -> twilightForestConfig.knightmetalMiningSpeedMultiplier, () -> twilightForestConfig.knightmetalAttackDamage, () -> twilightForestConfig.knightmetalMiningLevel, () -> twilightForestConfig.knightmetalEnchantability, "twilightforest:knightmetal_ingot"),


    //Undergarden Tiers
    CLOGGRUM(() -> undergardenConfig.cloggrumDurability, () -> undergardenConfig.cloggrumMiningSpeedMultiplier, () -> undergardenConfig.cloggrumAttackDamage, () -> undergardenConfig.cloggrumMiningLevel, () -> undergardenConfig.cloggrumEnchantability, "undergarden:cloggrum_ingot"),
    FROSTSTEEL(() -> undergardenConfig.froststeelDurability, () -> undergardenConfig.froststeelMiningSpeedMultiplier, () -> undergardenConfig.froststeelAttackDamage, () -> undergardenConfig.froststeelMiningLevel, () -> undergardenConfig.froststeelEnchantability, "undergarden:froststeel_ingot"),
    UTHERIUM(() -> undergardenConfig.utheriumDurability, () -> undergardenConfig.utheriumMiningSpeedMultiplier, () -> undergardenConfig.utheriumAttackDamage, () -> undergardenConfig.utheriumMiningLevel, () -> undergardenConfig.utheriumEnchantability, "undergarden:utherium_crystal"),
    FORGOTTEN(() -> undergardenConfig.forgottenDurability, () -> undergardenConfig.forgottenMiningSpeedMultiplier, () -> undergardenConfig.forgottenAttackDamage, () -> undergardenConfig.forgottenMiningLevel, () -> undergardenConfig.forgottenEnchantability, "undergarden:forgotten_ingot"),


    //Blue Skies Tiers
    PYROPE(() -> blueSkiesConfig.pyropeDurability, () -> blueSkiesConfig.pyropeMiningSpeedMultiplier, () -> blueSkiesConfig.pyropeAttackDamage, () -> blueSkiesConfig.pyropeMiningLevel, () -> blueSkiesConfig.pyropeEnchantability, "blue_skies:pyrope_gem"),
    AQUITE(() -> blueSkiesConfig.aquiteDurability, () -> blueSkiesConfig.aquiteMiningSpeedMultiplier, () -> blueSkiesConfig.aquiteAttackDamage, () -> blueSkiesConfig.aquiteMiningLevel, () -> blueSkiesConfig.aquiteEnchantability, "blue_skies:aquite"),
    DIOPSIDE(() -> blueSkiesConfig.diopsideDurability, () -> blueSkiesConfig.diopsideMiningSpeedMultiplier, () -> blueSkiesConfig.diopsideAttackDamage, () -> blueSkiesConfig.diopsideMiningLevel, () -> blueSkiesConfig.diopsideEnchantability, "blue_skies:diopside_gem"),
    CHAROITE(() -> blueSkiesConfig.charoiteDurability, () -> blueSkiesConfig.charoiteMiningSpeedMultiplier, () -> blueSkiesConfig.charoiteAttackDamage, () -> blueSkiesConfig.charoiteMiningLevel, () -> blueSkiesConfig.charoiteEnchantability, "blue_skies:charoite"),
    HORIZONITE(() -> blueSkiesConfig.horizoniteDurability, () -> blueSkiesConfig.horizoniteMiningSpeedMultiplier, () -> blueSkiesConfig.horizoniteAttackDamage, () -> blueSkiesConfig.horizoniteMiningLevel, () -> blueSkiesConfig.horizoniteEnchantability, "blue_skies:horizonite_ingot"),

    TURQUOISE_STONE(() -> blueSkiesConfig.turquoiseStoneDurability, () -> blueSkiesConfig.turquoiseStoneMiningSpeedMultiplier, () -> blueSkiesConfig.turquoiseStoneAttackDamage, () -> blueSkiesConfig.turquoiseStoneMiningLevel, () -> blueSkiesConfig.turquoiseStoneEnchantability, "blue_skies:turquoise_cobblestone"),
    LUNAR_STONE(() -> blueSkiesConfig.lunarStoneDurability, () -> blueSkiesConfig.lunarStoneMiningSpeedMultiplier, () -> blueSkiesConfig.lunarStoneAttackDamage, () -> blueSkiesConfig.lunarStoneMiningLevel, () -> blueSkiesConfig.lunarStoneEnchantability, "blue_skies:lunar_cobblestone"),

    BLUEBRIGHT_WOOD(() -> blueSkiesConfig.bluebrightWoodDurability, () -> blueSkiesConfig.bluebrightWoodMiningSpeedMultiplier, () -> blueSkiesConfig.bluebrightWoodAttackDamage, () -> blueSkiesConfig.bluebrightWoodMiningLevel, () -> blueSkiesConfig.bluebrightWoodEnchantability, "blue_skies:bluebright_planks"),
    LUNAR_WOOD(() -> blueSkiesConfig.lunarWoodDurability, () -> blueSkiesConfig.lunarWoodMiningSpeedMultiplier, () -> blueSkiesConfig.lunarWoodAttackDamage, () -> blueSkiesConfig.lunarWoodMiningLevel, () -> blueSkiesConfig.lunarWoodEnchantability, "blue_skies:lunar_planks"),
    STARLIT_WOOD(() -> blueSkiesConfig.starlitWoodDurability, () -> blueSkiesConfig.starlitWoodMiningSpeedMultiplier, () -> blueSkiesConfig.starlitWoodAttackDamage, () -> blueSkiesConfig.starlitWoodMiningLevel, () -> blueSkiesConfig.starlitWoodEnchantability, "blue_skies:starlit_planks"),
    DUSK_WOOD(() -> blueSkiesConfig.duskWoodDurability, () -> blueSkiesConfig.duskWoodMiningSpeedMultiplier, () -> blueSkiesConfig.duskWoodAttackDamage, () -> blueSkiesConfig.duskWoodMiningLevel, () -> blueSkiesConfig.duskWoodEnchantability, "blue_skies:dusk_planks"),
    FROSTBRIGHT_WOOD(() -> blueSkiesConfig.frostbrightWoodDurability, () -> blueSkiesConfig.frostbrightWoodMiningSpeedMultiplier, () -> blueSkiesConfig.frostbrightWoodAttackDamage, () -> blueSkiesConfig.frostbrightWoodMiningLevel, () -> blueSkiesConfig.frostbrightWoodEnchantability, "blue_skies:frostbright_planks"),
    MAPLE_WOOD(() -> blueSkiesConfig.mapleWoodDurability, () -> blueSkiesConfig.mapleWoodMiningSpeedMultiplier, () -> blueSkiesConfig.mapleWoodAttackDamage, () -> blueSkiesConfig.mapleWoodMiningLevel, () -> blueSkiesConfig.mapleWoodEnchantability, "blue_skies:maple_planks"),
    CHERRY_WOOD(() -> blueSkiesConfig.cherryWoodDurability, () -> blueSkiesConfig.cherryWoodMiningSpeedMultiplier, () -> blueSkiesConfig.cherryWoodAttackDamage, () -> blueSkiesConfig.cherryWoodMiningLevel, () -> blueSkiesConfig.cherryWoodEnchantability, "blue_skies:cherry_planks"),


    //Forbidden Arcanus Tiers
    DEORUM(() -> forbiddenArcanusConfig.deorumDurability, () -> forbiddenArcanusConfig.deorumMiningSpeedMultiplier, () -> forbiddenArcanusConfig.deorumAttackDamage, () -> forbiddenArcanusConfig.deorumMiningLevel, () -> forbiddenArcanusConfig.deorumEnchantability, "forbidden_arcanus:deorum_ingot"),
    REINFORCED_DEORUM(() -> forbiddenArcanusConfig.reinforcedDeorumDurability, () -> forbiddenArcanusConfig.reinforcedDeorumMiningSpeedMultiplier, () -> forbiddenArcanusConfig.reinforcedDeorumAttackDamage, () -> forbiddenArcanusConfig.reinforcedDeorumMiningLevel, () -> forbiddenArcanusConfig.reinforcedDeorumEnchantability, "forbidden_arcanus:dragon_scale"),
    DRACO_ARCANUS(() -> forbiddenArcanusConfig.dracoArcanusDurability, () -> forbiddenArcanusConfig.dracoArcanusMiningSpeedMultiplier, () -> forbiddenArcanusConfig.dracoArcanusAttackDamage, () -> forbiddenArcanusConfig.dracoArcanusMiningLevel, () -> forbiddenArcanusConfig.dracoArcanusEnchantability, "forbidden_arcanus:stellarite_piece"),


    //Better End Tiers
    AETERNIUM(() -> betterEndConfig.aeterniumDurability, () -> betterEndConfig.aeterniumMiningSpeedMultiplier, () -> betterEndConfig.aeterniumAttackDamage, () -> betterEndConfig.aeterniumMiningLevel, () -> betterEndConfig.aeterniumEnchantability, "betterend:aeternium_ingot"),
    TERMINITE(() -> betterEndConfig.terminiteDurability, () -> betterEndConfig.terminiteMiningSpeedMultiplier, () -> betterEndConfig.terminiteAttackDamage, () -> betterEndConfig.terminiteMiningLevel, () -> betterEndConfig.terminiteEnchantability, "betterend:terminite_ingot"),
    THALLASIUM(() -> betterEndConfig.thallasiumDurability, () -> betterEndConfig.thallasiumMiningSpeedMultiplier, () -> betterEndConfig.thallasiumAttackDamage, () -> betterEndConfig.thallasiumMiningLevel, () -> betterEndConfig.thallasiumEnchantability, "betterend:thallasium_ingot"),


    //Better Nether Tiers
    CINCINNASITE(() -> betterNetherConfig.cincinnasiteDurability, () -> betterNetherConfig.cincinnasiteMiningSpeedMultiplier, () -> betterNetherConfig.cincinnasiteAttackDamage, () -> betterNetherConfig.cincinnasiteMiningLevel, () -> betterNetherConfig.cincinnasiteEnchantability, "betternether:cincinnasite_ingot"),
    CINCINNASITE_DIAMOND(() -> betterNetherConfig.cincinnasiteDiamondDurability, () -> betterNetherConfig.cincinnasiteDiamondMiningSpeedMultiplier, () -> betterNetherConfig.cincinnasiteDiamondAttackDamage, () -> betterNetherConfig.cincinnasiteDiamondMiningLevel, () -> betterNetherConfig.cincinnasiteDiamondEnchantability, "minecraft:diamond"),
    NETHER_RUBY(() -> betterNetherConfig.netherRubyDurability, () -> betterNetherConfig.netherRubyMiningSpeedMultiplier, () -> betterNetherConfig.netherRubyAttackDamage, () -> betterNetherConfig.netherRubyMiningLevel, () -> betterNetherConfig.netherRubyEnchantability, "betternether:nether_ruby"),
    FLAMING_RUBY(() -> betterNetherConfig.flamingRubyDurability, () -> betterNetherConfig.flamingRubyMiningSpeedMultiplier, () -> betterNetherConfig.flamingRubyAttackDamage, () -> betterNetherConfig.flamingRubyMiningLevel, () -> betterNetherConfig.flamingRubyEnchantability, "betternether:nether_ruby"),


    //Plus The End Tiers
    //ENDRONIUM(1024,9.0f,7.0f,5,8, "plus_the_end:endronium_ingot"),


    //SoulsLikeWeapons
    TRANSLUCENT(() -> soulsWeaponsConfig.translucentDurability, () -> soulsWeaponsConfig.translucentMiningSpeedMultiplier, () -> soulsWeaponsConfig.translucentAttackDamage, () -> soulsWeaponsConfig.translucentMiningLevel, () -> soulsWeaponsConfig.translucentEnchantability, "soulsweapons:lost_soul"),


    //Deeper and Darker
    WARDEN(() -> deeperDarkerConfig.wardenDurability, () -> deeperDarkerConfig.wardenMiningSpeedMultiplier, () -> deeperDarkerConfig.wardenAttackDamage, () -> deeperDarkerConfig.wardenMiningLevel, () -> deeperDarkerConfig.wardenEnchantability, "deeperdarker:reinforced_echo_shard"),


    //Oh, The Biomes You'll Go
    PENDORITE(() -> biomesYoullGoConfig.pendoriteDurability, () -> biomesYoullGoConfig.pendoriteMiningSpeedMultiplier, () -> biomesYoullGoConfig.pendoriteAttackDamage, () -> biomesYoullGoConfig.pendoriteMiningLevel, () -> biomesYoullGoConfig.pendoriteEnchantability, "byg:pendorite_ingot"),

    //AmethystImbuement
    AMETRINE(() -> amethystImbuementConfig.ametrineDurability, () -> amethystImbuementConfig.ametrineMiningSpeedMultiplier, () -> amethystImbuementConfig.ametrineAttackDamage, () -> amethystImbuementConfig.ametrineMiningLevel, () -> amethystImbuementConfig.ametrineEnchantability, "byg:pendorite_ingot"),
    GARNET(() -> amethystImbuementConfig.garnetDurability, () -> amethystImbuementConfig.garnetMiningSpeedMultiplier, () -> amethystImbuementConfig.garnetAttackDamage, () -> amethystImbuementConfig.garnetMiningLevel, () -> amethystImbuementConfig.garnetEnchantability, "byg:pendorite_ingot"),
    GLOWING(() -> amethystImbuementConfig.glowingDurability, () -> amethystImbuementConfig.glowingMiningSpeedMultiplier, () -> amethystImbuementConfig.glowingAttackDamage, () -> amethystImbuementConfig.glowingMiningLevel, () -> amethystImbuementConfig.glowingEnchantability, "byg:pendorite_ingot"),
    STEEL(() -> amethystImbuementConfig.steelDurability, () -> amethystImbuementConfig.steelMiningSpeedMultiplier, () -> amethystImbuementConfig.steelAttackDamage, () -> amethystImbuementConfig.steelMiningLevel, () -> amethystImbuementConfig.steelEnchantability, "byg:pendorite_ingot");

    //This declares which type of registries is allowed to be used in the enum.
    private final Supplier<Integer> tierUses;
    private final Supplier<Float> tierSpeed;
    private final Supplier<Float> tierDamageBonus;
    private final Supplier<Integer> tierLevel;
    private final Supplier<Integer> tierEnchantmentValue;
    private final String tierIngredient;


    //Enum definition and order.
    ToolTierHelper(Supplier<Integer> tierUses, Supplier<Float> tierSpeed, Supplier<Float> tierDamageBonus, Supplier<Integer> tierLevel, Supplier<Integer> tierEnchantValue, String tierIngredient) {
        this.tierUses = tierUses;
        this.tierSpeed = tierSpeed;
        this.tierDamageBonus = tierDamageBonus;
        this.tierLevel = tierLevel;
        this.tierEnchantmentValue = tierEnchantValue;
        this.tierIngredient = tierIngredient;
    }

    ToolTierHelper(int tierUses, float tierSpeed, float tierDamageBonus, int tierLevel, int tierEnchantValue, String tierIngredient) {
        this(() -> tierUses, () -> tierSpeed, () -> tierDamageBonus, () -> tierLevel, () -> tierEnchantValue, tierIngredient);
    }

    //Method Implementation.
    @Override
    public int getUses() {
        return tierUses.get();
    }

    @Override
    public float getSpeed() {
        return tierSpeed.get();
    }

    @Override
    public float getAttackDamageBonus() {
        return tierDamageBonus.get();
    }

    @Override
    public int getLevel() {
        return tierLevel.get();
    }

    @Override
    public int getEnchantmentValue() {
        return tierEnchantmentValue.get();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation(tierIngredient)));
    }
}