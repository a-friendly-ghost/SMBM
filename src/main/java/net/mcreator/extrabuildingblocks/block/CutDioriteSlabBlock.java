package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class CutDioriteSlabBlock extends SlabBlock {
	public CutDioriteSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.QUARTZ).strength(1.5f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}