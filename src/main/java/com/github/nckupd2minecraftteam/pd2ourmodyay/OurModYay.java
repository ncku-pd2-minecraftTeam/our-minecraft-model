package com.github.nckupd2minecraftteam.pd2ourmodyay;

import com.github.nckupd2minecraftteam.pd2ourmodyay.bus.ModEventHandlers;
import com.github.nckupd2minecraftteam.pd2ourmodyay.handlers.RegistryHandler;
import com.github.nckupd2minecraftteam.pd2ourmodyay.world.gen.ModOreGen;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod(OurModYay.MODID)
public class OurModYay{
    public static final String MODID = "pd2ourmodyay";
    public static final String NAME = "our pd2 project";

    public OurModYay(){
    	RegistryHandler.registAll();
        ModEventHandlers.registEvents();
    }
}
