package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class IcicleTipBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)) {
			return true;
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.ICICLE_TIP.get()) {
			return true;
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.ICICLE_FRUSTUM.get()) {
			return true;
		}
		return false;
	}
}
