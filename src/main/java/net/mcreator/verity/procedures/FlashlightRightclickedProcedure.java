package net.mcreator.verity.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.verity.init.VerityModItems;

public class FlashlightRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack5 = new ItemStack(VerityModItems.FLASHLIGHTOFF.get()).copy();
				_setstack5.setCount(itemstack.getCount());
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}