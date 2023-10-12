package net.knavesneeds.helpers;

import dev.architectury.platform.Platform;
import net.knavesneeds.compat.registries.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

//Returns itemstack based on what mods are currently loaded.

public class IconHelper {
    public static Supplier<ItemStack> knavesNeeds$IconHelper() {

        if (Platform.isModLoaded("twilightforest")) {
            return () -> new ItemStack(TwilightForestAdditionsRegister.IRONWOOD_CHAKRAM.get());

        } else if (Platform.isModLoaded("undergarden")) {
            return () -> new ItemStack(UndergardenAdditionsRegister.FROSTSTEEL_CHAKRAM.get());

        } else if (Platform.isModLoaded("forbidden_arcanus")) {
            return () -> new ItemStack(ForbiddenArcanusAdditionsRegister.DRACO_ARCANUS_CHAKRAM.get());

        } else if (Platform.isModLoaded("blue_skies")) {
            return () -> new ItemStack(BlueSkiesAdditionsRegister.PYROPE_CHAKRAM.get());

        } else if (Platform.isModLoaded("betterend")) {
            return () -> new ItemStack(BetterEndAdditionsRegister.AETERNIUM_CHAKRAM.get());

        } else if (Platform.isModLoaded("betternether")) {
            return () -> new ItemStack(BetterNetherAdditionsRegister.CINCINNASITE_CHAKRAM.get());

        } else if (Platform.isModLoaded("soulsweapons")) {
            return () -> new ItemStack(SoulsWeaponsAdditionsRegister.TRANSLUCENT_CHAKRAM.get());

        } else if (Platform.isModLoaded("byg")) {
            return () -> new ItemStack(BiomesYoullGoRegister.PENDORITE_CHAKRAM.get());

        } else if (Platform.isModLoaded("deeperdarker")) {
            return () -> new ItemStack(DeeperDarkerRegister.WARDEN_CHAKRAM.get());

        } else if (Platform.isModLoaded("amethyst_imbuement")) {
            return () -> new ItemStack(AmethystImbuementRegister.AMETRINE_CHAKRAM.get());

        }

        return () -> new ItemStack(Items.IRON_SWORD);
    }
}
