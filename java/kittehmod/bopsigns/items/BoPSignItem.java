package kittehmod.bopsigns.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SignItem;

public class BoPSignItem extends SignItem
{
	public BoPSignItem(Item.Properties properties, Block floorBlock, Block wallBlock) {
		super(properties, floorBlock, wallBlock);
	}
	
	@Override
	public int getBurnTime(ItemStack stack) {
		if (stack.getItem() == BoPSignsItems.HELLBARK_SIGN.get()) {
			return -1; // Hellbark sign can't be used as fuel in furnace.
		}
		else {
			return 200;
		}
	}
}
