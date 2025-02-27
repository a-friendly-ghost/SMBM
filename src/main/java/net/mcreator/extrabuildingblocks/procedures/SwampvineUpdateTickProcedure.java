package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class SwampvineUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			if (Mth.nextInt(RandomSource.create(), 1, 6) == 1) {
				world.setBlock(BlockPos.containing(x, y - 1, z), ExtraBuildingBlocksModBlocks.SWAMPVINE.get().defaultBlockState(), 3);
			}
		}
	}
}
