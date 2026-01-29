package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class CutSmoothStoneSlabBlock extends SlabBlock {
	public CutSmoothStoneSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}