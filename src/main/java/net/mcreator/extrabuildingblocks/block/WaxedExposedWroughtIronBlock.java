package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WaxedExposedWroughtIronBlock extends Block {
	public WaxedExposedWroughtIronBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHERITE_BLOCK).strength(5f, 10f).requiresCorrectToolForDrops());
	}
}