package com.idtech.item;

import com.idtech.entity.BombArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class BombArrow extends ArrowItem {
    public BombArrow(Properties properties) {
        super(properties);

    }
    private static Properties properties = new Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static Item INSTANCE = new BombArrow(properties).setRegistryName("bombarrow");
    @Override
    public AbstractArrow createArrow (Level level, ItemStack stack, LivingEntity shooter){
        BombArrowEntity entity = new BombArrowEntity(level,shooter);
        return entity;
    }
}
