package net.mcreator.verity.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.verity.entity.Verity2Entity;
import net.mcreator.verity.client.model.animations.verityAnimation;
import net.mcreator.verity.client.model.Modelballbutbetter;

public class Verity2Renderer extends MobRenderer<Verity2Entity, Modelballbutbetter<Verity2Entity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("verity:textures/entities/17743587.5_eviltalking.png");

	public Verity2Renderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelballbutbetter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Verity2Entity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelballbutbetter<Verity2Entity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<Verity2Entity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Verity2Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, verityAnimation.bounce, ageInTicks, 1.5f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(Verity2Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}