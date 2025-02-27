package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class LampBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CHAIN
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.BRACKET.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.BRACKET.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.SOUL_LAMP.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.LAMP.get()) {
			return true;
		}
		return false;
	}
}
