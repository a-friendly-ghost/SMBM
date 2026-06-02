package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.procedures.SaltCrystalNeighbourBlockChangesProcedure;

import javax.annotation.Nullable;

public class SaltCrystalBlock extends Block {
	public static final BooleanProperty ILLUMINATED = BooleanProperty.create("illuminated");

	public SaltCrystalBlock(BlockBehaviour.Properties properties) {
		super(properties
			.strength(1f, 1.5f)
			.requiresCorrectToolForDrops()
			.lightLevel(s -> s.getValue(ILLUMINATED) ? 1 : 0)
			.hasPostProcess((bs, br, bp) -> bs.getValue(ILLUMINATED))
			.emissiveRendering((bs, br, bp) -> bs.getValue(ILLUMINATED))
		);
		this.registerDefaultState(this.stateDefinition.any().setValue(ILLUMINATED, false));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(ILLUMINATED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(ILLUMINATED, false);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		SaltCrystalNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		SaltCrystalNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}
}