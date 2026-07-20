package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class ChorusTrapdoorBlock extends TrapDoorBlock {
	public ChorusTrapdoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.CRIMSON, properties.mapColor(MapColor.COLOR_PURPLE).sound(SoundType.NETHER_WOOD).strength(3f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.BASS));
	}
}