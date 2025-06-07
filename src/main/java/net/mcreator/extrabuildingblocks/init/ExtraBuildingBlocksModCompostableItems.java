
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extrabuildingblocks.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtraBuildingBlocksModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(ExtraBuildingBlocksModBlocks.GREEN_DESERT_BUSH.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(ExtraBuildingBlocksModBlocks.PURPLE_DESERT_BUSH.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(ExtraBuildingBlocksModBlocks.FOUNTAIN_GRASS.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(ExtraBuildingBlocksModBlocks.PURPLE_FOUNTAIN_GRASS.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(ExtraBuildingBlocksModBlocks.DUCK_WEED.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(ExtraBuildingBlocksModBlocks.SWAMP_GRASS.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(ExtraBuildingBlocksModBlocks.CACTUS_WOOD.get().asItem(), 0.5f);
	}
}
