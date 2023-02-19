package com.astra.katanastra.potion;

import com.astra.katanastra.effect.ModEffects;
import com.astra.katanastra.katanastraMod;
import com.astra.katanastra.mixin.BrewingRecipeRegistryMixin;
import com.astra.katanastra.registry.ModItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {
    public static Potion BLOOD_BOTTLE;

    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(katanastraMod.MODID, name),
        new Potion(new StatusEffectInstance(ModEffects.BLOOD,1200,0)
        ));


    }
    public static void registerPotions() {
        BLOOD_BOTTLE = registerPotion("blood_bottle");

        registerPotionRecipe();
    }
    private static void registerPotionRecipe(){
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItem.BLOOD_DROP,
                ModPotions.BLOOD_BOTTLE);
    }
}
