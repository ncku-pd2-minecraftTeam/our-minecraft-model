package com.github.nckupd2minecraftteam.pd2ourmodyay.bus;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;
import com.github.nckupd2minecraftteam.pd2ourmodyay.entity.Entities;
import com.github.nckupd2minecraftteam.pd2ourmodyay.entity.Magic_silver_slime_Renderer;
import com.github.nckupd2minecraftteam.pd2ourmodyay.entity.Test_animal_Renderer;
import com.github.nckupd2minecraftteam.pd2ourmodyay.item.Items;
import com.github.nckupd2minecraftteam.pd2ourmodyay.world.gen.ModOreGen;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@Mod.EventBusSubscriber(modid = OurModYay.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ModEventHandlers {
    private static final IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public static void registEvents(){
        ModEventHandlers.BUS.register(ModEventHandlers.class);
        ModEventHandlers.BUS.register(new ModEventHandlers());
    }

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event){
        ModOreGen.generatorOre();
    }
    
    @SubscribeEvent
    public static void onItemColor(ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, i) -> 0xff0000, Items.TEST_ANIMAL_EGG);
        event.getItemColors().register((stack, i) -> 0xff0000, Items.MAGIC_SILVER_SLIME_EGG);
    }	
    
    @SubscribeEvent
	public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {
		// Register TileEntity Renderers
    	RenderingRegistry.registerEntityRenderingHandler(Entities.EntityRegistry.TEST_ANIMAL.get(), Test_animal_Renderer::new);
    	RenderingRegistry.registerEntityRenderingHandler(Entities.EntityRegistry.MAGIC_SILVER_SLIME.get(), Magic_silver_slime_Renderer::new);
    
    }

}
