package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class ChorusButtonBlock extends ButtonBlock {
	public ChorusButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.CRIMSON, 30, properties.sound(SoundType.NETHER_WOOD).strength(0.5f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}