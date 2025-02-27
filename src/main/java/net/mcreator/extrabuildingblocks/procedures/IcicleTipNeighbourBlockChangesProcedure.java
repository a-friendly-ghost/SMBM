package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class IcicleTipNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.ICICLE_TIP.get()) {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.ICICLE_FRUSTUM.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.ICICLE_TIP.get().defaultBlockState(), 3);
		}
	}
}
