package kittehmod.bopsigns.client.renderer;

import java.util.List;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import kittehmod.bopsigns.blockentities.BoPSignBlockEntity;
import kittehmod.bopsigns.blocks.BoPStandingSignBlock;
import kittehmod.bopsigns.blocks.BoPWallSignBlock;
import kittehmod.bopsigns.blocks.BoPWoodType;
import kittehmod.bopsigns.client.ClientHelper;
import net.minecraft.block.AbstractSignBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.WoodType;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.IReorderingProcessor;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BoPSignRenderer extends TileEntityRenderer<BoPSignBlockEntity>
{
	private final BoPSignRenderer.SignModel model = new BoPSignRenderer.SignModel();

	private static final RenderMaterial SIGN_MATERIAL_CHERRY = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.CHERRY_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_DEAD = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.DEAD_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_FIR = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.FIR_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_HELLBARK = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.HELLBARK_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_JACARANDA = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.JACARANDA_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_MAHOGANY = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.MAHOGANY_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_MAGIC = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.MAGIC_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_PALM = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.PALM_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_REDWOOD = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.REDWOOD_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_UMBRAN = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.UMBRAN_SIGN_LOCATION);
	private static final RenderMaterial SIGN_MATERIAL_WILLOW = new RenderMaterial(Atlases.SIGN_SHEET, ClientHelper.WILLOW_SIGN_LOCATION);

	public BoPSignRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(BoPSignBlockEntity tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		BlockState blockstate = tileEntityIn.getBlockState();
		matrixStackIn.pushPose();
		float f = 0.6666667F;
		if (blockstate.getBlock() instanceof BoPStandingSignBlock) {
			matrixStackIn.translate(0.5D, 0.5D, 0.5D);
			float f1 = -((float) (blockstate.getValue(BoPStandingSignBlock.ROTATION) * 360) / 16.0F);
			matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f1));
			this.model.stick.visible = true;
		} else {
			matrixStackIn.translate(0.5D, 0.5D, 0.5D);
			float f4 = -blockstate.getValue(BoPWallSignBlock.FACING).toYRot();
			matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f4));
			matrixStackIn.translate(0.0D, -0.3125D, -0.4375D);
			this.model.stick.visible = false;
		}

		matrixStackIn.pushPose();
		matrixStackIn.scale(f, -f, -f);
		RenderMaterial rendermaterial = getMaterial(blockstate.getBlock());
		IVertexBuilder ivertexbuilder = rendermaterial.buffer(bufferIn, this.model::renderType);
		this.model.sign.render(matrixStackIn, ivertexbuilder, combinedLightIn, combinedOverlayIn);
		this.model.stick.render(matrixStackIn, ivertexbuilder, combinedLightIn, combinedOverlayIn);
		matrixStackIn.popPose();
		FontRenderer fontrenderer = this.renderer.getFont();
		float f2 = 0.010416667F;
		matrixStackIn.translate(0.0D, (double) 0.33333334F, (double) 0.046666667F);
		matrixStackIn.scale(f2, -f2, f2);
		int i = tileEntityIn.getColor().getTextColor();
		double d0 = 0.4D;
		int j = (int) ((double) NativeImage.getR(i) * d0);
		int k = (int) ((double) NativeImage.getG(i) * d0);
		int l = (int) ((double) NativeImage.getB(i) * d0);
		int i1 = NativeImage.combine(0, l, k, j);

		for (int k1 = 0; k1 < 4; ++k1) {
			IReorderingProcessor ireorderingprocessor = tileEntityIn.getRenderMessage(k1, (p_243502_1_) -> {
				List<IReorderingProcessor> list = fontrenderer.split(p_243502_1_, 90);
				return list.isEmpty() ? IReorderingProcessor.EMPTY : list.get(0);
			});
			if (ireorderingprocessor != null) {
				float f3 = (float) (-fontrenderer.width(ireorderingprocessor) / 2);
				fontrenderer.drawInBatch(ireorderingprocessor, f3, (float) (k1 * 10 - 20), i1, false, matrixStackIn.last().pose(), bufferIn, false, 0, combinedLightIn);
			}
		}

		matrixStackIn.popPose();
	}

	public static RenderMaterial getMaterial(Block block) {
		WoodType wtype = ((AbstractSignBlock)block).type();
		if (wtype == BoPWoodType.CHERRY) {
			return SIGN_MATERIAL_CHERRY;
		} else if (wtype == BoPWoodType.DEAD) {
			return SIGN_MATERIAL_DEAD;
		} else if (wtype == BoPWoodType.FIR) {
			return SIGN_MATERIAL_FIR;
		} else if (wtype == BoPWoodType.HELLBARK) {
			return SIGN_MATERIAL_HELLBARK;
		} else if (wtype == BoPWoodType.JACARANDA) {
			return SIGN_MATERIAL_JACARANDA;
		} else if (wtype == BoPWoodType.MAGIC) {
			return SIGN_MATERIAL_MAGIC;
		} else if (wtype == BoPWoodType.MAHOGANY) {
			return SIGN_MATERIAL_MAHOGANY;
		} else if (wtype == BoPWoodType.PALM) {
			return SIGN_MATERIAL_PALM;
		} else if (wtype == BoPWoodType.REDWOOD) {
			return SIGN_MATERIAL_REDWOOD;
		} else if (wtype == BoPWoodType.UMBRAN) {
			return SIGN_MATERIAL_UMBRAN;
		} else if (wtype == BoPWoodType.WILLOW) {
			return SIGN_MATERIAL_WILLOW;
		} else {
			return SIGN_MATERIAL_CHERRY; // Fallback
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static final class SignModel extends Model
	{
		public final ModelRenderer sign = new ModelRenderer(64, 32, 0, 0);
		public final ModelRenderer stick;

		public SignModel() {
			super(RenderType::entityCutoutNoCull);
			this.sign.addBox(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F, 0.0F);
			this.stick = new ModelRenderer(64, 32, 0, 14);
			this.stick.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F);
		}

		public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
			this.sign.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
			this.stick.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
		}
	}
}
