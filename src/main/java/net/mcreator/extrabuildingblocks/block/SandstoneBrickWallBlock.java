package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class SandstoneBrickWallBlock extends WallBlock {
	public SandstoneBrickWallBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.SAND).strength(0.8f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn());
	}
}