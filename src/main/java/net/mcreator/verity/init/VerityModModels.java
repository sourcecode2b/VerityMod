/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.verity.client.model.Modelveritymonster;
import net.mcreator.verity.client.model.Modeltwodman;
import net.mcreator.verity.client.model.Modelballofverity;
import net.mcreator.verity.client.model.ModelGoatman;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VerityModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltwodman.LAYER_LOCATION, Modeltwodman::createBodyLayer);
		event.registerLayerDefinition(Modelveritymonster.LAYER_LOCATION, Modelveritymonster::createBodyLayer);
		event.registerLayerDefinition(ModelGoatman.LAYER_LOCATION, ModelGoatman::createBodyLayer);
		event.registerLayerDefinition(Modelballofverity.LAYER_LOCATION, Modelballofverity::createBodyLayer);
	}
}