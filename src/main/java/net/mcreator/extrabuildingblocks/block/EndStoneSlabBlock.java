package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class EndStoneSlabBlock extends SlabBlock {
	public EndStoneSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.SAND).strength(3f, 9f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}