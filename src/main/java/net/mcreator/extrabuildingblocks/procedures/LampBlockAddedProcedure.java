package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class LampBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CHAIN
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LANTERN || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SOUL_LANTERN
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.LAMP.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ExtraBuildingBlocksModBlocks.SOUL_LAMP.get()) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
