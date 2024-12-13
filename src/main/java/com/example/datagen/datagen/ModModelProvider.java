package com.example.datagen.datagen;

import com.example.block.ModBlocks;
import com.example.block.custom.CauliflowerCropBlock;
import com.example.block.custom.Tomato;
import com.example.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOT_ORE);


blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CITRINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CITRINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_CITRINE_ORE);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STACKED_CITRINE_BLOCK);

              blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED,
                Tomato.AGE, 0, 1, 2, 3);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);

        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PERIDOT,Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO_SEEDS,Models.GENERATED);

        itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);

itemModelGenerator.register(ModItems.LILYFISH,Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE,Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CITRINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CITRINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CITRINE_AXE, Models.HANDHELD);



    }
}
