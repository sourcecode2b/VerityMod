package net.mcreator.verity.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.init.VerityModGameRules;
import net.mcreator.verity.VerityMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(VerityModGameRules.DAYSTHREWW) == true) {
			VerityMod.queueServerWork(24000, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_2).set(true, world.getServer());
			});
			VerityMod.queueServerWork(48000, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_2).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_1).set(true, world.getServer());
			});
			VerityMod.queueServerWork(72000, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_1).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.MONSTERTIME).set(true, world.getServer());
			});
			VerityMod.queueServerWork(74000, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.MONSTERTIME).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW).set(false, world.getServer());
			});
		}
	}
}