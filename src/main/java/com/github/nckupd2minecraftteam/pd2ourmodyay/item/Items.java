package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;

import com.github.nckupd2minecraftteam.pd2ourmodyay.block.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(OurModYay.MODID)
public class Items{
	public static final Testitem TESTITEM = null;
	public static final Silver_ingot SILVER_INGOT = null;
    public static final Item SILVER_ORE = null;
    public static final Item SILVER_BLOCK = null;
    public static final Item AND_GATE = null;
    public static final Item NAND_GATE = null;
    public static final Item XOR_GATE = null;
    public static DeferredRegister<Item> getRegister(){
        return Items.ItemRegistry.REGISTER;
    }

    @SuppressWarnings("unused")
    public static class ItemRegistry{
        public static final DeferredRegister<Item> REGISTER = new DeferredRegister<Item>(ForgeRegistries.ITEMS, OurModYay.MODID);


        // items
        public static final RegistryObject<Item> OBJ_TESTITEM = ItemRegistry.REGISTER.register("testitem", () -> new Testitem());
        
        
        public static final RegistryObject<Item> OBJ_SILVER_INGOT = ItemRegistry.REGISTER.register("silver_ingot", () -> new Silver_ingot());
        public static final RegistryObject<Item> OBJ_RAW_SILVER = ItemRegistry.REGISTER.register("raw_silver", () -> new Raw_silver());
        
        
        public static final RegistryObject<PickaxeItem> OBJ_SILVER_PICKAXE = ItemRegistry.REGISTER.register("silver_pickaxe", () -> new Silver_pickaxe());
        public static final RegistryObject<ShovelItem> OBJ_SILVER_SHOVEL = ItemRegistry.REGISTER.register("silver_shovel", () -> new Silver_shovel());
        public static final RegistryObject<SwordItem> OBJ_SILVER_SWORD = ItemRegistry.REGISTER.register("silver_sword", () -> new Silver_sword());
        public static final RegistryObject<HoeItem> OBJ_SILVER_HOE = ItemRegistry.REGISTER.register("silver_hoe", () -> new Silver_hoe());
        public static final RegistryObject<AxeItem> OBJ_SILVER_AXE = ItemRegistry.REGISTER.register("silver_axe", () -> new Silver_axe());
        
        public static final RegistryObject<Item> OBJ_MAGIC_SILVER = ItemRegistry.REGISTER.register("magic_silver", () -> new Magic_silver());
        public static final RegistryObject<Item> OBJ_MAGIC_FRUIT = ItemRegistry.REGISTER.register("magic_fruit", () -> new Magic_fruit());
        public static final RegistryObject<Item> OBJ_MAGIC_SLIME = ItemRegistry.REGISTER.register("magic_slime", () -> new Magic_slime());


        // blocks
        public static final RegistryObject<Item> OBJ_TESTBLOCK = ItemRegistry.REGISTER.register("testblock", () -> new BlockItem(Blocks.BlockRegistry.OBJ_TESTBLOCK.get(), new Item.Properties().group(ItemGroups.ITEM_TAB)));
        public static final RegistryObject<Item> OBJ_SILVER_ORE = ItemRegistry.REGISTER.register("silver_ore", () -> new BlockItem(Blocks.BlockRegistry.OBJ_SILVER_ORE.get(), new Item.Properties().group(ItemGroups.ITEM_TAB)));
        public static final RegistryObject<Item> OBJ_SILVER_BLOCK = ItemRegistry.REGISTER.register("silver_block", () -> new BlockItem(Blocks.BlockRegistry.OBJ_SILVER_BLOCK.get(), new Item.Properties().group(ItemGroups.ITEM_TAB)));
        public static final RegistryObject<Item> OBJ_AND_GATE = ItemRegistry.REGISTER.register("and_gate", () -> new BlockItem(Blocks.BlockRegistry.OBJ_AND_GATE.get(), new Item.Properties().group(ItemGroups.ITEM_TAB)));
        public static final RegistryObject<Item> OBJ_NAND_GATE = ItemRegistry.REGISTER.register("nand_gate", () -> new BlockItem(Blocks.BlockRegistry.OBJ_NAND_GATE.get(), new Item.Properties().group(ItemGroups.ITEM_TAB)));
        public static final RegistryObject<Item> OBJ_XOR_GATE = ItemRegistry.REGISTER.register("xor_gate", () -> new BlockItem(Blocks.BlockRegistry.OBJ_XOR_GATE.get(), new Item.Properties().group(ItemGroups.ITEM_TAB)));
    }
}
