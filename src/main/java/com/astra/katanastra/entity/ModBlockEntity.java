package com.astra.katanastra.entity;

import com.astra.katanastra.entity.client.FissionBlockBlockEntity;
import com.astra.katanastra.katanastraMod;
import com.astra.katanastra.registry.ModBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntity {
    public static BlockEntityType<FissionBlockBlockEntity> FISSION_BLOCK;

    public static void registerAllBlockEntities() {
        FISSION_BLOCK = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(katanastraMod.MODID, "fission_block"),
                FabricBlockEntityTypeBuilder.create(FissionBlockBlockEntity::new,
                        ModBlock.FISSION_BLOCK).build(null));
    }
}