
package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.extrabuildingblocks.procedures.ExposedCopperBarsOnTickUpdateProcedure;

public class ExposedCopperBarsBlock extends IronBarsBlock {
	public ExposedCopperBarsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(3f).requiresCorrectToolForDrops().randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		ExposedCopperBarsOnTickUpdateProcedure.execute(world, x, y, z, blockstate);
	}

}
