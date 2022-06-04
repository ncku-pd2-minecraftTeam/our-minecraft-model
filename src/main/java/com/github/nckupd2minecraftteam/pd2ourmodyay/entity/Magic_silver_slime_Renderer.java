package com.github.nckupd2minecraftteam.pd2ourmodyay.entity;


import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;



@OnlyIn(Dist.CLIENT)
public class Magic_silver_slime_Renderer extends MobRenderer<Magic_silver_slime, Magic_silver_slime_Model<Magic_silver_slime>>{
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(OurModYay.MODID, "textures/entity/magic_silver_slime.png");
	
	public Magic_silver_slime_Renderer(EntityRendererManager manager) {
        super(manager, new Magic_silver_slime_Model<>(16), 0.25F);
        this.addLayer(new Magic_SlimeGelLayer<>(this));
    }
	
	
	public void render(Magic_silver_slime entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
	      this.shadowSize = 0.25F * (float)entityIn.getSlimeSize();
	      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	   }
	
	protected void preRenderCallback(Magic_silver_slime entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
	      float f = 0.999F;
	      matrixStackIn.scale(0.999F, 0.999F, 0.999F);
	      matrixStackIn.translate(0.0D, (double)0.001F, 0.0D);
	      float f1 = (float)entitylivingbaseIn.getSlimeSize();
	      float f2 = MathHelper.lerp(partialTickTime, entitylivingbaseIn.prevSquishFactor, entitylivingbaseIn.squishFactor) / (f1 * 0.5F + 1.0F);
	      float f3 = 1.0F / (f2 + 1.0F);
	      matrixStackIn.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
	   }
	
	
	public ResourceLocation getEntityTexture(Magic_silver_slime entity) {
        return TEXTURE;
    }
}
