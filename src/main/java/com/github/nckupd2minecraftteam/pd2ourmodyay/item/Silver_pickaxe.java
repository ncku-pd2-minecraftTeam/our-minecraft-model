package com.github.nckupd2minecraftteam.pd2ourmodyay.item;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;

public class Silver_pickaxe extends PickaxeItem{
	Silver_pickaxe(){
		super(SilverItem_Tier.SILVER, 1, -2.8F,(new Item.Properties())
				.addToolType(ToolType.PICKAXE, 3)
				.maxStackSize(1)
				.rarity(Rarity.RARE)
				.group(ItemGroups.ITEM_TAB)
				);
	}
}
