package com.github.nckupd2minecraftteam.pd2ourmodyay.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import com.github.nckupd2minecraftteam.pd2ourmodyay.potion.ModEffects;

public class Magic_broom extends Item{
	public Magic_broom() {
		super((new Item.Properties())
				.maxStackSize(1)
				.rarity(Rarity.EPIC)
				.group(ItemGroups.ITEM_TAB));
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn){
		playerIn.addPotionEffect(new EffectInstance(ModEffects.MAGIC_BROOM_EFFECT.getEffect(),40));
		playerIn.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING,200));
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
