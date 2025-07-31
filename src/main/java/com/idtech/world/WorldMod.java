package com.idtech.world;

import com.idtech.BaseMod;
import com.idtech.block.BlockMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.MobSpawnSettingsBuilder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BaseMod.MODID)
public class WorldMod {
    private static ResourceKey<Biome> REDWOOD_FOREST = ResourceKey.create(Registry.BIOME_REGISTRY,RedwoodForest.INSTANCE.getRegistryName());

    public static void registerBiomes(final RegistryEvent.Register<Biome> event){
        event.getRegistry().register(RedwoodForest.INSTANCE);
    }


    public static void setupBiomes() {
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL,new BiomeManager.BiomeEntry(REDWOOD_FOREST,15));
    }
    @SubscribeEvent
    public static void addFeatures(BiomeLoadingEvent event) {
    }
}
