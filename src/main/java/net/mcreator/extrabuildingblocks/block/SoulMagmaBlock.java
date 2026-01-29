package net.mcreator.extrabuildingblocks.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.procedures.SoulMagmaEntityWalksOnTheBlockProcedure;

public class SoulMagmaBlock extends Block {
	public SoulMagmaBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(0.5f).lightLevel(s -> 2).requiresCorrectToolForDrops().speedFactor(0.8f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		SoulMagmaEntityWalksOnTheBlockProcedure.execute(world, entity);
	}
}