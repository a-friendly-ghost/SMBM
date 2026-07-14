package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PolishedDripstoneBlock extends Block {
	public PolishedDripstoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f, 1f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}