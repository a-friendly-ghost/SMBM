package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class PolishedDripstoneWallBlock extends WallBlock {
	public PolishedDripstoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f, 1f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASEDRUM)
				.forceSolidOn());
	}
}