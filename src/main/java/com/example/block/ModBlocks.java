package com.example.block;

import com.example.ExampleMod;
import com.example.block.custom.CauliflowerCropBlock;
import com.example.block.custom.Tomato;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

        public static final Block PERIDOT_BLOCK = registerBlock("peridot_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_block")))
                        .strength(4f)
                        .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

        public static final Block PERIDOT_ORE = registerBlock("peridot_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                        AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "peridot_ore")))
                                .strength(3f).requiresTool()));



        public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop",
                new CauliflowerCropBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "cauliflower_crop"))).noCollision()
                        .ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.DARK_GREEN)));









        public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_block")))
                        .strength(4f)
                        .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
        public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "raw_pink_garnet_block")))
                        .strength(3f)
                        .requiresTool()));

        public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                        AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_ore")))
                                .strength(3f).requiresTool()));
        public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                        AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_deepslate_ore")))
                                .strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

        public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_block")))
                        .strength(4f)
                        .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

        public static final Block STACKED_CITRINE_BLOCK = registerBlock("stacked_citrine_block",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_block")))
                        .strength(4f)
                        .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));





        public static final Block CITRINE_ORE = registerBlock("citrine_ore",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_block")))
                        .strength(4f)
                        .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

        public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
                new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "deepslate_citrine_ore")))
                        .strength(4f)
                        .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

        public static final Block TOMATO = registerBlockWithoutBlockItem("tomato",
                new Tomato(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, "tomato")))));




        private static Block registerBlockWithoutBlockItem(String name, Block block) {


        return Registry.register(Registries.BLOCK, Identifier.of(ExampleMod.MOD_ID, name), block);

    }


        private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ExampleMod.MOD_ID, name), block);
    }

        private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

        public static void registerModBlocks() {
        ExampleMod.LOGGER.info("Registering Mod Blocks for " + ExampleMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        });
    }
    }


