package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;

public class IronGateRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) == false) {
			IronGateToggleNoEntityProcedure.execute(world, x, y, z);
		}
	}
}