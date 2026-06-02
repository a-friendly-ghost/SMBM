package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

public class IronGateToggleNoEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double checkY = 0;
		double aboveCount = 0;
		checkY = y;
		aboveCount = -1;
		for (int index0 = 0; index0 < 15; index0++) {
			if (!((world.getBlockState(BlockPos.containing(x, checkY, z))).getBlock() == ExtraBuildingBlocksModBlocks.IRON_GATE.get())) {
				break;
			}
			if (((world.getBlockState(BlockPos.containing(x, checkY, z))).getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _getbp3
					&& (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getbp3)) == false) {
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
			if (!((world.getBlockState(BlockPos.containing(x, checkY, z))).getBlock() == ExtraBuildingBlocksModBlocks.IRON_GATE.get())) {
				break;
			}
			if (((world.getBlockState(BlockPos.containing(x, checkY, z))).getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _getbp11
					&& (world.getBlockState(BlockPos.containing(x, checkY, z))).getValue(_getbp11)) == false) {
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
		IronGateBlockAddedProcedure.execute(world, x, y, z);
	}
}