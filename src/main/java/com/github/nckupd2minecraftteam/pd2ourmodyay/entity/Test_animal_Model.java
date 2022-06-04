package com.github.nckupd2minecraftteam.pd2ourmodyay.entity;	

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class Test_animal_Model<T extends Test_animal> extends EntityModel<Test_animal>{
	public ModelRenderer body;
	
	public Test_animal_Model() {
		body = new ModelRenderer(this, 0, 0);
        body.addBox(-3, -3, -3, 6, 6, 6,false);
	}
	
	@Override
    public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        body.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }
	
	@Override
	public void setRotationAngles(Test_animal test_animal, float v, float v1, float v2, float v3, float v4) {

	}
}
