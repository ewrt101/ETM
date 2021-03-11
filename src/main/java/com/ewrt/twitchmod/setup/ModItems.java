package com.ewrt.twitchmod.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;


public class ModItems {
	
	public static final RegistryObject<Item> TWITCH_INGOT = Registration.ITEMS.register("twitch_ingot", () -> 
	new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	static void register() {
		
	}
}
