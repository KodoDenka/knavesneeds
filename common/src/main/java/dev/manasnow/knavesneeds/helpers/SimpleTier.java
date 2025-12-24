package dev.manasnow.knavesneeds.helpers;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public record SimpleTier(
        String name,
        Supplier<Integer> uses,
        Supplier<Float> speed,
        Supplier<Float> attackDamageBonus,
        Supplier<Integer> level,
        Supplier<Integer> enchantmentValue,
        Supplier<Ingredient> repairIngredient
) implements Tier {

    public SimpleTier(Supplier<Integer> uses, Supplier<Float> speed, Supplier<Float> attackDamageBonus, Supplier<Integer> level, Supplier<Integer> enchantmentValue, String repairIngredientId) {
        this("UNKNOWN", uses, speed, attackDamageBonus, level, enchantmentValue, () -> Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation(repairIngredientId))));
    }

    public SimpleTier(String name, Supplier<Integer> uses, Supplier<Float> speed, Supplier<Float> attackDamageBonus, Supplier<Integer> level, Supplier<Integer> enchantmentValue, String repairIngredientId) {
        this(name, uses, speed, attackDamageBonus, level, enchantmentValue, () -> Ingredient.of(BuiltInRegistries.ITEM.get(new ResourceLocation(repairIngredientId))));
    }

    //Overides toString behavour to better emulate a normal tier.
    @Override
    public String toString() {
        return name;
    }

    @Override public int getUses() { return uses.get(); }
    @Override public float getSpeed() { return speed.get(); }
    @Override public float getAttackDamageBonus() { return attackDamageBonus.get(); }
    @Override public int getLevel() { return level.get(); }
    @Override public int getEnchantmentValue() { return enchantmentValue.get(); }
    @Override public Ingredient getRepairIngredient() { return repairIngredient.get(); }
}
