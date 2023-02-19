package com.astra.katanastra.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

import static com.astra.katanastra.registry.ModItem.ULTIMATE_KATANA;

public class CooldownEffect extends StatusEffect {
    public CooldownEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }
    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {


        if (pLivingEntity.isHolding(ULTIMATE_KATANA)) {
            ((PlayerEntity)pLivingEntity).addExhaustion(0.005F * (float)(pAmplifier + 700));
            pLivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 28, 0));
            pLivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 28, 1));
            pLivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 28, 1));
        }
        if (pLivingEntity.isHolding(ULTIMATE_KATANA)) {
            if (pLivingEntity.hasStatusEffect(ModEffects.BLOOD)) {
            }else{
            if (pLivingEntity.getHealth() > 1.0) {
                pLivingEntity.damage(DamageSource.MAGIC, 1.0F);
            }
            }
        }

        if (pLivingEntity.isAlive()){
            ((PlayerEntity)pLivingEntity).addExhaustion(0.005F * (float)(pAmplifier + 300));}
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