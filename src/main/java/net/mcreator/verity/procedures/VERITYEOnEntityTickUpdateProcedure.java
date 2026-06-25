package net.mcreator.verity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.verity.init.VerityModGameRules;

public class VERITYEOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(VerityModGameRules.MONSTERTIME) == false) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}