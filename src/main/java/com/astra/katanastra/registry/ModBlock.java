package com.astra.katanastra.registry;

import com.astra.katanastra.fluid.ModFluids;
import com.astra.katanastra.katanastraMod;
import com.astra.katanastra.registry.custom.ModFluidBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {
    public static final Block BLOOD_FLUID_BLOCK = new ModFluidBlock(ModFluids.BLOOD_STILL ,FabricBlockSettings
            .of(Material.LAVA)
            .noCollision()
            .nonOpaque()
            .luminance(1).
            lightLevel(1)
            .dropsNothing()
            .blockVision(AbstractBlock.AbstractBlockState::isOpaqueFullCube)
            .velocityMultiplier(1.0F)

    );
    public static final Block BLOOD_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(3.0f, 6.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block DEEPSLATE_PLATINIUM_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .strength(3.0f, 6.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block PLATINIUM_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .strength(3.0f, 6.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    );
    public static final Block RAW_PLATINIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(3.0f, 6.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block PLATINIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(3.0f, 6.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL)
    );
    public static final Block FISSION_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(4.0f, 7.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL)
            .lightLevel(5)
    );
    public static final Block DEEPSLATE_LUCKY_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(3.0f, 7.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .lightLevel(5)
    );
    public static final Block LUCKY_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(3.0f, 7.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .lightLevel(5)
    );

    public static void registerBlock() {
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "blood_block"), BLOOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "deepslate_platinium_ore"), DEEPSLATE_PLATINIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "platinium_ore"), PLATINIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "raw_platinium_block"), RAW_PLATINIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "platinium_block"), PLATINIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "blood_fluid_block"), BLOOD_FLUID_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "fission_block"), FISSION_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "deepslate_lucky_ore"), DEEPSLATE_LUCKY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(katanastraMod.MODID, "lucky_ore"), LUCKY_ORE);

    }

}
