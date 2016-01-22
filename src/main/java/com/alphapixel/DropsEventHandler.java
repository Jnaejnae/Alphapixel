package com.alphapixel;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropsEventHandler {
	
	  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)

	    public void onEvent(LivingDropsEvent event)
	    {
		  System.out.println("wool drops");
		  System.out.println(event.drops);
		  event.drops.clear();
		  System.out.println(event.drops);
		  if (event.entity instanceof EntitySheep)
		  {
			  Item wool = Item.getItemFromBlock(Blocks.wool);
			  int fleeceColor = ((EntitySheep)(event.entity)).getFleeceColor().getMetadata();
			  EntityItem dropItem = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(wool, 1, fleeceColor));		
			  event.entity.worldObj.spawnEntityInWorld(dropItem);
		  }
		  event.setResult(Result.DENY);
	    }  
}
