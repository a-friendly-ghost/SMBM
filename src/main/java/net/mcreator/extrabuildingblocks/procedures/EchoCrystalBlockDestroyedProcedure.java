package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.extrabuildingblocks.entity.EchoCrystalInteriorEntity;

import java.util.Comparator;

public class EchoCrystalBlockDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(EchoCrystalInteriorEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3((x + 0.5), (y + 0.5), (z + 0.5))).inflate(1 / 2d), e -> true).isEmpty()) {
			if (!(findEntityInWorldRange(world, EchoCrystalInteriorEntity.class, (x + 0.5), (y + 0.5), (z + 0.5), 1)).level().isClientSide())
				(findEntityInWorldRange(world, EchoCrystalInteriorEntity.class, (x + 0.5), (y + 0.5), (z + 0.5), 1)).discard();
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}