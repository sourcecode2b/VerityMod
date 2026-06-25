package net.mcreator.verity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.verity.init.VerityModItems;
import net.mcreator.verity.init.VerityModGameRules;

public class Verity2RightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			world.getLevelData().getGameRules().getRule(VerityModGameRules.DISTURBED_1).set(false, world.getServer());
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack4 = new ItemStack(VerityModItems.VERITI.get()).copy();
				_setstack4.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}