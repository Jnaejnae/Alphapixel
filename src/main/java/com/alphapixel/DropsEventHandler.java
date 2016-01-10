package com.alphapixel;

import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropsEventHandler {
	
	  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)

	    public void onEvent(LivingDropsEvent event)
	    {
		  System.out.println("cancel drops");
		  event.drops.clear();
	    }  
}
