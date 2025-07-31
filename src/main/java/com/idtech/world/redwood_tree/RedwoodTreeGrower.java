package com.idtech.world.redwood_tree;

import net.minecraft.world.level.block.grower.AbstractTreeGrower;

import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
import net.minecraft.core.Holder;

import java.util.Random;

public class RedwoodTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random rand, boolean largeHive){
        return null;
    }
}
