package com.github.nckupd2minecraftteam.pd2ourmodyay.handlers;

import com.github.nckupd2minecraftteam.pd2ourmodyay.block.Blocks;
import com.github.nckupd2minecraftteam.pd2ourmodyay.entity.Entities;
import com.github.nckupd2minecraftteam.pd2ourmodyay.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {
	private static IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();
	public static void registAll(){
		// item register
		Items.getRegister().register(RegistryHandler.BUS);
		// block register
		Blocks.getRegister().register(RegistryHandler.BUS);
		// entities register
		Entities.getRegister().register(RegistryHandler.BUS);
	}

}
