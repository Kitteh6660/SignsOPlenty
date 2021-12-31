package kittehmod.bopsigns.items;

import kittehmod.bopsigns.BoPSignsMod;
import kittehmod.bopsigns.blocks.BoPSignsBlocks;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BoPSignsItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "biomesoplenty");
	
	public static final RegistryObject<Item> CHERRY_SIGN = ITEMS.register("cherry_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.CHERRY_SIGN.get(), BoPSignsBlocks.CHERRY_WALL_SIGN.get()));
    public static final RegistryObject<Item> DEAD_SIGN = ITEMS.register("dead_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.DEAD_SIGN.get(), BoPSignsBlocks.DEAD_WALL_SIGN.get()));
    public static final RegistryObject<Item> FIR_SIGN = ITEMS.register("fir_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.FIR_SIGN.get(), BoPSignsBlocks.FIR_WALL_SIGN.get()));
    public static final RegistryObject<Item> HELLBARK_SIGN = ITEMS.register("hellbark_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.HELLBARK_SIGN.get(), BoPSignsBlocks.HELLBARK_WALL_SIGN.get()));
    public static final RegistryObject<Item> JACARANDA_SIGN = ITEMS.register("jacaranda_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.JACARANDA_SIGN.get(), BoPSignsBlocks.JACARANDA_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAGIC_SIGN = ITEMS.register("magic_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.MAGIC_SIGN.get(), BoPSignsBlocks.MAGIC_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAHOGANY_SIGN = ITEMS.register("mahogany_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.MAHOGANY_SIGN.get(), BoPSignsBlocks.MAHOGANY_WALL_SIGN.get()));
    public static final RegistryObject<Item> PALM_SIGN = ITEMS.register("palm_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.PALM_SIGN.get(), BoPSignsBlocks.PALM_WALL_SIGN.get()));
    public static final RegistryObject<Item> REDWOOD_SIGN = ITEMS.register("redwood_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.REDWOOD_SIGN.get(), BoPSignsBlocks.REDWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> UMBRAN_SIGN = ITEMS.register("umbran_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.UMBRAN_SIGN.get(), BoPSignsBlocks.UMBRAN_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab(getTabWithMatchingName("biomesoplenty")), BoPSignsBlocks.WILLOW_SIGN.get(), BoPSignsBlocks.WILLOW_WALL_SIGN.get()));
    
    private static CreativeModeTab getTabWithMatchingName(String tabName) {
    	CreativeModeTab tab = null;
    	for (CreativeModeTab tempTab : CreativeModeTab.TABS) {
    		TranslatableComponent tabComp = (TranslatableComponent) tempTab.getDisplayName();
    		if (tabComp.getKey().equalsIgnoreCase("itemGroup." + tabName)) {
    			tab = tempTab;
    			break;
    		}
    	}
    	return tab;
    }
    
    @EventBusSubscriber(modid = BoPSignsMod.MODID)
	public static class RegistrationHandler 
	{
	    @SubscribeEvent
	    public static void registerItems(final RegistryEvent.Register<Item> event) {
	    	event.getRegistry().registerAll();
	    }
	}
}
