package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PolishedCalciteBlock extends Block {
	public PolishedCalciteBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CALCITE).strength(0.75f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}