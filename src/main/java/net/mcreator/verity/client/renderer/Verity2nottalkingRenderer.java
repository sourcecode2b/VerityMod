package net.mcreator.verity.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.verity.entity.Verity2nottalkingEntity;
import net.mcreator.verity.client.model.animations.ballbutbetterAnimation;
import net.mcreator.verity.client.model.Modelballbutbetter;

public class Verity2nottalkingRenderer extends MobRenderer<Verity2nottalkingEntity, Modelballbutbetter<Verity2nottalkingEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("verity:textures/entities/17736939.100000024_evil.png");

	public Verity2nottalkingRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelballbutbetter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Verity2nottalkingEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelballbutbetter<Verity2nottalkingEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Verity2nottalkingEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Verity2nottalkingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(ballbutbetterAnimation.animation, limbSwing, limbSwingAmount, 0.8f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Verity2nottalkingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}