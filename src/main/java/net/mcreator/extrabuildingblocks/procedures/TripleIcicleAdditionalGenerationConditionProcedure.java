package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class TripleIcicleAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y - 1, z), ExtraBuildingBlocksModBlocks.ICICLE_FRUSTUM.get().defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y - 2, z), ExtraBuildingBlocksModBlocks.ICICLE_TIP.get().defaultBlockState(), 3);
		return true;
	}
}
