package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.util.RandomSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.procedures.BraceBlockAddedProcedure;
import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

import javax.annotation.Nullable;

import java.util.function.Consumer;

public class BraceBlock extends Block implements SimpleWaterloggedBlock {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	private static final VoxelShape SHAPE_NORTH_FLOOR = box(5, -1, -1, 11, 11.5, 11);
	private static final VoxelShape SHAPE_NORTH_WALL = box(5, -1, 4.5, 11, 11, 17);
	private static final VoxelShape SHAPE_NORTH_CEILING = box(5, 4.5, -1, 11, 17, 11);
	private static final VoxelShape SHAPE_SOUTH_FLOOR = box(5, -1, 5, 11, 11.5, 17);
	private static final VoxelShape SHAPE_SOUTH_WALL = box(5, -1, -1, 11, 11, 11.5);
	private static final VoxelShape SHAPE_SOUTH_CEILING = box(5, 4.5, 5, 11, 17, 17);
	private static final VoxelShape SHAPE_EAST_FLOOR = box(5, -1, 5, 17, 11.5, 11);
	private static final VoxelShape SHAPE_EAST_WALL = box(-1, -1, 5, 11.5, 11, 11);
	private static final VoxelShape SHAPE_EAST_CEILING = box(5, 4.5, 5, 17, 17, 11);
	private static final VoxelShape SHAPE_WEST_FLOOR = box(-1, -1, 5, 11, 11.5, 11);
	private static final VoxelShape SHAPE_WEST_WALL = box(4.5, -1, 5, 17, 11, 11);
	private static final VoxelShape SHAPE_WEST_CEILING = box(-1, 4.5, 5, 11, 17, 11);

	public BraceBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return (switch (state.getValue(FACING)) {
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_NORTH_FLOOR;
				case WALL -> SHAPE_NORTH_WALL;
				case CEILING -> SHAPE_NORTH_CEILING;
			};
			case SOUTH -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_SOUTH_FLOOR;
				case WALL -> SHAPE_SOUTH_WALL;
				case CEILING -> SHAPE_SOUTH_CEILING;
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_EAST_FLOOR;
				case WALL -> SHAPE_EAST_WALL;
				case CEILING -> SHAPE_EAST_CEILING;
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_WEST_FLOOR;
				case WALL -> SHAPE_WEST_WALL;
				case CEILING -> SHAPE_WEST_CEILING;
			};
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_NORTH_FLOOR;
				case WALL -> SHAPE_NORTH_WALL;
				case CEILING -> SHAPE_NORTH_CEILING;
			};
		});
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, FACE, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return super.getStateForPlacement(context).setValue(FACE, context.getClickedFace().getOpposite() == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, flag);
		return super.getStateForPlacement(context).setValue(FACE, AttachFace.WALL).setValue(FACING, context.getClickedFace()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess scheduledTickAccess, BlockPos currentPos, Direction facing, BlockPos facingPos, BlockState facingState, RandomSource random) {
		if (state.getValue(WATERLOGGED)) {
			scheduledTickAccess.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, world, scheduledTickAccess, currentPos, facing, facingPos, facingState, random);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		BraceBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		BraceBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(ExtraBuildingBlocksModBlocks.BRACE.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("block.extra_building_blocks.brace.description_0"));
		}
	}
}