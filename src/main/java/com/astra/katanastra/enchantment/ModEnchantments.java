package com.astra.katanastra.enchantment;

import com.astra.katanastra.katanastraMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static Enchantment BLESSING_ZEUS = register("blessing_of_zeus",
            new BlessingZeusEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.BOW,
                    EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(katanastraMod.MODID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + katanastraMod.MODID);
    }
}