package kittehmod.bopsigns.blocks;

import kittehmod.bopsigns.blockentities.BoPSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BoPStandingSignBlock extends StandingSignBlock 
{	
	public BoPStandingSignBlock(Block.Properties properties, WoodType woodtype) {
		super(properties, woodtype);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new BoPSignBlockEntity(pos, state);
	}

}
