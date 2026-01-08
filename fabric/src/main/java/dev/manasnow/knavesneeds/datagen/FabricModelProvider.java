package dev.manasnow.knavesneeds.datagen;

import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.registries.*;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.world.item.Item;

public class FabricModelProvider extends net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider {
    public FabricModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        //Currently, there are no block models, but it's easier to put this here and leave it blank.
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        //Placeholder testing code, junk for better system.
        //Models for Amethyst Imbuement Additions
        for (var item : AmethystImbuementAdditionsRegistries.AMETRINE_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : AmethystImbuementAdditionsRegistries.GARNET_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : AmethystImbuementAdditionsRegistries.GLOWING_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : AmethystImbuementAdditionsRegistries.STEEL_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }

        //Models for Better End Additions
        for (var item : BetterEndAdditionsRegistries.AETERNIUM_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : BetterEndAdditionsRegistries.TERMINITE_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : BetterEndAdditionsRegistries.THALLASIUM_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }

        //Models for Better Nether Additions
        for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : BetterNetherAdditionsRegistries.NETHER_RUBY_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_DIAMOND_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }

        //Blueskies not on fabric

        //Models for Deeper Darker Additions
        for (var item : DeeperDarkerAdditionsRegistries.WARDEN_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }

        //Forbidden Arcanus not on fabric

        //Models for SoulsWeapons Additions
        for (var item : SoulsWeaponsAdditionsRegistries.TRANSLUCENT_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }

        //TODO Models for Spectrum not yet implemented

        //Models for Twilight Forest Additions
        for (var item : TwilightForestAdditionsRegistries.FIERY_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : TwilightForestAdditionsRegistries.IRONWOOD_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : TwilightForestAdditionsRegistries.KNIGHTMETAL_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
        for (var item : TwilightForestAdditionsRegistries.STEELEAF_ITEMS) {
            itemModelGeneratorHelper(itemModelGenerator, item);
        }
    }

    private void itemModelGeneratorHelper(ItemModelGenerators itemModelGenerator, RegistrySupplier<Item> item) {
        switch (item.get().toString().split("/")[2]) {
            case "longsword" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.LONGSWORD);
            case "twinblade" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.TWINBLADE);
            case "rapier" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.RAPIER);
            case "katana" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.KATANA);
            case "sai" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.SAI);
            case "spear" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.SPEAR);
            case "glaive" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.GLAIVE);
            case "warglaive" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.WARGLAIVE);
            case "cutlass" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.CUTLASS);
            case "claymore" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.CLAYMORE);
            case "greathammer" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.GREATHAMMER);
            case "greataxe" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.GREATAXE);
            case "chakram" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.CHAKRAM);
            case "scythe" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.SCYTHE);
            case "halberd" -> itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.HALBERD);
            default -> Constants.LOG.info("Failed to make model for item: {}", item.get());
        }
    }
}
