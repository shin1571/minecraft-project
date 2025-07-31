package com.idtech.block;

import com.idtech.BaseMod;
import com.idtech.Utils;
import com.idtech.entity.BombTntEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class BombTNT extends TntBlock {

    public BombTNT(Properties properties) {
        super(properties);
    }
    private static Properties properties = Properties .of(Material.EXPLOSIVE);
    public static Block INSTANCE = new BombTNT(properties).setRegistryName(BaseMod.MODID,"bombtnt");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, CreativeModeTab.TAB_REDSTONE);
    @Override
    public void onCaughtFire (BlockState state, Level world, BlockPos pos, Direction face, LivingEntity igniter){
        BombTntEntity E= new BombTntEntity(world,pos.getX(),pos.getY(),pos.getZ(),igniter);
        Utils.spawnEntity(world,E,pos);
    }
}