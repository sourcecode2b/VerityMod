/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.verity.VerityMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VerityModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VerityMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(VerityModItems.VERITY_SPAWN_EGG.get());
			tabData.accept(VerityModItems.VERITY_2_SPAWN_EGG.get());
			tabData.accept(VerityModItems.VERITY_2MOREDAYS_SPAWN_EGG.get());
			tabData.accept(VerityModItems.VERITY_1MOREDAYS_SPAWN_EGG.get());
			tabData.accept(VerityModItems.VERITYE_SPAWN_EGG.get());
			tabData.accept(VerityModItems.VERITY_2NOTTALKING_SPAWN_EGG.get());
			tabData.accept(VerityModItems.GOATMAN_SPAWN_EGG.get());
			tabData.accept(VerityModItems.VERITYTALKING_SPAWN_EGG.get());
			tabData.accept(VerityModItems.ANGRYVERITYTALKING_SPAWN_EGG.get());
			tabData.accept(VerityModItems.ANGRYVERITY_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(VerityModItems.VERITI.get());
			tabData.accept(VerityModItems.VERITI_2.get());
			tabData.accept(VerityModItems.VERITIDAY_2.get());
			tabData.accept(VerityModItems.VERITIDAY_1.get());
			tabData.accept(VerityModItems.VERITIDAY_3.get());
		}
	}
}