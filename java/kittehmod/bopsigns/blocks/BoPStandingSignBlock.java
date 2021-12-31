package kittehmod.bopsigns.blocks;

import kittehmod.bopsigns.blockentities.BoPSignBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class BoPStandingSignBlock extends StandingSignBlock 
{	
	public BoPStandingSignBlock(Block.Properties properties, WoodType woodtype) {
		super(properties, woodtype);
	}

	@Override
	public TileEntity newBlockEntity(IBlockReader reader) {
		return new BoPSignBlockEntity();
	}

}
