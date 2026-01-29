package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class DripstoneWallBlock extends WallBlock {
	public DripstoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DRIPSTONE_BLOCK).strength(1.5f, 1f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}