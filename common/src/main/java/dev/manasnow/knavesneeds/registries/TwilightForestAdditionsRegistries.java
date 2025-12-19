package dev.manasnow.knavesneeds.registries;

import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class TwilightForestAdditionsRegistries {


    //public static final Item TEST = registerItem("test", new Item(new Item.Properties()));

    static Registrar<Item> myItemRegistrar = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static RegistrySupplier<Item> TEST_ONE = myItemRegistrar.register("test", () -> new Item(new Item.Properties()));

    public static void smartRegister() {
        myItemRegistrar.init();
    }

    //private static Item registerItem(String name, Item item) {
    //    return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), item);
    //}

    //public static void smartRegister() {
    //
    //}


}
