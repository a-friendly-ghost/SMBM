package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WaxedRustedWroughtIronBlock extends Block {
	public WaxedRustedWroughtIronBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHERITE_BLOCK).strength(5f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}
}