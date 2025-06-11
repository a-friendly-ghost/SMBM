package net.mcreator.extrabuildingblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class WaxStrippingProcedureProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		return execute(null, world, x, y, z, blockstate, entity);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_WROUGHT_IRON.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.WROUGHT_IRON.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_EXPOSED_WROUGHT_IRON.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.EXPOSED_WROUGHT_IRON.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_WEATHERED_WROUGHT_IRON.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.WEATHERED_WROUGHT_IRON.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_RUSTED_WROUGHT_IRON.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.RUSTED_WROUGHT_IRON.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_COPPER_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.COPPER_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_EXPOSED_COPPER_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.EXPOSED_COPPER_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_WEATHERED_COPPER_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.WEATHERED_COPPER_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_OXIDISED_COPPER_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.OXIDISED_COPPER_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_WROUGHT_IRON_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.WROUGHT_IRON_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_EXPOSED_WROUGHT_IRON_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.EXPOSED_WROUGHT_IRON_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_WEATHERED_WROUGHT_IRON_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.WEATHERED_WROUGHT_IRON_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_RUSTED_WROUGHT_IRON_BARS.get()) {
				WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = ExtraBuildingBlocksModBlocks.RUSTED_WROUGHT_IRON_BARS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				return true;
			}
			if (entity.isShiftKeyDown()) {
				if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_WROUGHT_IRON_GATE.get()) {
					WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ExtraBuildingBlocksModBlocks.WROUGHT_IRON_GATE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					return true;
				}
				if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_EXPOSED_WROUGHT_IRON_GATE.get()) {
					WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ExtraBuildingBlocksModBlocks.EXPOSED_WROUGHT_IRON_GATE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					return true;
				}
				if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_WEATHERED_WROUGHT_IRON_GATE.get()) {
					WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ExtraBuildingBlocksModBlocks.WEATHERED_WROUGHT_IRON_GATE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					return true;
				}
				if (blockstate.getBlock() == ExtraBuildingBlocksModBlocks.WAXED_RUSTED_WROUGHT_IRON_GATE.get()) {
					WaxStrippingAudiovisualProcedureProcedure.execute(world, x, y, z, entity);
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ExtraBuildingBlocksModBlocks.RUSTED_WROUGHT_IRON_GATE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					return true;
				}
			}
		}
		return true;
	}
}
