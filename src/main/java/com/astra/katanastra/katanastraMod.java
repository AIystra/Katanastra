package com.astra.katanastra;


import com.astra.katanastra.effect.ModEffects;
import com.astra.katanastra.enchantment.ModEnchantments;
import com.astra.katanastra.entity.client.DemonArmorRenderer;
import com.astra.katanastra.fluid.ModFluids;
import com.astra.katanastra.potion.ModPotions;
import com.astra.katanastra.registry.ModBlock;
import com.astra.katanastra.registry.ModItem;
import com.astra.katanastra.util.ModLootTableModifiers;
import com.astra.katanastra.util.ModModelPredicateProvider;
import com.astra.katanastra.world.feature.ModConfiguredFeatures;
import com.astra.katanastra.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class katanastraMod implements ModInitializer
{

    public static final String MODID = "katanastra";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {

        ModConfiguredFeatures.registerConfiguredFeatures();

        ModItem.registerALL();

        ModBlock.registerBlock();

        ModEffects.registerEffects();
        ModPotions.registerPotions();

        ModLootTableModifiers.modifyLootTables();
        ModOreGeneration.generateOres();

        ModModelPredicateProvider.registerModModels();



        GeoArmorRenderer.registerArmorRenderer(new DemonArmorRenderer(), ModItem.DEMON_BOOTS,
                ModItem.DEMON_LEGGINGS, ModItem.DEMON_CHESTPLATE, ModItem.DEMON_HELMET);

        ModEnchantments.registerModEnchantments();

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BLOOD_STILL, ModFluids.BLOOD_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"), 6557198));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.BLOOD_STILL, ModFluids.BLOOD_FLOWING);
    }

}
