// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.1.4 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class verityAnimation {
	public static final AnimationDefinition bounce = AnimationDefinition.Builder.withLength(2.2917F)
			.addAnimation("ball",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.4583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 40.0F, -1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2083F, KeyframeAnimations.posVec(0.0F, 71.0F, -1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 71.0F, -1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, 71.0F, -1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.3333F, KeyframeAnimations.posVec(0.0F, 71.0F, -1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 71.0F, -1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, 40.0F, -1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ball",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.4583F, KeyframeAnimations.scaleVec(1.0F, 0.2F, 1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8333F, KeyframeAnimations.scaleVec(1.0F, 2.7F, 0.6F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2083F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 0.9F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 0.9F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2917F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 0.9F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.3333F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 0.9F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 0.9F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.625F, KeyframeAnimations.scaleVec(1.0F, 2.7F, 0.6F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.9583F, KeyframeAnimations.scaleVec(1.0F, 0.2F, 1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.125F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}