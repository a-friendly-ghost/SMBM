package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DestroyedStoneBricksBlock extends Block {
	public DestroyedStoneBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.STONE).strength(1.5f, 5f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}