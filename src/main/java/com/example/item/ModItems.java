package com.example.item;

import com.example.ExampleMod;
import com.example.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {




    public static final Item LILYFISH = registerItem("lilyfish", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "cauliflower")))
            .food(ModFoodComponents.LILYFISH)));



    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new BlockItem(ModBlocks.CAULIFLOWER_CROP, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "cauliflower_seeds")))));



    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new BlockItem(ModBlocks.TOMATO, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "tomato_seeds")))));

    public static final Item TOMATO = registerItem("tomato",
            new  BlockItem(ModBlocks.TOMATO, new Item.Settings().food(ModFoodComponents.TOMATO)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "tomato")))));








    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "pink_garnet")))));

    public static final Item PERIDOT = registerItem("peridot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "peridot")))));


    public static final Item CITRINE = registerItem("citrine", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "citrine")))));

    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "raw_pink_garnet")))));
    




      public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "cauliflower")))
            .food(ModFoodComponents.CAULIFLOWER, ModFoodComponents.CAULIFLOWER_EFFECT)) {



        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);









        }
    });


    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, 3, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_sword")))));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_pickaxe")))));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_shovel")))));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, 6, -3.2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_axe")))));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, 0, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "pink_garnet_hoe")))));



    public static final Item CITRINE_SWORD = registerItem("citrine_sword",
            new SwordItem(ModToolMaterials.CITRINE, 3, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "citrine_sword")))));
    public static final Item CITRINE_PICKAXE = registerItem("citrine_pickaxe",
            new PickaxeItem(ModToolMaterials.CITRINE, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "citrine_pickaxe")))));
    public static final Item CITRINE_SHOVEL = registerItem("citrine_shovel",
            new ShovelItem(ModToolMaterials.CITRINE, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "citrine_shovel")))));
    public static final Item CITRINE_AXE = registerItem("citrine_axe",
            new AxeItem(ModToolMaterials.CITRINE, 6, -3.2f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExampleMod.MOD_ID, "citrine_axe")))));






















    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering Mod Items for " + ExampleMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}