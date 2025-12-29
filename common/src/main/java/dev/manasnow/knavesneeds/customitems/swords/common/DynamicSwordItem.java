package dev.manasnow.knavesneeds.customitems.swords.common;


import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.function.Supplier;

public class DynamicSwordItem extends SwordItem {
    private final Supplier<Integer> damageSupplier;
    private final Supplier<Float> speedSupplier;

    public DynamicSwordItem(Tier tier, Supplier<Integer> baseDamage, Supplier<Float> baseSpeed, Properties properties) {
        super(tier, 0, 0f, properties);
        this.damageSupplier = baseDamage;
        this.speedSupplier = baseSpeed;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
            // We calculate the final damage: Tier Bonus + Config Base Damage
            float totalDamage = (float) this.getTier().getAttackDamageBonus() + damageSupplier.get();
            
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", totalDamage, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", speedSupplier.get(), AttributeModifier.Operation.ADDITION));
            return builder.build();
        }
        return super.getDefaultAttributeModifiers(slot);
    }
}