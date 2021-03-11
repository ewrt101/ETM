package com.ewrt.twitchmod.data;

import com.ewrt.twitchmod.TwitchMod;
import com.ewrt.twitchmod.setup.ModBlocks;
import com.ewrt.twitchmod.setup.ModTags;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
	public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, TwitchMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerTags() {
		getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_TWITCH).add(ModBlocks.TWITCH_BLOCK.get());
		getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TWITCH);
	}
}
