package net.mcreator.verity.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.VerityMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MakenoteProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		VerityMod.queueServerWork(2000, () -> {
			try {
				String desktop = System.getProperty("user.home") + "\\Desktop";
				java.io.File file = new java.io.File(desktop, "READ_ME.txt");
				java.io.PrintWriter writer = new java.io.PrintWriter(file);
				writer.println("im becoming more aware");
				writer.println();
				writer.println("i got in your computer");
				writer.close();
				new ProcessBuilder("notepad.exe", file.getAbsolutePath()).start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}