package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static final ItemGroup ITEM_TAB = (new ItemGroup("pd2ourmodyay.items"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(Items.TESTITEM);
        }
    });
}
