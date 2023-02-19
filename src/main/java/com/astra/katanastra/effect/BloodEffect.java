package com.astra.katanastra.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import static com.astra.katanastra.registry.ModItem.ULTIMATE_KATANA;

public class BloodEffect extends StatusEffect {
    public BloodEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity.isHolding(ULTIMATE_KATANA)) {
            if (pLivingEntity.getHealth() < pLivingEntity.getMaxHealth()) {
                pLivingEntity.heal(0.5F);
            }}else{
        if (pLivingEntity.getHealth() > 1.0) {
            pLivingEntity.damage(DamageSource.MAGIC, 1.0F);
        }

            super.applyUpdateEffect(pLivingEntity, pAmplifier);
        }
    }


    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        int i;
        i = 25 >> pAmplifier;
        if (i > 0) {
            return pDuration % i == 0;
        }
        return false;
    }
}