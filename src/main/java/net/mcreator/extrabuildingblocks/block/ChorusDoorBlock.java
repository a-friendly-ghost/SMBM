package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoorBlock;

public class ChorusDoorBlock extends DoorBlock {
	public ChorusDoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.CRIMSON, properties.mapColor(MapColor.COLOR_PURPLE).sound(SoundType.NETHER_WOOD).strength(3f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASS));
	}
}