package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class IcicleTipNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip"))) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip"))) {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "frustum")), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip")), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "frustum"))) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "frustum"))) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "middle"))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "base"))) {
					world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "middle")), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "base")), 3);
				}
			} else {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip")))) {
					world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip")), 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "middle"))) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip"))) {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "frustum")), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "frustum"))
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "middle"))) {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "middle")), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip")), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "base"))) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip"))) {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "frustum")), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "frustum"))
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))) == (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "middle"))) {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "base")), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), (blockStateWithEnum(ExtraBuildingBlocksModBlocks.ICICLE.get().defaultBlockState(), "thickness", "tip")), 3);
			}
		}
	}

	private static BlockState blockStateWithEnum(BlockState blockState, String property, String newValue) {
		Property<?> prop = blockState.getBlock().getStateDefinition().getProperty(property);
		return prop instanceof EnumProperty ep && ep.getValue(newValue).isPresent() ? blockState.setValue(ep, (Enum) ep.getValue(newValue).get()) : blockState;
	}
}