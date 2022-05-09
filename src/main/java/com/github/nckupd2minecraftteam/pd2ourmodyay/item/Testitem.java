package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;

public class Testitem extends Item{
	@Override
	public int getUseDuration(ItemStack stack){
	    return 2;
	}
	public Testitem() {
	    super((new Item.Properties())
	            .maxStackSize(1)
	            .rarity(Rarity.EPIC)
	    		.group(ItemGroups.ITEM_TAB)
	            .food((new Food.Builder())
                    .hunger(4)
                    .saturation(2.0f)
                    .setAlwaysEdible()
                    .build()
                )
        );
	}
}
