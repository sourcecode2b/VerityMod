package net.mcreator.verity.item;

public class FLASHLIGHTOFFItem extends Item {
	public FLASHLIGHTOFFItem() {
		super(new Item.Properties().stacksTo(1));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FLASHLIGHTOFFRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}