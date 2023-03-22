package net.knavesneeds.mixin;

import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;


@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @ModifyVariable(method = "damage", at = @At(value = "HEAD"), argsOnly = true)
    public float knavesneeds$damageModifiers(float amount, DamageSource source) {
        LivingEntity target = (LivingEntity) (Object) this;

        if (source.getAttacker() instanceof PlayerEntity player) {
            ItemStack attackingStack = player.getMainHandStack();
            ////Checks to see if the attack is a BetterCombat player. If so, consider offhand
            if (source.getAttacker() instanceof EntityPlayer_BetterCombat playerEntity) {
                if (playerEntity.getCurrentAttack() != null) {
                    attackingStack = playerEntity.getCurrentAttack().isOffHand() ? ((PlayerEntity) playerEntity).getOffHandStack() : ((PlayerEntity) playerEntity).getMainHandStack();
                }
            }
            if (attackingStack.getItem() instanceof KnavesSwordItem swordItem) {
                // Forgotten weapon damage against all Undergarden mobs
                if (swordItem.getMaterial().equals(ToolMaterialCompat.FORGOTTEN)) {
                    if (Registries.ENTITY_TYPE.getId(target.getType()).getNamespace().equals("undergarden")) {
                        return amount * 1.5f;
                    }
                }
                // Froststeel slowness application
                else if (swordItem.getMaterial().equals(ToolMaterialCompat.FROSTSTEEL)) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 2));
                }
                // Utherium weapon damage bonus against Rotspawn
                else if (swordItem.getMaterial().equals(ToolMaterialCompat.UTHERIUM)) {
                    if (Registries.ENTITY_TYPE.getId(target.getType()).equals(new Identifier("undergarden:rotspawn"))) {
                        return amount * 1.5f;
                    }
                }
                // Fiery Weapon burn
                else if (swordItem.getMaterial().equals(ToolMaterialCompat.FIERY) || swordItem.getMaterial().equals(ToolMaterialCompat.HORIZONITE)) {
                    target.setOnFireFor(2);
                }
            }
        }

        return amount;
    }
}
