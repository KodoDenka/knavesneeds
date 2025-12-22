package dev.manasnow.knavesneeds.registries;

import dev.manasnow.knavesneeds.KnavesCommon;
import dev.manasnow.knavesneeds.helpers.ToolTierHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.tools.Tool;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

public class TwilightForestAdditionsRegistries {


    Tier testing_tier = ToolTierHelper.AETERNIUM;

    boolean testing = KnavesCommon.commonConfig;

    //testing_tier

    //public static final Item TEST = registerItem("test", new Item(new Item.Properties()));

    static Registrar<Item> myItemRegistrar = ConfigApiJava.platform().createRegistrar(MOD_ID, BuiltInRegistries.ITEM);

    public static RegistrySupplier<Item> TEST_ONE = myItemRegistrar.register("test", () -> new SwordItem(ToolTierHelper.AETERNIUM, 4 , 1.0f, new Item.Properties()));

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
