/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.verity.client.renderer.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VerityModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(VerityModEntities.VERITY.get(), VerityRenderer::new);
		event.registerEntityRenderer(VerityModEntities.VERITY_2.get(), Verity2Renderer::new);
		event.registerEntityRenderer(VerityModEntities.VERITY_2MOREDAYS.get(), Verity2moredaysRenderer::new);
		event.registerEntityRenderer(VerityModEntities.VERITY_1MOREDAYS.get(), Verity1moredaysRenderer::new);
		event.registerEntityRenderer(VerityModEntities.VERITYE.get(), VERITYERenderer::new);
		event.registerEntityRenderer(VerityModEntities.VERITY_2NOTTALKING.get(), Verity2nottalkingRenderer::new);
		event.registerEntityRenderer(VerityModEntities.GOATMAN.get(), GoatmanRenderer::new);
		event.registerEntityRenderer(VerityModEntities.VERITYTALKING.get(), VeritytalkingRenderer::new);
		event.registerEntityRenderer(VerityModEntities.ANGRYVERITYTALKING.get(), AngryveritytalkingRenderer::new);
		event.registerEntityRenderer(VerityModEntities.ANGRYVERITY.get(), AngryverityRenderer::new);
	}
}