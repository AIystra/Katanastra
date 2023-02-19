package com.astra.katanastra.effect;

import com.astra.katanastra.katanastraMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.util.registry.Registry.STATUS_EFFECT;


public class ModEffects {
    public static StatusEffect BLOOD;
    public static StatusEffect BLUUD;
    public static StatusEffect COOLDOWN;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(STATUS_EFFECT, new Identifier(katanastraMod.MODID, name),
                new BloodEffect(StatusEffectCategory.HARMFUL, 11141120));};

    public static StatusEffect registerStatusEffect1(String name) {
        return Registry.register(STATUS_EFFECT, new Identifier(katanastraMod.MODID, name),
                new CooldownEffect(StatusEffectCategory.HARMFUL, 11141120));};

    public static StatusEffect registerStatusEffect3(String name) {
        return Registry.register(STATUS_EFFECT, new Identifier(katanastraMod.MODID, name),
                new BluudEffect(StatusEffectCategory.HARMFUL, 11141120));
    }


    public static void registerEffects() {
        BLOOD = registerStatusEffect("blood");
        BLUUD = registerStatusEffect3("bluud");
        COOLDOWN = registerStatusEffect1("cooldown");
    }
}
