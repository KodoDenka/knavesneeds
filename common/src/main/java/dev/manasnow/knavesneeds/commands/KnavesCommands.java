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

public class KnavesCommands {

    //Registers knavesneeds as a command with help and tier info as subcommands.
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        Constants.LOG.info("Knaves' Need helper is active.");
        dispatcher.register(Commands.literal("knavesneeds")
                        .then(Commands.literal("tier_info")
                                .executes(KnavesCommands::executeInfo)
                        )
                        .then(Commands.literal("help")
                                .executes(KnavesCommands::executeHelp)
                        )
                // Removed the base .executes() to ensure users provide a valid subcommand
        );
    }

    //Sub commands the shows information about the current tier.
    private static int executeInfo(CommandContext<CommandSourceStack> context) {
        CommandSourceStack source = context.getSource();

        // Safety: check if the source is actually a player
        if (source.getPlayer() == null) {
            source.sendFailure(Component.literal("This command must be executed by a player."));
            return 0;
        }

        Item heldItem = source.getPlayer().getMainHandItem().getItem();

        if (heldItem instanceof SwordItem swordItem) {
            var tier = swordItem.getTier();

            // Format ingredient name nicely
            String ingredientName;
            if (tier.getRepairIngredient().getItems().length > 0) {
                ingredientName = BuiltInRegistries.ITEM.getKey(tier.getRepairIngredient().getItems()[0].getItem()).toString();
            } else {
                ingredientName = "None";
            }

            source.sendSuccess(() -> Component.literal("§5Tier Info: §f" + tier)
                    .append("\n §7- Attack Bonus: §a" + tier.getAttackDamageBonus())
                    .append("\n §7- Durability: §a" + tier.getUses())
                    .append("\n §7- Speed: §a" + tier.getSpeed())
                    .append("\n §7- Enchantability: §a" + tier.getEnchantmentValue())
                    .append("\n §7- Mining Level: §a" + tier.getLevel())
                    .append("\n §7- Repair Item: §e" + ingredientName), false);
            return 1;
        } else {
            source.sendFailure(Component.literal("You must be holding a Sword/Weapon to see tier info."));
            return 0;
        }
    }

    //Simple sub command, honestly don't know how helpful this is.
    //TODO more testing to see if this is needed for the workflow.
    private static int executeHelp(CommandContext<CommandSourceStack> context) {
        context.getSource().sendSuccess(() -> Component.literal("§6Help: §fHold a weapon or sword and use /knavesneeds tier_info to get information about the item's tier. \n This is mostly a dev tool."), false);
        return 1;
    }
}