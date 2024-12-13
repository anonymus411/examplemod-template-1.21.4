package com.example.item;

import com.example.ExampleMod;
import com.example.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExampleMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);


                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.LILYFISH);




                   entries.add(ModItems.TOMATO_SEEDS);
                   entries.add(ModItems.TOMATO);






                   entries.add(ModItems.CITRINE);

                        entries.add(ModItems.PINK_GARNET_SWORD);
                        entries.add(ModItems.PINK_GARNET_PICKAXE);
                        entries.add(ModItems.PINK_GARNET_SHOVEL);
                        entries.add(ModItems.PINK_GARNET_AXE);
                        entries.add(ModItems.PINK_GARNET_HOE);

                        entries.add(ModItems.CITRINE_SWORD);
                        entries.add(ModItems.CITRINE_PICKAXE);
                        entries.add(ModItems.CITRINE_AXE);
                        entries.add(ModItems.CITRINE_SHOVEL);




                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExampleMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.examplemod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PERIDOT_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                       entries.add(ModBlocks.CITRINE_BLOCK);
                       entries.add(ModBlocks.CITRINE_ORE);
                       entries.add(ModBlocks.STACKED_CITRINE_BLOCK);
                       entries.add(ModBlocks.DEEPSLATE_CITRINE_ORE);


                       entries.add(ModItems.PERIDOT);
                       entries.add(ModBlocks.PERIDOT_ORE);

                    }).build());


    public static void registerItemGroups() {
        ExampleMod.LOGGER.info("Registering Item Groups for " + ExampleMod.MOD_ID);
    }
}
