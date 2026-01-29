/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extrabuildingblocks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.extrabuildingblocks.entity.EchoCrystalInteriorEntity;
import net.mcreator.extrabuildingblocks.ExtraBuildingBlocksMod;

@EventBusSubscriber
public class ExtraBuildingBlocksModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ExtraBuildingBlocksMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<EchoCrystalInteriorEntity>> ECHO_CRYSTAL_INTERIOR = register("echo_crystal_interior",
			EntityType.Builder.<EchoCrystalInteriorEntity>of(EchoCrystalInteriorEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(ExtraBuildingBlocksMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		EchoCrystalInteriorEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ECHO_CRYSTAL_INTERIOR.get(), EchoCrystalInteriorEntity.createAttributes().build());
	}
}