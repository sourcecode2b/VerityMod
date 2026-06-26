package net.mcreator.verity.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.verity.init.VerityModGameRules;
import net.mcreator.verity.init.VerityModEntities;
import net.mcreator.verity.VerityMod;

public class VerityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire()) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("verity:yelllava")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("verity:yelllava")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			world.getLevelData().getGameRules().getRule(VerityModGameRules.TALKANGRY).set(true, world.getServer());
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = VerityModEntities.ANGRYVERITYTALKING.get().spawn(_level, BlockPos.containing(x, y + 4, z - 4), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			VerityMod.queueServerWork(60, () -> {
				world.getLevelData().getGameRules().getRule(VerityModGameRules.TALKANGRY).set(false, world.getServer());
			});
		}
	}
}