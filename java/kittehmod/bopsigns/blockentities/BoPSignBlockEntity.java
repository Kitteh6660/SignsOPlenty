package kittehmod.bopsigns.blockentities;

import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class BoPSignBlockEntity extends SignTileEntity
{
	public BoPSignBlockEntity() {
		super();
	}

	@Override
	public TileEntityType<?> getType() {
		return BoPSignsBlockEntityType.BOP_SIGN.get();
	}
}
