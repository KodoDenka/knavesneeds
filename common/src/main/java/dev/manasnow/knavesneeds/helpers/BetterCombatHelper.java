package dev.manasnow.knavesneeds.helpers;

import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class BetterCombatHelper {

    public ItemStack attackingStackFix(DamageSource source) {
        if (source.getEntity() instanceof EntityPlayer_BetterCombat playerEntity) {
            if (playerEntity.getCurrentAttack() != null) {
                return playerEntity.getCurrentAttack().isOffHand() ? ((Player) playerEntity).getOffhandItem() : ((Player) playerEntity).getMainHandItem();
            }
        }
        assert source.getEntity() != null;
        return ((Player)source.getEntity()).getMainHandItem();
    }
}