package dev.manasnow.knavesneeds.datagen;

import dev.manasnow.knavesneeds.Constants;
import dev.manasnow.knavesneeds.registries.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class KnavesModelProvider extends FabricModelProvider {
    public KnavesModelProvider(FabricDataOutput output) {
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
            Constants.LOG.info("Generating model for Ametrine item: {}", item.get());
            itemModelGenerator.generateFlatItem(item.get(), KnavesModelTemplate.TWINBLADE);
        }
        for (var item : AmethystImbuementAdditionsRegistries.GARNET_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : AmethystImbuementAdditionsRegistries.GLOWING_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : AmethystImbuementAdditionsRegistries.STEEL_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }

        //Models for Better End Additions
        for (var item : BetterEndAdditionsRegistries.AETERNIUM_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : BetterEndAdditionsRegistries.TERMINITE_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : BetterEndAdditionsRegistries.THALLASIUM_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }

        //Models for Better Nether Additions
        for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : BetterNetherAdditionsRegistries.NETHER_RUBY_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : BetterNetherAdditionsRegistries.CINCINNASITE_DIAMOND_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }

        //Blueskies not on fabric

        //Models for Deeper Darker Additions
        for (var item : DeeperDarkerAdditionsRegistries.WARDEN_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }

        //Forbidden Arcanus not on fabric

        //Models for SoulsWeapons Additions
        for (var item : SoulsWeaponsAdditionsRegistries.TRANSLUCENT_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }

        //TODO Models for Spectrum not yet implemented

        //Models for Twilight Forest Additions
        for (var item : TwilightForestAdditionsRegistries.FIERY_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : TwilightForestAdditionsRegistries.IRONWOOD_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : TwilightForestAdditionsRegistries.KNIGHTMETAL_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
        for (var item : TwilightForestAdditionsRegistries.STEELEAF_ITEMS) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }

    }
}
