package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LaceBannerFirstPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
			return true;
		}
		if (!world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
			return true;
		}
		if (!world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
			return true;
		}
		if (!world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
			return true;
		}
		if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			return true;
		}
		return false;
	}
}
