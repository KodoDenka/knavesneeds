package net.knavesneeds.helpers;

import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class BetterCombatHelperClass {

    public ItemStack attackingStackFix(DamageSource source) {
        if (source.getAttacker() instanceof EntityPlayer_BetterCombat playerEntity) {
            if (playerEntity.getCurrentAttack() != null) {
                return playerEntity.getCurrentAttack().isOffHand() ? ((PlayerEntity) playerEntity).getOffHandStack() : ((PlayerEntity) playerEntity).getMainHandStack();
            }
        }
        return ((PlayerEntity)source.getAttacker()).getMainHandStack();
    }



}
