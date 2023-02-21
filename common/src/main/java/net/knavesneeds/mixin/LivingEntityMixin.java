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
import net.minecraft.util.registry.Registry;
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
        }

        return amount;
    }
}
