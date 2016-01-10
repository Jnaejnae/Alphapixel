package com.alphapixel;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Alphapixel.MODID, version = Alphapixel.VERSION)
public class Alphapixel
{
    public static final String MODID = "alphapixel";
    public static final String VERSION = "0.0.1";
    
	@EventHandler
	public void init(FMLPreInitializationEvent event)
	{
		// some example code
	    System.out.println("preinit");
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("init");
    }

	
	@EventHandler
	public void init(FMLPostInitializationEvent event)
	{
		// some example code
	    System.out.println("postinit");
	}		
}
