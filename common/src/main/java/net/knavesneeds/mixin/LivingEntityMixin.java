package net.knavesneeds.mixin;

import dev.architectury.platform.Platform;
import net.knavesneeds.compat.BetterCombatHelperClass;
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

    private BetterCombatHelperClass leaveMeAloneCurseForgeComments;

    @ModifyVariable(method = "damage", at = @At(value = "HEAD"), argsOnly = true)
    public float knavesneeds$damageModifiers(float amount, DamageSource source) {
        LivingEntity target = (LivingEntity) (Object) this;

        if (source.getAttacker() instanceof PlayerEntity player) {
            ItemStack attackingStack = player.getMainHandStack();
            ////Checks to see if the attack is a BetterCombat player. If so, consider offhand
            if (Platform.getOptionalMod("bettercombat").isPresent()) {
                if (leaveMeAloneCurseForgeComments == null) {
                    leaveMeAloneCurseForgeComments = new BetterCombatHelperClass();
                }
                attackingStack = leaveMeAloneCurseForgeComments.attackingStackFix(source);
            }
            if (attackingStack.getItem() instanceof KnavesSwordItem swordItem) {
                // Forgotten weapon damage against all Undergarden mobs
                if (swordItem.getMaterial().equals(ToolMaterialCompat.FORGOTTEN)) {
                    if (Registry.ENTITY_TYPE.getId(target.getType()).getNamespace().equals("undergarden")) {
                        return amount * 1.5f;
                    }
                }
                // Froststeel slowness application
                else if (swordItem.getMaterial().equals(ToolMaterialCompat.FROSTSTEEL)) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 2));
                }
                // Utherium weapon damage bonus against Rotspawn
                else if (swordItem.getMaterial().equals(ToolMaterialCompat.UTHERIUM)) {
                    if (Registry.ENTITY_TYPE.getId(target.getType()).equals(new Identifier("undergarden:rotspawn"))) {
                        return amount * 1.5f;
                    }
                }
                // Fiery Weapon burn
                else if (swordItem.getMaterial().equals(ToolMaterialCompat.FIERY) || swordItem.getMaterial().equals(ToolMaterialCompat.HORIZONITE)) {
                    target.setOnFireFor(2);
                }
                // Knightmetal armor bonus
                else if (swordItem.getMaterial().equals(ToolMaterialCompat.UTHERIUM)) {
                    if (target.getArmor() > 0) {
                        if (target.getArmorVisibility() > 0.0f) {
                            int damageBonus = (int)(2.0f * target.getArmorVisibility());
                            return amount + (float)damageBonus;
                        } else {
                            return amount + 2.0f;
                        }
                    }
                }
            }
        }

        return amount;
    }
}
