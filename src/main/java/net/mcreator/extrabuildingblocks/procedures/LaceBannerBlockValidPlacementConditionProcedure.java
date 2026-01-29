package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class LaceBannerBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			return true;
		}
		if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.EAST) {
			if (!world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
				return true;
			} else {
				return false;
			}
		}
		if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.WEST) {
			if (!world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
				return true;
			} else {
				return false;
			}
		}
		if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.NORTH) {
			if (!world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
				return true;
			} else {
				return false;
			}
		}
		if ((getBlockDirection(world, BlockPos.containing(x, y, z))) == Direction.SOUTH) {
			if (!world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private static Direction getBlockDirection(LevelAccessor world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos);
		Property<?> property = blockState.getBlock().getStateDefinition().getProperty("facing");
		if (property != null && blockState.getValue(property) instanceof Direction direction)
			return direction;
		else if (blockState.hasProperty(BlockStateProperties.AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
		else if (blockState.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}
}