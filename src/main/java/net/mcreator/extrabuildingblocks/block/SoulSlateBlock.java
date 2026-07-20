package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SoulSlateBlock extends Block {
	public SoulSlateBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_BROWN).strength(0.8f).requiresCorrectToolForDrops().speedFactor(0.8f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}