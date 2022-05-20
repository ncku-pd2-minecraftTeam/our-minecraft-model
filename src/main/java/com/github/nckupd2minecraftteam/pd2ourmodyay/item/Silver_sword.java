package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;

public class Silver_sword extends SwordItem{
	public Silver_sword() {
		super(SilverItem_Tier.SILVER, 4, -2.4F, (new Item.Properties())
				.maxStackSize(1)
				.rarity(Rarity.RARE)
				.group(ItemGroups.ITEM_TAB)
				);
	}
}
