package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.procedures.WeatheredCopperBarsOnTickUpdateProcedure;

public class WeatheredCopperBarsBlock extends IronBarsBlock {
	public WeatheredCopperBarsBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(3f).requiresCorrectToolForDrops().randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		WeatheredCopperBarsOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

}