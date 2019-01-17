package com.verdantartifice.thaumicbrewing.common.recipes;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;

public class ModRecipes {
    public static void initializeRecipes() {
        initializeCrucibleRecipes();
    }
    
    private static void initializeCrucibleRecipes() {
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "healing_potion"), new CrucibleRecipe(
                "TBREW_HEALING_POTION",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HEALING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                new AspectList().add(Aspect.LIFE, 5).add(Aspect.ALCHEMY, 1)
        ));
    }
}
