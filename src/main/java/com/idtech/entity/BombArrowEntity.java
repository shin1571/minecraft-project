package com.idtech.entity;

import com.idtech.item.BombArrow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;


public class BombArrowEntity extends AbstractArrow {
    public BombArrowEntity (Level level, LivingEntity entity) {
        super(EntityType.ARROW,entity,level);
    }
    @Override
    protected ItemStack getPickupItem (){
        return new ItemStack(BombArrow.INSTANCE);

    }
    int count =0;
    @Override
    protected void onHit(HitResult result){
        super.onHit(result);
        Vec3 Loc = result.getLocation();
        if (count<1){
            level.explode(null,Loc.x,Loc.y,Loc.z,10f, Explosion.BlockInteraction.DESTROY);
            count++;
        }
    }
}
