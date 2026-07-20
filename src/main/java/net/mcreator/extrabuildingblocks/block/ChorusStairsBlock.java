package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class ChorusStairsBlock extends StairBlock {
	public ChorusStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.mapColor(MapColor.COLOR_PURPLE).sound(SoundType.NETHER_WOOD).strength(2f, 3f).instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public float getExplosionResistance() {
		return 3f;
	}
}