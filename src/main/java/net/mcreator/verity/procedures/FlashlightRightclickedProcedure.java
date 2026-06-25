package net.mcreator.verity.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FlashlightRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack5 = new ItemStack(VerityModItems.DELETED_MOD_ELEMENT.get()).copy();
				_setstack5.setCount(itemstack.getCount());
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}