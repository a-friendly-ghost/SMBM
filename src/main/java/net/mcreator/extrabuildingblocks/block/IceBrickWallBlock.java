package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class IceBrickWallBlock extends WallBlock {
	public IceBrickWallBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(0.5f).requiresCorrectToolForDrops().friction(0.8f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}