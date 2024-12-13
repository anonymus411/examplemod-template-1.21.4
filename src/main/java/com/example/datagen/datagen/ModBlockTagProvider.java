package com.example.datagen.datagen;

import com.example.block.ModBlocks;
import com.example.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.CITRINE_ORE)
                .add(ModBlocks.CITRINE_BLOCK)


                .add(ModBlocks.DEEPSLATE_CITRINE_ORE)
                .add(ModBlocks.STACKED_CITRINE_BLOCK)
                .add(ModBlocks.CITRINE_BLOCK)
                .add(ModBlocks.CITRINE_ORE)
                .add(ModBlocks.PERIDOT_BLOCK)
                .add(ModBlocks.PERIDOT_ORE);



        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.DEEPSLATE_CITRINE_ORE)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PERIDOT_ORE);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
    }
}
