package com.github.nckupd2minecraftteam.pd2ourmodyay.potion;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;

import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(OurModYay.MODID)
public class ModEffects {
	public static final Magic_broom_Effect MAGIC_BROOM_EFFECT = null;
	
	public static DeferredRegister<Effect> getRegister(){
        return ModEffects.EffectRegistry.REGISTER;
    }
	@SuppressWarnings("unused")
	 public static class EffectRegistry{
	        
			public static final DeferredRegister<Effect> REGISTER = new DeferredRegister<Effect>(ForgeRegistries.POTIONS, OurModYay.MODID);
	        
			
			public static final RegistryObject<Effect> OBJ_TESTEFFECT = EffectRegistry.REGISTER.register("testeffect", () -> new TestEffect());
	        public static final RegistryObject<Effect> OBJ_MAGIC_BROOM_EFFECT = EffectRegistry.REGISTER.register("magic_broom_effect", () -> new Magic_broom_Effect());
	 }
}
