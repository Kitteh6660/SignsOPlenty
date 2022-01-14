package kittehmod.bopsigns.items;

import javax.annotation.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class BoPSignItem extends SignItem
{
	public BoPSignItem(Item.Properties properties, Block floorBlock, Block wallBlock) {
		super(properties, floorBlock, wallBlock);
	}
	
	@Override
	public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
		if (stack.getItem() == BoPSignsItems.HELLBARK_SIGN.get()) {
			return -1; // Hellbark sign can't be used as fuel in furnace.
		}
		else {
			return 200;
		}
	}
}
