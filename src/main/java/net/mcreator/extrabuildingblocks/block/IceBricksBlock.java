package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class IceBricksBlock extends Block {
	public IceBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.ICE).sound(SoundType.GLASS).strength(0.5f).friction(0.8f));
	}
}