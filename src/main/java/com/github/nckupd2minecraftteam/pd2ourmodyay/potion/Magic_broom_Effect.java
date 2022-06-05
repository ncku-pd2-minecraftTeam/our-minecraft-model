package com.github.nckupd2minecraftteam.pd2ourmodyay.potion;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class Magic_broom_Effect extends Effect{
	public Magic_broom_Effect() {
		super(EffectType.BENEFICIAL, 0xFFBB00);
		this.addAttributesModifier(
				LivingEntity.ENTITY_GRAVITY
				, "3d6a4d0c-a34d-47cc-b955-06f6fb5c7aa9"
				, -0.1D
				, AttributeModifier.Operation.ADDITION);
	}

}
