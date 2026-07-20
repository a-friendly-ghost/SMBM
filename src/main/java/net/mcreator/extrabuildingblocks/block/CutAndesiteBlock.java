package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CutAndesiteBlock extends Block {
	public CutAndesiteBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.STONE).strength(1.5f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}