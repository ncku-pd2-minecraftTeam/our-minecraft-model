package com.github.nckupd2minecraftteam.pd2ourmodyay;

import com.github.nckupd2minecraftteam.pd2ourmodyay.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;

@Mod(OurModYay.MODID)
public class OurModYay{
    public static final String MODID = "pd2ourmodyay";
    public static final String NAME = "our pd2 project";
    
    public OurModYay(){
    	RegistryHandler.registAll();
    }
}
