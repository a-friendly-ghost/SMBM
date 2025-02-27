package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class SwampvineUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.SWAMPVINE.get())) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ExtraBuildingBlocksModBlocks.SWAMPVINE.get().defaultBlockState()));
		}
	}
}
