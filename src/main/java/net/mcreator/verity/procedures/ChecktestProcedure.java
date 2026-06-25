package net.mcreator.verity.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.init.VerityModGameRules;
import net.mcreator.verity.VerityMod;

public class ChecktestProcedure {
	public static void execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(VerityModGameRules.DAYSTHREWW) == true) {
			VerityMod.queueServerWork(100, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_2).set(true, world.getServer());
			});
			VerityMod.queueServerWork(200, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_2).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_1).set(true, world.getServer());
			});
			VerityMod.queueServerWork(300, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW_1).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.MONSTERTIME).set(true, world.getServer());
			});
			VerityMod.queueServerWork(500, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.MONSTERTIME).set(false, world.getServer());
				world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW).set(false, world.getServer());
			});
		}
	}
}