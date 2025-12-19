package dev.manasnow.knavesneeds;


import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.RootCommandNode;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;

import static java.lang.Integer.getInteger;


public class KnavesCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        Constants.LOG.info("Attempting to registering commands");
        // Register the command with the literal "mycommand"
        dispatcher.register(Commands.literal("KnavesCommands")
                .executes(KnavesCommands::execute) // Calls the execute method when command is run
                .then(Commands.literal("subcommand") // Example of a subcommand
                        .executes(KnavesCommands::executeSub)
                )
        );
    }

    private static int execute(CommandContext<CommandSourceStack> context) {
        // This is the code that runs when /mycommand is used
        Constants.LOG.info("Executing command");
        context.getSource().sendSuccess(() -> Component.literal("Hello from the common project command!"), false);
        return 1; // Return 1 for success
    }

    private static int executeSub(CommandContext<CommandSourceStack> context) {
        // Code for the subcommand
        Constants.LOG.info("Executing command");
        context.getSource().sendSuccess(() -> Component.literal("You ran the subcommand!"), false);
        return 1;
        new ItemStack heldItem;
        heldItem = context.getSource().getPlayer().getMainHandItem();
        // get tier of held item

        //return tier of held item.
    }
}
