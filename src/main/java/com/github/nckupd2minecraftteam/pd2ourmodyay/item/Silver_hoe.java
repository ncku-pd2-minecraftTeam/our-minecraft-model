package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class Silver_hoe extends HoeItem{
	public Silver_hoe() {
		super(SilverItem_Tier.SILVER, 0,(new Item.Properties())
				.maxStackSize(1)
				.rarity(Rarity.RARE)
				.group(ItemGroups.ITEM_TAB)
				);
	}
}
