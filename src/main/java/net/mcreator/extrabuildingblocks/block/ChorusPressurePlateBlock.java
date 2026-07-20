package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class ChorusPressurePlateBlock extends PressurePlateBlock {
	public ChorusPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.CRIMSON, properties.mapColor(MapColor.COLOR_PURPLE).sound(SoundType.NETHER_WOOD).strength(0.5f).instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}