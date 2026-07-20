package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class CutAndesiteSlabBlock extends SlabBlock {
	public CutAndesiteSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}