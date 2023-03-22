package net.knavesneeds.mixin;

import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public abstract class EnchantmentMixin {
    @Shadow
    protected abstract String getOrCreateTranslationKey();
    @Inject(method = "isAcceptableItem", at = @At("RETURN"), cancellable = true)
    private void knavesneeds$isAcceptableItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof KnavesSwordItem swordItem
                && swordItem.getMaterial().equals(ToolMaterialCompat.FIERY)
                && knavesneeds$isEnchantment(Enchantments.FIRE_ASPECT)) {
            cir.setReturnValue(false);
        }
    }


    //Used with permission from chronosacaria :)
    private boolean knavesneeds$isEnchantment(Enchantment... enchantments){
        for (Enchantment enchantment : enchantments){
            if (Util.createTranslationKey("enchantment", Registries.ENCHANTMENT.getId(enchantment)).equals(this.getOrCreateTranslationKey())){
                return true;
            }
        }
        return false;
    }
}