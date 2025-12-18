package dev.manasnow.knavesneeds.customitems.swords.blue_skies;

import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import java.util.List;


public class HorizoniteSwordItem extends SwordItem{
    public HorizoniteSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List tooltipComponents, TooltipFlag isAdvanced)  {
        if (stack.getItem() instanceof HorizoniteSwordItem swordItem) {
            tooltipComponents.add(Component.translatable("gui.blue_skies.item.ability.fire").withStyle(ChatFormatting.AQUA));
        }
    }
}
