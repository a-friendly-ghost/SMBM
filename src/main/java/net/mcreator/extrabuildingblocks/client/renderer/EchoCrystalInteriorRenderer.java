
package net.mcreator.extrabuildingblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.extrabuildingblocks.entity.EchoCrystalInteriorEntity;
import net.mcreator.extrabuildingblocks.client.model.ModelEchoCrystalJava;

public class EchoCrystalInteriorRenderer extends MobRenderer<EchoCrystalInteriorEntity, ModelEchoCrystalJava<EchoCrystalInteriorEntity>> {
	public EchoCrystalInteriorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEchoCrystalJava<EchoCrystalInteriorEntity>(context.bakeLayer(ModelEchoCrystalJava.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(EchoCrystalInteriorEntity entity) {
		return new ResourceLocation("extra_building_blocks:textures/entities/texture_23.png");
	}
}
