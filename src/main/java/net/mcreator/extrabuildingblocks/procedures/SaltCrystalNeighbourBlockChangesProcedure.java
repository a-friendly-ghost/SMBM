package net.mcreator.extrabuildingblocks.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBlocks;
import net.mcreator.extrabuildingblocks.block.SaltCrystalBlock;

public class SaltCrystalNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState state) {
	    BlockPos pos = BlockPos.containing(x, y, z);
		
		boolean found = false;
		
		for (Direction dir : Direction.values()) {
		    BlockPos n1 = pos.relative(dir);
		    BlockState s1 = world.getBlockState(n1);
		
		    // direct adjacency
		    if (s1.is(BlockTags.create(ResourceLocation.parse("custom:light_source")))) {
		        found = true;
		        break;
		    }
		
		    // second hop (check neighbor's neighbors)
		    for (Direction dir2 : Direction.values()) {
		        BlockPos n2 = n1.relative(dir2);
		        BlockState s2 = world.getBlockState(n2);
		
		        if (s2.is(BlockTags.create(ResourceLocation.parse("custom:light_source")))) {
		            found = true;
		            break;
		        }
		    }
		
		    if (found) break;
		}
		
		if (state.getValue(SaltCrystalBlock.ILLUMINATED) != found) {
		    world.setBlock(pos, state.setValue(SaltCrystalBlock.ILLUMINATED, found), 3);
		}
	}
}