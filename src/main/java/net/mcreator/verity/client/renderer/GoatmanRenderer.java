package net.mcreator.verity.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.verity.entity.GoatmanEntity;
import net.mcreator.verity.client.model.ModelGoatman;

public class GoatmanRenderer extends MobRenderer<GoatmanEntity, ModelGoatman<GoatmanEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("verity:textures/entities/is-anyone-interested-in-making-a-twixxels-stalker-3d-v0-pjo5soiqsm8h1_1.png");

	public GoatmanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGoatman<GoatmanEntity>(context.bakeLayer(ModelGoatman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoatmanEntity entity) {
		return entityTexture;
	}
}