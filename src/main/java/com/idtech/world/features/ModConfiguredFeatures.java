package com.idtech.world.features;

import com.idtech.block.BlockMod;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> REDWOOD_TREE =
            FeatureUtils.register("redwood", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(BlockMod.REDWOOD_LOG.get()),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.simple(BlockMod.REDWOOD_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),4),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final Holder<PlacedFeature> REDWOOD_CHECKED = PlacementUtils.register("redwood_checked",REDWOOD_TREE,
            PlacementUtils.filteredByBlockSurvival(BlockMod.REDWOOD_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> REDWOOD_SPAWN =
            FeatureUtils.register("redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(REDWOOD_CHECKED,
                            0.5f)), REDWOOD_CHECKED));
}
