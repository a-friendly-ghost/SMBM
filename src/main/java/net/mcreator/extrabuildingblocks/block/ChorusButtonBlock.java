package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.material.PushReaction;

public class ChorusButtonBlock extends ButtonBlock {
	public ChorusButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.CRIMSON, 30, properties.mapColor(MapColor.NONE).sound(SoundType.NETHER_WOOD).pushReaction(PushReaction.DESTROY).strength(0.5f));
	}
}