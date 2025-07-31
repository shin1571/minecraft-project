package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.event.ColorHandlerEvent;

public class TeleportRodItem extends Item {
    public TeleportRodItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerIn, InteractionHand handIn) {
        BlockPos pos = Utils.getBlockAtCursor(playerIn, 1000.0d, true);


        if (pos != null) {
            playerIn.teleportTo(pos.getX(), pos.getY() + playerIn.getBoundingBox().getYsize(),pos.getZ());

            playerIn.fallDistance = 0.0f;
        }


        return InteractionResultHolder.pass(playerIn.getItemInHand(handIn).copy());
    }
}
