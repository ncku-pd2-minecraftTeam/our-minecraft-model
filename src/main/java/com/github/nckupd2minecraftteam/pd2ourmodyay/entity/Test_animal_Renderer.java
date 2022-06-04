package com.github.nckupd2minecraftteam.pd2ourmodyay.entity;

import javax.annotation.Nullable;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class Test_animal_Renderer extends MobRenderer<Test_animal, Test_animal_Model<Test_animal>>{
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(OurModYay.MODID, "textures/entity/test_animal.png");

	public Test_animal_Renderer(EntityRendererManager manager) {
        super(manager, new Test_animal_Model<Test_animal>(), 0.5f);
    }
	@Nullable
    @Override
	public ResourceLocation getEntityTexture(final Test_animal entity) {
        return TEXTURE;
    }
}
