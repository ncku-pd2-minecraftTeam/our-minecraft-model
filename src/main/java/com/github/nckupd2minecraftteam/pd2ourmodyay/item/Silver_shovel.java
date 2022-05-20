package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.common.ToolType;

public class Silver_shovel extends ShovelItem{
	public Silver_shovel() {
		super(SilverItem_Tier.SILVER, 1.5F, -3.0F,(new Item.Properties())
				.addToolType(ToolType.SHOVEL, 3)
				.maxStackSize(1)
				.rarity(Rarity.RARE)
				.group(ItemGroups.ITEM_TAB)
				);
	}
}
