package dev.manasnow.knavesneeds.customitems.swords.undergarden;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;


public class FroststeelSwordItem extends SwordItem{
    public FroststeelSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List tooltipComponents, TooltipFlag isAdvanced)  {
        if (stack.getItem() instanceof FroststeelSwordItem swordItem) {
            tooltipComponents.add(Component.translatable("tooltip.froststeel_sword").withStyle(ChatFormatting.GREEN));
        }
    }
}
