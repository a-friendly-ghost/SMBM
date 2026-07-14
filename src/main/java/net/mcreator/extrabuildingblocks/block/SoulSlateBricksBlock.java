package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SoulSlateBricksBlock extends Block {
	public SoulSlateBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(0.8f).requiresCorrectToolForDrops().speedFactor(0.8f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}