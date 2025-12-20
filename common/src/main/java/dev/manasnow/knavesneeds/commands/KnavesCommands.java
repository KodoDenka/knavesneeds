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

import static java.lang.Integer.getInteger;


public class KnavesCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        Constants.LOG.info("Attempting to registering commands");
        // Register the command with the literal "mycommand"
        dispatcher.register(Commands.literal("knavesneeds")
                .executes(KnavesCommands::execute) // Calls the execute method when command is run
                .then(Commands.literal("tier_info")
                    .executes(KnavesCommands::executeSub)
                )
                .then(Commands.literal("help")
                        .executes(KnavesCommands::executeHelp)
                )
        );
    }

    private static int execute(CommandContext<CommandSourceStack> context) {
        // This is the code that runs when /mycommand is used
        context.getSource().sendSuccess(() -> Component.literal("P"), false);
        return 1;
    }

    private static int executeSub(CommandContext<CommandSourceStack> context) {
        Constants.LOG.info("Executing command");

        Item heldItem = context.getSource().getPlayer().getMainHandItem().getItem();


        if (heldItem instanceof SwordItem swordItem) {
            float itemAttackDamage = swordItem.getTier().getAttackDamageBonus();
            Constants.LOG.info(String.valueOf(itemAttackDamage));
            int itemEnchantmentValue = swordItem.getTier().getEnchantmentValue();
            Constants.LOG.info(String.valueOf(itemEnchantmentValue));
            int itemDurability = swordItem.getTier().getUses();
            Constants.LOG.info(String.valueOf(itemDurability));
            int itemLevel = swordItem.getTier().getLevel();
            Constants.LOG.info(String.valueOf(itemLevel));
            float itemSpeed = swordItem.getTier().getSpeed();
            Constants.LOG.info(String.valueOf(itemSpeed));
            Ingredient itemRepairIngredient = swordItem.getTier().getRepairIngredient();
            Constants.LOG.info(String.valueOf(BuiltInRegistries.ITEM.getKey(itemRepairIngredient.getItems()[0].getItem())));
            context.getSource().sendSuccess(() -> Component.literal("Check Logs"),(false));

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
