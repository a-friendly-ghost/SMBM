
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extrabuildingblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.extrabuildingblocks.world.features.TripleIcicleGroundOffsetFeature;
import net.mcreator.extrabuildingblocks.world.features.TripleIcicleFeature;
import net.mcreator.extrabuildingblocks.world.features.DoubleIcicleGroundOffsetFeature;
import net.mcreator.extrabuildingblocks.world.features.DoubleIcicleFeature;
import net.mcreator.extrabuildingblocks.ExtraBuildingBlocksMod;

@Mod.EventBusSubscriber
public class ExtraBuildingBlocksModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ExtraBuildingBlocksMod.MODID);
	public static final RegistryObject<Feature<?>> DOUBLE_ICICLE = REGISTRY.register("double_icicle", DoubleIcicleFeature::new);
	public static final RegistryObject<Feature<?>> TRIPLE_ICICLE = REGISTRY.register("triple_icicle", TripleIcicleFeature::new);
	public static final RegistryObject<Feature<?>> DOUBLE_ICICLE_GROUND_OFFSET = REGISTRY.register("double_icicle_ground_offset", DoubleIcicleGroundOffsetFeature::new);
	public static final RegistryObject<Feature<?>> TRIPLE_ICICLE_GROUND_OFFSET = REGISTRY.register("triple_icicle_ground_offset", TripleIcicleGroundOffsetFeature::new);
}
