package net.mcreator.verity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.verity.entity.Verity2Entity;

public class TDayslefttrrewDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(Verity2Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(400 / 2d), e -> true).isEmpty()) {
			return true;
		}
		return false;
	}
}