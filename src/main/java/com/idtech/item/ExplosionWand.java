package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class ExplosionWand extends Item {
    public ExplosionWand(Properties properties){
        super(properties);
    }
    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static Item INSTANCE = new ExplosionWand(properties).setRegistryName("explosionwand");
    @Override
    public InteractionResultHolder<ItemStack> use(Level levelIn, Player playerIn, InteractionHand handIn) {
        BlockPos loc = Utils.getBlockAtCursor(playerIn, 200d, false);
        if (loc!=null)
        {
            Utils.createExplosion(levelIn,loc,100);
            return InteractionResultHolder.pass(playerIn.getItemInHand(handIn));

        }
        return InteractionResultHolder.fail(playerIn.getItemInHand(handIn));
    }
}
