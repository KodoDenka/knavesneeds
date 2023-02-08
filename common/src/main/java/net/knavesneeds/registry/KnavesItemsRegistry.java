package net.knavesneeds.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.KnavesCommon;
import net.knavesneeds.compat.TwilightForestCompat;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.*;


public class KnavesItemsRegistry {

    //Declaring registry
    public static final DeferredRegister<Item> KNAVES_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //TwilightForestCompat;

    //Populating Registry
    //public static final RegistrySupplier<Item> EXAMPLE_SWORD = KNAVES_ITEMS.register("example_sword", () -> new KnavesSwordItem(ToolMaterials.WOOD, 5,5f));



    public static void TwilightItemReg() {

        if (KnavesCommon.config.damage_mod > 0.0f) {
            RegistrySupplier<Item> EXAMPLE_SWORD = KNAVES_ITEMS.register("example_sword", () -> new KnavesSwordItem(ToolMaterials.WOOD, 5, 5f));
        }

    }

    //Submiting Registry



}
