package net.knavesneeds.customitems;

import dev.architectury.registry.CreativeTabRegistry;
import net.knavesneeds.KnavesCommon;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class KnavesNeedsItemGroup {
    public static ItemGroup KNAVES_NEEDS_ITEM_GROUP;

    public static void ItemGroupsRegistry() {
        KNAVES_NEEDS_ITEM_GROUP = CreativeTabRegistry.create(
                new Identifier(KnavesCommon.MOD_ID, "knaves_needs_additions"),
                () -> new ItemStack(Items.AIR)
        );
    }
}
