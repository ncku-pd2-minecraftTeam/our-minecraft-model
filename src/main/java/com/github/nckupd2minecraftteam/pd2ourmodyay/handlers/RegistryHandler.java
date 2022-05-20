package com.github.nckupd2minecraftteam.pd2ourmodyay.handlers;

import com.github.nckupd2minecraftteam.pd2ourmodyay.block.Blocks;
import com.github.nckupd2minecraftteam.pd2ourmodyay.item.Items;
import com.github.nckupd2minecraftteam.pd2ourmodyay.world.gen.ModOreGen;
import com.google.common.eventbus.Subscribe;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {
	private static IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();
	public static void registAll(){
		// item register
		Items.getRegister().register(RegistryHandler.BUS);
		// block register
		Blocks.getRegister().register(RegistryHandler.BUS);
	}

}
