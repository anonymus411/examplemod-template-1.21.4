package com.example.datagen.datagen;

import com.example.block.ModBlocks;
import com.example.block.custom.CauliflowerCropBlock;
import com.example.block.custom.Tomato;
import com.example.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.example.block.ModBlocks.*;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {









        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);



        addDrop(PINK_GARNET_BLOCK);
        addDrop(RAW_PINK_GARNET_BLOCK);
        addDrop(PERIDOT_BLOCK);


        addDrop(STACKED_CITRINE_BLOCK);
        addDrop(CITRINE_BLOCK);

        addDrop(PINK_GARNET_ORE, oreDrops(PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(PINK_GARNET_DEEPSLATE_ORE, multipleOreDrops(PINK_GARNET_DEEPSLATE_ORE, ModItems.RAW_PINK_GARNET, 3, 7));
        addDrop(CITRINE_ORE, oreDrops(CITRINE_ORE, ModItems.CITRINE));
        addDrop(DEEPSLATE_CITRINE_ORE,oreDrops(DEEPSLATE_CITRINE_ORE,ModItems.CITRINE));

        addDrop(PERIDOT_ORE, oreDrops(PERIDOT_ORE, ModItems.PERIDOT));



        this.addDrop(TOMATO,
                block -> this.applyExplosionDecay(
                        block,LootTable.builder().pool(LootPool.builder().conditionally(
                                                BlockStatePropertyLootCondition.builder(TOMATO).properties(StatePredicate.Builder.create().exactMatch(Tomato.AGE, 3))
                                        )
                                        .with(ItemEntry.builder(ModItems.TOMATO))
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                        ).pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(TOMATO).properties(StatePredicate.Builder.create().exactMatch(Tomato.AGE, 2))
                                ).with(ItemEntry.builder(ModItems.TOMATO))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));


        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, CauliflowerCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder2));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
