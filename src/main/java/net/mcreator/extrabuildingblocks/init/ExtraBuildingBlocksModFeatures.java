/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extrabuildingblocks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

import net.mcreator.extrabuildingblocks.world.features.TripleIcicleGroundOffsetFeature;
import net.mcreator.extrabuildingblocks.world.features.TripleIcicleFeature;
import net.mcreator.extrabuildingblocks.world.features.DoubleIcicleGroundOffsetFeature;
import net.mcreator.extrabuildingblocks.world.features.DoubleIcicleFeature;
import net.mcreator.extrabuildingblocks.ExtraBuildingBlocksMod;

public class ExtraBuildingBlocksModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, ExtraBuildingBlocksMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> DOUBLE_ICICLE = REGISTRY.register("double_icicle", DoubleIcicleFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> TRIPLE_ICICLE = REGISTRY.register("triple_icicle", TripleIcicleFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> DOUBLE_ICICLE_GROUND_OFFSET = REGISTRY.register("double_icicle_ground_offset", DoubleIcicleGroundOffsetFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> TRIPLE_ICICLE_GROUND_OFFSET = REGISTRY.register("triple_icicle_ground_offset", TripleIcicleGroundOffsetFeature::new);
}