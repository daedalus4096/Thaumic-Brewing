package com.verdantartifice.thaumicbrewing;

import org.apache.logging.log4j.Logger;

import com.verdantartifice.thaumicbrewing.common.recipes.ModRecipes;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;

@Mod(modid = ThaumicBrewing.MODID, name = ThaumicBrewing.NAME, version = ThaumicBrewing.VERSION, dependencies = ThaumicBrewing.DEPENDENCIES)
public class ThaumicBrewing
{
    public static final String MODID = "thaumicbrewing";
    public static final String NAME = "Thaumic Brewing";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDENCIES = "required-after:thaumcraft";
    
    public static Logger LOGGER;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LOGGER = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.initializeRecipes();
        ResearchCategories.registerCategory("THAUMIC_BREWING", "UNLOCKALCHEMY", new AspectList(), new ResourceLocation("minecraft","textures/items/brewing_stand.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_1.jpg"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_over.png"));
        ThaumcraftApi.registerResearchLocation(new ResourceLocation("thaumicbrewing", "research/potions" ));
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModRecipes.tweakResearchIcons();
    }
}
