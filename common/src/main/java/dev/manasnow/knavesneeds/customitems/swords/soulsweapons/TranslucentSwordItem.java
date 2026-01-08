package dev.manasnow.knavesneeds.customitems.swords.soulsweapons;

import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

import java.util.function.Supplier;

public class TranslucentSwordItem extends DynamicSwordItem {
    public TranslucentSwordItem(Tier tier, Supplier<Integer> attackDamageModifier, Supplier<Float> attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    //Add logic to mimic TranslucentWeapon
    //Code built referencing mariumbacchus's code. https://github.com/mariumbacchus
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactHand) {
        ItemStack itemStack = player.getItemInHand(interactHand);
        if (itemStack.hasTag() && itemStack.getTag().contains("Invisible")) {
            itemStack.getTag().putBoolean("Invisible", !itemStack.getTag().getBoolean("Invisible"));
        } else {
            itemStack.getOrCreateTag().putBoolean("Invisible", true);
        }
        player.getCooldowns().addCooldown(this, 20);
        player.playSound(SoundEvents.ENDERMAN_TELEPORT, 0.8f, 0.75f);
        return InteractionResultHolder.success(itemStack);
    }

}
