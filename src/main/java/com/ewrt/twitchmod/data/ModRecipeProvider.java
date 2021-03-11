package com.ewrt.twitchmod.data;

import com.ewrt.twitchmod.TwitchMod;
import com.ewrt.twitchmod.setup.ModBlocks;
import com.ewrt.twitchmod.setup.ModItems;

import net.minecraft.data.*;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends  RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }
    
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.TWITCH_INGOT.get(), 9)
                .addIngredient(ModBlocks.TWITCH_BLOCK.get())
                .addCriterion("has_item", hasItem(ModBlocks.TWITCH_BLOCK.get()))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.TWITCH_BLOCK.get())
                .key('#', ModItems.TWITCH_INGOT.get())
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(ModItems.TWITCH_INGOT.get()))
                .build(consumer);
    }
    
    private static ResourceLocation modId(String path) {
        return new ResourceLocation(TwitchMod.MOD_ID, path);
    }

}
