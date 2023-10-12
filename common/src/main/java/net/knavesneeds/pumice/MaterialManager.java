package net.knavesneeds.pumice;

import dev.architectury.platform.Platform;
import net.knavesneeds.compat.registries.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Collection;

public class MaterialManager {

    public static int convertModifiersToInteger(Collection<EntityAttributeModifier> modifiers) {
        int intValue = 0;

        for (EntityAttributeModifier modifier : modifiers) {
            if (modifier.getOperation() == EntityAttributeModifier.Operation.ADDITION) {
                // If the operation is addition, add the modifier value to the integer.
                double modifierValue = modifier.getValue();
                intValue += (int) modifierValue;
            } else if (modifier.getOperation() == EntityAttributeModifier.Operation.MULTIPLY_BASE) {
                // If the operation is multiply_base, multiply the integer by the modifier value.
                double modifierValue = modifier.getValue();
                intValue *= modifierValue;
            }
            // Handle other operations as needed.
        }

        return intValue;
    }



    private Item item = (Registries.ITEM.get(new Identifier("betternether", "rubyfire")));

    // Registries.ITEM.set();

    public static void knavesItemCheck() {
        if (Platform.getOptionalMod("twilightforest").isPresent()) {
            int STEELEAF_DAMAGE = Registries.ITEM.get(new Identifier("betternether", "rubyfire_sword")).getMaxDamage();
            int STEELEAF_SPEED = convertModifiersToInteger(new ItemStack(Registries.ITEM.get(new Identifier("betternether", "rubyfire_sword"))).getAttributeModifiers(EquipmentSlot.MAINHAND).get(EntityAttributes.GENERIC_ATTACK_SPEED));

            int IRONWOOD_DAMAGE = Registries.ITEM.get(new Identifier("betternether", "rubyfire")).getMaxDamage();
            int IRONWOOD_SPEED = Registries.ITEM.get(new Identifier("betternether", "rubyfire")).getMaxDamage();

            ItemStack itemStack = new ItemStack(Registries.ITEM.get(new Identifier("betternether", "rubyfire")));

            itemStack.getAttributeModifiers(EquipmentSlot.MAINHAND).get(EntityAttributes.GENERIC_ATTACK_SPEED);

            //ItemStack(Registries.ITEM.get(new Identifier("betternether", "rubyfire"))).getAttributeModifiers(EquipmentSlot.MAINHAND).get(EntityAttributes.GENERIC_ATTACK_SPEED);

            //int FIERY =

            /**
            public static double getAttackSpeed(ItemStack itemStack) {
                if (itemStack.isEmpty()) {
                    return 0.0;
                }

                // Get the max attack speed attribute
                EntityAttribute attackSpeedAttribute = EntityAttributes.GENERIC_ATTACK_SPEED;

                // Get the modifier associated with the max attack speed attribute for the item
                EntityAttributeModifier attackSpeedModifier = itemStack.getAttributeModifiers(attackSpeedAttribute).get(0);

                if (attackSpeedModifier != null) {
                    // Get the modified attack speed value
                    double modifiedAttackSpeed = attackSpeedModifier.getValue();
                    return modifiedAttackSpeed;
                } else {
                    // If no modifier found, return the default attack speed value
                    return attackSpeedAttribute.getDefaultValue();
                }
            }

             **/



            //int KNIGHTMETAL
        }

        if (Platform.getOptionalMod("undergarden").isPresent()) {
            UndergardenAdditionsRegister.UNDERGARDEN_ITEMS.register();

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

        if (Platform.getOptionalMod("byg").isPresent()) {
            BiomesYoullGoRegister.BYG_ITEMS.register();

        }

        if (Platform.getOptionalMod("deeperdarker").isPresent()) {
            DeeperDarkerRegister.DEEPER_DARKER_ITEMS.register();

        }

        if (Platform.getOptionalMod("amethyst_imbuement").isPresent()) {
            AmethystImbuementRegister.AMETHYST_IMBUEMENT_ITEMS.register();

        }


    }


    public static void knavesItemUpdate() {

    }

}
