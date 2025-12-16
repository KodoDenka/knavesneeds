package dev.manasnow.knavesneeds.registries;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class TwilightForestAdditionsRegistries {

    private static Item registerItem(String name, Item item) {
        return net.minecraft.core.Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), item);
    }



}
