package com.example.datagen.datagen;

import com.example.block.ModBlocks;
import com.example.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE,
                        ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                offerSmelting(PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
                offerBlasting(PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);

                createShaped(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.RAW_PINK_GARNET)
                        .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                        .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                        .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                        .offerTo(exporter);




                createShaped(RecipeCategory.MISC, ModBlocks.CITRINE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.CITRINE)
                        .criterion(hasItem(ModItems.CITRINE), conditionsFromItem(ModItems.CITRINE))
                        .offerTo(exporter);



                createShaped(RecipeCategory.MISC, ModBlocks.STACKED_CITRINE_BLOCK)
                        .pattern(" RR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.CITRINE)
                        .criterion(hasItem(ModItems.CITRINE), conditionsFromItem(ModItems.CITRINE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.PERIDOT_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.PERIDOT)
                        .criterion(hasItem(ModItems.PERIDOT), conditionsFromItem(ModItems.PERIDOT))
                        .offerTo(exporter);






                createShapeless(RecipeCategory.MISC, ModItems.LILYFISH, 1)
                        .input(ModItems.LILYFISH)
                        .criterion(hasItem(ModItems.LILYFISH), conditionsFromItem(Items.LILY_PAD))
                        .offerTo(exporter);



            }
        };
    }


    @Override
    public String getName() {
        return "TutorialMod Recipes";
    }
}
