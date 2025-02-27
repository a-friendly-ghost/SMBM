package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class IcicleTipUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.WATER) {
			if (Mth.nextInt(RandomSource.create(), 1, 15) == 1) {
				world.setBlock(BlockPos.containing(x, y - 1, z), ExtraBuildingBlocksModBlocks.ICICLE_TIP.get().defaultBlockState(), 3);
			}
		}
	}
}
