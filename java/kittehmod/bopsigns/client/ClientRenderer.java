package kittehmod.bopsigns.client;

import kittehmod.bopsigns.blockentities.BoPSignsBlockEntityType;
import kittehmod.bopsigns.client.renderer.BoPSignRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientRenderer
{
	public static void setup() {
		ClientRegistry.bindTileEntityRenderer(BoPSignsBlockEntityType.BOP_SIGN.get(), BoPSignRenderer::new);
	}
}
