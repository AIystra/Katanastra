package com.astra.katanastra.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

import static com.astra.katanastra.registry.ModItem.ULTIMATE_KATANA;

public class BluudEffect extends StatusEffect {
    public BluudEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }
    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        pLivingEntity.removeStatusEffect(StatusEffects.HUNGER);
        pLivingEntity.removeStatusEffect(StatusEffects.WITHER);

        if (pLivingEntity.isHolding(ULTIMATE_KATANA)) {
            if (pLivingEntity.getHealth() > 1.0) {
                pLivingEntity.damage(DamageSource.MAGIC, 0.7F);
            }
        }
        super.applyUpdateEffect(pLivingEntity, pAmplifier);
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
