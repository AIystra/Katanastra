package com.astra.katanastra.Bow;

import com.astra.katanastra.registry.ModItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum BowTiers implements BowTier {
    BOWPLATINIUM(3456, 3.0f, 2, () -> {
        return Ingredient.ofItems(ModItem.PLATINIUM_INGOT);
    });

    private final int uses;
    private final float damage;
    private final int enchantmentValue;
    private final Lazy<Ingredient> repairIngredient;

    private BowTiers(int uses, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.uses = uses;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}