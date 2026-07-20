package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.procedures.WroughtIronOnTickUpdateProcedure;

public class WroughtIronBlock extends Block {
	public WroughtIronBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.NETHERITE_BLOCK).strength(5f, 10f).requiresCorrectToolForDrops().randomTicks().instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.UNPASSABLE_RAIL;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		WroughtIronOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}
}