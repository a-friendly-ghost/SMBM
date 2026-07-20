package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CrackedBricksBlock extends Block {
	public CrackedBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_RED).strength(2f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}