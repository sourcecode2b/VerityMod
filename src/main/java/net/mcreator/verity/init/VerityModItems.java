/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.verity.item.*;
import net.mcreator.verity.VerityMod;

public class VerityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VerityMod.MODID);
	public static final RegistryObject<Item> VERITY_SPAWN_EGG;
	public static final RegistryObject<Item> VERITI;
	public static final RegistryObject<Item> VERITY_2_SPAWN_EGG;
	public static final RegistryObject<Item> VERITY_3_SPAWN_EGG;
	public static final RegistryObject<Item> BOX;
	public static final RegistryObject<Item> VERITI_2;
	public static final RegistryObject<Item> VERITY_2MOREDAYS_SPAWN_EGG;
	public static final RegistryObject<Item> VERITY_1MOREDAYS_SPAWN_EGG;
	public static final RegistryObject<Item> VERITIDAY_2;
	public static final RegistryObject<Item> VERITIDAY_1;
	public static final RegistryObject<Item> VERITYE_SPAWN_EGG;
	public static final RegistryObject<Item> FLASHLIGHTBLOCK;
	public static final RegistryObject<Item> FLASHLIGHTOFF;
	public static final RegistryObject<Item> FLASHLIGHT;
	static {
		VERITY_SPAWN_EGG = REGISTRY.register("verity_spawn_egg", () -> new ForgeSpawnEggItem(VerityModEntities.VERITY, -256, -13261, new Item.Properties()));
		VERITI = REGISTRY.register("veriti", VeritiItem::new);
		VERITY_2_SPAWN_EGG = REGISTRY.register("verity_2_spawn_egg", () -> new ForgeSpawnEggItem(VerityModEntities.VERITY_2, -256, -13261, new Item.Properties()));
		VERITY_3_SPAWN_EGG = REGISTRY.register("verity_3_spawn_egg", () -> new ForgeSpawnEggItem(VerityModEntities.VERITY_3, -256, -13261, new Item.Properties()));
		BOX = block(VerityModBlocks.BOX);
		VERITI_2 = REGISTRY.register("veriti_2", Veriti2Item::new);
		VERITY_2MOREDAYS_SPAWN_EGG = REGISTRY.register("verity_2moredays_spawn_egg", () -> new ForgeSpawnEggItem(VerityModEntities.VERITY_2MOREDAYS, -256, -13261, new Item.Properties()));
		VERITY_1MOREDAYS_SPAWN_EGG = REGISTRY.register("verity_1moredays_spawn_egg", () -> new ForgeSpawnEggItem(VerityModEntities.VERITY_1MOREDAYS, -256, -13261, new Item.Properties()));
		VERITIDAY_2 = REGISTRY.register("veritiday_2", Veritiday2Item::new);
		VERITIDAY_1 = REGISTRY.register("veritiday_1", Veritiday1Item::new);
		VERITYE_SPAWN_EGG = REGISTRY.register("veritye_spawn_egg", () -> new ForgeSpawnEggItem(VerityModEntities.VERITYE, -6710887, -256, new Item.Properties()));
		FLASHLIGHTBLOCK = block(VerityModBlocks.FLASHLIGHTBLOCK);
		FLASHLIGHTOFF = REGISTRY.register("flashlightoff", FLASHLIGHTOFFItem::new);
		FLASHLIGHT = REGISTRY.register("flashlight", FlashlightItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}