package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class ZooSword extends SwordItem {
    private static Properties properties = new Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static Item INSTANCE = new ZooSword(Tiers.NETHERITE,50,20,properties).setRegistryName("zoosword");
    public ZooSword(Tiers t,int speed,float damage,Properties p) {
        super(t,speed,damage,p);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level levelIn, Player playerIn, InteractionHand handIn) {
        BlockPos loc = Utils.getBlockAtCursor(playerIn,200d, false);
        EntityType mobs[] = new EntityType[10];
        mobs[0] = EntityType.ZOMBIE;
        mobs[1] = EntityType.OCELOT;
        mobs[2] = EntityType.CREEPER;
        mobs[3] = EntityType.PILLAGER;
        mobs[4] = EntityType.WITHER;
        mobs[5] = EntityType.EVOKER;
        mobs[6] = EntityType.PIGLIN;
        mobs[7] = EntityType.PIGLIN_BRUTE;
        mobs[8] = EntityType.ILLUSIONER;
        mobs[9] = EntityType.TNT;
        int R = levelIn.random.nextInt(10);
        if(loc != null){
            Entity mob = mobs[R].create(levelIn);
            Utils.spawnEntity(levelIn,mob,loc);
            return InteractionResultHolder.success(playerIn.getItemInHand(handIn));

        }
        return InteractionResultHolder.fail(playerIn.getItemInHand(handIn));
    }
}
