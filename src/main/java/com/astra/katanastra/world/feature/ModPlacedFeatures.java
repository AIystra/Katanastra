package com.astra.katanastra.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

        public static final RegistryEntry<PlacedFeature> PLATINIUM_ORE_PLACED = PlacedFeatures.register("platinium_ore_placed",
                ModConfiguredFeatures.PLATINIUM_ORE, modifiersWithCount(9,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> LUCKY_ORE_PLACED = PlacedFeatures.register("lucky_ore_placed",
            ModConfiguredFeatures.LUCKY_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-70), YOffset.fixed(50))));

    public static final RegistryEntry<PlacedFeature> BLOOD_FLUID_BLOCK_PLACED = PlacedFeatures.register("blood_fluid_block_placed",
            ModConfiguredFeatures.BLOOD_FLUID_BLOCK, modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(9), YOffset.fixed(21))));


        private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }
        private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }
        private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
}