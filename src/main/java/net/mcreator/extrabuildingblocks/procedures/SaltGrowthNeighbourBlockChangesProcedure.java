package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class SaltGrowthNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world
				.getBlockState(BlockPos.containing(x + ((getBlockDirection(world, BlockPos.containing(x, y, z))).getOpposite()).getStepX(), y + ((getBlockDirection(world, BlockPos.containing(x, y, z))).getOpposite()).getStepY(),
						z + ((getBlockDirection(world, BlockPos.containing(x, y, z))).getOpposite()).getStepZ()))
				.isFaceSturdy(world, BlockPos.containing(x + ((getBlockDirection(world, BlockPos.containing(x, y, z))).getOpposite()).getStepX(), y + ((getBlockDirection(world, BlockPos.containing(x, y, z))).getOpposite()).getStepY(),
						z + ((getBlockDirection(world, BlockPos.containing(x, y, z))).getOpposite()).getStepZ()), (getBlockDirection(world, BlockPos.containing(x, y, z))))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
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