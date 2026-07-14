package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class IceBrickSlabBlock extends SlabBlock {
	public IceBrickSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(0.5f).requiresCorrectToolForDrops().friction(0.8f));
	}
}