package dev.manasnow.knavesneeds.mixin;


import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.KnavesCommon;
import dev.manasnow.knavesneeds.helpers.BetterCombatHelper;
import dev.manasnow.knavesneeds.helpers.UndergardenHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
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
                Constants.LOG.info("Is item Knaves Needs? - " + attackingStack.toString());
                //if (swordItem.getName().getString().equals("sword")) {

               // }
                return knavesneeds$applySwordEffects(amount, (LivingEntity) (Object) this, swordItem, source);
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
    private float knavesneeds$applySwordEffects(float amount, LivingEntity target, SwordItem swordItem, DamageSource source) {
        Tier tier = swordItem.getTier();

        // Forgotten weapon damage against all Undergarden mobs
        if (tier.toString().equals("FORGOTTEN")) {
            Constants.LOG.info("Forgotten event -");
            Constants.LOG.info(tier.toString());
            if (EntityType.getKey(target.getType()).getNamespace().equals("undergarden")) {
                return amount * 1.5f;
            }
        }
        // Froststeel slowness application
        else if (tier.toString().equals("FROSTSTEEL")) {
            Constants.LOG.info("Froststeel event -");
            Constants.LOG.info(tier.toString());
            UndergardenHelper.applyChillyEffect(target);
        }
        // Utherium weapon damage bonus against Rotspawn
        else if (tier.toString().equals("UTHERIUM")) {
            Constants.LOG.info("Utherium event -");
            Constants.LOG.info(tier.toString());
            UndergardenHelper.utheriumCritParticles(target, source);
            if (EntityType.getKey(target.getType()).equals(new ResourceLocation("undergarden:rotspawn"))) {
                return amount * 1.5f;
            }
        }
        // Fiery Weapon burn
        else if (tier.toString().equals("FIERY") || tier.toString().equals("HORIZONITE")) {
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
