/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.verity.entity.*;
import net.mcreator.verity.VerityMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VerityModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VerityMod.MODID);
	public static final RegistryObject<EntityType<VerityEntity>> VERITY = register("verity",
			EntityType.Builder.<VerityEntity>of(VerityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(300).setUpdateInterval(3).setCustomClientFactory(VerityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Verity2Entity>> VERITY_2 = register("verity_2",
			EntityType.Builder.<Verity2Entity>of(Verity2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(300).setUpdateInterval(3).setCustomClientFactory(Verity2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Verity3Entity>> VERITY_3 = register("verity_3",
			EntityType.Builder.<Verity3Entity>of(Verity3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(300).setUpdateInterval(3).setCustomClientFactory(Verity3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Verity2moredaysEntity>> VERITY_2MOREDAYS = register("verity_2moredays",
			EntityType.Builder.<Verity2moredaysEntity>of(Verity2moredaysEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(300).setUpdateInterval(3).setCustomClientFactory(Verity2moredaysEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Verity1moredaysEntity>> VERITY_1MOREDAYS = register("verity_1moredays",
			EntityType.Builder.<Verity1moredaysEntity>of(Verity1moredaysEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(300).setUpdateInterval(3).setCustomClientFactory(Verity1moredaysEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VERITYEEntity>> VERITYE = register("veritye",
			EntityType.Builder.<VERITYEEntity>of(VERITYEEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VERITYEEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			VerityEntity.init();
			Verity2Entity.init();
			Verity3Entity.init();
			Verity2moredaysEntity.init();
			Verity1moredaysEntity.init();
			VERITYEEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(VERITY.get(), VerityEntity.createAttributes().build());
		event.put(VERITY_2.get(), Verity2Entity.createAttributes().build());
		event.put(VERITY_3.get(), Verity3Entity.createAttributes().build());
		event.put(VERITY_2MOREDAYS.get(), Verity2moredaysEntity.createAttributes().build());
		event.put(VERITY_1MOREDAYS.get(), Verity1moredaysEntity.createAttributes().build());
		event.put(VERITYE.get(), VERITYEEntity.createAttributes().build());
	}
}