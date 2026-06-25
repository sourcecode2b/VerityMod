package net.mcreator.verity.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.verity.entity.Verity3Entity;
import net.mcreator.verity.client.model.animations.verityAnimation;

public class Verity3Renderer extends MobRenderer<Verity3Entity, OcelotModel<Verity3Entity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("verity:textures/entities/evil.png");

	public Verity3Renderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Verity3Entity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends OcelotModel<Verity3Entity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Verity3Entity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Verity3Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, verityAnimation.bounce, ageInTicks, 1.5f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Verity3Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}