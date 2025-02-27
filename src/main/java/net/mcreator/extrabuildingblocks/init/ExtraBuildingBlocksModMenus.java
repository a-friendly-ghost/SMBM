
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.extrabuildingblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.extrabuildingblocks.world.inventory.EmitterGUIMenu;
import net.mcreator.extrabuildingblocks.ExtraBuildingBlocksMod;

public class ExtraBuildingBlocksModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ExtraBuildingBlocksMod.MODID);
	public static final RegistryObject<MenuType<EmitterGUIMenu>> EMITTER_GUI = REGISTRY.register("emitter_gui", () -> IForgeMenuType.create(EmitterGUIMenu::new));
}
