/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extrabuildingblocks.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.extrabuildingblocks.client.gui.EmitterGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class ExtraBuildingBlocksModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ExtraBuildingBlocksModMenus.EMITTER_GUI.get(), EmitterGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}