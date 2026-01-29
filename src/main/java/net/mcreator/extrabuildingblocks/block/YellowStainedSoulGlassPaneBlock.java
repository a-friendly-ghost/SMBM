package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class YellowStainedSoulGlassPaneBlock extends IronBarsBlock {
	public YellowStainedSoulGlassPaneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(0.5f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.HAT));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 2;
	}
}