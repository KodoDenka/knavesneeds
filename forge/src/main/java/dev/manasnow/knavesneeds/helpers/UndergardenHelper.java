package dev.manasnow.knavesneeds.helpers;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.network.PacketDistributor;
import quek.undergarden.network.CreateCritParticlePacket;
import quek.undergarden.registry.UGParticleTypes;

import java.util.function.Supplier;

public class UndergardenHelper {
    private static final ResourceLocation CHILLY_EFFECT= new ResourceLocation("undergarden", "chilly");

    //Apply Crit Particles when using Utherium weapons.
    public static void utheriumCritParticles(LivingEntity target, DamageSource source) {
        //TODO: Add Utherium Crit Particles
        Entity player = source.getEntity();
        if (target.level().isClientSide && player != null) {
            PacketDistributor.TRACKING_ENTITY.with(() -> player).send((Packet<?>) new CreateCritParticlePacket(player.getId(), 2, UGParticleTypes.UTHERIUM_CRIT.get()));
        }
    }

    //Apply Chilly Effect when using Froststeel weapons.
    public static void applyChillyEffect(LivingEntity target) {
        MobEffect effect = BuiltInRegistries.MOB_EFFECT.get(CHILLY_EFFECT);
        if (effect != null) {
            target.addEffect(new MobEffectInstance(effect, 600, 2, false, false));
        }
    }
}
