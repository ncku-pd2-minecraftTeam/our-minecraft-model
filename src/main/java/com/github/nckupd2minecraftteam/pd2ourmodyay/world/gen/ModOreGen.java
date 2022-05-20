package com.github.nckupd2minecraftteam.pd2ourmodyay.world.gen;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;
import com.github.nckupd2minecraftteam.pd2ourmodyay.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;

public class ModOreGen {

    public static void generatorOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement customeConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 5, 5, 128));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.SILVER_ORE.getDefaultState(), 10))
                            .withPlacement(customeConfig));
        }
    }
}
