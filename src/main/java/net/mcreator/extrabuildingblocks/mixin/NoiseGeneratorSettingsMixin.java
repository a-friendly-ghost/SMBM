package net.mcreator.extrabuildingblocks.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.extrabuildingblocks.init.ExtraBuildingBlocksModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements ExtraBuildingBlocksModBiomes.ExtraBuildingBlocksModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> extra_building_blocks_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.extra_building_blocks_dimensionTypeReference != null) {
			retval = ExtraBuildingBlocksModBiomes.adaptSurfaceRule(retval, this.extra_building_blocks_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setextra_building_blocksDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.extra_building_blocks_dimensionTypeReference = dimensionType;
	}
}