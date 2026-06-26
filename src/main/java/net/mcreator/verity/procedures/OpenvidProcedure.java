package net.mcreator.verity.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.init.VerityModGameRules;
import net.mcreator.verity.entity.Verity1moredaysEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OpenvidProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(VerityModGameRules.VIDEOHAPPENED) == false) {
			if (!world.getEntitiesOfClass(Verity1moredaysEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.VIDEOHAPPENED).set(true, world.getServer());
				try {
					java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
					desktop.browse(new java.net.URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}