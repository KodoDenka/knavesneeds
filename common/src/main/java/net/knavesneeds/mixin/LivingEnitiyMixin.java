package net.knavesneeds.mixin;

import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static net.knavesneeds.KnavesCommon.*;


@Mixin(LivingEntity.class)
public class LivingEnitiyMixin {



    @ModifyVariable(method = "damage", at = @At(value = "HEAD"), argsOnly = true)
    public float knavesneeds$damageModifiers(float amount, DamageSource source) {
        LivingEntity target = (LivingEntity) (Object) this;

        //Checks to see if the attack is a BetterCombat player.
        if (source instanceof EntityPlayer_BetterCombat playerBetterCombat) {
            if (playerBetterCombat.getCurrentAttack() != null) {
                //check item in current attack
                ItemStack mainHandStack = playerBetterCombat.getCurrentAttack().itemStack();

                //Forgotten damage bonus against all Undergarden monsters.
                if (mainHandStack.isIn(FORGOTTEN_WEAPON)) {
                    //target.getType().getRegistryEntry()   .getKey() .equals("undergarden");
                    if (Registry.ENTITY_TYPE.getId(target.getType()).equals(new Identifier("undergarden", target.getEntityName()))) {
                        return amount * 1.5f;
                    }
                }

                //Froststeel slowness aplication
                else if (mainHandStack.isIn(FROSTSTEEL_WEAPON)) {
                    //event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2));
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 2));
                }

                //Utherium weapon damage bonus against Rotspawn
                else if (mainHandStack.isIn(UTHERIUM_WEAPON)) {
                    if (target.getType().isIn(TagKey.of(Registry.ENTITY_TYPE_KEY, new Identifier("undergarden", "rotspawn")))) {
                        return amount * 1.5f;
                    }
                }
            }
        }

        //Else, default to player.getMainHandStack()
        else {
            if (source.getAttacker() instanceof PlayerEntity playerEntity) {
                //check item mainhand
                ItemStack mainHandStack = playerEntity.getMainHandStack();

                //Forgotten damage bonus against all Undergarden monsters.
                if (mainHandStack.isIn(FORGOTTEN_WEAPON)) {
                    System.out.println("This is what you're looking for idiot - " + Registry.ENTITY_TYPE.getId(target.getType()));
                    playerEntity.sendMessage(Text.of(String.valueOf(Registry.ENTITY_TYPE.getId(target.getType()))));

                    //target.getType().getRegistryEntry()   .getKey() .equals("undergarden");
                    if (Registry.ENTITY_TYPE.getId(target.getType()).equals(new Identifier("undergarden", target.getEntityName()))) {
                        return amount * 1.5f;
                    }
                }

                //Froststeel slowness aplication
                else if (mainHandStack.isIn(FROSTSTEEL_WEAPON)) {
                    //event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2));
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 2));
                }

                //Utherium weapon damage bonus against Rotspawn
                else if (mainHandStack.isIn(UTHERIUM_WEAPON)) {
                    if (target.getType().isIn(TagKey.of(Registry.ENTITY_TYPE_KEY, new Identifier("undergarden", "rotspawn")))) {
                        return amount * 1.5f;
                    }
                }
            }
        }

        return amount;
    }



    //Blue skies weapons are calculated by their mod_id, causes issues with better combat duel wielding, consider mixing to fix issue.
}
