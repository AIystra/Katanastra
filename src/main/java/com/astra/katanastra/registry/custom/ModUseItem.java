package com.astra.katanastra.registry.custom;

import com.astra.katanastra.registry.ModBlock;
import com.astra.katanastra.registry.ModItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class ModUseItem extends Item {

    public ModUseItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block block = world.getBlockState(context.getBlockPos()).getBlock();
        if (block == ModBlock.FISSION_BLOCK) {
            if (!world.isClient()) {
                if (context.getPlayer().isSneaking()) {
                    context.getPlayer().getItemCooldownManager().set(this, 400);
                    context.getPlayer().dropItem(ModItem.BLOOD_DROP);
                    context.getPlayer().dropItem(Items.IRON_INGOT);
                    context.getPlayer().dropItem(Items.IRON_INGOT);
                    context.getPlayer().dropItem(Items.IRON_INGOT);
                    context.getPlayer().getInventory().removeStack(context.getPlayer().getInventory().selectedSlot,1);
                }
            }


        }
        return super.useOnBlock(context);
    }
}
