package dev.manasnow.knavesneeds.customitems.swords.undergarden;

import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.function.Supplier;


public class UtheriumSwordItem extends DynamicSwordItem {
    public UtheriumSwordItem(Tier tier, Supplier<Integer> attackDamageModifier, Supplier<Float> attackSpeedModifier, Item.Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List tooltipComponents, TooltipFlag isAdvanced)  {
        if (stack.getItem() instanceof UtheriumSwordItem swordItem) {
            tooltipComponents.add(Component.translatable("tooltip.utheric_sword").withStyle(ChatFormatting.DARK_RED));
        }
    }
}
