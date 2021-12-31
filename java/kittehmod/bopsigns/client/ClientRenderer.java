package kittehmod.bopsigns.client;

import kittehmod.bopsigns.blockentities.BoPSignsBlockEntityType;
import kittehmod.bopsigns.client.renderer.BoPSignRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class ClientRenderer
{
	public static void setup() {
		BlockEntityRenderers.register(BoPSignsBlockEntityType.BOP_SIGN.get(), BoPSignRenderer::new);
	}
}
