package net.mcreator.verity.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TestForEventProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		if (Math.random() > 0.99999) {
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
		}
	}
}