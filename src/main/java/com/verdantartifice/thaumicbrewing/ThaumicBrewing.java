package com.verdantartifice.thaumicbrewing;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchCategory;

import org.apache.logging.log4j.Logger;

@Mod(modid = ThaumicBrewing.MODID, name = ThaumicBrewing.NAME, version = ThaumicBrewing.VERSION, dependencies = ThaumicBrewing.DEPENDENCIES)
public class ThaumicBrewing
{
    public static final String MODID = "thaumic-brewing";
    public static final String NAME = "Thaumic Brewing";
    public static final String VERSION = "0.0.1";
    public static final String DEPENDENCIES = "required-after:thaumcraft";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ResearchCategories.registerCategory("THAUMIC_BREWING", "UNLOCKALCHEMY", new AspectList(), new ResourceLocation("minecraft","textures/items/potion_bottle_drinkable.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_1.jpg"), new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_over.png"));
        ThaumcraftApi.registerResearchLocation(new ResourceLocation("thaumicbrewing", "research/potions" ));
    }
}
