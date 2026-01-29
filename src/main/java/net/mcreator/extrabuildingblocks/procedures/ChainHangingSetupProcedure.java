package net.mcreator.extrabuildingblocks.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ChainHangingSetupProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHAIN) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.CHAIN && (world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x + 1, y, z))).getAxis() == Direction.Axis.X
							&& (getBlockDirection(world, BlockPos.containing(x + 2, y, z))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x + 2, y + 1, z))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x + 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_MID.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x + 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x + 2, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x + 2, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.CHAIN && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.X && (getBlockDirection(world, BlockPos.containing(x + 1, y, z))).getAxis() == Direction.Axis.Y
							&& (getBlockDirection(world, BlockPos.containing(x - 1, y, z))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x - 1, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x + 1, y + 1, z))) {
							world.setBlock(BlockPos.containing(x - 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = BlockPos.containing(x - 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_MID.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x + 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x + 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.CHAIN && (world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x - 1, y, z))).getAxis() == Direction.Axis.X
							&& (getBlockDirection(world, BlockPos.containing(x - 2, y, z))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x - 2, y + 1, z))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x - 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_MID.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x - 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x - 2, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = BlockPos.containing(x - 2, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.CHAIN && (world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x, y, z + 1))).getAxis() == Direction.Axis.Z
							&& (getBlockDirection(world, BlockPos.containing(x, y, z + 2))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x, y + 1, z + 2))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z + 1), ExtraBuildingBlocksModBlocks.CHAIN_MID.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z + 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z + 2), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z + 2);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.CHAIN && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Z && (getBlockDirection(world, BlockPos.containing(x, y, z + 1))).getAxis() == Direction.Axis.Y
							&& (getBlockDirection(world, BlockPos.containing(x, y, z - 1))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z - 1)) && !world.isEmptyBlock(BlockPos.containing(x, y + 1, z + 1))) {
							world.setBlock(BlockPos.containing(x, y, z - 1), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z - 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_MID.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z + 1), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z + 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.CHAIN && (world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x, y, z - 1))).getAxis() == Direction.Axis.Z
							&& (getBlockDirection(world, BlockPos.containing(x, y, z - 2))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x, y + 1, z - 2))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z - 1), ExtraBuildingBlocksModBlocks.CHAIN_MID.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z - 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z - 2), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z - 2);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x + 1, y, z))).getAxis() == Direction.Axis.X) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x + 2, y, z))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x + 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = BlockPos.containing(x + 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.X && (getBlockDirection(world, BlockPos.containing(x + 1, y, z))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x + 1, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x + 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x + 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.X && (getBlockDirection(world, BlockPos.containing(x - 1, y, z))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x - 1, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x - 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = BlockPos.containing(x - 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x - 1, y, z))).getAxis() == Direction.Axis.X) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x - 2, y, z))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x - 1, y, z), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = BlockPos.containing(x - 1, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x, y, z + 1))).getAxis() == Direction.Axis.Z) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x, y, z + 2))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z + 1), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z + 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Z && (getBlockDirection(world, BlockPos.containing(x, y, z + 1))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z + 1)) && !world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z + 1), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z + 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Z && (getBlockDirection(world, BlockPos.containing(x, y, z - 1))).getAxis() == Direction.Axis.Y) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z - 1)) && !world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z - 1), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.WEST;
								BlockPos _pos = BlockPos.containing(x, y, z - 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.CHAIN) {
					if ((getBlockDirection(world, BlockPos.containing(x, y, z))).getAxis() == Direction.Axis.Y && (getBlockDirection(world, BlockPos.containing(x, y, z - 1))).getAxis() == Direction.Axis.Z) {
						if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.isEmptyBlock(BlockPos.containing(x, y, z - 2))) {
							world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.CHAIN_LEFT.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z - 1), ExtraBuildingBlocksModBlocks.CHAIN_CONNECTED.get().defaultBlockState(), 3);
							{
								Direction _dir = Direction.EAST;
								BlockPos _pos = BlockPos.containing(x, y, z - 1);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else if (_bs.getBlock().getStateDefinition().getProperty("axis") instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis())) {
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
			}
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