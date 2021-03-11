package com.ewrt.twitchmod.data;

import com.ewrt.twitchmod.TwitchMod;
import com.ewrt.twitchmod.setup.ModItems;
import com.ewrt.twitchmod.setup.ModTags;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider{
	public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, TwitchMod.MOD_ID, existingFileHelper);
    }
	
	@Override
    protected void registerTags() {
        copy(ModTags.Blocks.STORAGE_BLOCKS_TWITCH, ModTags.Items.STORAGE_BLOCKS_TWITCH);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        

        getOrCreateBuilder(ModTags.Items.INGOTS_TWITCH).add(ModItems.TWITCH_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TWITCH);
    }
}
