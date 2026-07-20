package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DarkSeaLanternBlock extends Block {
	public DarkSeaLanternBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.DIAMOND).strength(0.5f, 6f).lightLevel(blockstate -> 10).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.HAT));
	}
}