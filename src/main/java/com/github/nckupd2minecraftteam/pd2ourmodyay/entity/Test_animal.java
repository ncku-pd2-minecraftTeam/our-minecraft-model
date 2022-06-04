package com.github.nckupd2minecraftteam.pd2ourmodyay.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

public class Test_animal extends AnimalEntity{
	public Test_animal(EntityType<? extends AnimalEntity> type, final World worldIn) {
        super(type, worldIn);
    }
	
	 @Nullable
	 @Override
	 public AgeableEntity createChild(AgeableEntity ageable) {
	        return null;	
	 }
}
	