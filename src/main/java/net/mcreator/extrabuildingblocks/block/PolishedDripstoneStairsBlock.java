package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class PolishedDripstoneStairsBlock extends StairBlock {
	public PolishedDripstoneStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f, 1f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public float getExplosionResistance() {
		return 1f;
	}
}