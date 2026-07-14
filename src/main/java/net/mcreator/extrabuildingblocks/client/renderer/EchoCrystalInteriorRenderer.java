package net.mcreator.extrabuildingblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.extrabuildingblocks.entity.EchoCrystalInteriorEntity;
import net.mcreator.extrabuildingblocks.client.model.ModelEchoCrystalJava;

public class EchoCrystalInteriorRenderer extends MobRenderer<EchoCrystalInteriorEntity, LivingEntityRenderState, ModelEchoCrystalJava> {
	private EchoCrystalInteriorEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("extra_building_blocks:textures/entities/texture_23.png");

	public EchoCrystalInteriorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEchoCrystalJava(context.bakeLayer(ModelEchoCrystalJava.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EchoCrystalInteriorEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}