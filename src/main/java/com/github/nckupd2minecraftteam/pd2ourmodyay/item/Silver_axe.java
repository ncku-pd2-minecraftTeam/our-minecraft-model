package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;


public class Silver_axe extends AxeItem{
	public Silver_axe() {
		super(SilverItem_Tier.SILVER, 5, -3.0F, (new Item.Properties())
				.maxStackSize(1)
				.rarity(Rarity.RARE)
				.group(ItemGroups.ITEM_TAB));

	}
}
