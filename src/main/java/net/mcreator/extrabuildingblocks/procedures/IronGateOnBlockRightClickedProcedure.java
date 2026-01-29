package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class IronGateOnBlockRightClickedProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		double checkY = 0;
		double aboveCount = 0;
		if (entity.isShiftKeyDown()) {
			return false;
		}
		checkY = y;
		aboveCount = -1;
		for (int index0 = 0; index0 < 15; index0++) {
			if (!(world.getBlockState(BlockPos.containing(x, checkY, z))).is(BlockTags.create(ResourceLocation.parse("extra_building_blocks:metal_gates")))) {
				break;
			}
			if (!((getBlockDirection(world, BlockPos.containing(x, checkY, z))).getAxis() == (getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis())) {
				break;
			}
			if (((world.getBlockState(BlockPos.containing(x, checkY, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7
					? (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getip7)
					: -1) == 0) {
				if ((getBlockDirection(world, BlockPos.containing(x, checkY, z))).getAxis() == Direction.Axis.Z) {
					if (entity.getZ() > z) {
						{
							Direction _dir = Direction.NORTH;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					} else {
						{
							Direction _dir = Direction.SOUTH;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, checkY, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					if (entity.getX() > x) {
						{
							Direction _dir = Direction.WEST;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					} else {
						{
							Direction _dir = Direction.EAST;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, checkY, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, checkY, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.open")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, checkY, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.open")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, checkY, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, checkY, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.close")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, checkY, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.close")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			checkY = checkY + 1;
			aboveCount = aboveCount + 1;
		}
		checkY = y - 1;
		for (int index1 = 0; index1 < (int) (16 - aboveCount); index1++) {
			if (!(world.getBlockState(BlockPos.containing(x, checkY, z))).is(BlockTags.create(ResourceLocation.parse("extra_building_blocks:metal_gates")))) {
				break;
			}
			if (!((getBlockDirection(world, BlockPos.containing(x, checkY, z))).getAxis() == (getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis())) {
				break;
			}
			if (((world.getBlockState(BlockPos.containing(x, checkY, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip27
					? (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getip27)
					: -1) == 0) {
				if ((getBlockDirection(world, BlockPos.containing(x, checkY, z))).getAxis() == Direction.Axis.Z) {
					if (entity.getZ() > z) {
						{
							Direction _dir = Direction.NORTH;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					} else {
						{
							Direction _dir = Direction.SOUTH;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, checkY, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					if (entity.getX() > x) {
						{
							Direction _dir = Direction.WEST;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					} else {
						{
							Direction _dir = Direction.EAST;
							BlockPos _pos = BlockPos.containing(x, checkY, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, checkY, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, checkY, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.open")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, checkY, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.open")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, checkY, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, checkY, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.close")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, checkY, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.iron_trapdoor.close")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			checkY = checkY - 1;
		}
		IronGateBlockAddedProcedure.execute(world, x, y, z);
		return true;
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