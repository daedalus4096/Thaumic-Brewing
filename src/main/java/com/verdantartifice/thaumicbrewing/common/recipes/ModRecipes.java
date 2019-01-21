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
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "night_vision_potion"), new CrucibleRecipe(
                "TBREW_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.NIGHT_VISION),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                new AspectList().add(Aspect.SENSES, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "fire_resistance_potion"), new CrucibleRecipe(
                "TBREW_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.FIRE_RESISTANCE),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                new AspectList().add(Aspect.COLD, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "swiftness_potion"), new CrucibleRecipe(
                "TBREW_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SWIFTNESS),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                new AspectList().add(Aspect.MOTION, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "water_breathing_potion"), new CrucibleRecipe(
                "TBREW_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER_BREATHING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                new AspectList().add(Aspect.AIR, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "healing_potion"), new CrucibleRecipe(
                "TBREW_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HEALING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                new AspectList().add(Aspect.LIFE, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strength_potion"), new CrucibleRecipe(
                "TBREW_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRENGTH),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                new AspectList().add(Aspect.AVERSION, 5).add(Aspect.ALCHEMY, 1)
        ));
    }
}
