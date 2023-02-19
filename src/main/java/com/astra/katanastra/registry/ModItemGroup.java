package com.astra.katanastra.registry;

import com.astra.katanastra.katanastraMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup KATANASTRA = FabricItemGroupBuilder.build(new Identifier(katanastraMod.MODID, "katanastra"),
    () -> new ItemStack(ModItem.BLOOD_INGOT));
}
