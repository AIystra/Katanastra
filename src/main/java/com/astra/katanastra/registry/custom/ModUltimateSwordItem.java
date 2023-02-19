package com.astra.katanastra.registry.custom;

import com.astra.katanastra.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static net.minecraft.item.Items.MILK_BUCKET;

public class ModUltimateSwordItem extends SwordItem {
    public ModUltimateSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (user.isSneaking()) {
            if (!world.isClient) {
                user.getItemCooldownManager().set(this, 1200);
                user.getItemCooldownManager().set(MILK_BUCKET, 1200);

                user.addStatusEffect(new StatusEffectInstance(ModEffects.COOLDOWN, 1200, 0));

            }

        }
        return super.use(world, user, hand);
    }

}