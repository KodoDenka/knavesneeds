package dev.manasnow.knavesneeds.customitems.swords.blue_skies;

import dev.manasnow.knavesneeds.customitems.swords.common.DynamicSwordItem;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import java.util.List;
import java.util.function.Supplier;


public class HorizoniteSwordItem extends DynamicSwordItem {
    public HorizoniteSwordItem(Tier tier, Supplier<Integer> attackDamageModifier, Supplier<Float> attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List tooltipComponents, TooltipFlag isAdvanced)  {
        if (stack.getItem() instanceof HorizoniteSwordItem swordItem) {
            tooltipComponents.add(Component.translatable("gui.blue_skies.item.ability.fire").withStyle(ChatFormatting.AQUA));
        }
    }
}
