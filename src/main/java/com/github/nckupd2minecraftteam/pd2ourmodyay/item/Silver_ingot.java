package com.github.nckupd2minecraftteam.pd2ourmodyay.item;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
public class Silver_ingot extends Item{
	
	public Silver_ingot(){
	super((new Item.Properties())
			.maxStackSize(64)
			.rarity(Rarity.RARE)
			.group(ItemGroups.ITEM_TAB)
			);
	}
}
