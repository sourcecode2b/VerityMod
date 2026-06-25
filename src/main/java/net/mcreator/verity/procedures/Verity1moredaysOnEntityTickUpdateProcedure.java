package net.mcreator.verity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.verity.init.VerityModGameRules;
import net.mcreator.verity.init.VerityModEntities;

public class Verity1moredaysOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(VerityModGameRules.MONSTERTIME) == true) {
			world.getLevelData().setRaining(true);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = VerityModEntities.VERITYE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("IM HUNGRY"), false);
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}