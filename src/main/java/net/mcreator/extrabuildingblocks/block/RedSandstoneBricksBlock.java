package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class RedSandstoneBricksBlock extends Block {
	public RedSandstoneBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_ORANGE).strength(0.8f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}