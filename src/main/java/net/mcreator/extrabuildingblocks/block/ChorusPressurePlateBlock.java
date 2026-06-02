package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class ChorusPressurePlateBlock extends PressurePlateBlock {
	public ChorusPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.CRIMSON, properties.sound(SoundType.NETHER_WOOD).strength(0.5f).instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}