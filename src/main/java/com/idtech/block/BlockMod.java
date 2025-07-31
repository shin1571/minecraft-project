package com.idtech.block;


import com.idtech.BaseMod;
import com.idtech.item.ItemMod;
import com.idtech.world.redwood_tree.RedwoodTreeGrower;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber
public class BlockMod {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BaseMod.MODID);

    public static final RegistryObject<Block> CASTLE_WALL = registerBlock("castlewall",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.0f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> GELORE = registerBlock("geloreblock",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silverore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_OF_RAW_SILVER = registerBlock("blockofrawsilver",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_OF_SILVER = registerBlock("blockofsilver",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_LOG = registerBlock("redwoodlog",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1.0f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_PLANKS = registerBlock("redwoodplanks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_LEAVES = registerBlock("redwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_SAPLING = registerBlock("redwood_sapling",
            () -> new SaplingBlock(new RedwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),CreativeModeTab.TAB_DECORATIONS);





    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn,tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ItemMod.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus iEventBus){
        BLOCKS.register(iEventBus);
    }
}





