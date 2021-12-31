package kittehmod.bopsigns.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BoPSignBlockEntity extends SignBlockEntity
{
	public BoPSignBlockEntity(BlockPos pos, BlockState state) {
		super(pos, state);
	}

	@Override
	public BlockEntityType<?> getType() {
		return BoPSignsBlockEntityType.BOP_SIGN.get();
	}
}
