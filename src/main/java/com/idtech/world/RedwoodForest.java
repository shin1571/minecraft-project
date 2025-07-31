package com.idtech.world;

import com.idtech.BaseMod;
import com.idtech.world.features.ModConfiguredFeatures;
import com.idtech.world.features.ModPlacedFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;

public class RedwoodForest {
    public static Biome INSTANCE = RedwoodForest(new MobSpawnSettings.Builder(),new BiomeGenerationSettings.Builder()).setRegistryName(BaseMod.MODID,"redwoodforest");
    public static Biome RedwoodForest(MobSpawnSettings.Builder mobSpawn,BiomeGenerationSettings.Builder builder){

        BiomeDefaultFeatures.addBirchTrees(builder);

        BiomeDefaultFeatures.addCommonBerryBushes(builder);
        BiomeDefaultFeatures.addBlueIce(builder);
        BiomeDefaultFeatures.addPlainGrass(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
        BiomeDefaultFeatures.addDefaultOres(builder);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);

        //builder.addFeature(10,ModPlacedFeatures.REDWOOD_PLACED);

        mobSpawn.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW,500,1,5));
        mobSpawn.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX,500,1,5));
        mobSpawn.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY,500,1,5));



        return (new Biome.BiomeBuilder())
                .precipitation(Biome.Precipitation.SNOW)
                .biomeCategory(Biome.BiomeCategory.FOREST)
                .temperature(0.2f)
                .downfall(0.5f)
                .specialEffects((new BiomeSpecialEffects.Builder()
                        .waterColor(0x2218D5)
                        .waterFogColor(0x18129C)
                        .fogColor(0x8682E0)
                        .skyColor(0x679FF3)
                        .build()))
                .mobSpawnSettings(mobSpawn.build())
                .generationSettings(builder.build())
                .build();
    }
}