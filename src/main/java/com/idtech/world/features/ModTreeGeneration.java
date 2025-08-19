package com.idtech.world.features;

import com.idtech.BaseMod;
import com.idtech.world.WorldMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;

public class ModTreeGeneration {
    public static void generateTrees(final BiomeLoadingEvent event){
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY,event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
       // if(types.contains(BiomeDictionary.Type.PLAINS)){
        BaseMod.LOGGER.info(types);
        if(isLoadingBiome(event, "redwoodforest")){

                List<Holder<PlacedFeature>> base =
                        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

                base.add(ModPlacedFeatures.REDWOOD_PLACED);

        }

    }

    private static boolean isLoadingBiome(BiomeLoadingEvent event, String biomeName){
        return event.getName().toString().equals(BaseMod.MODID + ":" + biomeName);
    }
}
