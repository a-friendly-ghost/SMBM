package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.network.chat.Component;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

import java.util.function.Consumer;

public class ChiseledBlackstoneBricksBlock extends Block {
	public ChiseledBlackstoneBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_BLACK).strength(1.5f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(ExtraBuildingBlocksModBlocks.CHISELED_BLACKSTONE_BRICKS.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("block.extra_building_blocks.chiseled_blackstone_bricks.description_0"));
		}
	}
}