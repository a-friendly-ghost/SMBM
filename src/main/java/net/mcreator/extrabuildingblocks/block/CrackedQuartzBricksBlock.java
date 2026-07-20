package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CrackedQuartzBricksBlock extends Block {
	public CrackedQuartzBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.QUARTZ).strength(0.8f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}