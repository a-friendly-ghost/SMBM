package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CutSmoothStoneBlock extends Block {
	public CutSmoothStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.STONE).strength(2f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}