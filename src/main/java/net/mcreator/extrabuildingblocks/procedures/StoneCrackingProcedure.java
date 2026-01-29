package net.mcreator.extrabuildingblocks.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StoneCrackingProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.PICKAXES)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE_BRICKS) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.STONE_BRICKS.defaultBlockState()));
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRACKED_STONE_BRICKS) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.CRACKED_STONE_BRICKS.defaultBlockState()));
				world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.VERY_CRACKED_STONE_BRICKS.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ExtraBuildingBlocksModBlocks.VERY_CRACKED_STONE_BRICKS.get()) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ExtraBuildingBlocksModBlocks.VERY_CRACKED_STONE_BRICKS.get().defaultBlockState()));
				world.setBlock(BlockPos.containing(x, y, z), ExtraBuildingBlocksModBlocks.DESTROYED_STONE_BRICKS.get().defaultBlockState(), 3);
			}
		}
	}
}