/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.verity.VerityMod;

public class VerityModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VerityMod.MODID);
	public static final RegistryObject<SoundEvent> VOICE1 = REGISTRY.register("voice1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("verity", "voice1")));
	public static final RegistryObject<SoundEvent> VOICE2 = REGISTRY.register("voice2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("verity", "voice2")));
	public static final RegistryObject<SoundEvent> YEAH = REGISTRY.register("yeah", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("verity", "yeah")));
	public static final RegistryObject<SoundEvent> MUSIC = REGISTRY.register("music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("verity", "music")));
}