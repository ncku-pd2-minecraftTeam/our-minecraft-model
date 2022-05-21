package com.github.nckupd2minecraftteam.pd2ourmodyay.bus;

import com.github.nckupd2minecraftteam.pd2ourmodyay.world.gen.ModOreGen;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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

}
