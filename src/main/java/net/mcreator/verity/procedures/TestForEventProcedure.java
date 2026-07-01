package net.mcreator.verity.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.VerityMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TestForEventProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		VerityMod.queueServerWork(1200, () -> {
			net.minecraft.client.Minecraft mc = net.minecraft.client.Minecraft.getInstance();
			mc.execute(() -> {
				net.minecraft.client.Screenshot.grab(mc.gameDirectory, mc.getMainRenderTarget(), component -> {
					try {
						java.io.File screenshotFolder = new java.io.File(mc.gameDirectory, "screenshots");
						java.io.File newest = java.util.Arrays.stream(screenshotFolder.listFiles((dir, name) -> name.endsWith(".png"))).max(java.util.Comparator.comparingLong(java.io.File::lastModified)).orElse(null);
						if (newest != null) {
							java.io.File renamed = new java.io.File(screenshotFolder, "iminyoursystemnow.png");
							// Delete old file if it already exists
							if (renamed.exists())
								renamed.delete();
							newest.renameTo(renamed);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
			});
		});
	}
}