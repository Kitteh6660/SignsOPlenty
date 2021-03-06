package kittehmod.bopsigns.blockentities;

import kittehmod.bopsigns.BoPSignsMod;
import kittehmod.bopsigns.blocks.BoPSignsBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BoPSignsBlockEntityType
{
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, "biomesoplenty");

	public static RegistryObject<BlockEntityType<BoPSignBlockEntity>> BOP_SIGN = BLOCK_ENTITIES.register("bop_sign", () -> BlockEntityType.Builder.of(BoPSignBlockEntity::new, 
		BoPSignsBlocks.CHERRY_SIGN.get(), BoPSignsBlocks.CHERRY_WALL_SIGN.get(),
		BoPSignsBlocks.DEAD_SIGN.get(), BoPSignsBlocks.DEAD_WALL_SIGN.get(),
		BoPSignsBlocks.FIR_SIGN.get(), BoPSignsBlocks.FIR_WALL_SIGN.get(),
		BoPSignsBlocks.HELLBARK_SIGN.get(), BoPSignsBlocks.HELLBARK_WALL_SIGN.get(),
		BoPSignsBlocks.JACARANDA_SIGN.get(), BoPSignsBlocks.JACARANDA_WALL_SIGN.get(),
		BoPSignsBlocks.MAGIC_SIGN.get(), BoPSignsBlocks.MAGIC_WALL_SIGN.get(),
		BoPSignsBlocks.MAHOGANY_SIGN.get(), BoPSignsBlocks.MAHOGANY_WALL_SIGN.get(),
		BoPSignsBlocks.PALM_SIGN.get(), BoPSignsBlocks.PALM_WALL_SIGN.get(),
		BoPSignsBlocks.REDWOOD_SIGN.get(), BoPSignsBlocks.REDWOOD_WALL_SIGN.get(),
		BoPSignsBlocks.UMBRAN_SIGN.get(), BoPSignsBlocks.UMBRAN_WALL_SIGN.get(),
		BoPSignsBlocks.WILLOW_SIGN.get(), BoPSignsBlocks.WILLOW_WALL_SIGN.get()
	).build(null));
	
	@Mod.EventBusSubscriber(modid = BoPSignsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration
    {
        @SubscribeEvent
        public static void onBlockEntityRegistry(final RegistryEvent.Register<BlockEntityType<?>> e)
        {
            e.getRegistry().registerAll();
        }
    }
}
