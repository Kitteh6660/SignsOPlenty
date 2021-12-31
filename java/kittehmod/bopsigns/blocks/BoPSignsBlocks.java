package kittehmod.bopsigns.blocks;

import kittehmod.bopsigns.BoPSignsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class BoPSignsBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "biomesoplenty");
	
    public static final RegistryObject<Block> CHERRY_SIGN = BLOCKS.register("cherry_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.CHERRY));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = BLOCKS.register("cherry_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.CHERRY));

    public static final RegistryObject<Block> DEAD_SIGN = BLOCKS.register("dead_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.DEAD));
    public static final RegistryObject<Block> DEAD_WALL_SIGN = BLOCKS.register("dead_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.DEAD));

    public static final RegistryObject<Block> FIR_SIGN = BLOCKS.register("fir_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.FIR));
    public static final RegistryObject<Block> FIR_WALL_SIGN = BLOCKS.register("fir_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.FIR));
    
    public static final RegistryObject<Block> HELLBARK_SIGN = BLOCKS.register("hellbark_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.HELLBARK));
    public static final RegistryObject<Block> HELLBARK_WALL_SIGN = BLOCKS.register("hellbark_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.HELLBARK));

    public static final RegistryObject<Block> JACARANDA_SIGN = BLOCKS.register("jacaranda_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_WALL_SIGN = BLOCKS.register("jacaranda_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.JACARANDA));

    public static final RegistryObject<Block> MAGIC_SIGN = BLOCKS.register("magic_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.MAGIC));
    public static final RegistryObject<Block> MAGIC_WALL_SIGN = BLOCKS.register("magic_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.MAGIC));

    public static final RegistryObject<Block> MAHOGANY_SIGN = BLOCKS.register("mahogany_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.MAHOGANY));
    public static final RegistryObject<Block> MAHOGANY_WALL_SIGN = BLOCKS.register("mahogany_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.MAHOGANY));

    public static final RegistryObject<Block> PALM_SIGN = BLOCKS.register("palm_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.PALM));
    public static final RegistryObject<Block> PALM_WALL_SIGN = BLOCKS.register("palm_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.PALM));
    
    public static final RegistryObject<Block> REDWOOD_SIGN = BLOCKS.register("redwood_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.REDWOOD));
    public static final RegistryObject<Block> REDWOOD_WALL_SIGN = BLOCKS.register("redwood_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.REDWOOD));

    public static final RegistryObject<Block> UMBRAN_SIGN = BLOCKS.register("umbran_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.UMBRAN));
    public static final RegistryObject<Block> UMBRAN_WALL_SIGN = BLOCKS.register("umbran_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.UMBRAN));

    public static final RegistryObject<Block> WILLOW_SIGN = BLOCKS.register("willow_sign", () -> new BoPStandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.WILLOW));
    public static final RegistryObject<Block> WILLOW_WALL_SIGN = BLOCKS.register("willow_wall_sign", () -> new BoPWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN).noCollission().strength(1.0F).sound(SoundType.WOOD), BoPWoodType.WILLOW));
    
    @EventBusSubscriber(modid = BoPSignsMod.MODID)
	public static class RegistrationHandler 
	{
		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
			return setup(entry, new ResourceLocation("biomesoplenty", name));
		}

		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
			entry.setRegistryName(registryName);
			return entry;
		}
		
	    @SubscribeEvent
	    public static void registerBlocks(final RegistryEvent.Register<Block> event) { 
	    	event.getRegistry().registerAll();
	    }
	    
	    /*@SubscribeEvent
	    public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
	    	event.getRegistry().registerAll();
	    }*/
	}
    
}
