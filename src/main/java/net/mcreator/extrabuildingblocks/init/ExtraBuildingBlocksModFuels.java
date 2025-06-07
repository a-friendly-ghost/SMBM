
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extrabuildingblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class ExtraBuildingBlocksModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.OAK_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.SPRUCE_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.BIRCH_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.JUNGLE_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.ACACIA_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.DARK_OAK_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.MANGROVE_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.CHERRY_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.BAMBOO_BEAM.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == ExtraBuildingBlocksModBlocks.CACTUS_WOOD.get().asItem())
			event.setBurnTime(300);
	}
}
