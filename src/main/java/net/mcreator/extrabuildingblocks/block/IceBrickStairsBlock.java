package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class IceBrickStairsBlock extends StairBlock {
	public IceBrickStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.GLASS).strength(0.5f).requiresCorrectToolForDrops().friction(0.8f));
	}

	@Override
	public float getExplosionResistance() {
		return 0.5f;
	}
}