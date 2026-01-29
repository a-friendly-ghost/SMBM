package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ChorusSlabBlock extends SlabBlock {
	public ChorusSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_WOOD).strength(2f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}