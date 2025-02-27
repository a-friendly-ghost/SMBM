package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BracketBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
			return true;
		}
		if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
