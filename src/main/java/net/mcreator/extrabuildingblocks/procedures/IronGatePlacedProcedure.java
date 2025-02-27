package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.extrabuildingblocks.ExtraBuildingBlocksMod;

public class IronGatePlacedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ExtraBuildingBlocksMod.queueServerWork(1, () -> {
			IronGateBlockAddedProcedure.execute(world, x, y, z);
		});
	}
}
