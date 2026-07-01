// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.1.4 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class ballbutbetterAnimation {
	public static final AnimationDefinition animation = AnimationDefinition.Builder.withLength(1.0F).looping()
			.addAnimation("sphere",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(357.5F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}