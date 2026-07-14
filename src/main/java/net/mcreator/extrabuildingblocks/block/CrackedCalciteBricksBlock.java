package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CrackedCalciteBricksBlock extends Block {
	public CrackedCalciteBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DRIPSTONE_BLOCK).strength(0.75f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}