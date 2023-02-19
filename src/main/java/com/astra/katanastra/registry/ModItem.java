package com.astra.katanastra.registry;

import com.astra.katanastra.Bow.BowTiers;
import com.astra.katanastra.Bow.TieredBowItem;
import com.astra.katanastra.fluid.ModFluids;
import com.astra.katanastra.katanastraMod;
import com.astra.katanastra.registry.custom.*;
import com.astra.katanastra.registry.custom.fission.ModUseDiamondItem;
import com.astra.katanastra.registry.custom.fission.ModUseEmeraldItem;
import com.astra.katanastra.registry.custom.fission.ModUseGoldItem;
import com.astra.katanastra.registry.custom.fission.ModUseIronItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItem {

    //Blood Item

    public static final Item BLOOD_INGOT = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item STONE_DIAMOND = new ModUseDiamondItem(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item STONE_EMERALD = new ModUseEmeraldItem(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item STEEL_GOLD = new ModUseGoldItem(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item STEEL_IRON = new ModUseIronItem(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item BLOOD_DROP = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item MOLTEN_BLOOD_DROP = new ModUseItem(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item HANDLE = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item BLOOD_STRING = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item BLOOD_STICK = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item REINFORCED_STICK = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item NETHERITE_HANDLE = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item BLOOD_INFUSED_NETHERITE = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item PLATINIUM_FLAME = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item STEEL_FRAGMENT = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item DEMON_STAR = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.EPIC).maxCount(1));
    public static final Item BLOOD_BUCKET = new BucketItem(ModFluids.BLOOD_STILL, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item PLATINIUM_TOOTHBRUSH = new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).maxDamage(640));
    public static final Item PLATINIUM_APPLE = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).food(ModFoods.PLATINIUM_APPLE).rarity(Rarity.COMMON).maxCount(64));


    public static final Item WOOD_KATANA = new SwordItem(ToolMaterials.WOOD, 3, -2.2f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item BLOOD_KATANA = new SwordItem(ModToolMaterial.BLOOD, 4, -1f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item GOLD_KATANA = new SwordItem(ToolMaterials.GOLD, 4, -2.2f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item DIAMOND_KATANA = new SwordItem(ToolMaterials.DIAMOND, 3, -2f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item IRON_KATANA = new SwordItem(ToolMaterials.IRON, 3, -2.3f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item PLATINIUM_KATANA = new SwordItem(ModToolMaterial.PLATINIUM, 3, -2f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item ULTIMATE_KATANA = new ModUltimateSwordItem(ModToolMaterial.ULTIMATE, 6, 8f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.EPIC).maxCount(1));

    public static final Item PLATINIUM_PICKAXE = new ModPickaxeItem(ModToolMaterial.PLATINIUM, 1, -2.6f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item PLATINIUM_AXE = new ModAxeItem(ModToolMaterial.PLATINIUM, 6, -3.0f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item PLATINIUM_SHOVEL = new ShovelItem(ModToolMaterial.PLATINIUM, 2, -3f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item PLATINIUM_HOE = new ModHoeItem(ModToolMaterial.PLATINIUM, -2, -1f, new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));

    public static final Item REINFORCED_BOW = new TieredBowItem(BowTiers.BOWPLATINIUM, new Item.Settings().group(ModItemGroup.KATANASTRA));

    public static final BlockItem BLOOD_BLOCK = new BlockItem(ModBlock.BLOOD_BLOCK, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final BlockItem FISSION_BLOCK = new BlockItem(ModBlock.FISSION_BLOCK, new FabricItemSettings().group(ModItemGroup.KATANASTRA));

    //ARMOR
    public static final Item DEMON_HELMET = new DemonArmorItem(ModArmorMaterials.DEMON,
            EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final Item DEMON_CHESTPLATE = new DemonArmorItem(ModArmorMaterials.DEMON,
            EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final Item DEMON_LEGGINGS = new DemonArmorItem(ModArmorMaterials.DEMON,
            EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final Item DEMON_BOOTS = new DemonArmorItem(ModArmorMaterials.DEMON,
            EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.KATANASTRA));

    public static final Item PLATINIUM_HELMET = new ModArmor1Item(ModArmorMaterials.PLATINIUM,
            EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final Item PLATINIUM_CHESTPLATE = new ModArmor1Item(ModArmorMaterials.PLATINIUM,
            EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final Item PLATINIUM_LEGGINGS = new ModArmor1Item(ModArmorMaterials.PLATINIUM,
            EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final Item PLATINIUM_BOOTS = new ModArmor1Item(ModArmorMaterials.PLATINIUM,
            EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.KATANASTRA));

    //Platinium Item
    public static final Item MILK_WITH_PLATINIUM_INGOT = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item PLATINIUM_MILK = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(1));
    public static final Item PLATINIUM_INGOT = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));
    public static final Item RAW_PLATINIUM = new Item(new Item.Settings().group(ModItemGroup.KATANASTRA).rarity(Rarity.COMMON).maxCount(64));

    public static final BlockItem DEEPSLATE_PLATINIUM_ORE = new BlockItem(ModBlock.DEEPSLATE_PLATINIUM_ORE, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final BlockItem PLATINIUM_ORE = new BlockItem(ModBlock.PLATINIUM_ORE, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final BlockItem RAW_PLATINIUM_BLOCK = new BlockItem(ModBlock.RAW_PLATINIUM_BLOCK, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final BlockItem PLATINIUM_BLOCK = new BlockItem(ModBlock.PLATINIUM_BLOCK, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final BlockItem DEEPSLATE_LUCKY_ORE = new BlockItem(ModBlock.DEEPSLATE_LUCKY_ORE, new FabricItemSettings().group(ModItemGroup.KATANASTRA));
    public static final BlockItem LUCKY_ORE = new BlockItem(ModBlock.LUCKY_ORE, new FabricItemSettings().group(ModItemGroup.KATANASTRA));

    public static void registerALL() {
        //1

        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "wood_katana"), WOOD_KATANA);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "gold_katana"), GOLD_KATANA);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "iron_katana"), IRON_KATANA);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_katana"), PLATINIUM_KATANA);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "diamond_katana"), DIAMOND_KATANA);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_katana"), BLOOD_KATANA);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "ultimate_katana"), ULTIMATE_KATANA);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "reinforced_bow"), REINFORCED_BOW);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "demon_star"), DEMON_STAR);

        //2

        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "demon_helmet"), DEMON_HELMET);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "demon_chestplate"), DEMON_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "demon_leggings"), DEMON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "demon_boots"), DEMON_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_block"), BLOOD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "fission_block"), FISSION_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_ingot"), BLOOD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_drop"), BLOOD_DROP);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_bucket"), BLOOD_BUCKET);

        //3

        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_helmet"), PLATINIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_chestplate"), PLATINIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_leggings"), PLATINIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_boots"), PLATINIUM_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "raw_platinium_block"), RAW_PLATINIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_block"), PLATINIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_ingot"), PLATINIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "raw_platinium"), RAW_PLATINIUM);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_apple"), PLATINIUM_APPLE);

        //4

        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_pickaxe"), PLATINIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_axe"), PLATINIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_shovel"), PLATINIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_hoe"), PLATINIUM_HOE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "handle"), HANDLE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "netherite_handle"), NETHERITE_HANDLE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "milk_with_platinium_ingot"), MILK_WITH_PLATINIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_milk"), PLATINIUM_MILK);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_flame"), PLATINIUM_FLAME);

        //5

        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "stone_diamond"), STONE_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "stone_emerald"), STONE_EMERALD);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "stone_gold"), STEEL_GOLD);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "stone_iron"), STEEL_IRON);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "molten_blood_drop"), MOLTEN_BLOOD_DROP);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_infused_netherite"), BLOOD_INFUSED_NETHERITE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_string"), BLOOD_STRING);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "blood_stick"), BLOOD_STICK);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "reinforced_stick"), REINFORCED_STICK);

        //6

        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_ore"), PLATINIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "deepslate_platinium_ore"), DEEPSLATE_PLATINIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "lucky_ore"), LUCKY_ORE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "deepslate_lucky_ore"), DEEPSLATE_LUCKY_ORE);
        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "steel_fragment"), STEEL_FRAGMENT);

        //7

        Registry.register(Registry.ITEM, new Identifier(katanastraMod.MODID, "platinium_toothbrush"), PLATINIUM_TOOTHBRUSH);
    }
}