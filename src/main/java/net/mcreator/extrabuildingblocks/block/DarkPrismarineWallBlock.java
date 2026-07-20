package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class DarkPrismarineWallBlock extends WallBlock {
	public DarkPrismarineWallBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.DIAMOND).strength(1.5f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn());
	}
}