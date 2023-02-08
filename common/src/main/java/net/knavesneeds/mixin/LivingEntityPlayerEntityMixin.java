package net.knavesneeds.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({LivingEntity.class, PlayerEntity.class})
public class LivingEntityPlayerEntityMixin {

    /*

    //Twilight Forest
    public static void onDamage(LivingHurtEvent evt) {
        LivingEntity target = evt.getEntityLiving();
        if (!target.level.isClientSide) {
            Entity var3 = evt.getSource().getDirectEntity();
            if (var3 instanceof EntityPlayer_BetterCombat) {
                EntityPlayer_BetterCombat living = (EntityPlayer_BetterCombat)var3;
                ItemStack weapon = living.getCurrentAttack().itemStack();
                if (weapon != null && !weapon.isEmpty()) {
                    if (target.getArmorValue() > 0 && (weapon.is((knightmetal_weapon)))) {
                        if (target.getArmorCoverPercentage() > 0.0F) {
                            int moreBonus = (int)(2.0F * target.getArmorCoverPercentage());
                            evt.setAmount(evt.getAmount() + (float)moreBonus);
                        } else {
                            evt.setAmount(evt.getAmount() + 2.0F);
                        }

                        ((ServerLevel)target.level).getChunkSource().broadcastAndSend(target, new ClientboundAnimatePacket(target, 5));
                    }
                }
            }
        }
    }

    //Twilight Forest Fiery
    public static void setFireBeforeDeath(LivingAttackEvent event) {
        Entity var2 = event.getSource().getEntity();
        if (var2 instanceof EntityPlayer_BetterCombat living) {
            if (living.getCurrentAttack() != null && living.getCurrentAttack().itemStack().is(fiery_weapon) && !event.getEntityLiving().fireImmune()) {
                event.getEntityLiving().setSecondsOnFire(1);
            }
        }

    }
    */

}
