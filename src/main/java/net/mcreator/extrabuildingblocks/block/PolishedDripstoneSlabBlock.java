package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedDripstoneSlabBlock extends SlabBlock {
	public PolishedDripstoneSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f, 1f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}