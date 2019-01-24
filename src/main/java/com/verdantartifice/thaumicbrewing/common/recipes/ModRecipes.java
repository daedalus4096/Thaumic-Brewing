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
        // Basic potion recipes
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
        
        // Advanced potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "invisibility_potion"), new CrucibleRecipe(
                "TBREW_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.INVISIBILITY),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.NIGHT_VISION),
                new AspectList().add(Aspect.VOID, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "leaping_potion"), new CrucibleRecipe(
                "TBREW_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LEAPING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SWIFTNESS),
                new AspectList().add(Aspect.FLIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "regeneration_potion"), new CrucibleRecipe(
                "TBREW_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.REGENERATION),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HEALING),
                new AspectList().add(Aspect.ORDER, 5).add(Aspect.ALCHEMY, 1)
        ));
        
        // Harmful potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "slowness_potion"), new CrucibleRecipe(
                "TBREW_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SLOWNESS),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SWIFTNESS),
                new AspectList().add(Aspect.ENTROPY, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "harming_potion"), new CrucibleRecipe(
                "TBREW_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HARMING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HEALING),
                new AspectList().add(Aspect.ENTROPY, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "poison_potion"), new CrucibleRecipe(
                "TBREW_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.POISON),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.REGENERATION),
                new AspectList().add(Aspect.ENTROPY, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "weakness_potion"), new CrucibleRecipe(
                "TBREW_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WEAKNESS),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRENGTH),
                new AspectList().add(Aspect.ENTROPY, 5).add(Aspect.ALCHEMY, 1)
        ));
        
        // Powerful basic potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strong_swiftness_potion"), new CrucibleRecipe(
                "TBREW_STRONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_SWIFTNESS),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SWIFTNESS),
                new AspectList().add(Aspect.ENERGY, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strong_healing_potion"), new CrucibleRecipe(
                "TBREW_STRONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_HEALING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HEALING),
                new AspectList().add(Aspect.ENERGY, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strong_strength_potion"), new CrucibleRecipe(
                "TBREW_STRONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_STRENGTH),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRENGTH),
                new AspectList().add(Aspect.ENERGY, 5).add(Aspect.ALCHEMY, 1)
        ));

        // Powerful advanced potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strong_leaping_potion"), new CrucibleRecipe(
                "TBREW_STRONG_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_LEAPING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LEAPING),
                new AspectList().add(Aspect.ENERGY, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strong_regeneration_potion"), new CrucibleRecipe(
                "TBREW_STRONG_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_REGENERATION),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.REGENERATION),
                new AspectList().add(Aspect.ENERGY, 5).add(Aspect.ALCHEMY, 1)
        ));
        
        // Powerful harmful potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strong_harming_potion"), new CrucibleRecipe(
                "TBREW_STRONG_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_HARMING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.HARMING),
                new AspectList().add(Aspect.ENERGY, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "strong_poison_potion"), new CrucibleRecipe(
                "TBREW_STRONG_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRONG_POISON),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.POISON),
                new AspectList().add(Aspect.ENERGY, 5).add(Aspect.ALCHEMY, 1)
        ));
        
        // Extended basic potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_night_vision_potion"), new CrucibleRecipe(
                "TBREW_LONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_NIGHT_VISION),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.NIGHT_VISION),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_fire_resistance_potion"), new CrucibleRecipe(
                "TBREW_LONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_FIRE_RESISTANCE),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.FIRE_RESISTANCE),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_swiftness_potion"), new CrucibleRecipe(
                "TBREW_LONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_SWIFTNESS),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SWIFTNESS),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_water_breathing_potion"), new CrucibleRecipe(
                "TBREW_LONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_WATER_BREATHING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER_BREATHING),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_strength_potion"), new CrucibleRecipe(
                "TBREW_LONG_BASIC_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_STRENGTH),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.STRENGTH),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));

        // Extended advanced potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_invisibility_potion"), new CrucibleRecipe(
                "TBREW_LONG_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_INVISIBILITY),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.INVISIBILITY),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_leaping_potion"), new CrucibleRecipe(
                "TBREW_LONG_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_LEAPING),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LEAPING),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_regeneration_potion"), new CrucibleRecipe(
                "TBREW_LONG_ADVANCED_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_REGENERATION),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.REGENERATION),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        
        // Extended harmful potion recipes
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_slowness_potion"), new CrucibleRecipe(
                "TBREW_LONG_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_SLOWNESS),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.SLOWNESS),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_poison_potion"), new CrucibleRecipe(
                "TBREW_LONG_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_POISON),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.POISON),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
        ThaumcraftApi.addCrucibleRecipe(new ResourceLocation("thaumicbrewing", "long_weakness_potion"), new CrucibleRecipe(
                "TBREW_LONG_HARMFUL_POTIONS",
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_WEAKNESS),
                PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WEAKNESS),
                new AspectList().add(Aspect.LIGHT, 5).add(Aspect.ALCHEMY, 1)
        ));
    }
}
