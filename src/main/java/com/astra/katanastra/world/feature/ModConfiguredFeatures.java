package com.astra.katanastra.world.feature;

import com.astra.katanastra.katanastraMod;
import com.astra.katanastra.registry.ModBlock;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_PLATINIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlock.PLATINIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlock.DEEPSLATE_PLATINIUM_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_LUCKY_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlock.LUCKY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlock.DEEPSLATE_LUCKY_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_BLOOD_FLUID_BLOCK = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlock.BLOOD_FLUID_BLOCK.getDefaultState()),
    OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlock.BLOOD_FLUID_BLOCK.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PLATINIUM_ORE =
            ConfiguredFeatures.register("platinium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_PLATINIUM_ORE, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BLOOD_FLUID_BLOCK =
            ConfiguredFeatures.register("overworld_blood_fluid_block", Feature.ORE, new OreFeatureConfig(OVERWORLD_BLOOD_FLUID_BLOCK, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LUCKY_ORE =
            ConfiguredFeatures.register("lucky_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_LUCKY_ORE, 3));


    public static void registerConfiguredFeatures() {
        katanastraMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + katanastraMod.MODID);
    }
}
