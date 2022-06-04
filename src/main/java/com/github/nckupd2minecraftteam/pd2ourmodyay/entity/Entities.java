package com.github.nckupd2minecraftteam.pd2ourmodyay.entity;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
@ObjectHolder(OurModYay.MODID)
public class Entities {
	
	public static final EntityType<?> TEST_ANIMAL = null;
	public static final EntityType<?> MAGIC_SILVER_SLIME = null;

	public static DeferredRegister<EntityType<?>> getRegister(){
        return Entities.EntityRegistry.REGISTER;
    }
	
	@SuppressWarnings("unused")
	public static class EntityRegistry{
		public static final DeferredRegister<EntityType<?>> REGISTER = new DeferredRegister<EntityType<?>>(ForgeRegistries.ENTITIES, OurModYay.MODID);
		
		public static final RegistryObject<EntityType<Test_animal>> TEST_ANIMAL = EntityRegistry.REGISTER.register("test_animal", () -> EntityType.Builder.create(Test_animal::new, EntityClassification.CREATURE)
				.size(1, 1)
	            .setShouldReceiveVelocityUpdates(false)
	            .build(new ResourceLocation(OurModYay.MODID, "test_animal").toString()));
		
		public static final RegistryObject<EntityType<Magic_silver_slime>> MAGIC_SILVER_SLIME = EntityRegistry.REGISTER.register("magic_silver_slime", () -> EntityType.Builder.create(Magic_silver_slime::new, EntityClassification.CREATURE)
				.size(1, 1)
	            .setShouldReceiveVelocityUpdates(false)
	            .build(new ResourceLocation(OurModYay.MODID, "magic_silver_slime").toString()));
		
	}
}
