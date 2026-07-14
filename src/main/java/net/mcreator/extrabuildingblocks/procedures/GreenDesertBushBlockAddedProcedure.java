package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class GreenDesertBushBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean blend = false;
		blend = false;
		for (Direction directioniterator : Direction.values()) {
			if ((world.getBlockState(BlockPos.containing(x + directioniterator.getStepX(), y + directioniterator.getStepY(), z + directioniterator.getStepZ()))).getBlock() == ExtraBuildingBlocksModBlocks.PURPLE_DESERT_BUSH.get()) {
				blend = true;
				break;
			}
		}
		{
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("blend") instanceof BooleanProperty _booleanProp)
				world.setBlock(_pos, _bs.setValue(_booleanProp, blend), 3);
		}
	}
}