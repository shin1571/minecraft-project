package com.idtech.entity;

import com.idtech.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class BombTntEntity extends PrimedTnt {
    public BombTntEntity(Level p_32079_, double p_32080_, double p_32081_, double p_32082_, @Nullable LivingEntity p_32083_) {
        super(p_32079_, p_32080_, p_32081_, p_32082_, p_32083_);
        this.setFuse(5);
    }
    @Override
    protected void explode(){
        this.level.explode(this,this.getBlockX(),this.getBlockY(),this.getBlockZ(),150f,true, Explosion.BlockInteraction.DESTROY);


    }
}
