package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(OurModYay.MODID)
public class Items{
	public static final Testitem TESTITEM = null;
    public static DeferredRegister<Item> getRegister(){
        return Items.ItemRegistry.REGISTER;
    }

    @SuppressWarnings("unused")
    public static class ItemRegistry{
        public static final DeferredRegister<Item> REGISTER = new DeferredRegister<Item>(ForgeRegistries.ITEMS, OurModYay.MODID);
        public static final RegistryObject<Item> OBJ_TESTITEM = ItemRegistry.REGISTER.register("testitem", () -> new Testitem());

    }
}
