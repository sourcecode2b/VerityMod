package net.mcreator.verity.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.verity.entity.Verity1moredaysEntity;
import net.mcreator.verity.client.model.animations.ballbutbetterAnimation;
import net.mcreator.verity.client.model.Modelballbutbetter;

public class Verity1moredaysRenderer extends MobRenderer<Verity1moredaysEntity, Modelballbutbetter<Verity1moredaysEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("verity:textures/entities/17736939.100000024_evil.png");

	public Verity1moredaysRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelballbutbetter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Verity1moredaysEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelballbutbetter<Verity1moredaysEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Verity1moredaysEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Verity1moredaysEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(ballbutbetterAnimation.animation, limbSwing, limbSwingAmount, 0.8f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Verity1moredaysEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}