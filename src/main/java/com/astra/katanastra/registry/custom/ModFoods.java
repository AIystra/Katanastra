package com.astra.katanastra.registry.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoods {
    public static final FoodComponent PLATINIUM_APPLE = (new FoodComponent.Builder()).hunger(0).saturationModifier(0.0F).snack().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 0.8F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 75, 0), 1.0F).alwaysEdible().build();;

}
