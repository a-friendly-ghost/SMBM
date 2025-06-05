package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class OxidationTickProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		BlockState blockToCheck = Blocks.AIR.defaultBlockState();
		double currentOxidation = 0;
		double xOffset = 0;
		double yOffset = 0;
		double zOffset = 0;
		double checkDistance = 0;
		double totalNearby = 0;
		double higherNearby = 0;
		double modifyingFactor = 0;
		double c = 0;
		double probability = 0;
		if (Mth.nextInt(RandomSource.create(), 1, 1125) <= 64) {
			if (blockstate.is(BlockTags.create(new ResourceLocation("extra_building_blocks:unoxidized")))) {
				currentOxidation = 0;
				modifyingFactor = 0.75;
			} else if (blockstate.is(BlockTags.create(new ResourceLocation("extra_building_blocks:exposed")))) {
				currentOxidation = 1;
				modifyingFactor = 1;
			} else if (blockstate.is(BlockTags.create(new ResourceLocation("extra_building_blocks:weathered")))) {
				currentOxidation = 2;
				modifyingFactor = 1;
			} else {
				return false;
			}
			checkDistance = 4;
			xOffset = checkDistance * (-1);
			totalNearby = 0;
			higherNearby = 0;
			while (xOffset <= checkDistance) {
				yOffset = checkDistance * (-1) + Math.abs(xOffset);
				while (yOffset <= checkDistance - Math.abs(xOffset)) {
					zOffset = checkDistance * (-1) + Math.abs(xOffset) + Math.abs(yOffset);
					while (zOffset <= (checkDistance - Math.abs(xOffset)) - Math.abs(yOffset)) {
						blockToCheck = (world.getBlockState(BlockPos.containing(x + xOffset, y + yOffset, z + zOffset)));
						if (blockToCheck.is(BlockTags.create(new ResourceLocation("extra_building_blocks:unoxidized")))) {
							if (currentOxidation > 0) {
								return false;
							}
							if (currentOxidation < 0) {
								higherNearby = higherNearby + 1;
							}
							totalNearby = totalNearby + 1;
						}
						if (blockToCheck.is(BlockTags.create(new ResourceLocation("extra_building_blocks:exposed")))) {
							if (currentOxidation > 1) {
								return false;
							}
							if (currentOxidation < 1) {
								higherNearby = higherNearby + 1;
							}
							totalNearby = totalNearby + 1;
						}
						if (blockToCheck.is(BlockTags.create(new ResourceLocation("extra_building_blocks:weathered")))) {
							if (currentOxidation > 2) {
								return false;
							}
							if (currentOxidation < 2) {
								higherNearby = higherNearby + 1;
							}
							totalNearby = totalNearby + 1;
						}
						if (blockToCheck.is(BlockTags.create(new ResourceLocation("extra_building_blocks:oxidized")))) {
							if (currentOxidation > 3) {
								return false;
							}
							if (currentOxidation < 3) {
								higherNearby = higherNearby + 1;
							}
							totalNearby = totalNearby + 1;
						}
						zOffset = zOffset + 1;
					}
					yOffset = yOffset + 1;
				}
				xOffset = xOffset + 1;
			}
			c = (higherNearby + 1) / (totalNearby + 1);
			probability = modifyingFactor * c * c;
			if (probability <= Math.random()) {
				return true;
			}
		}
		return false;
	}
}
