package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedCalciteSlabBlock extends SlabBlock {
	public PolishedCalciteSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CALCITE).strength(0.75f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}