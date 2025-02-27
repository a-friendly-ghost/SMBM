package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class SaltCrystalNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("custom:light_source")))) {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.SALT_CRYSTAL_EMISSIVE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("custom:light_source")))) {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.SALT_CRYSTAL_EMISSIVE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("custom:light_source")))) {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.SALT_CRYSTAL_EMISSIVE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("custom:light_source")))) {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.SALT_CRYSTAL_EMISSIVE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("custom:light_source")))) {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.SALT_CRYSTAL_EMISSIVE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("custom:light_source")))) {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.SALT_CRYSTAL_EMISSIVE.get().defaultBlockState(), 3);
		}
	}
}
