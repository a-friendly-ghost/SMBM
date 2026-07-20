package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.extrabuildingblocks.procedures.WeatheredWroughtIronBarsOnTickUpdateProcedure;

public class WeatheredWroughtIronBarsBlock extends IronBarsBlock {
	public WeatheredWroughtIronBarsBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHERITE_BLOCK).strength(5f, 10f).requiresCorrectToolForDrops().randomTicks().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.HARP));
	}

	@Override
	public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		WeatheredWroughtIronBarsOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

}