package com.ewrt.twitchmod.data.client;

import com.ewrt.twitchmod.TwitchMod;
import com.ewrt.twitchmod.setup.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider{
	
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
		super(gen, TwitchMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ModBlocks.TWITCH_BLOCK.get());
	}

}
