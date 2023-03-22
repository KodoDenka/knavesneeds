package net.knavesneeds.compat;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public enum ToolMaterialCompat implements ToolMaterial {

    //Twilight Forest Tiers
    STEELEAF(131,8.0f,7.0f,3,9, "twilightforest:steeleaf_ingot"),
    IRONWOOD(512,6.5f,5.0f,2,25, "twilightforest:ironwood_ingot"),
    FIERY(1024,9.0f,7.0f,4,10, "twilightforest:fiery_ingot"),
    KNIGHTMETAL(512,8.0f,6.0f,3,8, "twilightforest:knightmetal_ingot"),


    //Undergarden Tiers
    CLOGGRUM(286,6.0f,6.0f,2,8,"undergarden:cloggrum_ingot"),
    FROSTSTEEL(575,7.0f,5.0f,2,20, "undergarden:froststeel_ingot"),
    UTHERIUM(1279,8.5f,6.5f,3,17, "undergarden:utherium_crystal"),
    FORGOTTEN(1876,8.0f,6.0f,4,2, "undergarden:forgotten_ingot"),


    //Blue Skies Tiers
    PYROPE(200,9.0f,4.5f,1,10, "blue_skies:pyrope_gem"),
    AQUITE(270,9.0f,5.0f,2,32, "blue_skies:aquite"),
    DIOPSIDE(1661,9.0f,8.0f,3,14, "blue_skies:diopside_gem"),
    CHAROITE(1561,9.0f,6.0f,3,10, "blue_skies:charoite"),
    HORIZONITE(250,9.0f,5.0f,3,10, "blue_skies:horizonite_ingot"),

    TURQUOISE_STONE(131,4.0F,4.0F,1,8, "blue_skies:turquoise_cobblestone"),
    LUNAR_STONE(131,4.0F,4.0F,1,8, "blue_skies:lunar_cobblestone"),

    BLUEBRIGHT_WOOD(59,2.0F,3.0F,0,15, "blue_skies:bluebright_planks"),
    LUNAR_WOOD(59,2.0F,3.0F,0,15, "blue_skies:lunar_planks"),
    STARLIT_WOOD(59,2.0F,3.0F,0,15, "blue_skies:starlit_planks"),
    DUSK_WOOD(59,2.0F,3.0F,0,15, "blue_skies:dusk_planks"),
    FROSTBRIGHT_WOOD(59,2.0F,3.0F,0,15, "blue_skies:frostbright_planks"),
    MAPLE_WOOD(64,2.0F,3.0F,0,10, "blue_skies:maple_planks"),
    CHERRY_WOOD(64,2.0F,3.5F,0,10, "blue_skies:cherry_planks"),


    //Forbidden Arcanus Tiers
    DEORUM(1024,9.0f,6.5f,3,8, "forbidden_arcanus:deorum_ingot"),
    REINFORCED_DEORUM(2561,9.0f,6.5f,3,26, "forbidden_arcanus:dragon_scale"),
    DRACO_ARCANUS(2661,12.0f,7.0f,4,20, "forbidden_arcanus:stellarite_piece"),


    //Better End Tiers
    AETERNIUM(2196,10.0f,7.5f,5,18, "betterend:aeternium_ingot"),
    TERMINITE(1230,8.5f,6.0f, 3,14, "betterend:terminite_ingot"),
    THALLASIUM(320,7.0f,4.5f,2,12, "betterend:thallasium_ingot"),


    //Better Nether Tiers
    CINCINNASITE(512,6.2f,5.5f,2,16, "betternether:cincinnasite_ingot"),
    CINCINNASITE_DIAMOND(2061,8.2f,6.7f,3,14, "minecraft:diamond"),
    NETHER_RUBY(2561,9.2f,8.0f,4,22, "betternether:nether_ruby"),


    //Plus The End Tiers
    ENDRONIUM(1024,9.0f,7.0f,5,8, "plus_the_end:endronium_ingot"),


    //SoulsLikeWeapons
    TRANSLUCENT(300,5.0f,5.0f,2,8, "soulsweapons:lost_soul"),


    //Deeper and Darker
    WARDEN(2464,11.0f,9.0f,4,21, "deeperdarker:reinforced_echo_shard"),


    //Oh, The Biomes You'll Go
    PENDORITE(2500,10.0f,8.0f,5,15, "byg:pendorite_ingot");

    
    //This declares which type of registries is allowed to be used in the enum.
    private final int tierDurability;
    private final float tierSpeed;
    private final float tierDamage;
    private final int tierMining;
    private final int tierEnchant;
    private final String tierIngredient;


    //Enum definition.
    ToolMaterialCompat(int tierDurability, float tierSpeed, float tierDamage, int tierMining, int tierEnchant, String tierIngredient) {
        this.tierDurability = tierDurability;
        this.tierSpeed = tierSpeed;
        this.tierDamage = tierDamage;
        this.tierMining = tierMining;
        this.tierEnchant = tierEnchant;
        this.tierIngredient = tierIngredient;
    }

    //This returns the actual value from the enum above.
    @Override
    public int getDurability() {
        return tierDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return tierSpeed;
    }

    @Override
    public float getAttackDamage() {
        return tierDamage;
    }

    @Override
    public int getMiningLevel() {
        return tierMining;
    }

    @Override
    public int getEnchantability() {
        return tierEnchant;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(Registry.ITEM.getValue(new Identifier(tierIngredient)));
    }
}
