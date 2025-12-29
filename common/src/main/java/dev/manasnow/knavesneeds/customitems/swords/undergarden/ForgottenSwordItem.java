package dev.manasnow.knavesneeds.customitems.swords.undergarden;

import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import dev.manasnow.knavesneeds.customitems.swords.twilight_forest.KnightmetalSwordItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.function.Supplier;


public class ForgottenSwordItem extends DynamicSwordItem {
    public ForgottenSwordItem(Tier tier, Supplier<Integer> attackDamageModifier, Supplier<Float> attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List tooltipComponents, TooltipFlag isAdvanced)  {
        if (stack.getItem() instanceof ForgottenSwordItem swordItem) {
            tooltipComponents.add(Component.translatable("tooltip.forgotten_sword").withStyle(ChatFormatting.GREEN));
        }
    }
}
