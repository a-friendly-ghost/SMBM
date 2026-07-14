package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DarkSeaLanternBlock extends Block {
	public DarkSeaLanternBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(0.5f, 6f).lightLevel(blockstate -> 10).requiresCorrectToolForDrops());
	}
}