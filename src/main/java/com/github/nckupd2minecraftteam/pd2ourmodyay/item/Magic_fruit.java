package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Magic_fruit extends Item{
	public Magic_fruit() {
		super((new Item.Properties())
				.maxStackSize(64)
				.rarity(Rarity.RARE)
				.group(ItemGroups.ITEM_TAB)
				.food((new Food.Builder())
	                    .hunger(6)
	                    .saturation(14.4f)
	                    .effect(new EffectInstance(Effects.HUNGER,300), 0.3f)
	                    .effect(new EffectInstance(Effects.POISON,150,1), 0.3f)
	                    .build())
				);
	}
}
