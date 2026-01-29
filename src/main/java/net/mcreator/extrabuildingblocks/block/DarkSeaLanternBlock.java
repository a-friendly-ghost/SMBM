package net.mcreator.extrabuildingblocks.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DarkSeaLanternBlock extends Block {
	public DarkSeaLanternBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(0.5f, 6f).lightLevel(s -> 10).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}