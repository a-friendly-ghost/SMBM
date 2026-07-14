package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class VeryCrackedStoneBricksBlock extends Block {
	public VeryCrackedStoneBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.5f, 5.5f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}