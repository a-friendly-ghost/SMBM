package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CutAmethystBlock extends Block {
	public CutAmethystBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST).strength(1.5f).requiresCorrectToolForDrops());
	}
}