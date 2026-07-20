package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class RedStainedSoulGlassPaneBlock extends IronBarsBlock {
	public RedStainedSoulGlassPaneBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.NONE).sound(SoundType.GLASS).strength(0.5f).instrument(NoteBlockInstrument.HAT));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 2;
	}
}