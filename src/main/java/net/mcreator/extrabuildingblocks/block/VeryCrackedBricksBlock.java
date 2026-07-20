package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class VeryCrackedBricksBlock extends Block {
	public VeryCrackedBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_RED).strength(2f, 5.5f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}