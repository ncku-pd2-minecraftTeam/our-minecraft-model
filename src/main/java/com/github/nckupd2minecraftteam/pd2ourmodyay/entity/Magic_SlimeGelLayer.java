package com.github.nckupd2minecraftteam.pd2ourmodyay.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;

public class Magic_SlimeGelLayer <T extends LivingEntity> extends LayerRenderer<T, Magic_silver_slime_Model<T>>{
	private final EntityModel<T> slimeModel = new Magic_silver_slime_Model<>(0);

	   public Magic_SlimeGelLayer(IEntityRenderer<T, Magic_silver_slime_Model<T>> p_i50923_1_) {
	      super(p_i50923_1_);
	   }

	   public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
	      if (!entitylivingbaseIn.isInvisible()) {
	         this.getEntityModel().copyModelAttributesTo(this.slimeModel);
	         this.slimeModel.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
	         this.slimeModel.setRotationAngles(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	         IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntityTranslucent(this.getEntityTexture(entitylivingbaseIn)));
	         this.slimeModel.render(matrixStackIn, ivertexbuilder, packedLightIn, LivingRenderer.getPackedOverlay(entitylivingbaseIn, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
	      }
	   }
}
