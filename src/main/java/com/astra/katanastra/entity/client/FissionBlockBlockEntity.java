package com.astra.katanastra.entity.client;

import com.astra.katanastra.entity.ModBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;


public class FissionBlockBlockEntity extends BlockEntity {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);

    public FissionBlockBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntity.FISSION_BLOCK, pos, state);
    }
}
