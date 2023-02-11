package net.knavesneeds.registry;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum KnavesTeirRegistry implements ToolMaterial {


    //Twilight Forest Tiers
    STEELEAF(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    IRONWOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    FIERY(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    KNIGHTMETAL(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),


    //Undergarden Tiers
    CLOGGRUM(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    FROSTSTEEL(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    UTHERIUM(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    FORGOTTEN(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),


    //Blue Skies Tiers
    PYROPE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    AQUITE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    DIOPSIDE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    CHAROITE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    HORIZONITE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),

    TURQUOISE_STONE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    LUNAR_STONE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),

    BLUEBRIGHT_WOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    LUNAR_WOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    STARLIT_WOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    DUSK_WOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    FROSTBRIGHT_WOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    MAPLE_WOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    CHERRY_WOOD(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),


    //Forbidden Arcanus Tiers
    ARCANE_GOLDEN(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    REINFORCED_ARCANE_GOLDEN(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    DRACO_ARCANUS(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),


    //Better End Tiers
    AETERNIUM(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    TERMINITE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    THALLASIUM(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),


    //Better Nether Tiers
    CINCINNASITE(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    CINCINNASITE_DIAMOND(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),
    NETHER_RUBY(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),

    //Plus The End Tiers
    ENDRONIUM(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND)),

    //SoulsLikeWeapons
    TRANSLUCENT(1024,9.0f,7.0f,5,8,Ingredient.ofItems(Items.DIAMOND));





    //This declares which type of data is allowed to be used in the enum.
    private final int tierDurability;
    private final float tierSpeed;
    private final float tierDamage;
    private final int tierMining;
    private final int tierEnchant;
    private final Ingredient tierIngredient;


    //This is sloppy, but this lines everything up.
    KnavesTeirRegistry(int tierDurability, float tierSpeed, float tierDamage, int tierMining, int tierEnchant, Ingredient tierIngredient) {
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
