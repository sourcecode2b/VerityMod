package net.mcreator.verity.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.verity.entity.VERITYEEntity;
import net.mcreator.verity.client.model.Modelveritymonster;

public class VERITYERenderer extends MobRenderer<VERITYEEntity, Modelveritymonster<VERITYEEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("verity:textures/entities/images__26_-removebg-preview.png");

	public VERITYERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelveritymonster<VERITYEEntity>(context.bakeLayer(Modelveritymonster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VERITYEEntity entity) {
		return entityTexture;
	}
}