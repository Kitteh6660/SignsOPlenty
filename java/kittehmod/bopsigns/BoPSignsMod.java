package kittehmod.bopsigns;

import kittehmod.bopsigns.blockentities.BoPSignsBlockEntityType;
import kittehmod.bopsigns.blocks.BoPSignsBlocks;
import kittehmod.bopsigns.client.ClientRenderer;
import kittehmod.bopsigns.items.BoPSignsItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("bop_signs")
public class BoPSignsMod
{

	public static final String MODID = "bop_signs";
	
    public BoPSignsMod() {
    	MinecraftForge.EVENT_BUS.register(this);
    	BoPSignsBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	BoPSignsItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	BoPSignsBlockEntityType.BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> { FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient); });
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
    	//Nope!
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	ClientRenderer.setup();
    }

}
