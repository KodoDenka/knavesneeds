package net.knavesneeds.compat;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum ToolMaterialCompat implements ToolMaterial {

    //Twilight Forest Tiers
    STEELEAF(131,8.0f,6.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest:steeleaf_ingot")))),
    IRONWOOD(512,6.5f,5.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest:ironwood_ingot")))),
    FIERY(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest:fiery_ingot")))),
    KNIGHTMETAL(512,8.0f,6.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest:knightmetal_ingot")))),


    //Undergarden Tiers
    CLOGGRUM(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Registry.ITEM.get(new Identifier("undergarden:cloggrum_ingot")))),
    FROSTSTEEL(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("undergarden:froststeel_ingot")))),
    UTHERIUM(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("undergarden:utherium_crystal")))),
    FORGOTTEN(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("undergarden:forgotten_ingot")))),


    //Blue Skies Tiers
    PYROPE(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:pyrope_gem")))),
    AQUITE(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:aquite")))),
    DIOPSIDE(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:diopside_gem")))),
    CHAROITE(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:charoite")))),
    HORIZONITE(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:horizonite_ingot")))),

    TURQUOISE_STONE(131,4.0F,1.0F,1,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:turquoise_cobblestone")))),
    LUNAR_STONE(131,4.0F,1.0F,1,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:lunar_cobblestone")))),

    BLUEBRIGHT_WOOD(59,2.0F,0.0F,0,15, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:bluebright_planks")))),
    LUNAR_WOOD(59,2.0F,0.0F,0,15, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:lunar_planks")))),
    STARLIT_WOOD(59,2.0F,0.0F,0,15, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:starlit_planks")))),
    DUSK_WOOD(59,2.0F,0.0F,0,15, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:dusk_planks")))),
    FROSTBRIGHT_WOOD(59,2.0F,0.0F,0,15, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:frostbright_planks")))),
    MAPLE_WOOD(64,2.0F,0.0F,0,10, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:maple_planks")))),
    CHERRY_WOOD(64,2.0F,0.0F,0,10, Ingredient.ofItems(Registry.ITEM.get(new Identifier("blue_skies:cherry_planks")))),

    //Forbidden Arcanus Tiers
    DEORUM(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("forbidden_arcanus:deorum_ingot")))),
    REINFORCED_DEORUM(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("forbidden_arcanus:dragon_scale")))),
    DRACO_ARCANUS(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("forbidden_arcanus:stellarite_piece")))),

    //Better End Tiers
    AETERNIUM(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend:aeternium_ingot")))),
    TERMINITE(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend:terminite_ingot")))),
    THALLASIUM(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend:thallasium_ingot")))),

    //Better Nether Tiers
    CINCINNASITE(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("betternether:cincinnasite_ingot")))),
    CINCINNASITE_DIAMOND(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("minecraft:diamond")))),
    NETHER_RUBY(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("betternether:nether_ruby")))),

    //Plus The End Tiers
    ENDRONIUM(1024,9.0f,7.0f,5,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("plus_the_end:endronium_ingot")))),

    //SoulsLikeWeapons
    TRANSLUCENT(300,5.0f,2.0f,2,8, Ingredient.ofItems(Registry.ITEM.get(new Identifier("soulsweapons:lost_soul"))));

    
    
    //This declares which type of registries is allowed to be used in the enum.
    private final int tierDurability;
    private final float tierSpeed;
    private final float tierDamage;
    private final int tierMining;
    private final int tierEnchant;
    private final Ingredient tierIngredient;


    // This is sloppy, but this lines everything up.
    // From Chronos: This isn't sloppy at all
    ToolMaterialCompat(int tierDurability, float tierSpeed, float tierDamage, int tierMining, int tierEnchant, Ingredient tierIngredient) {
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
        return tierIngredient;
    }
}
