package net.mcreator.verity.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.init.VerityModGameRules;
import net.mcreator.verity.VerityMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Phase2Procedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		VerityMod.queueServerWork(2000, () -> {
			world.getLevelData().getGameRules().getRule(VerityModGameRules.DISTURBED_1).set(true, world.getServer());
		});
	}
}