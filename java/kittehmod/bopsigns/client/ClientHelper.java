package kittehmod.bopsigns.client;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientHelper {
	
	public static final ResourceLocation CHERRY_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/cherry");
	public static final ResourceLocation DEAD_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/dead");
	public static final ResourceLocation FIR_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/fir");
	public static final ResourceLocation HELLBARK_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/hellbark");
	public static final ResourceLocation JACARANDA_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/jacaranda");
	public static final ResourceLocation MAGIC_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/magic");
	public static final ResourceLocation MAHOGANY_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/mahogany");
	public static final ResourceLocation PALM_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/palm");
	public static final ResourceLocation REDWOOD_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/redwood");
	public static final ResourceLocation UMBRAN_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/umbran");
	public static final ResourceLocation WILLOW_SIGN_LOCATION = new ResourceLocation("biomesoplenty", "entity/signs/willow");

	
	@SubscribeEvent
	public static void onStitch(TextureStitchEvent.Pre event) {
		if (event.getMap().location().equals(Sheets.SIGN_SHEET)) {
			event.addSprite(CHERRY_SIGN_LOCATION);
			event.addSprite(DEAD_SIGN_LOCATION);
			event.addSprite(FIR_SIGN_LOCATION);
			event.addSprite(HELLBARK_SIGN_LOCATION);
			event.addSprite(JACARANDA_SIGN_LOCATION);
			event.addSprite(MAGIC_SIGN_LOCATION);
			event.addSprite(MAHOGANY_SIGN_LOCATION);
			event.addSprite(PALM_SIGN_LOCATION);
			event.addSprite(REDWOOD_SIGN_LOCATION);
			event.addSprite(UMBRAN_SIGN_LOCATION);
			event.addSprite(WILLOW_SIGN_LOCATION);
		}
	}
}
