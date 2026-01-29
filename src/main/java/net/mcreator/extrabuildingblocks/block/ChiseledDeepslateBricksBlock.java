package net.mcreator.extrabuildingblocks.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.network.chat.Component;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;

import java.util.function.Consumer;

public class ChiseledDeepslateBricksBlock extends Block {
	public ChiseledDeepslateBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE_BRICKS).strength(3.5f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(ExtraBuildingBlocksModBlocks.CHISELED_DEEPSLATE_BRICKS.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("block.extra_building_blocks.chiseled_deepslate_bricks.description_0"));
		}
	}
}