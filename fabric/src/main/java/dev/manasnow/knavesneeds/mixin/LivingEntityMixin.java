package dev.manasnow.knavesneeds.mixin;


import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.KnavesCommon;
import dev.manasnow.knavesneeds.helpers.BetterCombatHelper;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @ModifyVariable(method = "hurt", at = @At(value = "HEAD"), argsOnly = true)
    public float knavesneeds$damageModifiers(float amount, DamageSource source) {
        if (source.getEntity() instanceof Player player) {
            ItemStack attackingStack = knavesneeds$safeAttackingStack(source, player);

            if (attackingStack.getItem() instanceof SwordItem swordItem) {
                return knavesneeds$applySwordEffects(amount, (LivingEntity) (Object) this, swordItem);
            }
        }
        return amount;
    }

    //TODO - Look into refactoring this so it runs once when mod is loaded.
    @Unique
    private ItemStack knavesneeds$safeAttackingStack(DamageSource source, Player player) {
        if (KnavesCommon.USE_SAFE_ITEMSTACK) {
            return new BetterCombatHelper().attackingStackFix(source);
        }
        return player.getMainHandItem();
    }

    //TODO - Causes fzzy_config to register configs for unloaded mods due to tier checks. (Fix this.)
    @Unique
    private float knavesneeds$applySwordEffects(float amount, LivingEntity target, SwordItem swordItem) {
        Tier tier = swordItem.getTier();

        // Fiery Weapon burn
        if (tier.toString().equals("FIERY")) {
            Constants.LOG.info("Horizonite/Fiery event -");
            Constants.LOG.info(tier.toString());
            target.setSecondsOnFire(2);
        }

        // Knightmetal armor bonus
        else if (tier.toString().equals("KNIGHTMETAL")) {
            Constants.LOG.info("Knightmetal event -");
            Constants.LOG.info(tier.toString());
            if (target.getArmorValue() > 0) {
                if (target.getArmorCoverPercentage() > 0.0f) {
                    int damageBonus = (int) (2.0f * target.getArmorCoverPercentage());
                    return amount + (float) damageBonus;
                } else {
                    return amount + 2.0f;
                }
            }
        }
        return amount;
    }
}
