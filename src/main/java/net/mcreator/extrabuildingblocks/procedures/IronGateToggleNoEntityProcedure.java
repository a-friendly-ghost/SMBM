package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class IronGateToggleNoEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double checkY = 0;
		double aboveCount = 0;
		boolean openorclose = false;
		checkY = y;
		aboveCount = -1;
		openorclose = !(getPropertyByName((world.getBlockState(BlockPos.containing(x, y, z))), "open") instanceof BooleanProperty _getbp1 && (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getbp1));
		for (int index0 = 0; index0 < 15; index0++) {
			if (!(world.getBlockState(BlockPos.containing(x, checkY, z))).is(BlockTags.create(ResourceLocation.parse("extra_building_blocks:metal_gates")))) {
				break;
			}
			if (!((getBlockDirection(world, BlockPos.containing(x, checkY, z))).getAxis() == (getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis())) {
				break;
			}
			if ((getPropertyByName((world.getBlockState(BlockPos.containing(x, checkY, z))), "open") instanceof BooleanProperty _getbp8 && (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getbp8)) == openorclose) {
				break;
			}
			if ((getPropertyByName((world.getBlockState(BlockPos.containing(x, checkY, z))), "open") instanceof BooleanProperty _getbp10 && (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getbp10)) == false) {
				{
					BlockPos _pos = BlockPos.containing(x, checkY, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
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
					BlockPos _pos = BlockPos.containing(x, checkY, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
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
			if ((getPropertyByName((world.getBlockState(BlockPos.containing(x, checkY, z))), "open") instanceof BooleanProperty _getbp21 && (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getbp21)) == openorclose) {
				break;
			}
			if ((getPropertyByName((world.getBlockState(BlockPos.containing(x, checkY, z))), "open") instanceof BooleanProperty _getbp23 && (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getbp23)) == false) {
				{
					BlockPos _pos = BlockPos.containing(x, checkY, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
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
					BlockPos _pos = BlockPos.containing(x, checkY, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
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
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
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