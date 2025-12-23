package dev.manasnow.knavesneeds.commands;


import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import dev.manasnow.knavesneeds.Constants;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.crafting.Ingredient;

public class KnavesCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        Constants.LOG.info("Knaves' Need helper is active.");
        // Registers main command.
        dispatcher.register(Commands.literal("knavesneeds")
                .executes(KnavesCommands::execute)
                //Registers subcommand. ((There might be a better way to do this))
                .then(Commands.literal("tier_info")
                    .executes(KnavesCommands::executeSub)
                )
                .then(Commands.literal("help")
                        .executes(KnavesCommands::executeHelp)
                )
        );
    }

    private static int execute(CommandContext<CommandSourceStack> context) {
        // I don't need this here, look into refactoring to remove this.
        context.getSource().sendSuccess(() -> Component.literal("P"), false);
        return 1;
    }

    private static int executeSub(CommandContext<CommandSourceStack> context) {
        Item heldItem = context.getSource().getPlayer().getMainHandItem().getItem();


        if (heldItem instanceof SwordItem swordItem) {
            float itemAttackDamage = swordItem.getTier().getAttackDamageBonus();
            int itemEnchantmentValue = swordItem.getTier().getEnchantmentValue();
            int itemDurability = swordItem.getTier().getUses();
            int itemLevel = swordItem.getTier().getLevel();
            float itemSpeed = swordItem.getTier().getSpeed();
            Ingredient itemRepairIngredient = swordItem.getTier().getRepairIngredient();

            context.getSource().sendSuccess(() -> Component.literal("Tier named " + swordItem.getTier()
                    + ":\n - attackDamageBonus - " + itemAttackDamage
                    + "\n - enchantmentValue - " + itemEnchantmentValue
                    + "\n - durability - " + itemDurability
                    + "\n - speed - " + itemSpeed
                    + "\n - level - " + itemLevel
                    + "\n - repair ingredient - " + BuiltInRegistries.ITEM.getKey(itemRepairIngredient.getItems()[0].getItem())),(false));

        }
        else {
            context.getSource().sendSuccess(() -> Component.literal("You are not holding a valid weapon."), false);
        }
        return 1;
    }

    private static int executeHelp(CommandContext<CommandSourceStack> context) {
        context.getSource().sendSuccess(() -> Component.literal("Hold the weapon you want tier information about and then run /knavesneeds tier_info"), false);
        return 1;
    }
}
