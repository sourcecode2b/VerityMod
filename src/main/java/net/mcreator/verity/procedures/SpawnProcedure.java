package net.mcreator.verity.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.init.VerityModGameRules;

public class SpawnProcedure {
	public static void execute(LevelAccessor world) {
		world.getLevelData().getGameRules().getRule(VerityModGameRules.DAYSTHREWW).set(true, world.getServer());
	}
}