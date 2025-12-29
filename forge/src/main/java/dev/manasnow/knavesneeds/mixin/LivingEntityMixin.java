package dev.manasnow.knavesneeds.mixin;


import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.KnavesCommon;
import dev.manasnow.knavesneeds.helpers.BetterCombatHelper;
import dev.manasnow.knavesneeds.helpers.UndergardenHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
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

            if (BuiltInRegistries.ITEM.getKey(attackingStack.getItem()).getNamespace().equals("knavesneeds")) {
                if (attackingStack.getItem() instanceof SwordItem swordItem) {
                    return knavesneeds$applySwordEffects(amount, (LivingEntity) (Object) this, swordItem, source);
                }
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

    @Unique
    private float knavesneeds$applySwordEffects(float amount, LivingEntity target, SwordItem swordItem, DamageSource source) {
        Tier tier = swordItem.getTier();

        return switch (tier.toString()) {
            // Forgotten weapon damage against all Undergarden mobs
            case "FORGOTTEN" -> {
                if (EntityType.getKey(target.getType()).getNamespace().equals("undergarden")) {
                    yield amount * 1.5f;
                }
                yield amount;
            }
            // Froststeel slowness application
            case "FROSTSTEEL" -> {
                UndergardenHelper.applyChillyEffect(target);
                yield amount;
            }
            // Utherium weapon damage bonus against Rotspawn
            case "UTHERIUM" -> {
                UndergardenHelper.utheriumCritParticles(target, source);
                yield amount * 1.5f;
            }
            // Fiery Weapon burn
            case "FIERY", "HORIZONITE" -> {
                target.setSecondsOnFire(2);
                yield amount;
            }
            // Knightmetal armor bonus damage
            case "KNIGHTMETAL" -> {
                if (target.getArmorValue() > 0) {
                    if (target.getArmorCoverPercentage() > 0.0f) {
                        int damageBonus = (int) (2.0f * target.getArmorCoverPercentage());
                        yield amount + (float) damageBonus;
                    } else {
                        yield amount + 2.0f;
                    }
                }
                yield amount;
            }
            // Do nothing case.
            default -> amount;
        };
    }
}
