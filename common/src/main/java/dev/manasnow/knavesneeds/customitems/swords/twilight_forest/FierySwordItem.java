package dev.manasnow.knavesneeds.customitems.swords.twilight_forest;

import dev.manasnow.knavesneeds.customitems.swords.blue_skies.HorizoniteSwordItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;


public class FierySwordItem extends SwordItem{
    public FierySwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List tooltipComponents, TooltipFlag isAdvanced)  {
        if (stack.getItem() instanceof FierySwordItem swordItem) {
            tooltipComponents.add(Component.translatable("item.twilightforest.fiery_sword.tooltip").withStyle(ChatFormatting.GRAY));
        }
    }
}
