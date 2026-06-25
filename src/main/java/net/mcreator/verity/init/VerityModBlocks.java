/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.verity.block.FlashlightblockBlock;
import net.mcreator.verity.block.BoxBlock;
import net.mcreator.verity.VerityMod;

public class VerityModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VerityMod.MODID);
	public static final RegistryObject<Block> BOX;
	public static final RegistryObject<Block> FLASHLIGHTBLOCK;
	static {
		BOX = REGISTRY.register("box", BoxBlock::new);
		FLASHLIGHTBLOCK = REGISTRY.register("flashlightblock", FlashlightblockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}