package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class ChorusFenceBlock extends FenceBlock {
	public ChorusFenceBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_PURPLE).sound(SoundType.NETHER_WOOD).strength(2f, 3f).instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}