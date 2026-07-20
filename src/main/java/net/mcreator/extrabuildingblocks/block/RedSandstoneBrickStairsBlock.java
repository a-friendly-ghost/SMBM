package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class RedSandstoneBrickStairsBlock extends StairBlock {
	public RedSandstoneBrickStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.mapColor(MapColor.COLOR_ORANGE).strength(0.8f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public float getExplosionResistance() {
		return 0.8f;
	}
}