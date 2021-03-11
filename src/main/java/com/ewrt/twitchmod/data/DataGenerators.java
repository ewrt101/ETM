package com.ewrt.twitchmod.data;

import com.ewrt.twitchmod.TwitchMod;
import com.ewrt.twitchmod.data.client.ModBlockStateProvider;
import com.ewrt.twitchmod.data.client.ModItemModelProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;


@Mod.EventBusSubscriber(modid = TwitchMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
	
	private DataGenerators() {}
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		//items and blocks
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
        //tags
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
        //recipes
        gen.addProvider(new ModRecipeProvider(gen));
	}

}
