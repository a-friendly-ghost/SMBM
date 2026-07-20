package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class ChorusFenceGateBlock extends FenceGateBlock {
	public ChorusFenceGateBlock(BlockBehaviour.Properties properties) {
		super(WoodType.CRIMSON, properties.mapColor(MapColor.COLOR_PURPLE).sound(SoundType.NETHER_WOOD).strength(2f, 3f).instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}