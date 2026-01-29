package net.mcreator.extrabuildingblocks.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.procedures.SaltCrystalEmissiveNeighbourBlockChangesProcedure;
import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

import javax.annotation.Nullable;

public class SaltCrystalEmissiveBlock extends Block {
	public SaltCrystalEmissiveBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).lightLevel(s -> 1).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 13;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData, Player entity) {
		return new ItemStack(ExtraBuildingBlocksModBlocks.SALT_CRYSTAL.get());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		SaltCrystalEmissiveNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		SaltCrystalEmissiveNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}